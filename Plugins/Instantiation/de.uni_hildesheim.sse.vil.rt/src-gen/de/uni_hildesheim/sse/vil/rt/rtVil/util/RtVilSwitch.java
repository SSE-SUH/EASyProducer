/**
 */
package de.uni_hildesheim.sse.vil.rt.rtVil.util;

import de.uni_hildesheim.sse.vil.rt.rtVil.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage
 * @generated
 */
public class RtVilSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RtVilPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RtVilSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RtVilPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RtVilPackage.IMPLEMENTATION_UNIT:
      {
        ImplementationUnit implementationUnit = (ImplementationUnit)theEObject;
        T result = caseImplementationUnit(implementationUnit);
        if (result == null) result = caseVilBuildLanguage_ImplementationUnit(implementationUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RtVilPackage.LANGUAGE_UNIT:
      {
        LanguageUnit languageUnit = (LanguageUnit)theEObject;
        T result = caseLanguageUnit(languageUnit);
        if (result == null) result = caseVilBuildLanguage_LanguageUnit(languageUnit);
        if (result == null) result = caseExpressionDsl_LanguageUnit(languageUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RtVilPackage.RT_CONTENTS:
      {
        rtContents rtContents = (rtContents)theEObject;
        T result = casertContents(rtContents);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RtVilPackage.GLOBAL_VARIABLE_DECLARATION:
      {
        GlobalVariableDeclaration globalVariableDeclaration = (GlobalVariableDeclaration)theEObject;
        T result = caseGlobalVariableDeclaration(globalVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RtVilPackage.STRATEGY_DECLARATION:
      {
        StrategyDeclaration strategyDeclaration = (StrategyDeclaration)theEObject;
        T result = caseStrategyDeclaration(strategyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RtVilPackage.BREAKDOWN_ELEMENT:
      {
        BreakdownElement breakdownElement = (BreakdownElement)theEObject;
        T result = caseBreakdownElement(breakdownElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RtVilPackage.WEIGHTING_STATEMENT:
      {
        WeightingStatement weightingStatement = (WeightingStatement)theEObject;
        T result = caseWeightingStatement(weightingStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RtVilPackage.BREAKDOWN_STATEMENT:
      {
        BreakdownStatement breakdownStatement = (BreakdownStatement)theEObject;
        T result = caseBreakdownStatement(breakdownStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RtVilPackage.BREAKDOWN_WITH_PART:
      {
        BreakdownWithPart breakdownWithPart = (BreakdownWithPart)theEObject;
        T result = caseBreakdownWithPart(breakdownWithPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RtVilPackage.TACTIC_DECLARATION:
      {
        TacticDeclaration tacticDeclaration = (TacticDeclaration)theEObject;
        T result = caseTacticDeclaration(tacticDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implementation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implementation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementationUnit(ImplementationUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguageUnit(LanguageUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rt Contents</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rt Contents</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casertContents(rtContents object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalVariableDeclaration(GlobalVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strategy Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strategy Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrategyDeclaration(StrategyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Breakdown Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Breakdown Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreakdownElement(BreakdownElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weighting Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weighting Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeightingStatement(WeightingStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Breakdown Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Breakdown Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreakdownStatement(BreakdownStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Breakdown With Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Breakdown With Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreakdownWithPart(BreakdownWithPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tactic Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tactic Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTacticDeclaration(TacticDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implementation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implementation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVilBuildLanguage_ImplementationUnit(de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionDsl_LanguageUnit(de.uni_hildesheim.sse.vil.expressions.expressionDsl.LanguageUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVilBuildLanguage_LanguageUnit(de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RtVilSwitch
