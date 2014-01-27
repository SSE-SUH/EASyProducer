/**
 * <copyright>
 * </copyright>
 *

 */
package de.uni_hildesheim.sse.ivml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_hildesheim.sse.ivml.AccessName;
import de.uni_hildesheim.sse.ivml.ActualParameterList;
import de.uni_hildesheim.sse.ivml.AdditiveExpression;
import de.uni_hildesheim.sse.ivml.AdditiveExpressionPart;
import de.uni_hildesheim.sse.ivml.AssignmentExpression;
import de.uni_hildesheim.sse.ivml.AssignmentExpressionPart;
import de.uni_hildesheim.sse.ivml.AttrAssignment;
import de.uni_hildesheim.sse.ivml.AttrAssignmentPart;
import de.uni_hildesheim.sse.ivml.AttributeTo;
import de.uni_hildesheim.sse.ivml.BasicType;
import de.uni_hildesheim.sse.ivml.Call;
import de.uni_hildesheim.sse.ivml.CollectionInitializer;
import de.uni_hildesheim.sse.ivml.ConflictStmt;
import de.uni_hildesheim.sse.ivml.Declaration;
import de.uni_hildesheim.sse.ivml.Declarator;
import de.uni_hildesheim.sse.ivml.DerivedType;
import de.uni_hildesheim.sse.ivml.DslContext;
import de.uni_hildesheim.sse.ivml.EqualityExpression;
import de.uni_hildesheim.sse.ivml.EqualityExpressionPart;
import de.uni_hildesheim.sse.ivml.Eval;
import de.uni_hildesheim.sse.ivml.Export;
import de.uni_hildesheim.sse.ivml.Expression;
import de.uni_hildesheim.sse.ivml.ExpressionAccess;
import de.uni_hildesheim.sse.ivml.ExpressionListEntry;
import de.uni_hildesheim.sse.ivml.ExpressionListOrRange;
import de.uni_hildesheim.sse.ivml.ExpressionStatement;
import de.uni_hildesheim.sse.ivml.FeatureCall;
import de.uni_hildesheim.sse.ivml.Freeze;
import de.uni_hildesheim.sse.ivml.FreezeButExpression;
import de.uni_hildesheim.sse.ivml.FreezeButList;
import de.uni_hildesheim.sse.ivml.FreezeStatement;
import de.uni_hildesheim.sse.ivml.IfExpression;
import de.uni_hildesheim.sse.ivml.ImplicationExpression;
import de.uni_hildesheim.sse.ivml.ImplicationExpressionPart;
import de.uni_hildesheim.sse.ivml.ImportStmt;
import de.uni_hildesheim.sse.ivml.InterfaceDeclaration;
import de.uni_hildesheim.sse.ivml.IvmlFactory;
import de.uni_hildesheim.sse.ivml.IvmlPackage;
import de.uni_hildesheim.sse.ivml.LetExpression;
import de.uni_hildesheim.sse.ivml.Literal;
import de.uni_hildesheim.sse.ivml.LogicalExpression;
import de.uni_hildesheim.sse.ivml.LogicalExpressionPart;
import de.uni_hildesheim.sse.ivml.MultiplicativeExpression;
import de.uni_hildesheim.sse.ivml.MultiplicativeExpressionPart;
import de.uni_hildesheim.sse.ivml.NumValue;
import de.uni_hildesheim.sse.ivml.OpDefParameter;
import de.uni_hildesheim.sse.ivml.OpDefParameterList;
import de.uni_hildesheim.sse.ivml.OpDefStatement;
import de.uni_hildesheim.sse.ivml.PostfixExpression;
import de.uni_hildesheim.sse.ivml.PrimaryExpression;
import de.uni_hildesheim.sse.ivml.Project;
import de.uni_hildesheim.sse.ivml.ProjectContents;
import de.uni_hildesheim.sse.ivml.QualifiedName;
import de.uni_hildesheim.sse.ivml.RelationalExpression;
import de.uni_hildesheim.sse.ivml.RelationalExpressionPart;
import de.uni_hildesheim.sse.ivml.SetOp;
import de.uni_hildesheim.sse.ivml.Type;
import de.uni_hildesheim.sse.ivml.Typedef;
import de.uni_hildesheim.sse.ivml.TypedefCompound;
import de.uni_hildesheim.sse.ivml.TypedefConstraint;
import de.uni_hildesheim.sse.ivml.TypedefEnum;
import de.uni_hildesheim.sse.ivml.TypedefEnumLiteral;
import de.uni_hildesheim.sse.ivml.TypedefMapping;
import de.uni_hildesheim.sse.ivml.UnaryExpression;
import de.uni_hildesheim.sse.ivml.Value;
import de.uni_hildesheim.sse.ivml.VariabilityUnit;
import de.uni_hildesheim.sse.ivml.VariableDeclaration;
import de.uni_hildesheim.sse.ivml.VariableDeclarationPart;
import de.uni_hildesheim.sse.ivml.VersionStmt;
import de.uni_hildesheim.sse.ivml.VersionedId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IvmlFactoryImpl extends EFactoryImpl implements IvmlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IvmlFactory init()
  {
    try
    {
      IvmlFactory theIvmlFactory = (IvmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.uni_hildesheim.de/sse/Ivml"); 
      if (theIvmlFactory != null)
      {
        return theIvmlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IvmlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IvmlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IvmlPackage.VARIABILITY_UNIT: return createVariabilityUnit();
      case IvmlPackage.PROJECT: return createProject();
      case IvmlPackage.PROJECT_CONTENTS: return createProjectContents();
      case IvmlPackage.TYPEDEF: return createTypedef();
      case IvmlPackage.TYPEDEF_ENUM: return createTypedefEnum();
      case IvmlPackage.TYPEDEF_ENUM_LITERAL: return createTypedefEnumLiteral();
      case IvmlPackage.TYPEDEF_COMPOUND: return createTypedefCompound();
      case IvmlPackage.ATTR_ASSIGNMENT: return createAttrAssignment();
      case IvmlPackage.ATTR_ASSIGNMENT_PART: return createAttrAssignmentPart();
      case IvmlPackage.TYPEDEF_MAPPING: return createTypedefMapping();
      case IvmlPackage.TYPEDEF_CONSTRAINT: return createTypedefConstraint();
      case IvmlPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case IvmlPackage.VARIABLE_DECLARATION_PART: return createVariableDeclarationPart();
      case IvmlPackage.BASIC_TYPE: return createBasicType();
      case IvmlPackage.TYPE: return createType();
      case IvmlPackage.NUM_VALUE: return createNumValue();
      case IvmlPackage.QUALIFIED_NAME: return createQualifiedName();
      case IvmlPackage.ACCESS_NAME: return createAccessName();
      case IvmlPackage.VALUE: return createValue();
      case IvmlPackage.DERIVED_TYPE: return createDerivedType();
      case IvmlPackage.DSL_CONTEXT: return createDslContext();
      case IvmlPackage.ATTRIBUTE_TO: return createAttributeTo();
      case IvmlPackage.FREEZE: return createFreeze();
      case IvmlPackage.FREEZE_STATEMENT: return createFreezeStatement();
      case IvmlPackage.FREEZE_BUT_LIST: return createFreezeButList();
      case IvmlPackage.FREEZE_BUT_EXPRESSION: return createFreezeButExpression();
      case IvmlPackage.EVAL: return createEval();
      case IvmlPackage.INTERFACE_DECLARATION: return createInterfaceDeclaration();
      case IvmlPackage.EXPORT: return createExport();
      case IvmlPackage.IMPORT_STMT: return createImportStmt();
      case IvmlPackage.CONFLICT_STMT: return createConflictStmt();
      case IvmlPackage.VERSIONED_ID: return createVersionedId();
      case IvmlPackage.VERSION_STMT: return createVersionStmt();
      case IvmlPackage.OP_DEF_STATEMENT: return createOpDefStatement();
      case IvmlPackage.OP_DEF_PARAMETER_LIST: return createOpDefParameterList();
      case IvmlPackage.OP_DEF_PARAMETER: return createOpDefParameter();
      case IvmlPackage.EXPRESSION_STATEMENT: return createExpressionStatement();
      case IvmlPackage.EXPRESSION: return createExpression();
      case IvmlPackage.LET_EXPRESSION: return createLetExpression();
      case IvmlPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
      case IvmlPackage.ASSIGNMENT_EXPRESSION_PART: return createAssignmentExpressionPart();
      case IvmlPackage.IMPLICATION_EXPRESSION: return createImplicationExpression();
      case IvmlPackage.IMPLICATION_EXPRESSION_PART: return createImplicationExpressionPart();
      case IvmlPackage.LOGICAL_EXPRESSION: return createLogicalExpression();
      case IvmlPackage.LOGICAL_EXPRESSION_PART: return createLogicalExpressionPart();
      case IvmlPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
      case IvmlPackage.EQUALITY_EXPRESSION_PART: return createEqualityExpressionPart();
      case IvmlPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
      case IvmlPackage.RELATIONAL_EXPRESSION_PART: return createRelationalExpressionPart();
      case IvmlPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case IvmlPackage.ADDITIVE_EXPRESSION_PART: return createAdditiveExpressionPart();
      case IvmlPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case IvmlPackage.MULTIPLICATIVE_EXPRESSION_PART: return createMultiplicativeExpressionPart();
      case IvmlPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case IvmlPackage.POSTFIX_EXPRESSION: return createPostfixExpression();
      case IvmlPackage.CALL: return createCall();
      case IvmlPackage.FEATURE_CALL: return createFeatureCall();
      case IvmlPackage.SET_OP: return createSetOp();
      case IvmlPackage.DECLARATOR: return createDeclarator();
      case IvmlPackage.DECLARATION: return createDeclaration();
      case IvmlPackage.ACTUAL_PARAMETER_LIST: return createActualParameterList();
      case IvmlPackage.EXPRESSION_ACCESS: return createExpressionAccess();
      case IvmlPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case IvmlPackage.COLLECTION_INITIALIZER: return createCollectionInitializer();
      case IvmlPackage.EXPRESSION_LIST_OR_RANGE: return createExpressionListOrRange();
      case IvmlPackage.EXPRESSION_LIST_ENTRY: return createExpressionListEntry();
      case IvmlPackage.LITERAL: return createLiteral();
      case IvmlPackage.IF_EXPRESSION: return createIfExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariabilityUnit createVariabilityUnit()
  {
    VariabilityUnitImpl variabilityUnit = new VariabilityUnitImpl();
    return variabilityUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectContents createProjectContents()
  {
    ProjectContentsImpl projectContents = new ProjectContentsImpl();
    return projectContents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Typedef createTypedef()
  {
    TypedefImpl typedef = new TypedefImpl();
    return typedef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefEnum createTypedefEnum()
  {
    TypedefEnumImpl typedefEnum = new TypedefEnumImpl();
    return typedefEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefEnumLiteral createTypedefEnumLiteral()
  {
    TypedefEnumLiteralImpl typedefEnumLiteral = new TypedefEnumLiteralImpl();
    return typedefEnumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefCompound createTypedefCompound()
  {
    TypedefCompoundImpl typedefCompound = new TypedefCompoundImpl();
    return typedefCompound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrAssignment createAttrAssignment()
  {
    AttrAssignmentImpl attrAssignment = new AttrAssignmentImpl();
    return attrAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrAssignmentPart createAttrAssignmentPart()
  {
    AttrAssignmentPartImpl attrAssignmentPart = new AttrAssignmentPartImpl();
    return attrAssignmentPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefMapping createTypedefMapping()
  {
    TypedefMappingImpl typedefMapping = new TypedefMappingImpl();
    return typedefMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefConstraint createTypedefConstraint()
  {
    TypedefConstraintImpl typedefConstraint = new TypedefConstraintImpl();
    return typedefConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclarationPart createVariableDeclarationPart()
  {
    VariableDeclarationPartImpl variableDeclarationPart = new VariableDeclarationPartImpl();
    return variableDeclarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumValue createNumValue()
  {
    NumValueImpl numValue = new NumValueImpl();
    return numValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName createQualifiedName()
  {
    QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessName createAccessName()
  {
    AccessNameImpl accessName = new AccessNameImpl();
    return accessName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedType createDerivedType()
  {
    DerivedTypeImpl derivedType = new DerivedTypeImpl();
    return derivedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslContext createDslContext()
  {
    DslContextImpl dslContext = new DslContextImpl();
    return dslContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeTo createAttributeTo()
  {
    AttributeToImpl attributeTo = new AttributeToImpl();
    return attributeTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Freeze createFreeze()
  {
    FreezeImpl freeze = new FreezeImpl();
    return freeze;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreezeStatement createFreezeStatement()
  {
    FreezeStatementImpl freezeStatement = new FreezeStatementImpl();
    return freezeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreezeButList createFreezeButList()
  {
    FreezeButListImpl freezeButList = new FreezeButListImpl();
    return freezeButList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreezeButExpression createFreezeButExpression()
  {
    FreezeButExpressionImpl freezeButExpression = new FreezeButExpressionImpl();
    return freezeButExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Eval createEval()
  {
    EvalImpl eval = new EvalImpl();
    return eval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDeclaration createInterfaceDeclaration()
  {
    InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
    return interfaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Export createExport()
  {
    ExportImpl export = new ExportImpl();
    return export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportStmt createImportStmt()
  {
    ImportStmtImpl importStmt = new ImportStmtImpl();
    return importStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictStmt createConflictStmt()
  {
    ConflictStmtImpl conflictStmt = new ConflictStmtImpl();
    return conflictStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionedId createVersionedId()
  {
    VersionedIdImpl versionedId = new VersionedIdImpl();
    return versionedId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionStmt createVersionStmt()
  {
    VersionStmtImpl versionStmt = new VersionStmtImpl();
    return versionStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpDefStatement createOpDefStatement()
  {
    OpDefStatementImpl opDefStatement = new OpDefStatementImpl();
    return opDefStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpDefParameterList createOpDefParameterList()
  {
    OpDefParameterListImpl opDefParameterList = new OpDefParameterListImpl();
    return opDefParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpDefParameter createOpDefParameter()
  {
    OpDefParameterImpl opDefParameter = new OpDefParameterImpl();
    return opDefParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionStatement createExpressionStatement()
  {
    ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
    return expressionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetExpression createLetExpression()
  {
    LetExpressionImpl letExpression = new LetExpressionImpl();
    return letExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpression createAssignmentExpression()
  {
    AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
    return assignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpressionPart createAssignmentExpressionPart()
  {
    AssignmentExpressionPartImpl assignmentExpressionPart = new AssignmentExpressionPartImpl();
    return assignmentExpressionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicationExpression createImplicationExpression()
  {
    ImplicationExpressionImpl implicationExpression = new ImplicationExpressionImpl();
    return implicationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicationExpressionPart createImplicationExpressionPart()
  {
    ImplicationExpressionPartImpl implicationExpressionPart = new ImplicationExpressionPartImpl();
    return implicationExpressionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalExpression createLogicalExpression()
  {
    LogicalExpressionImpl logicalExpression = new LogicalExpressionImpl();
    return logicalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalExpressionPart createLogicalExpressionPart()
  {
    LogicalExpressionPartImpl logicalExpressionPart = new LogicalExpressionPartImpl();
    return logicalExpressionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualityExpression createEqualityExpression()
  {
    EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualityExpressionPart createEqualityExpressionPart()
  {
    EqualityExpressionPartImpl equalityExpressionPart = new EqualityExpressionPartImpl();
    return equalityExpressionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalExpression createRelationalExpression()
  {
    RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
    return relationalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalExpressionPart createRelationalExpressionPart()
  {
    RelationalExpressionPartImpl relationalExpressionPart = new RelationalExpressionPartImpl();
    return relationalExpressionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpressionPart createAdditiveExpressionPart()
  {
    AdditiveExpressionPartImpl additiveExpressionPart = new AdditiveExpressionPartImpl();
    return additiveExpressionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpressionPart createMultiplicativeExpressionPart()
  {
    MultiplicativeExpressionPartImpl multiplicativeExpressionPart = new MultiplicativeExpressionPartImpl();
    return multiplicativeExpressionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostfixExpression createPostfixExpression()
  {
    PostfixExpressionImpl postfixExpression = new PostfixExpressionImpl();
    return postfixExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureCall createFeatureCall()
  {
    FeatureCallImpl featureCall = new FeatureCallImpl();
    return featureCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetOp createSetOp()
  {
    SetOpImpl setOp = new SetOpImpl();
    return setOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarator createDeclarator()
  {
    DeclaratorImpl declarator = new DeclaratorImpl();
    return declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualParameterList createActualParameterList()
  {
    ActualParameterListImpl actualParameterList = new ActualParameterListImpl();
    return actualParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionAccess createExpressionAccess()
  {
    ExpressionAccessImpl expressionAccess = new ExpressionAccessImpl();
    return expressionAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionInitializer createCollectionInitializer()
  {
    CollectionInitializerImpl collectionInitializer = new CollectionInitializerImpl();
    return collectionInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionListOrRange createExpressionListOrRange()
  {
    ExpressionListOrRangeImpl expressionListOrRange = new ExpressionListOrRangeImpl();
    return expressionListOrRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionListEntry createExpressionListEntry()
  {
    ExpressionListEntryImpl expressionListEntry = new ExpressionListEntryImpl();
    return expressionListEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExpression createIfExpression()
  {
    IfExpressionImpl ifExpression = new IfExpressionImpl();
    return ifExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IvmlPackage getIvmlPackage()
  {
    return (IvmlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IvmlPackage getPackage()
  {
    return IvmlPackage.eINSTANCE;
  }

} //IvmlFactoryImpl
