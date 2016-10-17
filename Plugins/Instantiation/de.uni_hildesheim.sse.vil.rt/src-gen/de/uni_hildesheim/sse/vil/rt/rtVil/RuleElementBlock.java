/**
 */
package de.uni_hildesheim.sse.vil.rt.rtVil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Element Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_hildesheim.sse.vil.rt.rtVil.RuleElementBlock#getIntent <em>Intent</em>}</li>
 * </ul>
 *
 * @see de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage#getRuleElementBlock()
 * @model
 * @generated
 */
public interface RuleElementBlock extends de.uni_hildesheim.sse.vilBuildLanguage.RuleElementBlock
{
  /**
   * Returns the value of the '<em><b>Intent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intent</em>' containment reference.
   * @see #setIntent(IntentDeclaration)
   * @see de.uni_hildesheim.sse.vil.rt.rtVil.RtVilPackage#getRuleElementBlock_Intent()
   * @model containment="true"
   * @generated
   */
  IntentDeclaration getIntent();

  /**
   * Sets the value of the '{@link de.uni_hildesheim.sse.vil.rt.rtVil.RuleElementBlock#getIntent <em>Intent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intent</em>' containment reference.
   * @see #getIntent()
   * @generated
   */
  void setIntent(IntentDeclaration value);

} // RuleElementBlock
