/**
 */
package de.uni_hildesheim.sse.vil.expressions.expressionDsl.impl;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.AdditiveExpression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.AdditiveExpressionPart;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Advice;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ArgumentList;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Call;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Constant;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ConstructorExecution;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ContainerInitializer;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ContainerInitializerExpression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Declaration;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.DeclarationUnit;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Declarator;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.EqualityExpression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.EqualityExpressionPart;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Expression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslFactory;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionOrQualifiedExecution;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionStatement;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Import;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.LanguageUnit;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.LogicalExpression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.LogicalExpressionPart;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.MultiplicativeExpression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.MultiplicativeExpressionPart;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.NamedArgument;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.NumValue;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Parameter;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ParameterList;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.PostfixExpression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.PrimaryExpression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.QualifiedName;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.QualifiedPrefix;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.RelationalExpression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.RelationalExpressionPart;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.SubCall;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.SuperExecution;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Type;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.TypeDef;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.TypeParameters;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.UnaryExpression;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.UnqualifiedExecution;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.VariableDeclaration;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.VersionSpec;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.VersionStmt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionDslPackageImpl extends EPackageImpl implements ExpressionDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalExpressionPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalityExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalityExpressionPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationalExpressionPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpressionPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExpressionPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postfixExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionOrQualifiedExecutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unqualifiedExecutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass superExecutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorExecutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedPrefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerInitializerExpressionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExpressionDslPackageImpl()
  {
    super(eNS_URI, ExpressionDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ExpressionDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ExpressionDslPackage init()
  {
    if (isInited) return (ExpressionDslPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionDslPackage.eNS_URI);

    // Obtain or create and register package
    ExpressionDslPackageImpl theExpressionDslPackage = (ExpressionDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theExpressionDslPackage.createPackageContents();

    // Initialize created meta-data
    theExpressionDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theExpressionDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ExpressionDslPackage.eNS_URI, theExpressionDslPackage);
    return theExpressionDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLanguageUnit()
  {
    return languageUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLanguageUnit_Advices()
  {
    return (EReference)languageUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLanguageUnit_Name()
  {
    return (EAttribute)languageUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLanguageUnit_Version()
  {
    return (EReference)languageUnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLanguageUnit_Imports()
  {
    return (EReference)languageUnitEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Const()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Type()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Name()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Expression()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDef()
  {
    return typeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeDef_Name()
  {
    return (EAttribute)typeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDef_Type()
  {
    return (EReference)typeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdvice()
  {
    return adviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdvice_Name()
  {
    return (EReference)adviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdvice_VersionSpec()
  {
    return (EReference)adviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersionSpec()
  {
    return versionSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVersionSpec_Restriction()
  {
    return (EReference)versionSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterList()
  {
    return parameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterList_Param()
  {
    return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersionStmt()
  {
    return versionStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersionStmt_Version()
  {
    return (EAttribute)versionStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_Name()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImport_VersionSpec()
  {
    return (EReference)importEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionStatement()
  {
    return expressionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionStatement_Var()
  {
    return (EAttribute)expressionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionStatement_Field()
  {
    return (EAttribute)expressionStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionStatement_Expr()
  {
    return (EReference)expressionStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Expr()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Init()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalExpression()
  {
    return logicalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalExpression_Left()
  {
    return (EReference)logicalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalExpression_Right()
  {
    return (EReference)logicalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalExpressionPart()
  {
    return logicalExpressionPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicalExpressionPart_Op()
  {
    return (EAttribute)logicalExpressionPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalExpressionPart_Ex()
  {
    return (EReference)logicalExpressionPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualityExpression()
  {
    return equalityExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEqualityExpression_Left()
  {
    return (EReference)equalityExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEqualityExpression_Right()
  {
    return (EReference)equalityExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualityExpressionPart()
  {
    return equalityExpressionPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEqualityExpressionPart_Op()
  {
    return (EAttribute)equalityExpressionPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEqualityExpressionPart_Ex()
  {
    return (EReference)equalityExpressionPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationalExpression()
  {
    return relationalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationalExpression_Left()
  {
    return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationalExpression_Right()
  {
    return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationalExpressionPart()
  {
    return relationalExpressionPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationalExpressionPart_Op()
  {
    return (EAttribute)relationalExpressionPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationalExpressionPart_Ex()
  {
    return (EReference)relationalExpressionPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveExpression()
  {
    return additiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpression_Left()
  {
    return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpression_Right()
  {
    return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveExpressionPart()
  {
    return additiveExpressionPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdditiveExpressionPart_Op()
  {
    return (EAttribute)additiveExpressionPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpressionPart_Ex()
  {
    return (EReference)additiveExpressionPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicativeExpression()
  {
    return multiplicativeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExpression_Left()
  {
    return (EReference)multiplicativeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExpression_Right()
  {
    return (EReference)multiplicativeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicativeExpressionPart()
  {
    return multiplicativeExpressionPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicativeExpressionPart_Op()
  {
    return (EAttribute)multiplicativeExpressionPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExpressionPart_Expr()
  {
    return (EReference)multiplicativeExpressionPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpression()
  {
    return unaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpression_Op()
  {
    return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpression_Expr()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPostfixExpression()
  {
    return postfixExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostfixExpression_Left()
  {
    return (EReference)postfixExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryExpression()
  {
    return primaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_OtherEx()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_UnqEx()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_SuperEx()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_NewEx()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionOrQualifiedExecution()
  {
    return expressionOrQualifiedExecutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionOrQualifiedExecution_Val()
  {
    return (EReference)expressionOrQualifiedExecutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionOrQualifiedExecution_Parenthesis()
  {
    return (EReference)expressionOrQualifiedExecutionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionOrQualifiedExecution_Calls()
  {
    return (EReference)expressionOrQualifiedExecutionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnqualifiedExecution()
  {
    return unqualifiedExecutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnqualifiedExecution_Call()
  {
    return (EReference)unqualifiedExecutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnqualifiedExecution_Calls()
  {
    return (EReference)unqualifiedExecutionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuperExecution()
  {
    return superExecutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSuperExecution_Call()
  {
    return (EReference)superExecutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSuperExecution_Calls()
  {
    return (EReference)superExecutionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructorExecution()
  {
    return constructorExecutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorExecution_Type()
  {
    return (EReference)constructorExecutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorExecution_Param()
  {
    return (EReference)constructorExecutionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorExecution_Calls()
  {
    return (EReference)constructorExecutionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubCall()
  {
    return subCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubCall_Type()
  {
    return (EAttribute)subCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubCall_Call()
  {
    return (EReference)subCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubCall_ArrayEx()
  {
    return (EReference)subCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarator()
  {
    return declaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarator_Decl()
  {
    return (EReference)declaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclaration_Type()
  {
    return (EReference)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclaration_Units()
  {
    return (EReference)declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarationUnit()
  {
    return declarationUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclarationUnit_Id()
  {
    return (EAttribute)declarationUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationUnit_Deflt()
  {
    return (EReference)declarationUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCall()
  {
    return callEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCall_Name()
  {
    return (EReference)callEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCall_Decl()
  {
    return (EReference)callEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCall_Param()
  {
    return (EReference)callEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgumentList()
  {
    return argumentListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgumentList_Param()
  {
    return (EReference)argumentListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedArgument()
  {
    return namedArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedArgument_Name()
  {
    return (EAttribute)namedArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedArgument_Ex()
  {
    return (EReference)namedArgumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedPrefix()
  {
    return qualifiedPrefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedPrefix_Qname()
  {
    return (EAttribute)qualifiedPrefixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedName()
  {
    return qualifiedNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedName_Prefix()
  {
    return (EReference)qualifiedNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedName_Qname()
  {
    return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_NValue()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_SValue()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_QValue()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_BValue()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Null()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_Version()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumValue()
  {
    return numValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumValue_Val()
  {
    return (EAttribute)numValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Name()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Set()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Param()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Seq()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Map()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Call()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Return()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeParameters()
  {
    return typeParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeParameters_Param()
  {
    return (EReference)typeParametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerInitializer()
  {
    return containerInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerInitializer_Exprs()
  {
    return (EReference)containerInitializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerInitializerExpression()
  {
    return containerInitializerExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerInitializerExpression_Logical()
  {
    return (EReference)containerInitializerExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerInitializerExpression_Container()
  {
    return (EReference)containerInitializerExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionDslFactory getExpressionDslFactory()
  {
    return (ExpressionDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    languageUnitEClass = createEClass(LANGUAGE_UNIT);
    createEReference(languageUnitEClass, LANGUAGE_UNIT__ADVICES);
    createEAttribute(languageUnitEClass, LANGUAGE_UNIT__NAME);
    createEReference(languageUnitEClass, LANGUAGE_UNIT__VERSION);
    createEReference(languageUnitEClass, LANGUAGE_UNIT__IMPORTS);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__CONST);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__EXPRESSION);

    typeDefEClass = createEClass(TYPE_DEF);
    createEAttribute(typeDefEClass, TYPE_DEF__NAME);
    createEReference(typeDefEClass, TYPE_DEF__TYPE);

    adviceEClass = createEClass(ADVICE);
    createEReference(adviceEClass, ADVICE__NAME);
    createEReference(adviceEClass, ADVICE__VERSION_SPEC);

    versionSpecEClass = createEClass(VERSION_SPEC);
    createEReference(versionSpecEClass, VERSION_SPEC__RESTRICTION);

    parameterListEClass = createEClass(PARAMETER_LIST);
    createEReference(parameterListEClass, PARAMETER_LIST__PARAM);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TYPE);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    versionStmtEClass = createEClass(VERSION_STMT);
    createEAttribute(versionStmtEClass, VERSION_STMT__VERSION);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__NAME);
    createEReference(importEClass, IMPORT__VERSION_SPEC);

    expressionStatementEClass = createEClass(EXPRESSION_STATEMENT);
    createEAttribute(expressionStatementEClass, EXPRESSION_STATEMENT__VAR);
    createEAttribute(expressionStatementEClass, EXPRESSION_STATEMENT__FIELD);
    createEReference(expressionStatementEClass, EXPRESSION_STATEMENT__EXPR);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__EXPR);
    createEReference(expressionEClass, EXPRESSION__INIT);

    logicalExpressionEClass = createEClass(LOGICAL_EXPRESSION);
    createEReference(logicalExpressionEClass, LOGICAL_EXPRESSION__LEFT);
    createEReference(logicalExpressionEClass, LOGICAL_EXPRESSION__RIGHT);

    logicalExpressionPartEClass = createEClass(LOGICAL_EXPRESSION_PART);
    createEAttribute(logicalExpressionPartEClass, LOGICAL_EXPRESSION_PART__OP);
    createEReference(logicalExpressionPartEClass, LOGICAL_EXPRESSION_PART__EX);

    equalityExpressionEClass = createEClass(EQUALITY_EXPRESSION);
    createEReference(equalityExpressionEClass, EQUALITY_EXPRESSION__LEFT);
    createEReference(equalityExpressionEClass, EQUALITY_EXPRESSION__RIGHT);

    equalityExpressionPartEClass = createEClass(EQUALITY_EXPRESSION_PART);
    createEAttribute(equalityExpressionPartEClass, EQUALITY_EXPRESSION_PART__OP);
    createEReference(equalityExpressionPartEClass, EQUALITY_EXPRESSION_PART__EX);

    relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
    createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__LEFT);
    createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__RIGHT);

    relationalExpressionPartEClass = createEClass(RELATIONAL_EXPRESSION_PART);
    createEAttribute(relationalExpressionPartEClass, RELATIONAL_EXPRESSION_PART__OP);
    createEReference(relationalExpressionPartEClass, RELATIONAL_EXPRESSION_PART__EX);

    additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);
    createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__LEFT);
    createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__RIGHT);

    additiveExpressionPartEClass = createEClass(ADDITIVE_EXPRESSION_PART);
    createEAttribute(additiveExpressionPartEClass, ADDITIVE_EXPRESSION_PART__OP);
    createEReference(additiveExpressionPartEClass, ADDITIVE_EXPRESSION_PART__EX);

    multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);
    createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__LEFT);
    createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__RIGHT);

    multiplicativeExpressionPartEClass = createEClass(MULTIPLICATIVE_EXPRESSION_PART);
    createEAttribute(multiplicativeExpressionPartEClass, MULTIPLICATIVE_EXPRESSION_PART__OP);
    createEReference(multiplicativeExpressionPartEClass, MULTIPLICATIVE_EXPRESSION_PART__EXPR);

    unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
    createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OP);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__EXPR);

    postfixExpressionEClass = createEClass(POSTFIX_EXPRESSION);
    createEReference(postfixExpressionEClass, POSTFIX_EXPRESSION__LEFT);

    primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__OTHER_EX);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__UNQ_EX);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__SUPER_EX);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__NEW_EX);

    expressionOrQualifiedExecutionEClass = createEClass(EXPRESSION_OR_QUALIFIED_EXECUTION);
    createEReference(expressionOrQualifiedExecutionEClass, EXPRESSION_OR_QUALIFIED_EXECUTION__VAL);
    createEReference(expressionOrQualifiedExecutionEClass, EXPRESSION_OR_QUALIFIED_EXECUTION__PARENTHESIS);
    createEReference(expressionOrQualifiedExecutionEClass, EXPRESSION_OR_QUALIFIED_EXECUTION__CALLS);

    unqualifiedExecutionEClass = createEClass(UNQUALIFIED_EXECUTION);
    createEReference(unqualifiedExecutionEClass, UNQUALIFIED_EXECUTION__CALL);
    createEReference(unqualifiedExecutionEClass, UNQUALIFIED_EXECUTION__CALLS);

    superExecutionEClass = createEClass(SUPER_EXECUTION);
    createEReference(superExecutionEClass, SUPER_EXECUTION__CALL);
    createEReference(superExecutionEClass, SUPER_EXECUTION__CALLS);

    constructorExecutionEClass = createEClass(CONSTRUCTOR_EXECUTION);
    createEReference(constructorExecutionEClass, CONSTRUCTOR_EXECUTION__TYPE);
    createEReference(constructorExecutionEClass, CONSTRUCTOR_EXECUTION__PARAM);
    createEReference(constructorExecutionEClass, CONSTRUCTOR_EXECUTION__CALLS);

    subCallEClass = createEClass(SUB_CALL);
    createEAttribute(subCallEClass, SUB_CALL__TYPE);
    createEReference(subCallEClass, SUB_CALL__CALL);
    createEReference(subCallEClass, SUB_CALL__ARRAY_EX);

    declaratorEClass = createEClass(DECLARATOR);
    createEReference(declaratorEClass, DECLARATOR__DECL);

    declarationEClass = createEClass(DECLARATION);
    createEReference(declarationEClass, DECLARATION__TYPE);
    createEReference(declarationEClass, DECLARATION__UNITS);

    declarationUnitEClass = createEClass(DECLARATION_UNIT);
    createEAttribute(declarationUnitEClass, DECLARATION_UNIT__ID);
    createEReference(declarationUnitEClass, DECLARATION_UNIT__DEFLT);

    callEClass = createEClass(CALL);
    createEReference(callEClass, CALL__NAME);
    createEReference(callEClass, CALL__DECL);
    createEReference(callEClass, CALL__PARAM);

    argumentListEClass = createEClass(ARGUMENT_LIST);
    createEReference(argumentListEClass, ARGUMENT_LIST__PARAM);

    namedArgumentEClass = createEClass(NAMED_ARGUMENT);
    createEAttribute(namedArgumentEClass, NAMED_ARGUMENT__NAME);
    createEReference(namedArgumentEClass, NAMED_ARGUMENT__EX);

    qualifiedPrefixEClass = createEClass(QUALIFIED_PREFIX);
    createEAttribute(qualifiedPrefixEClass, QUALIFIED_PREFIX__QNAME);

    qualifiedNameEClass = createEClass(QUALIFIED_NAME);
    createEReference(qualifiedNameEClass, QUALIFIED_NAME__PREFIX);
    createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__QNAME);

    constantEClass = createEClass(CONSTANT);
    createEReference(constantEClass, CONSTANT__NVALUE);
    createEAttribute(constantEClass, CONSTANT__SVALUE);
    createEReference(constantEClass, CONSTANT__QVALUE);
    createEAttribute(constantEClass, CONSTANT__BVALUE);
    createEAttribute(constantEClass, CONSTANT__NULL);
    createEAttribute(constantEClass, CONSTANT__VERSION);

    numValueEClass = createEClass(NUM_VALUE);
    createEAttribute(numValueEClass, NUM_VALUE__VAL);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__NAME);
    createEAttribute(typeEClass, TYPE__SET);
    createEReference(typeEClass, TYPE__PARAM);
    createEAttribute(typeEClass, TYPE__SEQ);
    createEAttribute(typeEClass, TYPE__MAP);
    createEAttribute(typeEClass, TYPE__CALL);
    createEReference(typeEClass, TYPE__RETURN);

    typeParametersEClass = createEClass(TYPE_PARAMETERS);
    createEReference(typeParametersEClass, TYPE_PARAMETERS__PARAM);

    containerInitializerEClass = createEClass(CONTAINER_INITIALIZER);
    createEReference(containerInitializerEClass, CONTAINER_INITIALIZER__EXPRS);

    containerInitializerExpressionEClass = createEClass(CONTAINER_INITIALIZER_EXPRESSION);
    createEReference(containerInitializerExpressionEClass, CONTAINER_INITIALIZER_EXPRESSION__LOGICAL);
    createEReference(containerInitializerExpressionEClass, CONTAINER_INITIALIZER_EXPRESSION__CONTAINER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(languageUnitEClass, LanguageUnit.class, "LanguageUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLanguageUnit_Advices(), this.getAdvice(), null, "advices", null, 0, -1, LanguageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, LanguageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLanguageUnit_Version(), this.getVersionStmt(), null, "version", null, 0, 1, LanguageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLanguageUnit_Imports(), this.getImport(), null, "imports", null, 0, -1, LanguageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_Const(), ecorePackage.getEString(), "const", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclaration_Type(), this.getType(), null, "type", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclaration_Expression(), this.getExpression(), null, "expression", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDef_Type(), this.getType(), null, "type", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adviceEClass, Advice.class, "Advice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdvice_Name(), this.getQualifiedName(), null, "name", null, 0, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdvice_VersionSpec(), this.getVersionSpec(), null, "versionSpec", null, 0, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionSpecEClass, VersionSpec.class, "VersionSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVersionSpec_Restriction(), this.getExpression(), null, "restriction", null, 0, 1, VersionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterList_Param(), this.getParameter(), null, "param", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Type(), this.getType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(versionStmtEClass, VersionStmt.class, "VersionStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersionStmt_Version(), ecorePackage.getEString(), "version", null, 0, 1, VersionStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_Name(), ecorePackage.getEString(), "name", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImport_VersionSpec(), this.getVersionSpec(), null, "versionSpec", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionStatementEClass, ExpressionStatement.class, "ExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressionStatement_Var(), ecorePackage.getEString(), "var", null, 0, 1, ExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionStatement_Field(), ecorePackage.getEString(), "field", null, 0, 1, ExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionStatement_Expr(), this.getExpression(), null, "expr", null, 0, 1, ExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Expr(), this.getLogicalExpression(), null, "expr", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Init(), this.getContainerInitializer(), null, "init", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalExpressionEClass, LogicalExpression.class, "LogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalExpression_Left(), this.getEqualityExpression(), null, "left", null, 0, 1, LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicalExpression_Right(), this.getLogicalExpressionPart(), null, "right", null, 0, -1, LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalExpressionPartEClass, LogicalExpressionPart.class, "LogicalExpressionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLogicalExpressionPart_Op(), ecorePackage.getEString(), "op", null, 0, 1, LogicalExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicalExpressionPart_Ex(), this.getEqualityExpression(), null, "ex", null, 0, 1, LogicalExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalityExpressionEClass, EqualityExpression.class, "EqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEqualityExpression_Left(), this.getRelationalExpression(), null, "left", null, 0, 1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEqualityExpression_Right(), this.getEqualityExpressionPart(), null, "right", null, 0, 1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalityExpressionPartEClass, EqualityExpressionPart.class, "EqualityExpressionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEqualityExpressionPart_Op(), ecorePackage.getEString(), "op", null, 0, 1, EqualityExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEqualityExpressionPart_Ex(), this.getRelationalExpression(), null, "ex", null, 0, 1, EqualityExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationalExpression_Left(), this.getAdditiveExpression(), null, "left", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationalExpression_Right(), this.getRelationalExpressionPart(), null, "right", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationalExpressionPartEClass, RelationalExpressionPart.class, "RelationalExpressionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationalExpressionPart_Op(), ecorePackage.getEString(), "op", null, 0, 1, RelationalExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationalExpressionPart_Ex(), this.getAdditiveExpression(), null, "ex", null, 0, 1, RelationalExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditiveExpression_Left(), this.getMultiplicativeExpression(), null, "left", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdditiveExpression_Right(), this.getAdditiveExpressionPart(), null, "right", null, 0, -1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExpressionPartEClass, AdditiveExpressionPart.class, "AdditiveExpressionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdditiveExpressionPart_Op(), ecorePackage.getEString(), "op", null, 0, 1, AdditiveExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdditiveExpressionPart_Ex(), this.getMultiplicativeExpression(), null, "ex", null, 0, 1, AdditiveExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicativeExpressionEClass, MultiplicativeExpression.class, "MultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicativeExpression_Left(), this.getUnaryExpression(), null, "left", null, 0, 1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicativeExpression_Right(), this.getMultiplicativeExpressionPart(), null, "right", null, 0, 1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicativeExpressionPartEClass, MultiplicativeExpressionPart.class, "MultiplicativeExpressionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiplicativeExpressionPart_Op(), ecorePackage.getEString(), "op", null, 0, 1, MultiplicativeExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicativeExpressionPart_Expr(), this.getUnaryExpression(), null, "expr", null, 0, 1, MultiplicativeExpressionPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpression_Expr(), this.getPostfixExpression(), null, "expr", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postfixExpressionEClass, PostfixExpression.class, "PostfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPostfixExpression_Left(), this.getPrimaryExpression(), null, "left", null, 0, 1, PostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryExpression_OtherEx(), this.getExpressionOrQualifiedExecution(), null, "otherEx", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_UnqEx(), this.getUnqualifiedExecution(), null, "unqEx", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_SuperEx(), this.getSuperExecution(), null, "superEx", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimaryExpression_NewEx(), this.getConstructorExecution(), null, "newEx", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionOrQualifiedExecutionEClass, ExpressionOrQualifiedExecution.class, "ExpressionOrQualifiedExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionOrQualifiedExecution_Val(), this.getConstant(), null, "val", null, 0, 1, ExpressionOrQualifiedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionOrQualifiedExecution_Parenthesis(), this.getExpression(), null, "parenthesis", null, 0, 1, ExpressionOrQualifiedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionOrQualifiedExecution_Calls(), this.getSubCall(), null, "calls", null, 0, -1, ExpressionOrQualifiedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unqualifiedExecutionEClass, UnqualifiedExecution.class, "UnqualifiedExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnqualifiedExecution_Call(), this.getCall(), null, "call", null, 0, 1, UnqualifiedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnqualifiedExecution_Calls(), this.getSubCall(), null, "calls", null, 0, -1, UnqualifiedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(superExecutionEClass, SuperExecution.class, "SuperExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSuperExecution_Call(), this.getCall(), null, "call", null, 0, 1, SuperExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSuperExecution_Calls(), this.getSubCall(), null, "calls", null, 0, -1, SuperExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructorExecutionEClass, ConstructorExecution.class, "ConstructorExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstructorExecution_Type(), this.getType(), null, "type", null, 0, 1, ConstructorExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructorExecution_Param(), this.getArgumentList(), null, "param", null, 0, 1, ConstructorExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructorExecution_Calls(), this.getSubCall(), null, "calls", null, 0, -1, ConstructorExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subCallEClass, SubCall.class, "SubCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubCall_Type(), ecorePackage.getEString(), "type", null, 0, 1, SubCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubCall_Call(), this.getCall(), null, "call", null, 0, 1, SubCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubCall_ArrayEx(), this.getExpression(), null, "arrayEx", null, 0, 1, SubCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaratorEClass, Declarator.class, "Declarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarator_Decl(), this.getDeclaration(), null, "decl", null, 0, -1, Declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclaration_Type(), this.getType(), null, "type", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclaration_Units(), this.getDeclarationUnit(), null, "units", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationUnitEClass, DeclarationUnit.class, "DeclarationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclarationUnit_Id(), ecorePackage.getEString(), "id", null, 0, 1, DeclarationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarationUnit_Deflt(), this.getExpression(), null, "deflt", null, 0, 1, DeclarationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCall_Name(), this.getQualifiedPrefix(), null, "name", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCall_Decl(), this.getDeclarator(), null, "decl", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCall_Param(), this.getArgumentList(), null, "param", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentListEClass, ArgumentList.class, "ArgumentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgumentList_Param(), this.getNamedArgument(), null, "param", null, 0, -1, ArgumentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedArgumentEClass, NamedArgument.class, "NamedArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamedArgument_Ex(), this.getExpression(), null, "ex", null, 0, 1, NamedArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedPrefixEClass, QualifiedPrefix.class, "QualifiedPrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedPrefix_Qname(), ecorePackage.getEString(), "qname", null, 0, -1, QualifiedPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedNameEClass, QualifiedName.class, "QualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQualifiedName_Prefix(), this.getQualifiedPrefix(), null, "prefix", null, 0, 1, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQualifiedName_Qname(), ecorePackage.getEString(), "qname", null, 0, -1, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstant_NValue(), this.getNumValue(), null, "nValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_SValue(), ecorePackage.getEString(), "sValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstant_QValue(), this.getQualifiedName(), null, "qValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_BValue(), ecorePackage.getEString(), "bValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_Null(), ecorePackage.getEString(), "null", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_Version(), ecorePackage.getEString(), "version", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numValueEClass, NumValue.class, "NumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumValue_Val(), ecorePackage.getEString(), "val", null, 0, 1, NumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_Name(), this.getQualifiedPrefix(), null, "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Set(), ecorePackage.getEString(), "set", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Param(), this.getTypeParameters(), null, "param", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Seq(), ecorePackage.getEString(), "seq", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Map(), ecorePackage.getEString(), "map", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Call(), ecorePackage.getEString(), "call", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Return(), this.getType(), null, "return", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeParametersEClass, TypeParameters.class, "TypeParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeParameters_Param(), this.getType(), null, "param", null, 0, -1, TypeParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerInitializerEClass, ContainerInitializer.class, "ContainerInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerInitializer_Exprs(), this.getContainerInitializerExpression(), null, "exprs", null, 0, -1, ContainerInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerInitializerExpressionEClass, ContainerInitializerExpression.class, "ContainerInitializerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerInitializerExpression_Logical(), this.getLogicalExpression(), null, "logical", null, 0, 1, ContainerInitializerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerInitializerExpression_Container(), this.getContainerInitializer(), null, "container", null, 0, 1, ContainerInitializerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ExpressionDslPackageImpl
