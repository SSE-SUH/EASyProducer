/**
 */
package de.uni_hildesheim.sse.vil.rt.rtVil.impl;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage;

import de.uni_hildesheim.sse.vil.rt.rtVil.BreakdownElement;
import de.uni_hildesheim.sse.vil.rt.rtVil.BreakdownStatement;
import de.uni_hildesheim.sse.vil.rt.rtVil.BreakdownWithPart;
import de.uni_hildesheim.sse.vil.rt.rtVil.FailStatement;
import de.uni_hildesheim.sse.vil.rt.rtVil.GlobalVariableDeclaration;
import de.uni_hildesheim.sse.vil.rt.rtVil.ImplementationUnit;
import de.uni_hildesheim.sse.vil.rt.rtVil.IntentDeclaration;
import de.uni_hildesheim.sse.vil.rt.rtVil.LanguageUnit;
import de.uni_hildesheim.sse.vil.rt.rtVil.RtVilFactory;
import de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage;
import de.uni_hildesheim.sse.vil.rt.rtVil.RuleElement;
import de.uni_hildesheim.sse.vil.rt.rtVil.RuleElementBlock;
import de.uni_hildesheim.sse.vil.rt.rtVil.StrategyDeclaration;
import de.uni_hildesheim.sse.vil.rt.rtVil.TacticDeclaration;
import de.uni_hildesheim.sse.vil.rt.rtVil.WeightingStatement;
import de.uni_hildesheim.sse.vil.rt.rtVil.rtContents;

import de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage;

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
public class RtVilPackageImpl extends EPackageImpl implements RtVilPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implementationUnitEClass = null;

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
  private EClass rtContentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strategyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass breakdownElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weightingStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass breakdownStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass breakdownWithPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tacticDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleElementBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intentDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass failStatementEClass = null;

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
   * @see de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RtVilPackageImpl()
  {
    super(eNS_URI, RtVilFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link RtVilPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RtVilPackage init()
  {
    if (isInited) return (RtVilPackage)EPackage.Registry.INSTANCE.getEPackage(RtVilPackage.eNS_URI);

    // Obtain or create and register package
    RtVilPackageImpl theRtVilPackage = (RtVilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RtVilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RtVilPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    VilBuildLanguagePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theRtVilPackage.createPackageContents();

    // Initialize created meta-data
    theRtVilPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRtVilPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RtVilPackage.eNS_URI, theRtVilPackage);
    return theRtVilPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplementationUnit()
  {
    return implementationUnitEClass;
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
  public EReference getLanguageUnit_RtContents()
  {
    return (EReference)languageUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrtContents()
  {
    return rtContentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrtContents_Elements()
  {
    return (EReference)rtContentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalVariableDeclaration()
  {
    return globalVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobalVariableDeclaration_Persistent()
  {
    return (EAttribute)globalVariableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalVariableDeclaration_VarDecl()
  {
    return (EReference)globalVariableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStrategyDeclaration()
  {
    return strategyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStrategyDeclaration_Name()
  {
    return (EAttribute)strategyDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategyDeclaration_ParamList()
  {
    return (EReference)strategyDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategyDeclaration_Conditions()
  {
    return (EReference)strategyDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategyDeclaration_VarDecls()
  {
    return (EReference)strategyDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategyDeclaration_Objective()
  {
    return (EReference)strategyDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategyDeclaration_Weighting()
  {
    return (EReference)strategyDeclarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategyDeclaration_Breakdown()
  {
    return (EReference)strategyDeclarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrategyDeclaration_Post()
  {
    return (EReference)strategyDeclarationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBreakdownElement()
  {
    return breakdownElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBreakdownElement_VarDecl()
  {
    return (EReference)breakdownElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBreakdownElement_ExprStmt()
  {
    return (EReference)breakdownElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBreakdownElement_BreakdownStmt()
  {
    return (EReference)breakdownElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeightingStatement()
  {
    return weightingStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeightingStatement_Name()
  {
    return (EAttribute)weightingStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeightingStatement_Expr()
  {
    return (EReference)weightingStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBreakdownStatement()
  {
    return breakdownStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBreakdownStatement_Type()
  {
    return (EAttribute)breakdownStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBreakdownStatement_Guard()
  {
    return (EReference)breakdownStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBreakdownStatement_Name()
  {
    return (EReference)breakdownStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBreakdownStatement_Param()
  {
    return (EReference)breakdownStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBreakdownStatement_Part()
  {
    return (EReference)breakdownStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBreakdownStatement_Time()
  {
    return (EReference)breakdownStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBreakdownWithPart()
  {
    return breakdownWithPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBreakdownWithPart_Name()
  {
    return (EAttribute)breakdownWithPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBreakdownWithPart_Value()
  {
    return (EReference)breakdownWithPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTacticDeclaration()
  {
    return tacticDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTacticDeclaration_Name()
  {
    return (EAttribute)tacticDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTacticDeclaration_ParamList()
  {
    return (EReference)tacticDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTacticDeclaration_Conditions()
  {
    return (EReference)tacticDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTacticDeclaration_Block()
  {
    return (EReference)tacticDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleElementBlock()
  {
    return ruleElementBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleElementBlock_Intent()
  {
    return (EReference)ruleElementBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleElement()
  {
    return ruleElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleElement_Fail()
  {
    return (EReference)ruleElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntentDeclaration()
  {
    return intentDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntentDeclaration_ExprStmt()
  {
    return (EReference)intentDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFailStatement()
  {
    return failStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFailStatement_Name()
  {
    return (EAttribute)failStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFailStatement_Reason()
  {
    return (EReference)failStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFailStatement_Code()
  {
    return (EReference)failStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RtVilFactory getRtVilFactory()
  {
    return (RtVilFactory)getEFactoryInstance();
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
    implementationUnitEClass = createEClass(IMPLEMENTATION_UNIT);

    languageUnitEClass = createEClass(LANGUAGE_UNIT);
    createEReference(languageUnitEClass, LANGUAGE_UNIT__RT_CONTENTS);

    rtContentsEClass = createEClass(RT_CONTENTS);
    createEReference(rtContentsEClass, RT_CONTENTS__ELEMENTS);

    globalVariableDeclarationEClass = createEClass(GLOBAL_VARIABLE_DECLARATION);
    createEAttribute(globalVariableDeclarationEClass, GLOBAL_VARIABLE_DECLARATION__PERSISTENT);
    createEReference(globalVariableDeclarationEClass, GLOBAL_VARIABLE_DECLARATION__VAR_DECL);

    strategyDeclarationEClass = createEClass(STRATEGY_DECLARATION);
    createEAttribute(strategyDeclarationEClass, STRATEGY_DECLARATION__NAME);
    createEReference(strategyDeclarationEClass, STRATEGY_DECLARATION__PARAM_LIST);
    createEReference(strategyDeclarationEClass, STRATEGY_DECLARATION__CONDITIONS);
    createEReference(strategyDeclarationEClass, STRATEGY_DECLARATION__VAR_DECLS);
    createEReference(strategyDeclarationEClass, STRATEGY_DECLARATION__OBJECTIVE);
    createEReference(strategyDeclarationEClass, STRATEGY_DECLARATION__WEIGHTING);
    createEReference(strategyDeclarationEClass, STRATEGY_DECLARATION__BREAKDOWN);
    createEReference(strategyDeclarationEClass, STRATEGY_DECLARATION__POST);

    breakdownElementEClass = createEClass(BREAKDOWN_ELEMENT);
    createEReference(breakdownElementEClass, BREAKDOWN_ELEMENT__VAR_DECL);
    createEReference(breakdownElementEClass, BREAKDOWN_ELEMENT__EXPR_STMT);
    createEReference(breakdownElementEClass, BREAKDOWN_ELEMENT__BREAKDOWN_STMT);

    weightingStatementEClass = createEClass(WEIGHTING_STATEMENT);
    createEAttribute(weightingStatementEClass, WEIGHTING_STATEMENT__NAME);
    createEReference(weightingStatementEClass, WEIGHTING_STATEMENT__EXPR);

    breakdownStatementEClass = createEClass(BREAKDOWN_STATEMENT);
    createEAttribute(breakdownStatementEClass, BREAKDOWN_STATEMENT__TYPE);
    createEReference(breakdownStatementEClass, BREAKDOWN_STATEMENT__GUARD);
    createEReference(breakdownStatementEClass, BREAKDOWN_STATEMENT__NAME);
    createEReference(breakdownStatementEClass, BREAKDOWN_STATEMENT__PARAM);
    createEReference(breakdownStatementEClass, BREAKDOWN_STATEMENT__PART);
    createEReference(breakdownStatementEClass, BREAKDOWN_STATEMENT__TIME);

    breakdownWithPartEClass = createEClass(BREAKDOWN_WITH_PART);
    createEAttribute(breakdownWithPartEClass, BREAKDOWN_WITH_PART__NAME);
    createEReference(breakdownWithPartEClass, BREAKDOWN_WITH_PART__VALUE);

    tacticDeclarationEClass = createEClass(TACTIC_DECLARATION);
    createEAttribute(tacticDeclarationEClass, TACTIC_DECLARATION__NAME);
    createEReference(tacticDeclarationEClass, TACTIC_DECLARATION__PARAM_LIST);
    createEReference(tacticDeclarationEClass, TACTIC_DECLARATION__CONDITIONS);
    createEReference(tacticDeclarationEClass, TACTIC_DECLARATION__BLOCK);

    ruleElementBlockEClass = createEClass(RULE_ELEMENT_BLOCK);
    createEReference(ruleElementBlockEClass, RULE_ELEMENT_BLOCK__INTENT);

    ruleElementEClass = createEClass(RULE_ELEMENT);
    createEReference(ruleElementEClass, RULE_ELEMENT__FAIL);

    intentDeclarationEClass = createEClass(INTENT_DECLARATION);
    createEReference(intentDeclarationEClass, INTENT_DECLARATION__EXPR_STMT);

    failStatementEClass = createEClass(FAIL_STATEMENT);
    createEAttribute(failStatementEClass, FAIL_STATEMENT__NAME);
    createEReference(failStatementEClass, FAIL_STATEMENT__REASON);
    createEReference(failStatementEClass, FAIL_STATEMENT__CODE);
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

    // Obtain other dependent packages
    VilBuildLanguagePackage theVilBuildLanguagePackage = (VilBuildLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(VilBuildLanguagePackage.eNS_URI);
    ExpressionDslPackage theExpressionDslPackage = (ExpressionDslPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    implementationUnitEClass.getESuperTypes().add(theVilBuildLanguagePackage.getImplementationUnit());
    languageUnitEClass.getESuperTypes().add(theVilBuildLanguagePackage.getLanguageUnit());
    ruleElementBlockEClass.getESuperTypes().add(theVilBuildLanguagePackage.getRuleElementBlock());
    ruleElementEClass.getESuperTypes().add(theVilBuildLanguagePackage.getRuleElement());

    // Initialize classes and features; add operations and parameters
    initEClass(implementationUnitEClass, ImplementationUnit.class, "ImplementationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(languageUnitEClass, LanguageUnit.class, "LanguageUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLanguageUnit_RtContents(), this.getrtContents(), null, "rtContents", null, 0, 1, LanguageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rtContentsEClass, rtContents.class, "rtContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrtContents_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, rtContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(globalVariableDeclarationEClass, GlobalVariableDeclaration.class, "GlobalVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobalVariableDeclaration_Persistent(), ecorePackage.getEString(), "persistent", null, 0, 1, GlobalVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalVariableDeclaration_VarDecl(), theExpressionDslPackage.getVariableDeclaration(), null, "varDecl", null, 0, 1, GlobalVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strategyDeclarationEClass, StrategyDeclaration.class, "StrategyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStrategyDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, StrategyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategyDeclaration_ParamList(), theExpressionDslPackage.getParameterList(), null, "paramList", null, 0, 1, StrategyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategyDeclaration_Conditions(), theVilBuildLanguagePackage.getRuleConditions(), null, "conditions", null, 0, 1, StrategyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategyDeclaration_VarDecls(), theExpressionDslPackage.getVariableDeclaration(), null, "varDecls", null, 0, -1, StrategyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategyDeclaration_Objective(), theExpressionDslPackage.getExpression(), null, "objective", null, 0, 1, StrategyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategyDeclaration_Weighting(), this.getWeightingStatement(), null, "weighting", null, 0, 1, StrategyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategyDeclaration_Breakdown(), this.getBreakdownElement(), null, "breakdown", null, 0, -1, StrategyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStrategyDeclaration_Post(), this.getRuleElement(), null, "post", null, 0, -1, StrategyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(breakdownElementEClass, BreakdownElement.class, "BreakdownElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBreakdownElement_VarDecl(), theExpressionDslPackage.getVariableDeclaration(), null, "varDecl", null, 0, 1, BreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBreakdownElement_ExprStmt(), theVilBuildLanguagePackage.getExpressionStatement(), null, "exprStmt", null, 0, 1, BreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBreakdownElement_BreakdownStmt(), this.getBreakdownStatement(), null, "breakdownStmt", null, 0, 1, BreakdownElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weightingStatementEClass, WeightingStatement.class, "WeightingStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWeightingStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, WeightingStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeightingStatement_Expr(), theExpressionDslPackage.getExpression(), null, "expr", null, 0, 1, WeightingStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(breakdownStatementEClass, BreakdownStatement.class, "BreakdownStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBreakdownStatement_Type(), ecorePackage.getEString(), "type", null, 0, 1, BreakdownStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBreakdownStatement_Guard(), theExpressionDslPackage.getLogicalExpression(), null, "guard", null, 0, 1, BreakdownStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBreakdownStatement_Name(), theExpressionDslPackage.getQualifiedPrefix(), null, "name", null, 0, 1, BreakdownStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBreakdownStatement_Param(), theExpressionDslPackage.getArgumentList(), null, "param", null, 0, 1, BreakdownStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBreakdownStatement_Part(), this.getBreakdownWithPart(), null, "part", null, 0, -1, BreakdownStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBreakdownStatement_Time(), theExpressionDslPackage.getExpression(), null, "time", null, 0, 1, BreakdownStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(breakdownWithPartEClass, BreakdownWithPart.class, "BreakdownWithPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBreakdownWithPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, BreakdownWithPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBreakdownWithPart_Value(), theExpressionDslPackage.getExpression(), null, "value", null, 0, 1, BreakdownWithPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tacticDeclarationEClass, TacticDeclaration.class, "TacticDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTacticDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, TacticDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTacticDeclaration_ParamList(), theExpressionDslPackage.getParameterList(), null, "paramList", null, 0, 1, TacticDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTacticDeclaration_Conditions(), theVilBuildLanguagePackage.getRuleConditions(), null, "conditions", null, 0, 1, TacticDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTacticDeclaration_Block(), this.getRuleElementBlock(), null, "block", null, 0, 1, TacticDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleElementBlockEClass, RuleElementBlock.class, "RuleElementBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleElementBlock_Intent(), this.getIntentDeclaration(), null, "intent", null, 0, 1, RuleElementBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleElementEClass, RuleElement.class, "RuleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleElement_Fail(), this.getFailStatement(), null, "fail", null, 0, 1, RuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intentDeclarationEClass, IntentDeclaration.class, "IntentDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntentDeclaration_ExprStmt(), theVilBuildLanguagePackage.getExpressionStatement(), null, "exprStmt", null, 0, 1, IntentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(failStatementEClass, FailStatement.class, "FailStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFailStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FailStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFailStatement_Reason(), theExpressionDslPackage.getExpression(), null, "reason", null, 0, 1, FailStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFailStatement_Code(), theExpressionDslPackage.getExpression(), null, "code", null, 0, 1, FailStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RtVilPackageImpl
