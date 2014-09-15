/**
 */
package de.uni_hildesheim.sse.vilBuildLanguage;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface VilBuildLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "vilBuildLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uni_hildesheim.de/sse/VilBuildLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "vilBuildLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VilBuildLanguagePackage eINSTANCE = de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.ImplementationUnitImpl <em>Implementation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.ImplementationUnitImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getImplementationUnit()
   * @generated
   */
  int IMPLEMENTATION_UNIT = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_UNIT__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Requires</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_UNIT__REQUIRES = 1;

  /**
   * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_UNIT__SCRIPTS = 2;

  /**
   * The number of structural features of the '<em>Implementation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.RequireImpl <em>Require</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.RequireImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getRequire()
   * @generated
   */
  int REQUIRE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE__NAME = 0;

  /**
   * The feature id for the '<em><b>Version Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE__VERSION_SPEC = 1;

  /**
   * The number of structural features of the '<em>Require</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.LanguageUnitImpl <em>Language Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.LanguageUnitImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getLanguageUnit()
   * @generated
   */
  int LANGUAGE_UNIT = 2;

  /**
   * The feature id for the '<em><b>Advices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_UNIT__ADVICES = ExpressionDslPackage.LANGUAGE_UNIT__ADVICES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_UNIT__NAME = ExpressionDslPackage.LANGUAGE_UNIT__NAME;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_UNIT__VERSION = ExpressionDslPackage.LANGUAGE_UNIT__VERSION;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_UNIT__IMPORTS = ExpressionDslPackage.LANGUAGE_UNIT__IMPORTS;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_UNIT__PARAM = ExpressionDslPackage.LANGUAGE_UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_UNIT__PARENT = ExpressionDslPackage.LANGUAGE_UNIT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Load Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_UNIT__LOAD_PROPERTIES = ExpressionDslPackage.LANGUAGE_UNIT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_UNIT__CONTENTS = ExpressionDslPackage.LANGUAGE_UNIT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Language Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_UNIT_FEATURE_COUNT = ExpressionDslPackage.LANGUAGE_UNIT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.ScriptParentDeclImpl <em>Script Parent Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.ScriptParentDeclImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getScriptParentDecl()
   * @generated
   */
  int SCRIPT_PARENT_DECL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_PARENT_DECL__NAME = 0;

  /**
   * The number of structural features of the '<em>Script Parent Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_PARENT_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.LoadPropertiesImpl <em>Load Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.LoadPropertiesImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getLoadProperties()
   * @generated
   */
  int LOAD_PROPERTIES = 4;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_PROPERTIES__PATH = 0;

  /**
   * The number of structural features of the '<em>Load Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_PROPERTIES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.ScriptContentsImpl <em>Script Contents</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.ScriptContentsImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getScriptContents()
   * @generated
   */
  int SCRIPT_CONTENTS = 5;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_CONTENTS__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Script Contents</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_CONTENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleDeclarationImpl <em>Rule Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleDeclarationImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getRuleDeclaration()
   * @generated
   */
  int RULE_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Param List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__PARAM_LIST = 2;

  /**
   * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__POSTCONDITION = 3;

  /**
   * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__PRECONDITIONS = 4;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION__BLOCK = 5;

  /**
   * The number of structural features of the '<em>Rule Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DECLARATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleElementBlockImpl <em>Rule Element Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleElementBlockImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getRuleElementBlock()
   * @generated
   */
  int RULE_ELEMENT_BLOCK = 7;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_ELEMENT_BLOCK__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Rule Element Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_ELEMENT_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleElementImpl <em>Rule Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleElementImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getRuleElement()
   * @generated
   */
  int RULE_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_ELEMENT__VAR_DECL = 0;

  /**
   * The feature id for the '<em><b>Expr Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_ELEMENT__EXPR_STMT = 1;

  /**
   * The feature id for the '<em><b>Defer Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_ELEMENT__DEFER_DECL = 2;

  /**
   * The number of structural features of the '<em>Rule Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleModifierImpl <em>Rule Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleModifierImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getRuleModifier()
   * @generated
   */
  int RULE_MODIFIER = 9;

  /**
   * The feature id for the '<em><b>Protected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_MODIFIER__PROTECTED = 0;

  /**
   * The number of structural features of the '<em>Rule Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_MODIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.DeferDeclarationImpl <em>Defer Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.DeferDeclarationImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getDeferDeclaration()
   * @generated
   */
  int DEFER_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFER_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Depends</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFER_DECLARATION__DEPENDS = 1;

  /**
   * The number of structural features of the '<em>Defer Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.PrimaryExpressionImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Other Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__OTHER_EX = ExpressionDslPackage.PRIMARY_EXPRESSION__OTHER_EX;

  /**
   * The feature id for the '<em><b>Unq Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__UNQ_EX = ExpressionDslPackage.PRIMARY_EXPRESSION__UNQ_EX;

  /**
   * The feature id for the '<em><b>Super Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__SUPER_EX = ExpressionDslPackage.PRIMARY_EXPRESSION__SUPER_EX;

  /**
   * The feature id for the '<em><b>New Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__NEW_EX = ExpressionDslPackage.PRIMARY_EXPRESSION__NEW_EX;

  /**
   * The feature id for the '<em><b>Sys Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__SYS_EX = ExpressionDslPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__MAP = ExpressionDslPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Join</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__JOIN = ExpressionDslPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Instantiate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__INSTANTIATE = ExpressionDslPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = ExpressionDslPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.InstantiateImpl <em>Instantiate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.InstantiateImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getInstantiate()
   * @generated
   */
  int INSTANTIATE = 12;

  /**
   * The feature id for the '<em><b>Project</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATE__PROJECT = 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATE__RULE = 1;

  /**
   * The feature id for the '<em><b>Rule Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATE__RULE_NAME = 2;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATE__PARAM = 3;

  /**
   * The feature id for the '<em><b>Version Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATE__VERSION_SPEC = 4;

  /**
   * The number of structural features of the '<em>Instantiate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.MapVariableImpl <em>Map Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.MapVariableImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getMapVariable()
   * @generated
   */
  int MAP_VARIABLE = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_VARIABLE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_VARIABLE__VAR = 1;

  /**
   * The number of structural features of the '<em>Map Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.MapImpl <em>Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.MapImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getMap()
   * @generated
   */
  int MAP = 14;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__VAR = 0;

  /**
   * The feature id for the '<em><b>Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__SEPARATOR = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__EXPR = 2;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP__BLOCK = 3;

  /**
   * The number of structural features of the '<em>Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.JoinImpl <em>Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.JoinImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getJoin()
   * @generated
   */
  int JOIN = 15;

  /**
   * The feature id for the '<em><b>Var1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__VAR1 = 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__VAR2 = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__CONDITION = 2;

  /**
   * The number of structural features of the '<em>Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.JoinVariableImpl <em>Join Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.JoinVariableImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getJoinVariable()
   * @generated
   */
  int JOIN_VARIABLE = 16;

  /**
   * The feature id for the '<em><b>Excl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_VARIABLE__EXCL = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_VARIABLE__VAR = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_VARIABLE__EXPR = 2;

  /**
   * The number of structural features of the '<em>Join Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_VARIABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.SystemExecutionImpl <em>System Execution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.SystemExecutionImpl
   * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getSystemExecution()
   * @generated
   */
  int SYSTEM_EXECUTION = 17;

  /**
   * The feature id for the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EXECUTION__CALL = 0;

  /**
   * The feature id for the '<em><b>Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EXECUTION__CALLS = 1;

  /**
   * The number of structural features of the '<em>System Execution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_EXECUTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit <em>Implementation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implementation Unit</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit
   * @generated
   */
  EClass getImplementationUnit();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit#getImports()
   * @see #getImplementationUnit()
   * @generated
   */
  EReference getImplementationUnit_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requires</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit#getRequires()
   * @see #getImplementationUnit()
   * @generated
   */
  EReference getImplementationUnit_Requires();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit#getScripts <em>Scripts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scripts</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit#getScripts()
   * @see #getImplementationUnit()
   * @generated
   */
  EReference getImplementationUnit_Scripts();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.Require <em>Require</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Require</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Require
   * @generated
   */
  EClass getRequire();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.Require#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Require#getName()
   * @see #getRequire()
   * @generated
   */
  EAttribute getRequire_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.Require#getVersionSpec <em>Version Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version Spec</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Require#getVersionSpec()
   * @see #getRequire()
   * @generated
   */
  EReference getRequire_VersionSpec();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit <em>Language Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language Unit</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit
   * @generated
   */
  EClass getLanguageUnit();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit#getParam()
   * @see #getLanguageUnit()
   * @generated
   */
  EReference getLanguageUnit_Param();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parent</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit#getParent()
   * @see #getLanguageUnit()
   * @generated
   */
  EReference getLanguageUnit_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit#getLoadProperties <em>Load Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Load Properties</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit#getLoadProperties()
   * @see #getLanguageUnit()
   * @generated
   */
  EReference getLanguageUnit_LoadProperties();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contents</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit#getContents()
   * @see #getLanguageUnit()
   * @generated
   */
  EReference getLanguageUnit_Contents();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.ScriptParentDecl <em>Script Parent Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Parent Decl</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.ScriptParentDecl
   * @generated
   */
  EClass getScriptParentDecl();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.ScriptParentDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.ScriptParentDecl#getName()
   * @see #getScriptParentDecl()
   * @generated
   */
  EAttribute getScriptParentDecl_Name();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.LoadProperties <em>Load Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Properties</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.LoadProperties
   * @generated
   */
  EClass getLoadProperties();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.LoadProperties#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.LoadProperties#getPath()
   * @see #getLoadProperties()
   * @generated
   */
  EAttribute getLoadProperties_Path();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.ScriptContents <em>Script Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Contents</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.ScriptContents
   * @generated
   */
  EClass getScriptContents();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_hildesheim.sse.vilBuildLanguage.ScriptContents#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.ScriptContents#getElements()
   * @see #getScriptContents()
   * @generated
   */
  EReference getScriptContents_Elements();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration <em>Rule Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Declaration</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration
   * @generated
   */
  EClass getRuleDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getModifier()
   * @see #getRuleDeclaration()
   * @generated
   */
  EReference getRuleDeclaration_Modifier();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getName()
   * @see #getRuleDeclaration()
   * @generated
   */
  EAttribute getRuleDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getParamList <em>Param List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param List</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getParamList()
   * @see #getRuleDeclaration()
   * @generated
   */
  EReference getRuleDeclaration_ParamList();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getPostcondition <em>Postcondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Postcondition</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getPostcondition()
   * @see #getRuleDeclaration()
   * @generated
   */
  EReference getRuleDeclaration_Postcondition();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getPreconditions <em>Preconditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Preconditions</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getPreconditions()
   * @see #getRuleDeclaration()
   * @generated
   */
  EReference getRuleDeclaration_Preconditions();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration#getBlock()
   * @see #getRuleDeclaration()
   * @generated
   */
  EReference getRuleDeclaration_Block();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleElementBlock <em>Rule Element Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Element Block</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleElementBlock
   * @generated
   */
  EClass getRuleElementBlock();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleElementBlock#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleElementBlock#getElements()
   * @see #getRuleElementBlock()
   * @generated
   */
  EReference getRuleElementBlock_Elements();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleElement <em>Rule Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Element</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleElement
   * @generated
   */
  EClass getRuleElement();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleElement#getVarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Decl</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleElement#getVarDecl()
   * @see #getRuleElement()
   * @generated
   */
  EReference getRuleElement_VarDecl();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleElement#getExprStmt <em>Expr Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Stmt</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleElement#getExprStmt()
   * @see #getRuleElement()
   * @generated
   */
  EReference getRuleElement_ExprStmt();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleElement#getDeferDecl <em>Defer Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defer Decl</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleElement#getDeferDecl()
   * @see #getRuleElement()
   * @generated
   */
  EReference getRuleElement_DeferDecl();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleModifier <em>Rule Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Modifier</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleModifier
   * @generated
   */
  EClass getRuleModifier();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.RuleModifier#getProtected <em>Protected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protected</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.RuleModifier#getProtected()
   * @see #getRuleModifier()
   * @generated
   */
  EAttribute getRuleModifier_Protected();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.DeferDeclaration <em>Defer Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defer Declaration</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.DeferDeclaration
   * @generated
   */
  EClass getDeferDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.DeferDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.DeferDeclaration#getName()
   * @see #getDeferDeclaration()
   * @generated
   */
  EAttribute getDeferDeclaration_Name();

  /**
   * Returns the meta object for the attribute list '{@link de.uni_hildesheim.sse.vilBuildLanguage.DeferDeclaration#getDepends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Depends</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.DeferDeclaration#getDepends()
   * @see #getDeferDeclaration()
   * @generated
   */
  EAttribute getDeferDeclaration_Depends();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.PrimaryExpression#getSysEx <em>Sys Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sys Ex</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.PrimaryExpression#getSysEx()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_SysEx();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.PrimaryExpression#getMap <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.PrimaryExpression#getMap()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_Map();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.PrimaryExpression#getJoin <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Join</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.PrimaryExpression#getJoin()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_Join();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.PrimaryExpression#getInstantiate <em>Instantiate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instantiate</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.PrimaryExpression#getInstantiate()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_Instantiate();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.Instantiate <em>Instantiate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instantiate</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Instantiate
   * @generated
   */
  EClass getInstantiate();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.Instantiate#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Instantiate#getProject()
   * @see #getInstantiate()
   * @generated
   */
  EAttribute getInstantiate_Project();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.Instantiate#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Instantiate#getRule()
   * @see #getInstantiate()
   * @generated
   */
  EAttribute getInstantiate_Rule();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.Instantiate#getRuleName <em>Rule Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule Name</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Instantiate#getRuleName()
   * @see #getInstantiate()
   * @generated
   */
  EAttribute getInstantiate_RuleName();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.Instantiate#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Instantiate#getParam()
   * @see #getInstantiate()
   * @generated
   */
  EReference getInstantiate_Param();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.Instantiate#getVersionSpec <em>Version Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version Spec</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Instantiate#getVersionSpec()
   * @see #getInstantiate()
   * @generated
   */
  EReference getInstantiate_VersionSpec();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.MapVariable <em>Map Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Variable</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.MapVariable
   * @generated
   */
  EClass getMapVariable();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.MapVariable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.MapVariable#getType()
   * @see #getMapVariable()
   * @generated
   */
  EReference getMapVariable_Type();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.MapVariable#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.MapVariable#getVar()
   * @see #getMapVariable()
   * @generated
   */
  EAttribute getMapVariable_Var();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.Map <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Map
   * @generated
   */
  EClass getMap();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_hildesheim.sse.vilBuildLanguage.Map#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Map#getVar()
   * @see #getMap()
   * @generated
   */
  EReference getMap_Var();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.Map#getSeparator <em>Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Separator</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Map#getSeparator()
   * @see #getMap()
   * @generated
   */
  EAttribute getMap_Separator();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.Map#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Map#getExpr()
   * @see #getMap()
   * @generated
   */
  EReference getMap_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.Map#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Map#getBlock()
   * @see #getMap()
   * @generated
   */
  EReference getMap_Block();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.Join <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Join
   * @generated
   */
  EClass getJoin();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.Join#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var1</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Join#getVar1()
   * @see #getJoin()
   * @generated
   */
  EReference getJoin_Var1();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.Join#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var2</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Join#getVar2()
   * @see #getJoin()
   * @generated
   */
  EReference getJoin_Var2();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.Join#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.Join#getCondition()
   * @see #getJoin()
   * @generated
   */
  EReference getJoin_Condition();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.JoinVariable <em>Join Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Variable</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.JoinVariable
   * @generated
   */
  EClass getJoinVariable();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.JoinVariable#getExcl <em>Excl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Excl</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.JoinVariable#getExcl()
   * @see #getJoinVariable()
   * @generated
   */
  EAttribute getJoinVariable_Excl();

  /**
   * Returns the meta object for the attribute '{@link de.uni_hildesheim.sse.vilBuildLanguage.JoinVariable#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.JoinVariable#getVar()
   * @see #getJoinVariable()
   * @generated
   */
  EAttribute getJoinVariable_Var();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.JoinVariable#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.JoinVariable#getExpr()
   * @see #getJoinVariable()
   * @generated
   */
  EReference getJoinVariable_Expr();

  /**
   * Returns the meta object for class '{@link de.uni_hildesheim.sse.vilBuildLanguage.SystemExecution <em>System Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Execution</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.SystemExecution
   * @generated
   */
  EClass getSystemExecution();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_hildesheim.sse.vilBuildLanguage.SystemExecution#getCall <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.SystemExecution#getCall()
   * @see #getSystemExecution()
   * @generated
   */
  EReference getSystemExecution_Call();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_hildesheim.sse.vilBuildLanguage.SystemExecution#getCalls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Calls</em>'.
   * @see de.uni_hildesheim.sse.vilBuildLanguage.SystemExecution#getCalls()
   * @see #getSystemExecution()
   * @generated
   */
  EReference getSystemExecution_Calls();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VilBuildLanguageFactory getVilBuildLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.ImplementationUnitImpl <em>Implementation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.ImplementationUnitImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getImplementationUnit()
     * @generated
     */
    EClass IMPLEMENTATION_UNIT = eINSTANCE.getImplementationUnit();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION_UNIT__IMPORTS = eINSTANCE.getImplementationUnit_Imports();

    /**
     * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION_UNIT__REQUIRES = eINSTANCE.getImplementationUnit_Requires();

    /**
     * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTATION_UNIT__SCRIPTS = eINSTANCE.getImplementationUnit_Scripts();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.RequireImpl <em>Require</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.RequireImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getRequire()
     * @generated
     */
    EClass REQUIRE = eINSTANCE.getRequire();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRE__NAME = eINSTANCE.getRequire_Name();

    /**
     * The meta object literal for the '<em><b>Version Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRE__VERSION_SPEC = eINSTANCE.getRequire_VersionSpec();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.LanguageUnitImpl <em>Language Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.LanguageUnitImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getLanguageUnit()
     * @generated
     */
    EClass LANGUAGE_UNIT = eINSTANCE.getLanguageUnit();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANGUAGE_UNIT__PARAM = eINSTANCE.getLanguageUnit_Param();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANGUAGE_UNIT__PARENT = eINSTANCE.getLanguageUnit_Parent();

    /**
     * The meta object literal for the '<em><b>Load Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANGUAGE_UNIT__LOAD_PROPERTIES = eINSTANCE.getLanguageUnit_LoadProperties();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANGUAGE_UNIT__CONTENTS = eINSTANCE.getLanguageUnit_Contents();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.ScriptParentDeclImpl <em>Script Parent Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.ScriptParentDeclImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getScriptParentDecl()
     * @generated
     */
    EClass SCRIPT_PARENT_DECL = eINSTANCE.getScriptParentDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_PARENT_DECL__NAME = eINSTANCE.getScriptParentDecl_Name();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.LoadPropertiesImpl <em>Load Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.LoadPropertiesImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getLoadProperties()
     * @generated
     */
    EClass LOAD_PROPERTIES = eINSTANCE.getLoadProperties();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_PROPERTIES__PATH = eINSTANCE.getLoadProperties_Path();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.ScriptContentsImpl <em>Script Contents</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.ScriptContentsImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getScriptContents()
     * @generated
     */
    EClass SCRIPT_CONTENTS = eINSTANCE.getScriptContents();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT_CONTENTS__ELEMENTS = eINSTANCE.getScriptContents_Elements();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleDeclarationImpl <em>Rule Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleDeclarationImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getRuleDeclaration()
     * @generated
     */
    EClass RULE_DECLARATION = eINSTANCE.getRuleDeclaration();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DECLARATION__MODIFIER = eINSTANCE.getRuleDeclaration_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DECLARATION__NAME = eINSTANCE.getRuleDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Param List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DECLARATION__PARAM_LIST = eINSTANCE.getRuleDeclaration_ParamList();

    /**
     * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DECLARATION__POSTCONDITION = eINSTANCE.getRuleDeclaration_Postcondition();

    /**
     * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DECLARATION__PRECONDITIONS = eINSTANCE.getRuleDeclaration_Preconditions();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DECLARATION__BLOCK = eINSTANCE.getRuleDeclaration_Block();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleElementBlockImpl <em>Rule Element Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleElementBlockImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getRuleElementBlock()
     * @generated
     */
    EClass RULE_ELEMENT_BLOCK = eINSTANCE.getRuleElementBlock();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_ELEMENT_BLOCK__ELEMENTS = eINSTANCE.getRuleElementBlock_Elements();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleElementImpl <em>Rule Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleElementImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getRuleElement()
     * @generated
     */
    EClass RULE_ELEMENT = eINSTANCE.getRuleElement();

    /**
     * The meta object literal for the '<em><b>Var Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_ELEMENT__VAR_DECL = eINSTANCE.getRuleElement_VarDecl();

    /**
     * The meta object literal for the '<em><b>Expr Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_ELEMENT__EXPR_STMT = eINSTANCE.getRuleElement_ExprStmt();

    /**
     * The meta object literal for the '<em><b>Defer Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_ELEMENT__DEFER_DECL = eINSTANCE.getRuleElement_DeferDecl();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleModifierImpl <em>Rule Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.RuleModifierImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getRuleModifier()
     * @generated
     */
    EClass RULE_MODIFIER = eINSTANCE.getRuleModifier();

    /**
     * The meta object literal for the '<em><b>Protected</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_MODIFIER__PROTECTED = eINSTANCE.getRuleModifier_Protected();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.DeferDeclarationImpl <em>Defer Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.DeferDeclarationImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getDeferDeclaration()
     * @generated
     */
    EClass DEFER_DECLARATION = eINSTANCE.getDeferDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFER_DECLARATION__NAME = eINSTANCE.getDeferDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Depends</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFER_DECLARATION__DEPENDS = eINSTANCE.getDeferDeclaration_Depends();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.PrimaryExpressionImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '<em><b>Sys Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__SYS_EX = eINSTANCE.getPrimaryExpression_SysEx();

    /**
     * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__MAP = eINSTANCE.getPrimaryExpression_Map();

    /**
     * The meta object literal for the '<em><b>Join</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__JOIN = eINSTANCE.getPrimaryExpression_Join();

    /**
     * The meta object literal for the '<em><b>Instantiate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__INSTANTIATE = eINSTANCE.getPrimaryExpression_Instantiate();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.InstantiateImpl <em>Instantiate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.InstantiateImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getInstantiate()
     * @generated
     */
    EClass INSTANTIATE = eINSTANCE.getInstantiate();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANTIATE__PROJECT = eINSTANCE.getInstantiate_Project();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANTIATE__RULE = eINSTANCE.getInstantiate_Rule();

    /**
     * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANTIATE__RULE_NAME = eINSTANCE.getInstantiate_RuleName();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANTIATE__PARAM = eINSTANCE.getInstantiate_Param();

    /**
     * The meta object literal for the '<em><b>Version Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANTIATE__VERSION_SPEC = eINSTANCE.getInstantiate_VersionSpec();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.MapVariableImpl <em>Map Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.MapVariableImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getMapVariable()
     * @generated
     */
    EClass MAP_VARIABLE = eINSTANCE.getMapVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_VARIABLE__TYPE = eINSTANCE.getMapVariable_Type();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAP_VARIABLE__VAR = eINSTANCE.getMapVariable_Var();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.MapImpl <em>Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.MapImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getMap()
     * @generated
     */
    EClass MAP = eINSTANCE.getMap();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP__VAR = eINSTANCE.getMap_Var();

    /**
     * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAP__SEPARATOR = eINSTANCE.getMap_Separator();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP__EXPR = eINSTANCE.getMap_Expr();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP__BLOCK = eINSTANCE.getMap_Block();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.JoinImpl <em>Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.JoinImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getJoin()
     * @generated
     */
    EClass JOIN = eINSTANCE.getJoin();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN__VAR1 = eINSTANCE.getJoin_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN__VAR2 = eINSTANCE.getJoin_Var2();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN__CONDITION = eINSTANCE.getJoin_Condition();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.JoinVariableImpl <em>Join Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.JoinVariableImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getJoinVariable()
     * @generated
     */
    EClass JOIN_VARIABLE = eINSTANCE.getJoinVariable();

    /**
     * The meta object literal for the '<em><b>Excl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_VARIABLE__EXCL = eINSTANCE.getJoinVariable_Excl();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_VARIABLE__VAR = eINSTANCE.getJoinVariable_Var();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_VARIABLE__EXPR = eINSTANCE.getJoinVariable_Expr();

    /**
     * The meta object literal for the '{@link de.uni_hildesheim.sse.vilBuildLanguage.impl.SystemExecutionImpl <em>System Execution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.SystemExecutionImpl
     * @see de.uni_hildesheim.sse.vilBuildLanguage.impl.VilBuildLanguagePackageImpl#getSystemExecution()
     * @generated
     */
    EClass SYSTEM_EXECUTION = eINSTANCE.getSystemExecution();

    /**
     * The meta object literal for the '<em><b>Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_EXECUTION__CALL = eINSTANCE.getSystemExecution_Call();

    /**
     * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_EXECUTION__CALLS = eINSTANCE.getSystemExecution_Calls();

  }

} //VilBuildLanguagePackage
