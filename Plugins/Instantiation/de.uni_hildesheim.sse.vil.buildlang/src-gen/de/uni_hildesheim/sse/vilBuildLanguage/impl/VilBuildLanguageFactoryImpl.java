/**
 */
package de.uni_hildesheim.sse.vilBuildLanguage.impl;

import de.uni_hildesheim.sse.vilBuildLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VilBuildLanguageFactoryImpl extends EFactoryImpl implements VilBuildLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VilBuildLanguageFactory init()
  {
    try
    {
      VilBuildLanguageFactory theVilBuildLanguageFactory = (VilBuildLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(VilBuildLanguagePackage.eNS_URI);
      if (theVilBuildLanguageFactory != null)
      {
        return theVilBuildLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VilBuildLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VilBuildLanguageFactoryImpl()
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
      case VilBuildLanguagePackage.IMPLEMENTATION_UNIT: return createImplementationUnit();
      case VilBuildLanguagePackage.REQUIRE: return createRequire();
      case VilBuildLanguagePackage.LANGUAGE_UNIT: return createLanguageUnit();
      case VilBuildLanguagePackage.SCRIPT_PARENT_DECL: return createScriptParentDecl();
      case VilBuildLanguagePackage.LOAD_PROPERTIES: return createLoadProperties();
      case VilBuildLanguagePackage.SCRIPT_CONTENTS: return createScriptContents();
      case VilBuildLanguagePackage.RULE_DECLARATION: return createRuleDeclaration();
      case VilBuildLanguagePackage.RULE_CONDITIONS: return createRuleConditions();
      case VilBuildLanguagePackage.RULE_ELEMENT_BLOCK: return createRuleElementBlock();
      case VilBuildLanguagePackage.RULE_ELEMENT: return createRuleElement();
      case VilBuildLanguagePackage.RULE_MODIFIER: return createRuleModifier();
      case VilBuildLanguagePackage.EXPRESSION_STATEMENT: return createExpressionStatement();
      case VilBuildLanguagePackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case VilBuildLanguagePackage.INSTANTIATE: return createInstantiate();
      case VilBuildLanguagePackage.LOOP_VARIABLE: return createLoopVariable();
      case VilBuildLanguagePackage.MAP: return createMap();
      case VilBuildLanguagePackage.FOR: return createFor();
      case VilBuildLanguagePackage.WHILE: return createWhile();
      case VilBuildLanguagePackage.ALTERNATIVE: return createAlternative();
      case VilBuildLanguagePackage.STATEMENT_OR_BLOCK: return createStatementOrBlock();
      case VilBuildLanguagePackage.JOIN: return createJoin();
      case VilBuildLanguagePackage.JOIN_VARIABLE: return createJoinVariable();
      case VilBuildLanguagePackage.SYSTEM_EXECUTION: return createSystemExecution();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementationUnit createImplementationUnit()
  {
    ImplementationUnitImpl implementationUnit = new ImplementationUnitImpl();
    return implementationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Require createRequire()
  {
    RequireImpl require = new RequireImpl();
    return require;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageUnit createLanguageUnit()
  {
    LanguageUnitImpl languageUnit = new LanguageUnitImpl();
    return languageUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptParentDecl createScriptParentDecl()
  {
    ScriptParentDeclImpl scriptParentDecl = new ScriptParentDeclImpl();
    return scriptParentDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadProperties createLoadProperties()
  {
    LoadPropertiesImpl loadProperties = new LoadPropertiesImpl();
    return loadProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptContents createScriptContents()
  {
    ScriptContentsImpl scriptContents = new ScriptContentsImpl();
    return scriptContents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleDeclaration createRuleDeclaration()
  {
    RuleDeclarationImpl ruleDeclaration = new RuleDeclarationImpl();
    return ruleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleConditions createRuleConditions()
  {
    RuleConditionsImpl ruleConditions = new RuleConditionsImpl();
    return ruleConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleElementBlock createRuleElementBlock()
  {
    RuleElementBlockImpl ruleElementBlock = new RuleElementBlockImpl();
    return ruleElementBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleElement createRuleElement()
  {
    RuleElementImpl ruleElement = new RuleElementImpl();
    return ruleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleModifier createRuleModifier()
  {
    RuleModifierImpl ruleModifier = new RuleModifierImpl();
    return ruleModifier;
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
  public Instantiate createInstantiate()
  {
    InstantiateImpl instantiate = new InstantiateImpl();
    return instantiate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopVariable createLoopVariable()
  {
    LoopVariableImpl loopVariable = new LoopVariableImpl();
    return loopVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map createMap()
  {
    MapImpl map = new MapImpl();
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For createFor()
  {
    ForImpl for_ = new ForImpl();
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative createAlternative()
  {
    AlternativeImpl alternative = new AlternativeImpl();
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementOrBlock createStatementOrBlock()
  {
    StatementOrBlockImpl statementOrBlock = new StatementOrBlockImpl();
    return statementOrBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Join createJoin()
  {
    JoinImpl join = new JoinImpl();
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinVariable createJoinVariable()
  {
    JoinVariableImpl joinVariable = new JoinVariableImpl();
    return joinVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemExecution createSystemExecution()
  {
    SystemExecutionImpl systemExecution = new SystemExecutionImpl();
    return systemExecution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VilBuildLanguagePackage getVilBuildLanguagePackage()
  {
    return (VilBuildLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VilBuildLanguagePackage getPackage()
  {
    return VilBuildLanguagePackage.eINSTANCE;
  }

} //VilBuildLanguageFactoryImpl
