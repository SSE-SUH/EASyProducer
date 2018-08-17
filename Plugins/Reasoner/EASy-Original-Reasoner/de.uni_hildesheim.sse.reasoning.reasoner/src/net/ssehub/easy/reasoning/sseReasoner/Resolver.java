package net.ssehub.easy.reasoning.sseReasoner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.ssehub.easy.basics.logger.EASyLoggerFactory;
import net.ssehub.easy.basics.logger.EASyLoggerFactory.EASyLogger;
import net.ssehub.easy.basics.modelManagement.Utils;
import net.ssehub.easy.reasoning.core.reasoner.AnnotationAssignmentConstraint;
import net.ssehub.easy.reasoning.core.reasoner.AttachedConstraint;
import net.ssehub.easy.reasoning.core.reasoner.ConstraintBase;
import net.ssehub.easy.reasoning.core.reasoner.ConstraintList;
import net.ssehub.easy.reasoning.core.reasoner.ConstraintVariableConstraint;
import net.ssehub.easy.reasoning.core.reasoner.DefaultConstraint;
import net.ssehub.easy.reasoning.core.reasoner.IReasonerInterceptor;
import net.ssehub.easy.reasoning.core.reasoner.ReasonerConfiguration;
import net.ssehub.easy.reasoning.core.reasoner.ReasoningErrorCodes;
import net.ssehub.easy.reasoning.sseReasoner.functions.FailedElementDetails;
import net.ssehub.easy.reasoning.sseReasoner.functions.FailedElements;
import net.ssehub.easy.reasoning.sseReasoner.functions.AbstractConstraintProcessor;
import net.ssehub.easy.reasoning.sseReasoner.functions.ScopeAssignments;
import net.ssehub.easy.reasoning.sseReasoner.model.ContextStack;
import net.ssehub.easy.reasoning.sseReasoner.model.ReasoningUtils;
import net.ssehub.easy.reasoning.sseReasoner.model.SubstitutionVisitor;
import net.ssehub.easy.reasoning.sseReasoner.model.VariablesInConstraintFinder;
import net.ssehub.easy.reasoning.sseReasoner.model.VariablesInNotSimpleAssignmentConstraintsFinder;
import net.ssehub.easy.reasoning.sseReasoner.model.VariablesMap;
import net.ssehub.easy.varModel.confModel.AssignmentState;
import net.ssehub.easy.varModel.confModel.Configuration;
import net.ssehub.easy.varModel.confModel.IAssignmentState;
import net.ssehub.easy.varModel.confModel.IConfigurationElement;
import net.ssehub.easy.varModel.confModel.IDecisionVariable;
import net.ssehub.easy.varModel.cst.AttributeVariable;
import net.ssehub.easy.varModel.cst.CSTSemanticException;
import net.ssehub.easy.varModel.cst.CSTUtils;
import net.ssehub.easy.varModel.cst.CompoundAccess;
import net.ssehub.easy.varModel.cst.ConstantValue;
import net.ssehub.easy.varModel.cst.ConstraintSyntaxTree;
import net.ssehub.easy.varModel.cst.OCLFeatureCall;
import net.ssehub.easy.varModel.cst.Variable;
import net.ssehub.easy.varModel.cstEvaluation.EvaluationVisitor;
import net.ssehub.easy.varModel.cstEvaluation.EvaluationVisitor.Message;
import net.ssehub.easy.varModel.cstEvaluation.IResolutionListener;
import net.ssehub.easy.varModel.cstEvaluation.LocalDecisionVariable;
import net.ssehub.easy.varModel.model.AbstractVariable;
import net.ssehub.easy.varModel.model.AnnotationVisitor;
import net.ssehub.easy.varModel.model.Attribute;
import net.ssehub.easy.varModel.model.AttributeAssignment;
import net.ssehub.easy.varModel.model.AttributeAssignment.Assignment;
import net.ssehub.easy.varModel.model.Constraint;
import net.ssehub.easy.varModel.model.DecisionVariableDeclaration;
import net.ssehub.easy.varModel.model.IModelElement;
import net.ssehub.easy.varModel.model.IvmlException;
import net.ssehub.easy.varModel.model.ModelQuery;
import net.ssehub.easy.varModel.model.ModelVisitorAdapter;
import net.ssehub.easy.varModel.model.OperationDefinition;
import net.ssehub.easy.varModel.model.PartialEvaluationBlock;
import net.ssehub.easy.varModel.model.Project;
import net.ssehub.easy.varModel.model.datatypes.Compound;
import net.ssehub.easy.varModel.model.datatypes.Container;
import net.ssehub.easy.varModel.model.datatypes.DerivedDatatype;
import net.ssehub.easy.varModel.model.datatypes.IDatatype;
import net.ssehub.easy.varModel.model.datatypes.OclKeyWords;
import net.ssehub.easy.varModel.model.datatypes.Reference;
import net.ssehub.easy.varModel.model.datatypes.TypeQueries;
import net.ssehub.easy.varModel.model.filter.FilterType;
import net.ssehub.easy.varModel.model.values.ContainerValue;
import net.ssehub.easy.varModel.model.values.NullValue;
import net.ssehub.easy.varModel.model.values.Value;

import static net.ssehub.easy.reasoning.sseReasoner.functions.ConstraintFunctions.*;
import static net.ssehub.easy.reasoning.sseReasoner.model.ReasoningUtils.*;

/**
 * Constraint identifier, resolver and executor. Assumption that constraints are not evaluated in parallel (see some
 * comments). This resolver can be re-used. Therefore, call {@link #markForReuse()} before the first call to 
 * {@link #resolve()} and after reasoning completed, call {@link #clear()}. When performing a further reasoning on this 
 * instance, call {@link #reInit()}.
 * 
 * @author Sizonenko
 * @author El-Sharkawy
 * @author Holger Eichelberger
 */
class Resolver implements IResolutionListener {

    private static final EASyLogger LOGGER
        = EASyLoggerFactory.INSTANCE.getLogger(Resolver.class, Descriptor.BUNDLE_NAME);
    private static final int MODE_COMPOUND_REGISTER = 1; 
    private static final int MODE_COMPOUND_TRANSLATE = 2; 
    private static final int MODE_COMPOUND_NONE = -1; 
    private ReasonerConfiguration reasonerConfig;
    
    private Configuration config;
    private boolean incremental = false;
    private boolean reuseInstance = false;
    private IAssignmentState assignmentState = AssignmentState.DERIVED;
    private IReasonerInterceptor interceptor;

    private EvalVisitor evaluator = new EvalVisitor();
    private FailedElements failedElements = new FailedElements();
    private ScopeAssignments scopeAssignments = new ScopeAssignments();

    private VariablesMap variablesMap = new VariablesMap();
    private ReasonerState copiedState;
    private ConstraintBase constraintBase = new ConstraintBase();
    private ConstraintList defaultConstraints = new ConstraintList();
    private ConstraintList deferredDefaultConstraints = new ConstraintList();
    private ConstraintList topLevelConstraints = new ConstraintList();
    private ConstraintList otherConstraints = new ConstraintList();
    private List<Project> projects;
    
    // Stats
    private int constraintCounter = 0;
    private int variablesInConstraintsCounter = 0;    
    private int reevaluationCounter = 0;
    private int variablesCounter = 0;
    private boolean hasTimeout = false;
    private boolean isRunning = false;
    private boolean wasStopped = false;
    private long translationTime = 0;
    private long evaluationTime = 0;

    // global temporary variables avoiding parameter passing (performance)
    
    private Project project;
    private transient Set<IDecisionVariable> usedVariables = new HashSet<IDecisionVariable>(100);
    private transient SubstitutionVisitor substVisitor = new SubstitutionVisitor();
    private transient ContextStack contexts = new ContextStack();
    private transient VariablesInNotSimpleAssignmentConstraintsFinder simpleAssignmentFinder 
        = new VariablesInNotSimpleAssignmentConstraintsFinder(variablesMap);
    private transient ConstraintTranslationVisitor projectVisitor = new ConstraintTranslationVisitor();
    private transient VariablesInConstraintFinder variablesFinder = new VariablesInConstraintFinder();
    private transient OtherConstraintsProcessor otherConstraintsProc = new OtherConstraintsProcessor();
    private transient CompoundAnnotationMapper annotationMapper = new CompoundAnnotationMapper();
    private transient RescheduleValueChangeVisitor rescheduler = new RescheduleValueChangeVisitor(this);
    private transient CheckInitializerVisitor initChecker = new CheckInitializerVisitor(this);            
    private transient long endTimestamp;
    private transient boolean inTopLevelEvals = false;

    /**
     * Represents the state of the resolver/reasoner to be kept in case of incremental reasoning.
     * 
     * @author Holger Eichelberger
     */
    private static class ReasonerState {
        private List<ConstraintList> constraintBase = new LinkedList<ConstraintList>();
        private VariablesMap variablesMap = new VariablesMap();
    }

    /**
     * Main constructor that activates Resolver constructor.
     * @param project Project for evaluation.
     * @param config Configuration to reason on.
     * @param reasonerConfig the reasoner configuration to be used for reasoning (e.g. taken from the UI, 
     *        may be <b>null</b>)
     */
    public Resolver(Project project, Configuration config, ReasonerConfiguration reasonerConfig) {
        this.reasonerConfig = reasonerConfig;
        this.config = config;
    } 
    
    /**
     * Main constructor that activates Resolver constructor with clean {@link Configuration}.
     * @param project Project for evaluation.
     * @param reasonerConfig the reasoner configuration to be used for reasoning (e.g. taken from the UI, 
     *        may be <b>null</b>)
     */
    public Resolver(Project project, ReasonerConfiguration reasonerConfig) {
        new Resolver(project, createCleanConfiguration(project), reasonerConfig);
    } 
    
    /**
     * Main constructor that activates Resolver constructor.
     * @param config Configuration to reason on.
     * @param reasonerConfig the reasoner configuration to be used for reasoning (e.g. taken from the UI, 
     *        may be <b>null</b>)
     */
    public Resolver(Configuration config, ReasonerConfiguration reasonerConfig) {
        new Resolver(config.getProject(), config, reasonerConfig);
    }  

    @Override
    public void localVariableCreated(LocalDecisionVariable var) {
        contexts.registerMapping(var.getDeclaration(), null);
    }

    @Override
    public void localVariableDisposed(LocalDecisionVariable var) {
        contexts.unregisterMapping(var.getDeclaration());
    }

    // >>> from here the names follows the reasoner.tex documentation

    /**
     * Translates/reschedules a change of value types for compound values. Precondition: constraints are correctly 
     * assigned before, {@code oldValue != newValue} and both, {@code oldValue} and {@code newValue} are not null.
     * 
     * @param variable the variable
     * @param newValue the new value (in {@code variable}
     * @param oldValue the old value
     */
    void translateValueTypeChange(IDecisionVariable variable, Value newValue, Value oldValue) {
        IDatatype newType = newValue.getType();
        IDatatype oldType = oldValue.getType();
        // precondition: oldValue != newValue
        if (NullValue.INSTANCE == newValue) {
            // clear every constraint
            obtainConstraints(variable, true, null);
        } else if (NullValue.INSTANCE == oldValue) {
            // nothing to clear, just add all for newValue
            boolean inc = setIncremental(true); // use incremental mode, disable default values anyway
            translateDeclaration(variable.getDeclaration(), variable, null); // null as access is unclear
            setIncremental(inc);
        } else if (oldType.isAssignableFrom(newType)) {
            // add those between oldValue (exclusive) and newType (inclusive), start at newType
            Set<Compound> types = collectRefines(oldType, newType);
            contexts.setTypeExcludes(types);
            boolean inc = setIncremental(true); // use incremental mode, disable default values anyway
            translateDeclaration(variable.getDeclaration(), variable, null); // null as access is unclear
            setIncremental(inc);
            contexts.setTypeExcludes(null);
            ReasoningUtils.SET_COMPOUND_POOL.releaseInstance(types);
        } else {
            // remove those between newValue and oldValue (start at oldValue)
            Set<Compound> types = collectRefines(oldType, newType);
            obtainConstraints(variable, true, types);        
            ReasoningUtils.SET_COMPOUND_POOL.releaseInstance(types);
        }
    }

    /**
     * Obtains and if specified clears old constraints in the internal reasoner data structures.
     * 
     * @param variable the variable to return the constraints for
     * @param clear {@code true} for clear variables, {@code false} for leave them as they are
     * @param deleteFilter compound types dictating those constraints having them as attached object
     *    that shall be deleted while others shall be left untouched (may be <b>null</b> for delete 
     *    all constraints if {@code clear} is {@code true}.
     * @return the constraints stored for {@code variable}, may be <b>null</b>
     */
    List<Constraint> obtainConstraints(IDecisionVariable variable, boolean clear, 
        Set<Compound> deleteFilter) {
        IConfigurationElement iter = variable;
        List<Constraint> constraints;
        do { // use holder or iterate in case of container element variable
            constraints = iter instanceof IDecisionVariable ? variablesMap.getConstraintsForVariable(iter) : null;
            iter = iter.getParent();
        } while (null == constraints && null != iter);
        if (clear && null != constraints) {
            if (null != deleteFilter) {
                List<Constraint> toRemove = new ArrayList<Constraint>();
                for (int i = constraints.size() - 1; i >= 0; i--) {
                    Constraint cst = constraints.get(i);
                    Object attachedTo = cst.getAttachedTo();
                    if (null != attachedTo && deleteFilter.contains(attachedTo)) {
                        constraints.remove(i);
                        toRemove.add(cst);
                    }
                }
                constraints = toRemove;
            }
            constraintBase.removeAll(constraints);
            failedElements.removeProblemConstraints(constraints);
            // clear dependent
            simpleAssignmentFinder.acceptAndClear(constraints, config, false);
            // clear this variable (if not already cleared)
            variablesMap.removeAll(variable, constraints);
            constraints.clear();
        }
        return constraints;
    }

    /**
     * Moves (temporary) constraints in {@link #otherConstraints} as created by constraint translation to the constraint
     * base. Relates constraints with {@code #variable}.
     * 
     * @param variable the variable to relate constraints to (may be <b>null</b>, ignored then)
     */
    void moveOtherConstraintsToConstraintBase(IDecisionVariable variable) {
        variablesMap.addAll(variable, otherConstraints);
        constraintBase.addAll(otherConstraints, true);
    }

    /**
     * Tries rescheduling the given constraints. Does not add a constraint to the constraint base if already
     * scheduled.
     * 
     * @param declaration the variable declaration to reschedule
     */
    void reschedule(AbstractVariable declaration) {
        Set<Constraint> constraints = variablesMap.getRelevantConstraints(declaration);
        if (null != constraints) {
            for (Constraint varConstraint : constraints) {
                if (!constraintBase.contains(varConstraint)) {
                    constraintBase.addLast(varConstraint);
                }
            }
        }
    }
    
    @Override
    public void notifyResolved(IDecisionVariable compound, String slotName, IDecisionVariable resolved) {
        if (!(resolved.isLocal())) {
            usedVariables.add(resolved);                
        }
    }
    
    @Override
    public void notifyResolved(AbstractVariable declaration, IDecisionVariable resolved) {
        if (!(resolved.isLocal())) {
            usedVariables.add(resolved);
        }            
    }
    
    // <<< documented until here    
    
    // >>> from here the names follow the reasoner.tex documentation
    
    /**
     * Resolves the (initial) values of the configuration.
     * 
     * @see Utils#discoverImports(net.ssehub.easy.basics.modelManagement.IModel)
     * @see #translateConstraints(Project)
     * @see #evaluateConstraintBase(long, Project)
     * @see Configuration#freeze(net.ssehub.easy.varModel.confModel.IFreezeSelector)
     */
    public void resolve() {
        isRunning = true;
        // Stack of importedProject (start with inner most imported project)
        evaluator.init(config, null, false, rescheduler); // also for defaults as they may refer to each other 
        evaluator.setResolutionListener(this);
        evaluator.setScopeAssignments(scopeAssignments);
        endTimestamp = reasonerConfig.getTimeout() <= 0 
            ? -1 : System.currentTimeMillis() + reasonerConfig.getTimeout();
        if (null == copiedState) {
            if (reuseInstance) {
                copiedState = new ReasonerState();
            }
            projects = Utils.discoverImports(config.getProject());
            for (int p = 0; !hasTimeout && !wasStopped && p < projects.size(); p++) {
                project = projects.get(p); // set global for deeper nested methods
                if (Descriptor.LOGGING) {
                    LOGGER.debug("Project:" + project.getName());                
                }
                long start = System.currentTimeMillis();
                translateConstraints(project);
                evaluateConstraintBase(start, project);
            }
        } else {
            variablesMap.clear();
            variablesMap.copyFrom(copiedState.variablesMap);
            // size corresponds to #projects
            for (int p = 0; !hasTimeout && !wasStopped && p < copiedState.constraintBase.size(); p++) {
                project = projects.get(p); // set global for deeper nested methods
                long start = System.currentTimeMillis();
                constraintBase.addAll(copiedState.constraintBase.get(p));
                evaluateConstraintBase(start, project);
            }
        }
        evaluator.clear();
        isRunning = false;
    }

    /**
     * Evaluates all constraints in the constraint base.
     * 
     * @param start the start point in time for reasoning statistics
     * @param project the project to evaluate
     * 
     * @see #evaluateConstraints(Project)
     */
    private void evaluateConstraintBase(long start, Project project) {
        long mid = System.currentTimeMillis();
        translationTime += mid - start;
        evaluateConstraints(project);
        long end = System.currentTimeMillis();
        evaluationTime += end - mid;
        // Freezes values after each scope
        config.freezeValues(project, FilterType.NO_IMPORTS);
        if (Descriptor.LOGGING) {
            printFailedElements(failedElements);                                
        }
    }
    
    /**
     * Evaluates and reschedules failed constraints.
     * 
     * @param project the project to evaluate the constraints for
     * @see #resolve()
     */
    private void evaluateConstraints(Project project) {
        scopeAssignments.clearScopeAssignments();
        evaluator.setDispatchScope(project);
        while (!constraintBase.isEmpty() && !wasStopped) { // reasoner.tex -> hasTimeout see end of loop
            usedVariables.clear();
            Constraint constraint = constraintBase.pop();
            scopeAssignments.setCurrentScope(constraint);
            ConstraintSyntaxTree cst = constraint.getConsSyntax();
            evaluator.setAssignmentState(Constraint.Type.DEFAULT == constraint.getType() 
                ? AssignmentState.DEFAULT : assignmentState);
            reevaluationCounter++;
            if (cst != null) {
                if (Descriptor.LOGGING) {
                    LOGGER.debug("Resolving: " + reevaluationCounter + ": " + toIvmlString(cst) 
                        + " : " + constraint.getTopLevelParent());                    
                }
                evaluator.visit(cst);
                //printConstraintEvaluationResult(constraint, evaluator); // debugging only
                analyzeEvaluationResult(constraint);
                if (null != interceptor) {
                    interceptor.notifyEvaluation(constraint, evaluator);
                }
                if (Descriptor.LOGGING) {
                    LOGGER.debug("Result: " + evaluator.getResult());
                    LOGGER.debug("------");                     
                }
                evaluator.clearIntermediary();
            }
            if (endTimestamp > 0 && System.currentTimeMillis() > endTimestamp) {
                hasTimeout = true;
                break;
            }
        }
    }

    /**
     * Visits the contents of a project for translation. Do not store stateful information in this class.
     * 
     * @author Holger Eichelberger
     */
    private class ConstraintTranslationVisitor extends ModelVisitorAdapter {
        
        // don't follow project imports here, just structural top-level traversal of the actual project!
        private List<PartialEvaluationBlock> evals = null;

        @Override // iterate over all elements declared in project, implicitly skipping not implemented elements
        public void visitProject(Project project) {
            for (int e = 0; e < project.getElementCount(); e++) {
                project.getElement(e).accept(this);
            }
            if (null != evals) {
                // prioritize top-level assignments over eval blocks over other project contents
                // process them at end, force insertion into topLevelConstraints at beginning after all
                inTopLevelEvals = true;
                for (PartialEvaluationBlock block : evals) {
                    for (int i = 0; i < block.getNestedCount(); i++) {
                        block.getNested(i).accept(this);
                    }
                    for (int i = 0; i < block.getEvaluableCount(); i++) {
                        block.getEvaluable(i).accept(this);
                    }
                }
                inTopLevelEvals = false;
            }
        }

        @Override // translate all top-level/enum/attribute assignment declarations
        public void visitDecisionVariableDeclaration(DecisionVariableDeclaration decl) {
            translateDeclaration(decl, config.getDecision(decl), null); 
        }

        @Override // collect all top-level/enum/attribute assignment constraints
        public void visitConstraint(Constraint constraint) {
            addConstraint(topLevelConstraints, constraint, true, null);
        }

        @Override // iterate over nested blocks/contained constraints
        public void visitPartialEvaluationBlock(PartialEvaluationBlock block) {
            if (!inTopLevelEvals) {
                if (null == evals) {
                    evals = new LinkedList<PartialEvaluationBlock>();
                }
                evals.add(block);
            }
        }

        @Override // iterate over nested blocks/contained, translate the individual blocks if not incremental
        public void visitAttributeAssignment(AttributeAssignment assignment) {
            for (int v = 0; v < assignment.getElementCount(); v++) {
                assignment.getElement(v).accept(this);
            }
            for (int c = 0; c < assignment.getConstraintsCount(); c++) {
                addConstraint(topLevelConstraints, assignment.getConstraint(c), true, null);
            }
            for (int a = 0; a < assignment.getAssignmentCount(); a++) {
                assignment.getAssignment(a).accept(this);
            }
            if (!incremental) {
                translateAnnotationAssignments(assignment, null, null, null);
            }
        }
        
    }

    /**
     * Extracts, translates and collects the internal constraints of <code>type</code> (if derived or, transitively, a 
     * reference datatype) and stores the constraints in {@link #derivedTypeConstraints}.
     * 
     * @param decl VariableDeclaration of <code>DerivedDatatype</code>
     * @param type the type to translate
     * @param localDecl the declaration of an iterator variable if quantified constraints shall be created, 
     *     <b>null</b> for normal constraints
     * @param parent the parent model element for creating constraint instances
     * @param refCounter the number of intermediary reference types on the path from the top-most call (call with 
     *     <code>0</code>)
     */
    private void translateDerivedDatatypeConstraints(AbstractVariable decl, IDatatype type, 
        DecisionVariableDeclaration localDecl, IModelElement parent, int refCounter) {
        if (type instanceof DerivedDatatype) {
            DerivedDatatype dType = (DerivedDatatype) type;
            int count = dType.getConstraintCount();
            DecisionVariableDeclaration dVar = dType.getTypeDeclaration();
            AbstractVariable declaration = null == localDecl ? decl : localDecl;
            if (count > 0 && dVar != declaration) {
                substVisitor.setMappings(contexts);
                substVisitor.addVariableMapping(dVar, declaration, refCounter);
                //Copy and replace each instance of the internal declaration with the given instance
                for (int i = 0; i < count; i++) {
                    ConstraintSyntaxTree cst = dType.getConstraint(i).getConsSyntax();
                    if (null != localDecl) {
                        cst = createContainerCall(new Variable(decl), Container.FORALL, cst, localDecl);
                    }
                    cst = substVisitor.accept(cst);
                    try {
                        cst.inferDatatype();
                        addConstraint(topLevelConstraints, new Constraint(cst, parent), true, null);
                    } catch (CSTSemanticException e) {
                        LOGGER.exception(e);
                    }
                }
                substVisitor.clear();
            }
            translateDerivedDatatypeConstraints(decl, dType.getBasisType(), localDecl, parent, refCounter);
        } else if (type instanceof Reference) { // dereference
            translateDerivedDatatypeConstraints(decl, ((Reference) type).getType(), localDecl, parent, refCounter + 1);
        }
    }
    
    /**
     * Translates annotation declarations.
     * 
     * @param decl {@link AbstractVariable} with annotations.
     * @param variable {@link IDecisionVariable} with annotations.
     * @param cAcc {@link CompoundAccess} <b>null</b> if variable is not nested, else accessor expression to 
     *     <code>variable</code>.
     */
    private void translateAnnotationDeclarations(AbstractVariable decl, IDecisionVariable variable, 
        ConstraintSyntaxTree cAcc) {
        ConstraintSyntaxTree acc = null == cAcc ? new Variable(decl) : cAcc;
        // not in nested assignment or compound attributes
        boolean isNested = (contexts.size() > 1 
            || TypeQueries.isCompound(DerivedDatatype.resolveToBasis(variable.getDeclaration().getType())));
        if (null != variable) {
            for (int i = 0; i < variable.getAttributesCount(); i++) {
                IDecisionVariable att = variable.getAttribute(i);
                translateAnnotationDeclaration((Attribute) att.getDeclaration(), att, acc, isNested);
            }
        } else {
            for (int i = 0; i < decl.getAttributesCount(); i++) {
                translateAnnotationDeclaration(decl.getAttribute(i), null, acc, isNested);
            }
        }
    }

    /**
     * Translates an annotation declaration.
     * 
     * @param decl {@link AbstractVariable} with annotations.
     * @param variable {@link IDecisionVariable} with annotations.
     * @param cAcc {@link CompoundAccess} <b>null</b> if variable is not nested, else accessor expression to 
     *     <code>variable</code>.
     * @param qualifyAttribute whether the attribute must be explicitly qualified via <code>cAcc</code>
     */
    private void translateAnnotationDeclaration(Attribute decl, IDecisionVariable variable, ConstraintSyntaxTree cAcc, 
        boolean qualifyAttribute) {
        ConstraintSyntaxTree attAcc = cAcc;
        if (null != cAcc && qualifyAttribute) {
            attAcc = new AttributeVariable(cAcc, decl);
        }
        translateDeclaration(decl, variable, attAcc);
    }

    /**
     * Translates the (transitive) defaults and type constraints for a declaration. 
     * 
     * @param decl The {@link AbstractVariable} for which the default value should be resolved.
     * @param var the instance of <tt>decl</tt> (may be <b>null</b> for type-based translation).
     * @param cAcc if variable is a nested compound.
     */
    private void translateDeclaration(AbstractVariable decl, IDecisionVariable var, ConstraintSyntaxTree cAcc) {
        variablesCounter++;
        IDatatype declType = decl.getType();
        IDatatype actType = declType;
        ConstraintSyntaxTree defaultValue = incremental ? null : decl.getDefaultValue();
        AbstractVariable self = null;
        ConstraintSyntaxTree selfEx = null;
        if (null != defaultValue) { // considering the actual type rather than base
            actType = inferTypeSafe(defaultValue, actType);
        }
        if (null != var && null != var.getValue()) {
            actType = var.getValue().getType();
        }
        int compoundMode = MODE_COMPOUND_NONE;
        boolean isCompound = TypeQueries.isCompound(actType);
        if (isCompound) { // this is a compound value -> default constraints, do not defer
            self = decl;
            compoundMode = translateCompoundDeclaration(decl, var, cAcc, (Compound) actType, MODE_COMPOUND_REGISTER); 
        }
        // next if: implicit overriding of default values through AttributeAssignment - leave out her
        if (null != defaultValue && !(decl.isAttribute() && decl.getParent() instanceof AttributeAssignment)) {
            if (cAcc instanceof CompoundAccess) { // defer init constraints to prevent accidental init override
                selfEx = ((CompoundAccess) cAcc).getCompoundExpression();
            }
            try {
                if (TypeQueries.isConstraint(declType)) { // handle and register constraint variables
                    variablesCounter--;
                    // use closest parent instead of project -> runtime analysis
                    createConstraintVariableConstraint(defaultValue, selfEx, self, decl, var);
                } 
                ConstraintSyntaxTree acc;
                if (decl instanceof Attribute) {
                    Attribute attribute = (Attribute) decl;
                    if (cAcc == null) {
                        acc = new Variable(attribute); // shall not occur
                    } else if (cAcc instanceof AttributeVariable) { // do not double qualify
                        acc = cAcc;
                    } else {
                        acc = new AttributeVariable(cAcc, attribute);
                    }
                } else {
                    acc = null != selfEx ? cAcc : new Variable(decl);
                }
                defaultValue = new OCLFeatureCall(acc, OclKeyWords.ASSIGNMENT, defaultValue);
                defaultValue = substituteVariables(defaultValue, selfEx, self);
                ConstraintList targetCons = defaultConstraints; 
                if (substVisitor.containsSelf() || isOverriddenSlot(decl)) {
                    targetCons = deferredDefaultConstraints;
                }
                addConstraint(targetCons, new DefaultConstraint(defaultValue, project), true, var);
                substVisitor.clear(); // clear false above 
            } catch (CSTSemanticException e) {
                LOGGER.exception(e); // should not occur, ok to log
            }            
        }
        if (!incremental) {
            translateAnnotationDeclarations(decl, var, cAcc);
        }
        translateDerivedDatatypeConstraints(decl, declType, null, decl.getTopLevelParent(), 0);
        if (isCompound) { // this is a compound value -> default constraints, do not defer
            translateCompoundDeclaration(decl, var, cAcc, (Compound) actType, compoundMode); 
        } else if (TypeQueries.isContainer(actType)) { // this is a container value -> default constraints, do not defer
            translateContainerDeclaration(decl, var, actType, cAcc);
        }
    }

    /**
     * Translates the (transitive) defaults and type constraints for a container declaration. 
     * 
     * @param decl The {@link AbstractVariable} for which the default value should be resolved.
     * @param var the instance of <tt>decl</tt> (may be <b>null</b> for type-based translation).
     * @param type the (specific) datatype ({@link Container})
     * @param cAcc compound access expression
     */
    private void translateContainerDeclaration(AbstractVariable decl, IDecisionVariable var, IDatatype type, 
        ConstraintSyntaxTree cAcc) {
        contexts.pushContext(decl, false);
        Container declType = (Container) type;
        IDatatype dContainedType = getDeepestContainedType(declType);
        IDatatype dContainedBasisType = DerivedDatatype.resolveToBasis(dContainedType);
        ContainerValue val = getRelevantValue(decl, var, incremental, ContainerValue.class);
        if (TypeQueries.isConstraint(dContainedBasisType)) { // don't care for derived
            if (null != val) {
                createContainerConstraintValueConstraints(val, cAcc, null, decl, var);
            } 
        } else {
            if (TypeQueries.isCompound(dContainedBasisType)) {
                Set<Compound> used = SET_COMPOUND_POOL.getInstance();
                if (null != val) {
                    getUsedCompoundTypes(val, used);
                    Set<Compound> tmp = SET_COMPOUND_POOL.getInstance();
                    purgeRefines(used, tmp);
                    SET_COMPOUND_POOL.releaseInstance(used);
                    used = tmp;
                } else if (dContainedBasisType instanceof Compound) {
                    used.add((Compound) dContainedBasisType);
                }
                for (Compound uType : used) {
                    translateCompoundContainer(decl, uType, dContainedType, cAcc);
                }
                SET_COMPOUND_POOL.releaseInstance(used);
            }
        }
        // in any case
        if (dContainedType instanceof DerivedDatatype || dContainedType instanceof Reference) {
            translateDerivedDatatypeConstraints(decl, dContainedType,  
                new DecisionVariableDeclaration("derivedType", dContainedType, null), project, 0);
        }
        contexts.popContext();
    }

    /**
     * Translates an entire compound container <code>decl</code> including defaults and constraints for the specific
     * type <code>cmpType</code> (iterate through all relevant types).
     * 
     * @param decl the declaration
     * @param type the compound type to translate for
     * @param declaredContainedType the declared contained type of <code>decl</code>
     * @param cAcc compound access to <code>decl</code> if needed (may be <b>null</b>)
     */
    private void translateCompoundContainer(AbstractVariable decl, Compound type, IDatatype declaredContainedType, 
        ConstraintSyntaxTree cAcc) {
        if (!contexts.alreadyProcessed(type)) {
            contexts.recordProcessed(type);
            final DecisionVariableDeclaration localDecl = new DecisionVariableDeclaration("cmp" + contexts.size(), 
                type, null);
            Variable localVar = new Variable(localDecl);
            Variable declVar = new Variable(decl);
            // we may transfer the attributes from decl here to localDecl, or we just pass decl as attribute provider
            // to the translation, which is more time/memory efficient
            // fill varMap
            ConstraintSyntaxTree containerOp = null == cAcc ? declVar : cAcc;
            try {
                if (TypeQueries.isSequence(decl.getType())) {
                    containerOp = new OCLFeatureCall(containerOp, OclKeyWords.AS_SET);
                }
                if (isNestedContainer(decl.getType())) {
                    containerOp = new OCLFeatureCall(containerOp, OclKeyWords.FLATTEN);
                }
                if (!TypeQueries.sameTypes(type, declaredContainedType)) {
                    containerOp = new OCLFeatureCall(containerOp, OclKeyWords.SELECT_BY_KIND, 
                        createTypeValueConstant(type));
                }
            } catch (IvmlException e) {
                LOGGER.exception(e); // should not occur if constraints are created correctly, ok to log
            }
            
            contexts.pushContext(null, containerOp, localDecl, true);
            registerCompoundMapping(type, localVar, declVar);
            translateCompoundContent(localDecl, null, type, localVar);
            contexts.popContext();
        }
    }

    /**
     * Translates translating compound type declarations, but only if not 
     * {@link ContextStack#alreadyProcessed(IDatatype)} in nested collection/compound types.
     * 
     * @param decl The {@link AbstractVariable} for which the default value should be resolved.
     * @param variable the instance of <tt>decl</tt> (may be <b>null</b> for based-type translation).
     * @param cAcc if variable is a nested compound, the access expression to 
     *     <code>decl</code>/<code>variable</code>
     * @param type specific {@link Compound} type.
     * @param mode the processing mode, either {@link #MODE_COMPOUND_REGISTER} for just registering the compound slot 
     *     accessor expressions, which must either be followed with {@link #MODE_COMPOUND_TRANSLATE} or 
     *     {@link ContextStack#popContext()} on
     *     the same nesting level. Not processing a complete compound allows keeping the registered scope open
     *     for processing related (default) value expressions that may refer to compound slots. May also 
     *     be {@link #MODE_COMPOUND_NONE} for not processing anything.
     * @return the next mode for calling this method again with the same parameters, typically 
     *     {@link #MODE_COMPOUND_NONE} or {@link #MODE_COMPOUND_TRANSLATE} if {@code mode} was 
     *     {@link #MODE_COMPOUND_REGISTER}
     */
    private int translateCompoundDeclaration(AbstractVariable decl, IDecisionVariable variable,
        ConstraintSyntaxTree cAcc, Compound type, int mode) {
        int nextMode = MODE_COMPOUND_NONE;
        if (!contexts.alreadyProcessed(type)) {
            if (MODE_COMPOUND_REGISTER == mode) {
                contexts.pushContext(decl, null == variable);
                contexts.transferTypeExcludes(type);
                registerCompoundMapping(type, cAcc, new Variable(decl));
                nextMode = MODE_COMPOUND_TRANSLATE;
            }
            if (MODE_COMPOUND_TRANSLATE == mode) {
                translateCompoundContent(decl, variable, type, cAcc);
                contexts.popContext();
                contexts.recordProcessed(type);
                nextMode = MODE_COMPOUND_NONE;
            }
        }
        return nextMode;
    }

    /**
     * Registers the mapping for a compound type.
     * 
     * @param type the compound type
     * @param cAcc the accessor expression (may be <b>null</b>)
     * @param declVar the compound variable as expression
     */
    private void registerCompoundMapping(Compound type, ConstraintSyntaxTree cAcc, Variable declVar) {
        for (int i = 0, n = type.getInheritedElementCount(); i < n; i++) {
            AbstractVariable nestedDecl = type.getInheritedElement(i);
            ConstraintSyntaxTree acc;
            if (null == cAcc) {
                acc = new CompoundAccess(declVar, nestedDecl.getName());
            } else {
                acc = new CompoundAccess(cAcc, nestedDecl.getName());
            }
            contexts.registerMapping(nestedDecl, acc);
            for (int a = 0, m = nestedDecl.getAttributesCount(); a < m; a++) {
                Attribute attr = nestedDecl.getAttribute(a);
                ConstraintSyntaxTree aAcc = new AttributeVariable(acc, attr);
                contexts.registerMapping(attr, aAcc);
            }
        }
        annotationMapper.initialize(cAcc, declVar);
        try {
            annotationMapper.visitAnnotations(declVar.getVariable());
        } catch (IvmlException e) {
        }
        annotationMapper.clear();
    }

    /**
     * Implements a compound annotation mapper. Call 
     * {@link #initialize(ConstraintSyntaxTree, Variable)} first, then 
     * {@link #visitAnnotations(net.ssehub.easy.varModel.model.IAttributeAccess)} and finally {@link #clear()}.
     * 
     * @author Holger Eichelberger
     */
    private class CompoundAnnotationMapper extends AnnotationVisitor {

        private ConstraintSyntaxTree cAcc;
        private Variable declVar;

        /**
         * Initializes the mapper.
         * 
         * @param cAcc the accessor expression (may be <b>null</b>)
         * @param declVar the compound variable as expression
         */
        protected void initialize(ConstraintSyntaxTree cAcc, Variable declVar) {
            this.cAcc = cAcc;
            this.declVar = declVar;
        }

        /**
         * Clears the mapper.
         */
        protected void clear() {
            this.cAcc = null;
            this.declVar = null;
        }
        
        @Override
        protected void processAttributeAssignment(AttributeAssignment assng) throws IvmlException {
        }

        @Override
        protected void processAttribute(Attribute attr) throws IvmlException {
            ConstraintSyntaxTree acc;
            if (null == cAcc) {
                acc = new AttributeVariable(declVar, attr);
            } else {                        
                acc = new AttributeVariable(cAcc, attr);
            }
            Attribute iter = attr;
            while (null != iter) {
                contexts.registerMapping(iter, acc);
                iter = iter.getOrigin();
            }
        }
        
    }

    /**
     * Translates the compound content.
     * 
     * @param decl the compound variable (self, instead of <code>cAcc</code>)
     * @param variable the decision variable holding <code>decl</code>, may be <b>null</b> - ignored then
     * @param type the (specific) compound type
     * @param cAcc the compound access expression
     */
    private void translateCompoundContent(AbstractVariable decl, IDecisionVariable variable, Compound type, 
        ConstraintSyntaxTree cAcc) {
        if (null != variable) {
            for (int i = 0, n = variable.getNestedElementsCount(); i < n; i++) {
                IDecisionVariable nestedVar = variable.getNestedElement(i);
                AbstractVariable nestedDecl = nestedVar.getDeclaration();
                if (!contexts.isElementTypeExcluded(nestedDecl.getParent())) {
                    translateDeclaration(nestedDecl, nestedVar, contexts.getMapping(nestedDecl));
                }
            }
        } else {
            for (int i = 0, n = type.getInheritedElementCount(); i < n; i++) {
                AbstractVariable nestedDecl = type.getInheritedElement(i);
                if (!contexts.isElementTypeExcluded(nestedDecl.getParent())) {
                    translateDeclaration(nestedDecl, null, contexts.getMapping(nestedDecl));
                }
            }
        }
        if (!incremental) {
            for (int a = 0; a < type.getAssignmentCount(); a++) {
                translateAnnotationAssignments(type.getAssignment(a), variable, null, cAcc);
            }
        }
        final AbstractVariable self = null == cAcc ? decl : null;
        processCompoundEvals(type, cAcc, self, variable);
        otherConstraintsProc.setParameter(cAcc, self, variable);
        allCompoundConstraints(type, otherConstraintsProc, false, false, decl);
        otherConstraintsProc.clear();
    }

    /**
     * Implements a processor for constraints, for which variables (including the variable mapping) shall be substituted
     * and the result shall be added to {@link Resolver#otherConstraints}. Call 
     * {@link #setParameter(CompoundAccess, AbstractVariable)} before
     * processing and {@link #clear()} afterwards before reuse.
     * 
     * @author Holger Eichelberger
     */
    private class OtherConstraintsProcessor extends AbstractConstraintProcessor {

        private ConstraintSyntaxTree selfEx;
        private AbstractVariable self;
        private IDecisionVariable variable;
       
        /**
         * Sets the parameters for processing.
         * 
         * @param selfEx an expression representing <i>self</i> (ignored if <b>null</b>, <code>self</code> and 
         *     <code>selfEx</code> shall never both be specified/not <b>null</b>).
         * @param self an variable declaration representing <i>self</i> (ignored if <b>null</b>).
         * @param variable the variable the constraints are processed for (may be <b>null</b>)
         */
        private void setParameter(ConstraintSyntaxTree selfEx, AbstractVariable self, IDecisionVariable variable) {
            this.selfEx = selfEx;
            this.self = self;
            this.variable = variable;
        }
        
        /**
         * Clears the parameters for reuse. Although clearing may be superfluous, it also helps getting rid of 
         * unnecessary references / supports garbage collection.
         */
        private void clear() {
            this.selfEx = null;
            this.self = null;
            this.variable = null;
        }
        
        @Override
        public ConstraintSyntaxTree process(ConstraintSyntaxTree cst, ExpressionType type, String slot, 
            IModelElement parent) {
            cst = substituteVariables(cst, selfEx, self);
            try { // compoundConstraints
                Constraint constraint = new AttachedConstraint(cst, contexts.getCurrentType(), parent);
                addConstraint(otherConstraints, constraint, true, variable);
                if (ExpressionType.CONSTRAINT == type || ExpressionType.ASSIGNMENT_CONSTRAINT == type) {
                    registerConstraint(variable, constraint);
                }
            } catch (CSTSemanticException e) {
                LOGGER.exception(e);
            }               
            return cst;
        }

        @Override
        public ContextStack getContextStack() {
            return contexts;
        }

    }

    /**
     * Method for extracting constraints from compounds eval blocks (also refined compounds).
     * @param cmpType Compound to be analyzed 
     * @param selfEx an expression representing <i>self</i> (ignored if <b>null</b>, <code>self</code> and 
     *     <code>selfEx</code> shall never both be specified/not <b>null</b>).
     * @param self an variable declaration representing <i>self</i> (ignored if <b>null</b>).
     * @param variable optional variable for registering constraints
     */
    private void processCompoundEvals(Compound cmpType, ConstraintSyntaxTree selfEx, AbstractVariable self, 
        IDecisionVariable variable) {
        if (!contexts.isTypeExcluded(cmpType)) {
            for (int r = 0; r < cmpType.getRefinesCount(); r++) {
                processCompoundEvals(cmpType.getRefines(r), selfEx, self, variable);
            }
            for (int i = 0; i < cmpType.getModelElementCount(); i++) {            
                if (cmpType.getModelElement(i) instanceof PartialEvaluationBlock) {
                    PartialEvaluationBlock evalBlock = (PartialEvaluationBlock) cmpType.getModelElement(i);
                    processEvalConstraints(evalBlock, selfEx, self, variable);
                }
            }
        }
    }
    
    /**
     * Method for handling eval blocks - searching for nested eval blocks and extracting constraints.
     * 
     * @param evalBlock Eval block to be processed.
     * @param selfEx an expression representing <i>self</i> (ignored if <b>null</b>, <code>self</code> and 
     *     <code>selfEx</code> shall never both be specified/not <b>null</b>).
     * @param self an variable declaration representing <i>self</i> (ignored if <b>null</b>).
     * @param variable optional variable for registering constraints
     * @see #registerConstraint(IDecisionVariable, Constraint)
     */
    private void processEvalConstraints(PartialEvaluationBlock evalBlock, ConstraintSyntaxTree selfEx, 
        AbstractVariable self, IDecisionVariable variable) {
        for (int i = 0; i < evalBlock.getNestedCount(); i++) {
            processEvalConstraints(evalBlock.getNested(i), selfEx, self, variable);
        }
        for (int i = 0; i < evalBlock.getEvaluableCount(); i++) {
            if (evalBlock.getEvaluable(i) instanceof Constraint) {
                Constraint evalConstraint = (Constraint) evalBlock.getEvaluable(i);
                ConstraintSyntaxTree evalCst = evalConstraint.getConsSyntax();
                ConstraintSyntaxTree cst = substituteVariables(evalCst, selfEx, self);
                try {
                    Constraint constraint = new Constraint(cst, project);
                    addConstraint(otherConstraints, constraint, true, null);
                    registerConstraint(variable, constraint);
                } catch (CSTSemanticException e) {
                    LOGGER.exception(e);
                } 
            }
        }
    }
    
    /**
     * Checks a container value for nested constraint values, i.e., values of nested constraint variables.
     * 
     * @param val the container value
     * @param selfEx expression representing <i>self</i>, must never be not null in conjunction with <code>self</code>
     * @param self the variable declaration representing <i>self</i>, must never be not null in conjunction 
     * with <code>self</code>
     * @param parent the parent for new constraints
     * @param nestedVariable the variable holding the constraint value
     */
    void createContainerConstraintValueConstraints(ContainerValue val, ConstraintSyntaxTree selfEx, 
        AbstractVariable self, IModelElement parent, IDecisionVariable nestedVariable) {
        for (int n = 0; n < val.getElementSize(); n++) {
            Value cVal = val.getElement(n);
            ConstraintSyntaxTree cst = getConstraintValueExpression(cVal);
            if (null != cst) {
                createConstraintVariableConstraint(cst, selfEx, self, parent, nestedVariable);
            } else if (cVal instanceof ContainerValue) {
                createContainerConstraintValueConstraints(((ContainerValue) cVal), selfEx, self, 
                    parent, nestedVariable);
            }
        }
    }

    /**
     * Translates attribute assignments. It is important to recall that in case of nested (orthogonal) attribute 
     * assignments, the outer one(s) must also be applied to the inner ones.
     * 
     * @param assignment Attribute assignments on top-level.
     * @param var variable holding the assignment, may be <b>null</b> for translating types
     * @param effectiveAssignments the list of effective current assignments, use <b>null</b> if not recursive.
     * @param compound Parent {@link CompoundAccess}.
     */
    private void translateAnnotationAssignments(AttributeAssignment assignment, IDecisionVariable var, 
        List<Assignment> effectiveAssignments, ConstraintSyntaxTree compound) {
        List<Assignment> assng = null == effectiveAssignments ? new ArrayList<Assignment>() : effectiveAssignments;
        for (int d = 0; d < assignment.getAssignmentDataCount(); d++) { 
            assng.add(assignment.getAssignmentData(d));
        }
        Set<String> done = new HashSet<String>();
        for (int d = assng.size() - 1; d >= 0; d--) { // process latest first
            Assignment effectiveAssignment = assng.get(d);
            String name = effectiveAssignment.getName();
            if (!done.contains(name)) {
                done.add(name);
                for (int e = 0; e < assignment.getElementCount(); e++) {
                    DecisionVariableDeclaration aElt = assignment.getElement(e);
                    String aEltName = aElt.getName();
                    translateAnnotationAssignment(effectiveAssignment, aElt, compound);
                    IDatatype aEltType = aElt.getType();
                    if (TypeQueries.isCompound(aEltType)) {
                        Compound cmp = (Compound) aEltType;
                        ConstraintSyntaxTree acc;
                        if (null != var) {
                            IDecisionVariable v = var.getNestedElement(aEltName);
                            if (null != v && null != v.getValue()) {
                                aEltType = v.getValue().getType();
                            }
                        }
                        if (null != compound) { // already nested
                            acc = new CompoundAccess(compound, aEltName); // may still be null
                        } else if (null != var) {
                            acc = new CompoundAccess(new Variable(var.getDeclaration()), aEltName);
                        } else { // top-level
                            acc = new Variable(aElt);
                        }
                        for (int s = 0; s < cmp.getDeclarationCount(); s++) {
                            DecisionVariableDeclaration slot = cmp.getDeclaration(s);
                            translateAnnotationAssignment(effectiveAssignment, slot, 
                                new CompoundAccess(acc, slot.getName()));
                        }
                    }
                }
            }
        }        
        for (int a = 0; a < assignment.getAssignmentCount(); a++) {
            translateAnnotationAssignments(assignment.getAssignment(a), var, assng, compound);
        }
    }
    
    /**
     * Method for creating attribute constraint for a specific element.
     * @param assignment Attribute assignment constraint.
     * @param element Elements to which the attribute is assigned.
     * @param compound Nesting compound if there is one, may be <b>null</b> for none.
     */
    private void translateAnnotationAssignment(Assignment assignment, DecisionVariableDeclaration element,
        ConstraintSyntaxTree compound) {
        Attribute attrib = ModelQuery.findAttribute(element, assignment.getName());
        if (null != attrib) {
            ConstraintSyntaxTree cst;
            //handle annotations in compounds
            if (null == compound) {
                compound = contexts.getMapping(element);
            }
            if (compound == null) {
                cst = new AttributeVariable(new Variable(element), attrib);
            } else {
                cst = new AttributeVariable(compound, attrib);
            }
            cst = new OCLFeatureCall(cst, OclKeyWords.ASSIGNMENT, assignment.getExpression());
            cst = substituteVariables(cst, compound, null);
            inferTypeSafe(cst, null);
            try {
                addConstraint(otherConstraints, new AnnotationAssignmentConstraint(cst, project), false, null); 
            } catch (CSTSemanticException e) {
                LOGGER.exception(e);
            }
        }
    }

    /**
     * Translates and collects all constraints in <code>project</code> by adding the collected constraints to the 
     * {@link #constraintBase}.
     * 
     * @param project the project to translate the constraints for
     * @see #resolve()
     */
    private void translateConstraints(Project project) {
        project.accept(projectVisitor);
        constraintBase.addAll(defaultConstraints, true); // true = clear take over nodes
        constraintBase.addAll(deferredDefaultConstraints, true);
        constraintBase.addAll(topLevelConstraints, true);
        constraintBase.addAll(otherConstraints, true);
        constraintCounter = constraintBase.size();
        variablesInConstraintsCounter = variablesMap.getDeclarationSize();
        // if marked for re-use, copy constraint base
        if (null != copiedState) {
            ConstraintList copy = new ConstraintList();
            copy.addAll(constraintBase); // do not clear here!
            copiedState.constraintBase.add(copy);
        }
        contexts.clear();
    }
    
    /**
     * Adding a constraint to a constraint set, checking for contained container/compound initializers if
     * requested. 
     * 
     * @param target the target container for assignment constraints (higher priority)
     * @param constraint the constraint (may be modified as a side effect)
     * @param checkForInitializers check also for initializers if (<code>true</code>), add only if (<code>false</code>)
     * @param variable the actually (nested) variable, used to relate the created constraint to, may be <b>null</b>. 
     *     This information is particularly relevant for constraints arising from constraint variables.
     */
    private void addConstraint(ConstraintList target, Constraint constraint, boolean checkForInitializers, 
        IDecisionVariable variable) {
        ConstraintSyntaxTree cst = constraint.getConsSyntax();
        try {
            cst = contexts.composeExpression(cst); // pass on possibly changed cst
            constraint.setConsSyntax(cst);
        } catch (CSTSemanticException e) {
            LOGGER.exception(e); // shall not occur if constraints are created correctly, ok to log
        }
        // check whether the constraint is a value assignment
        if (checkForInitializers) { // needed, also to avoid recursions on constant values inducing constraints
            initChecker.accept(cst, constraint.getParent(), variable);
        }
        boolean add = true;
        if (incremental) {
            add = !CSTUtils.isAssignment(cst);
            if (add) {
                variablesFinder.setConfiguration(config);
                cst.accept(variablesFinder);
                add = !variablesFinder.isConstraintFrozen();
                variablesFinder.clear();
            }
        }
        if (add) {
            if (inTopLevelEvals && (target == otherConstraints || target == topLevelConstraints)) {
                target.addFirst(constraint);
            } else {
                target.addLast(constraint);
            }
            simpleAssignmentFinder.acceptAndClear(constraint, config);
        }
    }

    /**
     * Creates a constraint for a (nested) constraint variable adding the result to 
     * {@link #constraintVariablesConstraints}. Performs initializers check upon adding if <code>cst</code> is not
     * a {@link ConstantValue}.
     * 
     * @param cst the constraint
     * @param selfEx the expression representing <i>self</i> in <code>cst</code>, both, <code>self</code> and 
     *    <code>selfEx</code> must not be different from <b>null</b> at the same time (may be <b>null</b> for none)
     * @param self the declaration of the variable representing <i>self</i> in <code>cst</code> (may be <b>null</b> 
     *    for none)
     * @param parent the parent for new constraints
     * @param variable the actually (nested) variable, used to relate the created constraint to, may be <b>null</b>
     * @return the created constraint
     * @see #createConstraintVariableConstraint(ConstraintSyntaxTree, AbstractVariable, boolean, IModelElement, 
     *     IDecisionVariable)
     */
    Constraint createConstraintVariableConstraint(ConstraintSyntaxTree cst, ConstraintSyntaxTree selfEx, 
        AbstractVariable self, IModelElement parent, IDecisionVariable variable) {
        cst = substituteVariables(cst, selfEx, self);
        return createConstraintVariableConstraint(cst, self, 
            !(cst instanceof ConstantValue), parent, variable);
    }

    /**
     * Creates a constraint for a (nested) constraint variable adding the result to 
     * {@link #otherConstraints}. Registers the constraint if needed.
     * 
     * @param cst the constraint
     * @param self the declaration of the variable representing <i>self</i> in <code>cst</code> (may be <b>null</b> 
     *    for none), just used for logging
     * @param checkForInitializers whether initializers shall be checked (recursively) when adding aconstraint
     * @param parent the parent for new constraints
     * @param variable the actually (nested) variable, used to relate the created constraint to, may be <b>null</b>
     * @return the created constraint
     * @see #addConstraint(ConstraintList, Constraint, boolean, IDecisionVariable)
     * @see #registerConstraint(IDecisionVariable, Constraint)
     */
    Constraint createConstraintVariableConstraint(ConstraintSyntaxTree cst, AbstractVariable self, 
        boolean checkForInitializers, IModelElement parent, IDecisionVariable variable) {
        Constraint constraint = null;
        try {
            constraint = new ConstraintVariableConstraint(cst, parent);
            // constants can cause endless recursion
            addConstraint(otherConstraints, constraint, checkForInitializers, variable);
            registerConstraint(variable, constraint);
            if (Descriptor.LOGGING) {
                LOGGER.debug((null != self ? self.getName() + "." : "") 
                    + (null != variable ? variable.getDeclaration().getName() : "")
                    + " constraint variable " + toIvmlString(cst));
            }
        } catch (CSTSemanticException e) {
            LOGGER.exception(e);
        }
        return constraint;
    }
    
    /**
     * Registers a <code>variable</code> and associated <code>constraint</code>.
     * 
     * @param variable the variable (may be <b>null</b>, call is ignored then)
     * @param constraint the constraint
     * 
     * @see #register(IDecisionVariable, Constraint, Map, Map)
     */
    private void registerConstraint(IDecisionVariable variable, Constraint constraint) {
        if (null != variable) {
            variablesMap.registerConstraint(variable, constraint);
            if (null != copiedState) {
                copiedState.variablesMap.registerConstraint(variable, constraint);
            }
        }
    }

    // <<< documented until here    
    
    // messages
    
    /**
     * Records information about the evaluation result, failed evaluation messages.
     * 
     * @param constraint the constraint to record the actual messages for
     */
    private void analyzeEvaluationResult(Constraint constraint) {
        if (evaluator.constraintFailed()) {
            FailedElementDetails failedElementDetails = new FailedElementDetails();
            failedElementDetails.setProblemPoints(new HashSet<IDecisionVariable>(usedVariables));
            failedElementDetails.setProblemConstraintPart(getFailedConstraintPart());
            failedElementDetails.setProblemConstraint(constraint);
            failedElementDetails.setErrorClassifier(ReasoningErrorCodes.FAILED_CONSTRAINT);
            failedElements.addProblemConstraint(constraint, failedElementDetails);
            if (Descriptor.LOGGING) {
                LOGGER.debug("Failed constraint: " + toIvmlString(constraint));
                printModelElements(config, "constraint resolved");
                printProblemPoints(usedVariables);
            }
        } else if (evaluator.constraintFulfilled()) {
            failedElements.removeProblemConstraint(constraint);
            if (Descriptor.LOGGING) {
                LOGGER.debug("Constraint fulfilled: " + toIvmlString(constraint));
            }
        }
        // must be done always, constraints -> undefined may cause illegal variable assignments as side effect
        for (int j = 0; j < evaluator.getMessageCount(); j++) {
            Message msg = evaluator.getMessage(j);
            AbstractVariable var = msg.getVariable();
            if (var != null) {
                // no local variable, i.e., defined for/within user-defined operation or within constraint
                if (!(var.getParent() instanceof OperationDefinition) && !(var.getParent() instanceof Constraint)) {
                    usedVariables.clear();
                    usedVariables.add(msg.getDecision());
                    FailedElementDetails failedelementDetails = new FailedElementDetails();
                    failedelementDetails.setProblemPoints(new HashSet<IDecisionVariable>(usedVariables));
                    // due to NULL result if failed assignment
                    failedelementDetails.setProblemConstraintPart(constraint.getConsSyntax());
                    failedelementDetails.setProblemConstraint(constraint);
                    failedelementDetails.setErrorClassifier(ReasoningErrorCodes.FAILED_REASSIGNMENT);
                    failedElements.addProblemVariable(var, failedelementDetails);
                    if (Descriptor.LOGGING) {
                        LOGGER.debug("Assigment error: " + evaluator.getMessage(j).getVariable());
                        printProblemPoints(usedVariables);
                    }
                }
            } 
        }
        if (evaluator.constraintFulfilled() && Constraint.Type.DEFAULT == constraint.getType()) {
            simpleAssignmentFinder.acceptAndClear(constraint, config, false);
        }
    }
    
    // helpers, accessors

    /**
     * Method for using {@link SubstitutionVisitor} for constraint transformation. Uses the actual
     * variable mapping in {@link #varMap} and may consider a mapping for <code>self</code>.
     * 
     * @param cst Constraint to be transformed.
     * @param selfEx an expression representing <i>self</i> (ignored if <b>null</b>, <code>self</code> and 
     *     <code>selfEx</code> shall never both be specified/not <b>null</b>).
     * @param self an variable declaration representing <i>self</i> (ignored if <b>null</b>).
     * @return Transformed constraint.
     */
    ConstraintSyntaxTree substituteVariables(ConstraintSyntaxTree cst, ConstraintSyntaxTree selfEx, 
        AbstractVariable self) {
        substVisitor.setMappings(contexts);
        if (selfEx != null) {
            substVisitor.setSelf(selfEx);            
        }
        if (self != null) {
            substVisitor.setSelf(self);            
        }
        cst = substVisitor.acceptAndClear(cst);
        inferTypeSafe(cst, null);
        return cst;
    }
    
    /**
     * Will be called after a failure was detected in a default constraint of an {@link AbstractVariable}.
     * @param decl The conflicting declaration of an {@link AbstractVariable}.
     *     Call {@link AbstractVariable#getDefaultValue()} to retrieve the conflicting constraint.
     */
    @SuppressWarnings("unused")
    private void conflictingDefault(AbstractVariable decl) {
        // currently unused
    }
    
    /**
     * Method for creating a clean {@link Configuration}.
     * @param project Project for {@link Configuration}
     * @return Created {@link Configuration}
     */
    private Configuration createCleanConfiguration(Project project) {
        return new Configuration(project, false);
    }
    
    /**
     * Method for checking part of a failed constraints against null.
     * @return null or part of a failed constraint.
     */
    private ConstraintSyntaxTree getFailedConstraintPart() {
        ConstraintSyntaxTree cstPart = null;
        if (evaluator.getFailedExpression() != null) {
            cstPart = evaluator.getFailedExpression()[0];
        }        
        return cstPart;
    }
    
    /**
     * Returns the variable currently assigned to <code>constraint</code>.
     * 
     * @param constraint the constraint to look for
     * @return the variable, may be <b>null</b> for none.
     */
    IDecisionVariable getConstraintVariable(Constraint constraint) {
        return variablesMap.getDecisionVariableForConstraint(constraint);
    }
    
    /**
     * Method for returning the overall count of evaluated constraints in the model.
     * @return number of evaluated constraints.
     */
    int constraintCount() {
        return constraintCounter;
    }
    
    /**
     * Method for returning the overall number of variables in the model.
     * @return number of variables.
     */
    int variableCount() {
        return variablesCounter;
    }
    
    /**
     * Method for returning the number of variables involved in constraints.
     * @return number of variables.
     */
    int variableInConstraintCount() {
        return variablesInConstraintsCounter;
    }
    
    /**
     * Method for returning the overall number of reevaluations in the model.
     * @return number of reevaluations.
     */
    int reevaluationCount() {
        return reevaluationCounter;
    }
    
    /**
     * Method for retrieving {@link FailedElements} with failed {@link Constraint}s and {@link IDecisionVariable}s.
     * @return {@link FailedElements}
     */
    FailedElements getFailedElements() {
        return failedElements;
    }  

    /**
     * Sets whether reasoning shall happen incrementally. 
     * 
     * @param incremental if reasoning shall happen incrementally
     * @return the old value of the incremental flag before changing to {@code incremental}
     * @see #setConsiderFrozenConstraints(boolean)
     */
    boolean setIncremental(boolean incremental) {
        boolean old = this.incremental;
        this.incremental = incremental;
        return old;
    }
    
    /**
     * Factory method for creating the evaluation visitor.
     * 
     * @return the evaluation visitor 
     */
    protected EvaluationVisitor createEvaluationVisitor() {
        return new EvalVisitor();
    }
    
    /**
     * Returns whether reasoning stopped due to a timeout.
     * 
     * @return <code>true</code> for timeout, <code>false</code> else
     */
    boolean hasTimeout() {
        return hasTimeout;
    }

    /**
     * Returns whether reasoning was stopped due to a user-request.
     * 
     * @return <code>true</code> for stopped, <code>false</code> else
     */
    boolean wasStopped() {
        return wasStopped;
    }

    /**
     * Returns whether the reasoner is (still) operating.
     * 
     * @return <code>true</code> for operating, <code>false</code> else
     */
    boolean isRunning() {
        return isRunning;
    }

    /**
     * Stops/terminates reasoning. If possible, a reasoner shall stop the reasoning
     * operations as quick as possible. A reasoner must not implement this operation.
     * 
     * @return <code>true</code> if the reasoner tries to stop, <code>false</code> else 
     *     (operation not implemented)
     */
    boolean stop() {
        wasStopped = true;
        return true;
    }
    
    /**
     * Marks this instance for re-use. Must be called before the first call to {@link #resolve()}.
     * Works intentionally only once.
     */
    void markForReuse() {
        reuseInstance = true;
    }

    /**
     * Clears this instance for reuse to free most of the resources.
     * 
     * @see #markForReuse()
     * @see #reInit()
     */
    void clear() {
        defaultConstraints.clear();
        deferredDefaultConstraints.clear();
        topLevelConstraints.clear();
        otherConstraints.clear();
        failedElements.clear();
        scopeAssignments.clearScopeAssignments();
        // keep variablesMap for now
        constraintBase.clear();        
        // keep constraintCounter - is set during translation
        // keep variablesInConstraintsCounter - is set during translation
        reevaluationCounter = 0;
        // keep variablesCounter - is set during translation
        hasTimeout = false;
        isRunning = false;
        wasStopped = false;
        usedVariables.clear();
        substVisitor.clear();
        contexts.clear();
        simpleAssignmentFinder.clear();
    }
    
    /**
     * Re-initializes this resolver instance to allocated resources only if really needed.
     * 
     * @see #markForReuse()
     * @see #reInit()
     */
    void reInit() {
        hasTimeout = false;
        isRunning = false;
        wasStopped = false;
        reevaluationCounter = 0;
        translationTime = 0;
        evaluationTime = 0;
        failedElements.clear();
        assignmentState = AssignmentState.DERIVED;
    }

    /**
     * Returns the time used for evaluation.
     * 
     * @return the time in ms
     */
    long getEvaluationTime() {
        return evaluationTime;
    }
    
    /**
     * Returns the time used for translation.
     * 
     * @return the time in ms
     */
    long getTranslationTime() {
        return translationTime;
    }

    /**
     * Sets the desired assignment state. The default value is {@link AssignmentState#DERIVED}, but specific reasoning
     * operations such as configuration initialization may require a different state.
     * 
     * @param state the state to use
     */
    void setAssignmentState(IAssignmentState state) {
        if (null != state) {
            this.assignmentState = state;
        }
    }

    /**
     * Defines the optional interceptor instance.
     * 
     * @param interceptor the interceptor
     */
    void setInterceptor(IReasonerInterceptor interceptor) {
        this.interceptor = interceptor;
    }
    
    /**
     * Adds an assigned variable to the current scope.
     * 
     * @param variable the variable to add to the scope
     */
    final void addAssignedVariableToScope(IDecisionVariable variable) {
        scopeAssignments.addAssignedVariable(variable);
    }
    
    /**
     * Returns whether the current context contains a mapping for <code>var</code>.
     * 
     * @param var the variable to look for
     * @return <code>true</code> if there is a mapping, <code>false</code> else
     */
    final boolean contextContainsMapping(AbstractVariable var) {
        return contexts.containsMapping(var);
    }
    
    /**
     * Registers a mapping between the variable <code>var</code> and its actual access expression <code>acc</code> into
     * the current top-most context. Overrides any existing mapping in the top-most context. Preceeds any 
     * existing mapping in a previous still active context.
     * 
     * @param var the variable
     * @param acc the access expression
     */
    final void contextRegisterMapping(AbstractVariable var, ConstraintSyntaxTree acc) {
        contexts.registerMapping(var, acc);
    }

}
