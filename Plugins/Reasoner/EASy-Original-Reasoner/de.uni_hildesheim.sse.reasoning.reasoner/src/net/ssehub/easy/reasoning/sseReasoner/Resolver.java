package net.ssehub.easy.reasoning.sseReasoner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.ssehub.easy.basics.logger.EASyLoggerFactory;
import net.ssehub.easy.basics.logger.EASyLoggerFactory.EASyLogger;
import net.ssehub.easy.basics.modelManagement.Utils;
import net.ssehub.easy.reasoning.core.reasoner.ReasonerConfiguration;
import net.ssehub.easy.reasoning.core.reasoner.ReasonerConfiguration.IAdditionalInformationLogger;
import net.ssehub.easy.reasoning.core.reasoner.ReasoningErrorCodes;
import net.ssehub.easy.reasoning.sseReasoner.functions.FailedElementDetails;
import net.ssehub.easy.reasoning.sseReasoner.functions.FailedElements;
import net.ssehub.easy.reasoning.sseReasoner.functions.AbstractConstraintProcessor;
import net.ssehub.easy.reasoning.sseReasoner.functions.ScopeAssignments;
import net.ssehub.easy.reasoning.sseReasoner.model.ContainerConstraintsFinder;
import net.ssehub.easy.reasoning.sseReasoner.model.SubstitutionVisitor;
import net.ssehub.easy.reasoning.sseReasoner.model.DefaultConstraint;
import net.ssehub.easy.reasoning.sseReasoner.model.VariablesInNotSimpleAssignmentConstraintsFinder;
import net.ssehub.easy.reasoning.sseReasoner.model.VariablesMap;
import net.ssehub.easy.varModel.confModel.AssignmentState;
import net.ssehub.easy.varModel.confModel.CompoundVariable;
import net.ssehub.easy.varModel.confModel.Configuration;
import net.ssehub.easy.varModel.confModel.IAssignmentState;
import net.ssehub.easy.varModel.confModel.IConfigurationElement;
import net.ssehub.easy.varModel.confModel.IDecisionVariable;
import net.ssehub.easy.varModel.cst.AttributeVariable;
import net.ssehub.easy.varModel.cst.CSTSemanticException;
import net.ssehub.easy.varModel.cst.CSTUtils;
import net.ssehub.easy.varModel.cst.CompoundAccess;
import net.ssehub.easy.varModel.cst.CompoundInitializer;
import net.ssehub.easy.varModel.cst.ConstantValue;
import net.ssehub.easy.varModel.cst.ConstraintSyntaxTree;
import net.ssehub.easy.varModel.cst.ContainerInitializer;
import net.ssehub.easy.varModel.cst.OCLFeatureCall;
import net.ssehub.easy.varModel.cst.Variable;
import net.ssehub.easy.varModel.cstEvaluation.EvaluationVisitor;
import net.ssehub.easy.varModel.cstEvaluation.EvaluationVisitor.Message;
import net.ssehub.easy.varModel.cstEvaluation.IResolutionListener;
import net.ssehub.easy.varModel.cstEvaluation.IValueChangeListener;
import net.ssehub.easy.varModel.model.AbstractVariable;
import net.ssehub.easy.varModel.model.Attribute;
import net.ssehub.easy.varModel.model.AttributeAssignment;
import net.ssehub.easy.varModel.model.AttributeAssignment.Assignment;
import net.ssehub.easy.varModel.model.Constraint;
import net.ssehub.easy.varModel.model.DecisionVariableDeclaration;
import net.ssehub.easy.varModel.model.IAttributeAccess;
import net.ssehub.easy.varModel.model.IModelElement;
import net.ssehub.easy.varModel.model.IvmlException;
import net.ssehub.easy.varModel.model.ModelVisitorAdapter;
import net.ssehub.easy.varModel.model.OperationDefinition;
import net.ssehub.easy.varModel.model.PartialEvaluationBlock;
import net.ssehub.easy.varModel.model.Project;
import net.ssehub.easy.varModel.model.datatypes.Compound;
import net.ssehub.easy.varModel.model.datatypes.Container;
import net.ssehub.easy.varModel.model.datatypes.DerivedDatatype;
import net.ssehub.easy.varModel.model.datatypes.IDatatype;
import net.ssehub.easy.varModel.model.datatypes.MetaType;
import net.ssehub.easy.varModel.model.datatypes.OclKeyWords;
import net.ssehub.easy.varModel.model.datatypes.TypeQueries;
import net.ssehub.easy.varModel.model.filter.FilterType;
import net.ssehub.easy.varModel.model.filter.VariablesInConstraintFinder;
import net.ssehub.easy.varModel.model.values.ConstraintValue;
import net.ssehub.easy.varModel.model.values.ContainerValue;
import net.ssehub.easy.varModel.model.values.Value;
import net.ssehub.easy.varModel.model.values.ValueFactory;

import static net.ssehub.easy.reasoning.sseReasoner.ReasoningUtils.*;
import static net.ssehub.easy.reasoning.sseReasoner.functions.ConstraintFunctions.*;

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
public class Resolver {

    private static final EASyLogger LOGGER
        = EASyLoggerFactory.INSTANCE.getLogger(Resolver.class, Descriptor.BUNDLE_NAME);
    @SuppressWarnings("unused")
    private IAdditionalInformationLogger infoLogger;
    private ReasonerConfiguration reasonerConfig;
    
    private Configuration config;
    private boolean incremental = false;
    private boolean considerFrozenConstraints = true;

    private EvalVisitor evaluator = new EvalVisitor();
    private FailedElements failedElements = new FailedElements();
    private ScopeAssignments scopeAssignments = new ScopeAssignments();

    private VariablesMap constraintMap = new VariablesMap();
    private Map<Constraint, IDecisionVariable> constraintVariableMap = new HashMap<Constraint, IDecisionVariable>();
    private Deque<Constraint> constraintBase = new LinkedList<Constraint>();
    private Deque<Constraint> constraintBaseCopy = null;
    private Set<Constraint> constraintBaseSet = new HashSet<Constraint>();
    private Deque<Constraint> defaultConstraints = new LinkedList<Constraint>();
    private Deque<Constraint> deferredDefaultConstraints = new LinkedList<Constraint>();
    private Deque<Constraint> topLevelConstraints = new LinkedList<Constraint>();
    private Deque<Constraint> otherConstraints = new LinkedList<Constraint>();
    
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
    private transient Map<AbstractVariable, ConstraintSyntaxTree> varMap 
        = new HashMap<AbstractVariable, ConstraintSyntaxTree>(100);
    private transient ContainerConstraintsFinder containerFinder = new ContainerConstraintsFinder();
    private transient VariablesInNotSimpleAssignmentConstraintsFinder simpleAssignmentFinder 
        = new VariablesInNotSimpleAssignmentConstraintsFinder(constraintMap);
    private transient ConstraintTranslationVisitor projectVisitor = new ConstraintTranslationVisitor();
    private transient VariablesInConstraintFinder variablesFinder = new VariablesInConstraintFinder();
    private transient OtherConstraintsProcessor otherConstraintsProc = new OtherConstraintsProcessor();
    private transient CompoundContainerProcessor compoundContainerProc = new CompoundContainerProcessor();
    private transient long endTimestamp;
    private transient boolean inTopLevelEvals = false;

    // >>> from here the names follows the reasoner.tex documentation

    private IValueChangeListener listener = new IValueChangeListener() {
        
        @Override
        public void notifyUnresolved(IDecisionVariable variable) {
        }
        
        @Override
        public void notifyChanged(IDecisionVariable variable, Value oldValue) {
            if (!variable.isLocal()) {
                if (Descriptor.LOGGING) {
                    LOGGER.debug("Value changed: " + variable.getDeclaration().getName() + " " + variable.getValue()
                        + " Parent: " + (null == variable.getParent() ? null : variable.getParent()));                 
                }
                scopeAssignments.addAssignedVariable(variable);
                // TODO if value type changes (currently not part of the notification), change also constraints
                rescheduleConstraintsForChilds(variable);
                // All constraints for the parent (as this was also changed)
                rescheduleConstraintsForParent(variable);
            }
        }

        /**
         * Tries rescheduling the given constraints. Does not add a constraint to the constraint base if already
         * scheduled.
         * 
         * @param constraints the constraints to reschedule (may be <b>null</b>, ignored then)
         */
        private void reschedule(Set<Constraint> constraints) {
            if (null != constraints) {
                for (Constraint varConstraint : constraints) {
                    if (!constraintBaseSet.contains(varConstraint)) {
                        addToConstraintBase(varConstraint);
                    }
                }
            }
        }

        /**
         * Determines the constraints needed for the parents of <code>variable</code>.
         * 
         * @param variable the variable to analyze
         * @param constraintsToReevaluate the constraint set to be modified as a side effect
         */
        private void rescheduleConstraintsForParent(IDecisionVariable variable) {
            IConfigurationElement parent = variable.getParent();
            if (parent instanceof IDecisionVariable) {
                IDecisionVariable pVar = (IDecisionVariable) parent;
                AbstractVariable declaration = pVar.getDeclaration();
                reschedule(constraintMap.getRelevantConstraints(declaration));
                rescheduleConstraintsForParent(pVar);
            }
        }

        /**
         * Determines the constraints needed for <code>variable</code> and its (transitive) child slots.
         * 
         * @param variable the variable to analyze
         * @param constraintsToReevaluate the constraint set to be modified as a side effect
         */
        private void rescheduleConstraintsForChilds(IDecisionVariable variable) {
            AbstractVariable declaration = variable.getDeclaration();
            reschedule(constraintMap.getRelevantConstraints(declaration));
            // All constraints for childs (as they may also changed)
            for (int j = 0, nChilds = variable.getNestedElementsCount(); j < nChilds; j++) {
                rescheduleConstraintsForChilds(variable.getNestedElement(j));
            }
        }
    };
    
    /**
     * Listener for the {@link #evaluator} to record changed variables.
     */
    private IResolutionListener resolutionListener = new IResolutionListener() {
        
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
    };
    
    // <<< documented until here    
    
    /**
     * Main constructor that activates Resolver constructor.
     * @param project Project for evaluation.
     * @param config Configuration to reason on.
     * @param reasonerConfig the reasoner configuration to be used for reasoning (e.g. taken from the UI, 
     *        may be <b>null</b>)
     */
    public Resolver(Project project, Configuration config, ReasonerConfiguration reasonerConfig) {
        this.reasonerConfig = reasonerConfig;
        this.infoLogger = reasonerConfig.getLogger();
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
    
    // >>> from here the names follow the reasoner.tex documentation
    
    /**
     * Resolves the (initial) values of the configuration.
     * 
     * @see Utils#discoverImports(net.ssehub.easy.basics.modelManagement.IModel)
     * @see #translateConstraints()
     * @see #evaluateConstraints()
     * @see Configuration#freeze(net.ssehub.easy.varModel.confModel.IFreezeSelector)
     */
    public void resolve() {
        isRunning = true;
        // Stack of importedProject (start with inner most imported project)
        evaluator.init(config, null, false, listener); // also for defaults as they may refer to each other 
        evaluator.setResolutionListener(resolutionListener);
        evaluator.setScopeAssignments(scopeAssignments);
        List<Project> projects = Utils.discoverImports(config.getProject());
        endTimestamp = reasonerConfig.getTimeout() <= 0 
            ? -1 : System.currentTimeMillis() + reasonerConfig.getTimeout();
        for (int p = 0; !hasTimeout && !wasStopped && p < projects.size(); p++) {
            project = projects.get(p);
            if (Descriptor.LOGGING) {
                LOGGER.debug("Project:" + project.getName());                
            }
            long start = System.currentTimeMillis();
            translateConstraints();
            long mid = System.currentTimeMillis();
            translationTime += mid - start;
            evaluateConstraints();
            long end = System.currentTimeMillis();
            evaluationTime += end - mid;
            // Freezes values after each scope
            config.freezeValues(project, FilterType.NO_IMPORTS);
            // TODO do incremental freezing in here -> required by interfaces with propagation constraints
            if (Descriptor.LOGGING) {
                printFailedElements(failedElements);                                
            }
        }
        evaluator.clear();
        isRunning = false;
    }
    
    /**
     * Evaluates and reschedules failed constraints.
     * 
     * @see #resolve()
     */
    private void evaluateConstraints() {
        if (Descriptor.LOGGING) {
            printConstraints(constraintBase);            
        }
        scopeAssignments.clearScopeAssignments();
        evaluator.setDispatchScope(project);
        while (!constraintBase.isEmpty() && !wasStopped) { // reasoner.tex -> hasTimeout see end of loop
            usedVariables.clear();
            Constraint constraint = constraintBase.pop();
            constraintBaseSet.remove(constraint);
            ConstraintSyntaxTree cst = constraint.getConsSyntax();
            evaluator.setAssignmentState(constraint.isDefaultConstraint() 
                ? AssignmentState.DEFAULT : AssignmentState.DERIVED);
            reevaluationCounter++;
            if (cst != null) {
                if (Descriptor.LOGGING) {
                    LOGGER.debug("Resolving: " + reevaluationCounter + ": " + toIvmlString(cst) 
                        + " : " + constraint.getTopLevelParent());                    
                }
                evaluator.visit(cst);
                analyzeEvaluationResult(constraint);
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
            addConstraint(topLevelConstraints, constraint, true); // topLevelConstraints
        }

        @Override // iterate over nested blocks/contained constraints
        public void visitPartialEvaluationBlock(PartialEvaluationBlock block) {
            if (null == evals) {
                evals = new LinkedList<PartialEvaluationBlock>();
            }
            evals.add(block);
        }

        @Override // iterate over nested blocks/contained, translate the individual blocks if not incremental
        public void visitAttributeAssignment(AttributeAssignment assignment) {
            for (int v = 0; v < assignment.getElementCount(); v++) {
                assignment.getElement(v).accept(this);
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
     * Extracts, translates and collects the internal constraints of <code>type</code> and stores them 
     * in {@link #derivedTypeConstraints}.
     * 
     * @param decl VariableDeclaration of <code>DerivedDatatype</code>
     * @param dType the type to translate
     * @param localDecl the declaration of an iterator variable if quantified constraints shall be created, 
     *     <b>null</b> for normal constraints
     * @param parent the parent model element for creating constraint instances
     */
    private void translateDerivedDatatypeConstraints(AbstractVariable decl, DerivedDatatype dType, 
        DecisionVariableDeclaration localDecl, IModelElement parent) {
        int count = dType.getConstraintCount();
        DecisionVariableDeclaration dVar = dType.getTypeDeclaration();
        AbstractVariable declaration = null == localDecl ? decl : localDecl;
        if (count > 0 && dVar != declaration) {
            substVisitor.setMappings(varMap);
            substVisitor.addVariableMapping(dVar, declaration);
            //Copy and replace each instance of the internal declaration with the given instance
            for (int i = 0; i < count; i++) {
                ConstraintSyntaxTree cst = substVisitor.accept(dType.getConstraint(i).getConsSyntax());
                if (null != localDecl) {
                    cst = createContainerCall(new Variable(decl), Container.FORALL, cst, localDecl);
                }
                try {
                    cst.inferDatatype();
                    addConstraint(topLevelConstraints, new Constraint(cst, parent), true);
                } catch (CSTSemanticException e) {
                    LOGGER.exception(e);
                }
            }
            substVisitor.clear();
        }        
        
        IDatatype basis = dType.getBasisType();
        if (basis instanceof DerivedDatatype) {
            translateDerivedDatatypeConstraints(decl, (DerivedDatatype) basis, localDecl, parent);
        }
    }
    
    /**
     * Translates annotation default value expressions.
     * 
     * @param decl {@link AbstractVariable} with annotations.
     * @param variable {@link IDecisionVariable} with annotations.
     * @param compound {@link CompoundAccess} null if variable is not nested.
     */
    private void translateAnnotationDeclarations(AbstractVariable decl, IDecisionVariable variable, 
        ConstraintSyntaxTree compound) {
        for (int i = 0; i < variable.getAttributesCount(); i++) {
            IDecisionVariable att = variable.getAttribute(i);
            translateDeclaration(att.getDeclaration(), att, null == compound ? new Variable(decl) : compound);
        }
    }

    /**
     * Translates the (transitive) defaults and type constraints for a declaration. 
     * 
     * @param decl The {@link AbstractVariable} for which the default value should be resolved.
     * @param var the instance of <tt>decl</tt>.
     * @param cAcc if variable is a nested compound.
     */
    protected void translateDeclaration(AbstractVariable decl, IDecisionVariable var, ConstraintSyntaxTree cAcc) {
        variablesCounter++;
        IDatatype type = decl.getType();
        ConstraintSyntaxTree defaultValue = decl.getDefaultValue();
        AbstractVariable self = null;
        ConstraintSyntaxTree selfEx = null;
        if (type instanceof DerivedDatatype) {
            translateDerivedDatatypeConstraints(decl, (DerivedDatatype) type, null, decl.getTopLevelParent());
        }
        if (!incremental) {
            translateAnnotationDeclarations(decl, var, cAcc);
        }
        if (null != defaultValue) { // considering the actual type rather than base, after derived (!)
            type = inferTypeSafe(defaultValue, type);
        }
        if (TypeQueries.isCompound(type)) { // this is a compound value -> default constraints, do not defer
            self = decl;
            translateCompoundDeclaration(decl, var, cAcc, type); 
        } else if (TypeQueries.isContainer(type)) { // this is a container value -> default constraints, do not defer
            translateContainerDeclaration(decl, var, type, cAcc);
        } else if (null != defaultValue && !incremental) {
            if (cAcc instanceof CompoundAccess) { // defer init constraints to prevent accidental init override
                selfEx = ((CompoundAccess) cAcc).getCompoundExpression();
            }
        } else if (incremental) { // remaining defaults
            defaultValue = null;
        }
        if (null != defaultValue) {
            try {
                if (TypeQueries.isConstraint(decl.getType())) { // handle and register constraint variables
                    variablesCounter--;
                    // use closest parent instead of project -> runtime analysis
                    createConstraintVariableConstraint(defaultValue, selfEx, self, var.getDeclaration(), var);
                } else { // Create default constraint
                    ConstraintSyntaxTree acc;
                    if (decl instanceof Attribute) {
                        Attribute attribute = (Attribute) decl;
                        if (cAcc == null) {
                            acc = new Variable(attribute); // shall not occur
                        } else {                        
                            acc = new AttributeVariable(cAcc, attribute);
                        }
                    } else {
                        acc = null != selfEx ? cAcc : new Variable(decl);
                    }
                    defaultValue = new OCLFeatureCall(acc, OclKeyWords.ASSIGNMENT, defaultValue);
                    defaultValue = substituteVariables(defaultValue, selfEx, self, false);
                    Deque<Constraint> targetCons = defaultConstraints; 
                    if (substVisitor.containsSelf() || isOverriddenSlot(decl)) {
                        targetCons = deferredDefaultConstraints;
                    }
                    addConstraint(targetCons, new DefaultConstraint(defaultValue, project), true);
                }
                substVisitor.clear(); // clear false above 
            } catch (CSTSemanticException e) {
                LOGGER.exception(e); // should not occur, ok to log
            }            
        }
    }

    /**
     * Translates the (transitive) defaults and type constraints for a container declaration. 
     * 
     * @param decl The {@link AbstractVariable} for which the default value should be resolved.
     * @param var the instance of <tt>decl</tt>.
     * @param type the (specific) datatype ({@link Container})
     * @param cAcc compound access expression
     */
    private void translateContainerDeclaration(AbstractVariable decl, IDecisionVariable var, IDatatype type, 
        ConstraintSyntaxTree cAcc) {
        Container declType = (Container) type;
        IDatatype dContainedType = getDeepestContainedType(declType);
        IDatatype dContainedBasisType = DerivedDatatype.resolveToBasis(dContainedType);
        ContainerValue val = getRelevantValue(decl, var, incremental, ContainerValue.class);
        if (TypeQueries.isConstraint(dContainedBasisType)) { // don't care for derived
            if (null != val) { // 
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
        if (dContainedType instanceof DerivedDatatype) {
            translateDerivedDatatypeConstraints(decl, (DerivedDatatype) dContainedType,  
                new DecisionVariableDeclaration("derivedType", dContainedType, null), project);
        }
    }

    /**
     * Translates an entire compound container <code>decl</code> including defaults and constraints for the specific
     * type <code>cmpType</code> (iterate through all relevant types).
     * 
     * @param decl the declaration
     * @param cmpType the compound type to translate for
     * @param declaredContainedType the declared contained type of <code>decl</code>
     * @param cAcc compound access to <code>decl</code> if needed (may be <b>null</b>)
     */
    private void translateCompoundContainer(AbstractVariable decl, Compound cmpType, IDatatype declaredContainedType, 
        ConstraintSyntaxTree cAcc) {
        final DecisionVariableDeclaration localDecl = new DecisionVariableDeclaration("cmp", cmpType, null);
        // we may transfer the attributes from decl here to localDecl, or we just pass decl as attribute provider
        // to the translation, which is more time/memory efficient
        // fill varMap
        Variable localVar = new Variable(localDecl);
        Variable declVar = new Variable(decl);
        for (int i = 0, n = cmpType.getInheritedElementCount(); i < n; i++) {
            AbstractVariable nestedDecl = cmpType.getInheritedElement(i);
            varMap.put(nestedDecl, new CompoundAccess(localVar, nestedDecl.getName()));
            for (int a = 0, m = nestedDecl.getAttributesCount(); a < m; a++) {
                Attribute attr = nestedDecl.getAttribute(a);
                ConstraintSyntaxTree acc;
                if (cAcc == null) {
                    acc = new AttributeVariable(declVar, attr);
                } else {                        
                    acc = new AttributeVariable(cAcc, attr);
                }
                varMap.put(attr, acc);
            }
        }
        try {
            ConstraintSyntaxTree containerOp = null == cAcc ? new Variable(decl) : cAcc;
            if (isNestedContainer(decl.getType())) {
                containerOp = new OCLFeatureCall(containerOp, OclKeyWords.FLATTEN);
            }
            if (!TypeQueries.sameTypes(cmpType, declaredContainedType)) {
                containerOp = new OCLFeatureCall(containerOp, OclKeyWords.SELECT_BY_KIND, 
                    new ConstantValue(ValueFactory.createValue(MetaType.TYPE, cmpType)));
            }
            compoundContainerProc.setParameter(containerOp, localDecl, localVar, decl);
            allCompoundConstraints(cmpType, compoundContainerProc, true, true, project);
            compoundContainerProc.clear();
        } catch (IvmlException e) {
            LOGGER.exception(e); // should not occur if constraints are created correctly, ok to log
        }
    }
    
    /**
     * A compound container processor creating the expressions for all-quantized constraints for all container entries. 
     * Call {@link #setParameter(ConstraintSyntaxTree, DecisionVariableDeclaration, Variable, IAttributeAccess))}
     * before use and {@link #clear()} afterwards.
     * 
     * @author Holger Eichelberger
     */
    private class CompoundContainerProcessor extends AbstractConstraintProcessor {

        private DecisionVariableDeclaration self;
        private ConstraintSyntaxTree selfEx;
        private ConstraintSyntaxTree containerOp;
        private IAttributeAccess attributeAccess;

        /**
         * Sets the processing parameter.
         * 
         * @param containerOp the container access operation including the all-quantor
         * @param self the local iterator declaration
         * @param selfEx the variable for <code>self</code>
         * @param attributeAccess access to attributes (instead of <code>self</code>)
         */
        private void setParameter(ConstraintSyntaxTree containerOp, DecisionVariableDeclaration self, Variable selfEx, 
            IAttributeAccess attributeAccess) {
            this.containerOp = containerOp;
            this.self = self;
            this.selfEx = selfEx;
            this.attributeAccess = attributeAccess;
        }
        
        /**
         * Clears this instance for reuse. Not really needed if 
         * {@link #setParameter(ConstraintSyntaxTree, DecisionVariableDeclaration, Variable, IAttributeAccess)} 
         * is utilized consequently, but helps getting rid of dangling references / supports garbage collection.
         */
        private void clear() {
            this.containerOp = null;
            this.self = null;
            this.selfEx = null;
            this.attributeAccess = null;
        }

        @Override
        public ConstraintSyntaxTree process(ConstraintSyntaxTree cst, ExpressionType type, String slot, 
            IModelElement parent) {
            cst = substituteVariables(cst, selfEx, null, true);
            ConstraintSyntaxTree acc = null;
            if (ExpressionType.DEFAULT == type) {
                acc = new CompoundAccess(selfEx, slot);
            } else if (ExpressionType.ANNOTATION_DEFAULT == type) {
                acc = new AttributeVariable(selfEx, attributeAccess.getAttribute(slot));
            }
            if (null != acc) {
                cst = new OCLFeatureCall(acc, OclKeyWords.ASSIGNMENT, cst);
            }
            if (Descriptor.LOGGING) {
                LOGGER.debug("New loop constraint " + toIvmlString(cst));
            }   
            try {
                cst = createContainerCall(containerOp, Container.FORALL, cst, self);
                cst.inferDatatype();
                Constraint cons;
                Deque<Constraint> res;
                if (ExpressionType.DEFAULT == type) {
                    cons = new DefaultConstraint(cst, parent);
                    // TODO decide for deferred
                    res = deferredDefaultConstraints;
                } else {
                    // TODO other constraints?
                    res = otherConstraints;
                    cons = new Constraint(cst, parent);
                }
                addConstraint(res, cons, true);
            } catch (CSTSemanticException e) {
                LOGGER.exception(e);
            }
            return null;
        }

    }

    /**
     * Method for translating compound default value declarations. Requires 
     * {@link #buildVariableMapping(AbstractVariable, IDecisionVariable, CompoundAccess, IDatatype)} before.
     * 
     * @param decl The {@link AbstractVariable} for which the default value should be resolved.
     * @param variable the instance of <tt>decl</tt>.
     * @param compound if variable is a nested compound, the access expression to 
     *     <code>decl</code>/<code>variable</code>
     * @param type specific {@link Compound} type.
     */
    private void translateCompoundDeclaration(AbstractVariable decl, IDecisionVariable variable,
        ConstraintSyntaxTree compound, IDatatype type) {
        Compound cmpType = (Compound) type;
        CompoundVariable cmpVar = (CompoundVariable) variable;
        // resolve compound access first for all slots
        for (int i = 0, n = cmpVar.getNestedElementsCount(); i < n; i++) {
            IDecisionVariable nestedVar = cmpVar.getNestedElement(i);
            AbstractVariable nestedDecl = nestedVar.getDeclaration();
            CompoundAccess cmpAccess;
            if (compound == null) {
                cmpAccess = new CompoundAccess(new Variable(decl), nestedDecl.getName());                   
            } else {
                cmpAccess = new CompoundAccess(createAsTypeCast(compound, type, cmpVar.getValue().getType()), 
                    nestedDecl.getName());
            }
            inferTypeSafe(cmpAccess, null);
            // fill varMap
            varMap.put(nestedDecl, cmpAccess);
        }
        for (int i = 0, n = cmpVar.getNestedElementsCount(); i < n; i++) {
            IDecisionVariable nestedVar = cmpVar.getNestedElement(i);
            AbstractVariable nestedDecl = nestedVar.getDeclaration();
            translateDeclaration(nestedDecl, nestedVar, varMap.get(nestedDecl));
        }
        // Nested attribute assignments handling
        if (!incremental) {
            for (int a = 0; a < cmpType.getAssignmentCount(); a++) {
                translateAnnotationAssignments(cmpType.getAssignment(a), variable, null, compound);
            }
        }
        final AbstractVariable self = null == compound ? decl : null;
        processCompoundEvals(cmpType, compound, self);
        //List<Constraint> thisCompoundConstraints = new ArrayList<Constraint>(); 
        otherConstraintsProc.setParameter(compound, self);
        allCompoundConstraints(cmpType, otherConstraintsProc, false, false, decl);
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
       
        /**
         * Sets the parameters for processing.
         * 
         * @param selfEx an expression representing <i>self</i> (ignored if <b>null</b>, <code>self</code> and 
         *     <code>selfEx</code> shall never both be specified/not <b>null</b>).
         * @param self an variable declaration representing <i>self</i> (ignored if <b>null</b>).
         */
        private void setParameter(ConstraintSyntaxTree selfEx, AbstractVariable self) {
            this.selfEx = selfEx;
            this.self = self;
        }
        
        /**
         * Clears the parameters for reuse. Although clearing may be superfluous, it also helps getting rid of 
         * unnecessary references / supports garbage collection.
         */
        private void clear() {
            this.selfEx = null;
            this.self = null;
        }
        
        @Override
        public ConstraintSyntaxTree process(ConstraintSyntaxTree cst, ExpressionType type, String slot, 
            IModelElement parent) {
            cst = substituteVariables(cst, selfEx, self, true);
            try { // compoundConstraints
                Constraint constraint = new Constraint(cst, parent);
                addConstraint(otherConstraints, constraint, true);            
            } catch (CSTSemanticException e) {
                LOGGER.exception(e);
            }               
            return cst;
        }

    }

    /**
     * Method for extracting constraints from compounds eval blocks (also refined compounds).
     * @param cmpType Compound to be analyzed 
     * @param selfEx an expression representing <i>self</i> (ignored if <b>null</b>, <code>self</code> and 
     *     <code>selfEx</code> shall never both be specified/not <b>null</b>).
     * @param self an variable declaration representing <i>self</i> (ignored if <b>null</b>).
     */
    private void processCompoundEvals(Compound cmpType, ConstraintSyntaxTree selfEx, AbstractVariable self) {
        for (int r = 0; r < cmpType.getRefinesCount(); r++) {
            processCompoundEvals(cmpType.getRefines(r), selfEx, self);
        }
        for (int i = 0; i < cmpType.getModelElementCount(); i++) {            
            if (cmpType.getModelElement(i) instanceof PartialEvaluationBlock) {
                PartialEvaluationBlock evalBlock = (PartialEvaluationBlock) cmpType.getModelElement(i);
                processEvalConstraints(evalBlock, selfEx, self);
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
     */
    private void processEvalConstraints(PartialEvaluationBlock evalBlock, ConstraintSyntaxTree selfEx, 
        AbstractVariable self) {
        for (int i = 0; i < evalBlock.getNestedCount(); i++) {
            processEvalConstraints(evalBlock.getNested(i), selfEx, self);
        }
        for (int i = 0; i < evalBlock.getEvaluableCount(); i++) {
            if (evalBlock.getEvaluable(i) instanceof Constraint) {
                Constraint evalConstraint = (Constraint) evalBlock.getEvaluable(i);
                ConstraintSyntaxTree evalCst = evalConstraint.getConsSyntax();
                ConstraintSyntaxTree cst = substituteVariables(evalCst, selfEx, self, true);
                try {
                    addConstraint(otherConstraints, new Constraint(cst, project), true);
                } catch (CSTSemanticException e) {
                    LOGGER.exception(e);
                } 
            }
        }
    }
    
    /**
     * Creates a constraint from a (nested) constraint variable adding the result to 
     * {@link #constraintVariablesConstraints}.
     * 
     * @param cst the constraint
     * @param selfEx the expression representing <i>self</i> in <code>cst</code>, both, <code>self</code> and 
     *    <code>selfEx</code> must not be different from <b>null</b> at the same time (may be <b>null</b> for none)
     * @param self the declaration of the variable representing <i>self</i> in <code>cst</code> (may be <b>null</b> 
     *    for none)
     * @param parent the parent for new constraints
     * @param variable the actually (nested) variable, used to fill {@link #constraintVariableMap}
     * @return the created constraint
     */
    private Constraint createConstraintVariableConstraint(ConstraintSyntaxTree cst, ConstraintSyntaxTree selfEx, 
        AbstractVariable self, IModelElement parent, IDecisionVariable variable) {
        Constraint constraint = null;
        if (cst != null) {
            cst = substituteVariables(cst, selfEx, self, true);
            try {
                constraint = new Constraint(cst, parent);
                addConstraint(otherConstraints, constraint, true); // constraintVariablesConstraints
                // TODO reverse mapping for changing constraint types through value upon value change
                constraintVariableMap.put(constraint, variable);
                if (Descriptor.LOGGING) {
                    LOGGER.debug((null != self ? self.getName() + "." : "") + variable.getDeclaration().getName() 
                        + " compound constraint variable " + toIvmlString(cst));
                }
            } catch (CSTSemanticException e) {
                LOGGER.exception(e);
            }
        }
        return constraint;
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
    private void createContainerConstraintValueConstraints(ContainerValue val, ConstraintSyntaxTree selfEx, 
        AbstractVariable self, IModelElement parent, IDecisionVariable nestedVariable) {
        for (int n = 0; n < val.getElementSize(); n++) {
            Value cVal = val.getElement(n);
            if (cVal instanceof ConstraintValue) {
                createConstraintVariableConstraint(((ConstraintValue) cVal).getValue(), selfEx, self, 
                    parent, nestedVariable);
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
        for (int d = 0; d < assng.size(); d++) { 
            Assignment effectiveAssignment = assng.get(d);
            for (int e = 0; e < assignment.getElementCount(); e++) {
                DecisionVariableDeclaration aElt = assignment.getElement(e);
                translateAnnotationAssignment(effectiveAssignment, aElt, compound);
                IDatatype aEltType = aElt.getType();
                if (null != var) {
                    IDecisionVariable v = var.getNestedElement(aElt.getName());
                    if (null != v && null != v.getValue()) {
                        aEltType = v.getValue().getType();
                    }
                }
                if (TypeQueries.isCompound(aEltType)) {         
                    Compound cmp = (Compound) aEltType;
                    for (int s = 0; s < cmp.getDeclarationCount(); s++) {
                        DecisionVariableDeclaration slot = cmp.getDeclaration(s);
                        translateAnnotationAssignment(effectiveAssignment, slot, varMap.get(slot));
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
        String attributeName = assignment.getName();
        Attribute attrib = (Attribute) element.getAttribute(attributeName);
        if (null != attrib) {
            ConstraintSyntaxTree cst;
            //handle annotations in compounds
            if (null == compound) {
                compound = varMap.get(element);
            }
            if (compound == null) {
                cst = new AttributeVariable(new Variable(element), attrib);
            } else {
                cst = new AttributeVariable(compound, attrib);
            }
            cst = new OCLFeatureCall(cst, OclKeyWords.ASSIGNMENT, 
                substituteVariables(assignment.getExpression(), compound, null, true));
            inferTypeSafe(cst, null);
            try { // assignedAttributeConstraints
                addConstraint(otherConstraints, new Constraint(cst, project), false); 
            } catch (CSTSemanticException e) {
                LOGGER.exception(e);
            }
        }
    }

    /**
     * Translates and collects all constraints in {@link #project} by adding the collected constraints to the 
     * {@link #constraintBase}.
     * 
     * @see #resolve()
     */
    private void translateConstraints() {
        // translate only if not marked for reuse and copy of constraint base is already available
        if (null == constraintBaseCopy || constraintBaseCopy.isEmpty()) {
            varMap.clear();
            project.accept(projectVisitor);
            addAllToConstraintBase(defaultConstraints);
            addAllToConstraintBase(deferredDefaultConstraints);
            addAllToConstraintBase(topLevelConstraints);
            addAllToConstraintBase(otherConstraints);
            constraintCounter = constraintBase.size();
            variablesInConstraintsCounter = constraintMap.getDeclarationSize();
            clearConstraintLists();
            // if marked for re-use, copy constraint base
            if (null != constraintBaseCopy) {
                constraintBaseCopy.addAll(constraintBase);
            }
        }
    }

    /**
     * Adding a constraint to a constraint set, checking for contained container/compound initializers if
     * requested. 
     * 
     * @param target the target container for assignment constraints (higher priority)
     * @param constraint the constraint
     * @param checkForInitializers check also for initializers if (<code>true</code>), add only if (<code>false</code>)
     */
    private void addConstraint(Deque<Constraint> target, Constraint constraint, boolean checkForInitializers) {
        ConstraintSyntaxTree cst = constraint.getConsSyntax();
        boolean add = true;
        if (incremental) {
            add = !CSTUtils.isAssignment(cst);
        }
        if (add && !considerFrozenConstraints) {
            variablesFinder.setConfiguration(config);
            cst.accept(variablesFinder);
            Set<IAssignmentState> states = variablesFinder.getStates();
            add = (!(1 == states.size() && states.contains(AssignmentState.FROZEN)));
            variablesFinder.clear();
        }
        if (add) {
            if (checkForInitializers) {
                containerFinder.accept(cst);
                if (containerFinder.isConstraintContainer()) {
                    checkContainerInitializer(containerFinder.getExpression(), false, constraint.getParent());
                }
                if (containerFinder.isCompoundInitializer()) {
                    checkCompoundInitializer(containerFinder.getExpression(), true, constraint.getParent());
                }
                containerFinder.clear();
            }
            if (inTopLevelEvals && (target == otherConstraints || target == topLevelConstraints)) {
                target.addFirst(constraint);
            } else {
                target.addLast(constraint);
            }
            simpleAssignmentFinder.acceptAndClear(constraint);
        }
    }

    /**
     * Method for checking if {@link CompoundInitializer} holds 
     * a {@link de.uni_hildesheim.sse.ivml.CollectionInitializer} with {@link Constraint}s.
     * @param exp expression to check.
     * @param substituteVars <code>true</code> if {@link #varMap} shall be applied to substitute variables in 
     *   <code>exp</code> (if variable is nested), <code>false</code> if <code>exp</code> shall be taken over as it is.
     * @param parent parent for temporary constraints
     */
    private void checkCompoundInitializer(ConstraintSyntaxTree exp, boolean substituteVars, IModelElement parent) {
        CompoundInitializer compoundInit = (CompoundInitializer) exp;
        for (int i = 0; i < compoundInit.getExpressionCount(); i++) {
            if (compoundInit.getExpression(i) instanceof ContainerInitializer) {
                checkContainerInitializer(compoundInit.getExpression(i), substituteVars, parent);
            }
            if (compoundInit.getExpression(i) instanceof CompoundInitializer) {
                checkCompoundInitializer(compoundInit.getExpression(i), substituteVars, parent);
            }    
        }
    }

    /**
     * Method for checking if an expression is a {@link ContainerInitializer}.
     * @param exp expression to be checked.
     * @param substituteVars <code>true</code> if {@link #varMap} shall be applied to substitute variables in 
     *   <code>exp</code> (if variable is nested), <code>false</code> if <code>exp</code> shall be taken over as it is.
     * @param parent parent for temporary constraints
     */
    private void checkContainerInitializer(ConstraintSyntaxTree exp, boolean substituteVars, IModelElement parent) {
        ContainerInitializer containerInit = (ContainerInitializer) exp;
        for (int i = 0; i < containerInit.getExpressionCount(); i++) {
            ConstraintSyntaxTree cst = containerInit.getExpression(i);
            if (cst instanceof ContainerInitializer) {
                checkContainerInitializer((ContainerInitializer) cst, substituteVars, parent);
            } else {
                if (TypeQueries.isConstraint(containerInit.getType().getContainedType())) {
                    Constraint constraint = new Constraint(parent);
                    if (substituteVars) {
                        cst = substituteVariables(cst, null, null, true);
                    }
                    try {
                        constraint.setConsSyntax(cst);
                        addConstraint(otherConstraints, constraint, false);
                    } catch (CSTSemanticException e) {
                        LOGGER.exception(e);
                    }
                }
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
    }
    
    // helpers, accessors

    /**
     * Adds <code>constraint</code> to the constraint base.
     * 
     * @param constraint the constraint
     */
    private void addToConstraintBase(Constraint constraint) {
        constraintBase.addLast(constraint);
        constraintBaseSet.add(constraint);
    }

    /**
     * Method for using {@link SubstitutionVisitor} for constraint transformation. Uses the actual
     * variable mapping in {@link #varMap} and may consider a mapping for <code>self</code>.
     * 
     * @param cst Constraint to be transformed.
     * @param selfEx an expression representing <i>self</i> (ignored if <b>null</b>, <code>self</code> and 
     *     <code>selfEx</code> shall never both be specified/not <b>null</b>).
     * @param self an variable declaration representing <i>self</i> (ignored if <b>null</b>).
     * @param clear clear {@link #substVisitor} if <code>true</code> or leave its state for further queries requring
     * the caller to explicitly clear the copy visitor after usage
     * @return Transformed constraint.
     */
    private ConstraintSyntaxTree substituteVariables(ConstraintSyntaxTree cst, ConstraintSyntaxTree selfEx, 
        AbstractVariable self, boolean clear) {
        substVisitor.setMappings(varMap);
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
     * Adds all <code>constraints</code> to the constraint base.
     * 
     * @param constraints the constraints
     */
    private void addAllToConstraintBase(Collection<Constraint> constraints) {
        constraintBase.addAll(constraints);
        constraintBaseSet.addAll(constraints);
    }

    /**
     * Method for clearing all constraint lists.
     */
    private void clearConstraintLists() {
        defaultConstraints.clear();
        deferredDefaultConstraints.clear();
        topLevelConstraints.clear();
        otherConstraints.clear();
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
     * Getter for the map of all ConstraintVariables.
     * and their {@link Constraint}s.
     * @return Map of constraint variables and their constraints.
     */
    Map<Constraint, IDecisionVariable> getConstraintVariableMap() {
        return constraintVariableMap;
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
     * @see #setConsiderFrozenConstraints(boolean)
     */
    void setIncremental(boolean incremental) {
        this.incremental = incremental;
    }

    /**
     * Defines whether frozen constraints shall be considered. Can speed up incremental reasoning.
     * 
     * @param considerFrozenConstraints whether frozen constraint shall be considered (default <code>true</code>)
     * @see #setIncremental(boolean)
     */
    void setConsiderFrozenConstraints(boolean considerFrozenConstraints) {
        this.considerFrozenConstraints = considerFrozenConstraints;
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
     */
    void markForReuse() {
        constraintBaseCopy  = new LinkedList<Constraint>();
    }

    /**
     * Clears this instance for reuse to free most of the resources.
     * 
     * @see #markForReuse()
     * @see #reInit()
     */
    void clear() {
        clearConstraintLists();
        failedElements.clear();
        scopeAssignments.clearScopeAssignments();
        // keep the constraintMap
        // keep the constraintVariableMap
        constraintBase.clear();
        constraintBaseSet.clear();
        // keep constraintCounter - is set during translation
        // keep variablesInConstraintsCounter - is set during translation
        reevaluationCounter = 0;
        // keep variablesCounter - is set during translation
        hasTimeout = false;
        isRunning = false;
        wasStopped = false;
        usedVariables.clear();
        substVisitor.clear();
        varMap.clear();
        containerFinder.clear();
        simpleAssignmentFinder.clear();
    }
    
    /**
     * Re-initializes this resolver instance to allocated resources only if really needed.
     * 
     * @see #markForReuse()
     * @see #reInit()
     */
    void reInit() {
        if (null != constraintBaseCopy) {
            constraintBase.addAll(constraintBaseCopy);
            constraintBaseSet.addAll(constraintBaseCopy);
        }
    }

    /**
     * Returns the time used for evaluation.
     * 
     * @return the time in ms
     */
    long getEvaluationTime() {
        return translationTime;
    }
    
    /**
     * Returns the time used for translation.
     * 
     * @return the time in ms
     */
    long getTranslationTime() {
        return evaluationTime;
    }

}
