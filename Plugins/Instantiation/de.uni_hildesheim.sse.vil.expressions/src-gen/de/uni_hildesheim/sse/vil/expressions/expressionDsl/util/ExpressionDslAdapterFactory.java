/**
 */
package de.uni_hildesheim.sse.vil.expressions.expressionDsl.util;

import de.uni_hildesheim.sse.vil.expressions.expressionDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage
 * @generated
 */
public class ExpressionDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExpressionDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ExpressionDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionDslSwitch<Adapter> modelSwitch =
    new ExpressionDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseLanguageUnit(LanguageUnit object)
      {
        return createLanguageUnitAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseAdvice(Advice object)
      {
        return createAdviceAdapter();
      }
      @Override
      public Adapter caseVersionSpec(VersionSpec object)
      {
        return createVersionSpecAdapter();
      }
      @Override
      public Adapter caseVersionedId(VersionedId object)
      {
        return createVersionedIdAdapter();
      }
      @Override
      public Adapter caseParameterList(ParameterList object)
      {
        return createParameterListAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseVersionStmt(VersionStmt object)
      {
        return createVersionStmtAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseExpressionStatement(ExpressionStatement object)
      {
        return createExpressionStatementAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalExpression(LogicalExpression object)
      {
        return createLogicalExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalExpressionPart(LogicalExpressionPart object)
      {
        return createLogicalExpressionPartAdapter();
      }
      @Override
      public Adapter caseEqualityExpression(EqualityExpression object)
      {
        return createEqualityExpressionAdapter();
      }
      @Override
      public Adapter caseEqualityExpressionPart(EqualityExpressionPart object)
      {
        return createEqualityExpressionPartAdapter();
      }
      @Override
      public Adapter caseRelationalExpression(RelationalExpression object)
      {
        return createRelationalExpressionAdapter();
      }
      @Override
      public Adapter caseRelationalExpressionPart(RelationalExpressionPart object)
      {
        return createRelationalExpressionPartAdapter();
      }
      @Override
      public Adapter caseAdditiveExpression(AdditiveExpression object)
      {
        return createAdditiveExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpressionPart(AdditiveExpressionPart object)
      {
        return createAdditiveExpressionPartAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpression(MultiplicativeExpression object)
      {
        return createMultiplicativeExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpressionPart(MultiplicativeExpressionPart object)
      {
        return createMultiplicativeExpressionPartAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter casePostfixExpression(PostfixExpression object)
      {
        return createPostfixExpressionAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseExpressionOrQualifiedExecution(ExpressionOrQualifiedExecution object)
      {
        return createExpressionOrQualifiedExecutionAdapter();
      }
      @Override
      public Adapter caseUnqualifiedExecution(UnqualifiedExecution object)
      {
        return createUnqualifiedExecutionAdapter();
      }
      @Override
      public Adapter caseSuperExecution(SuperExecution object)
      {
        return createSuperExecutionAdapter();
      }
      @Override
      public Adapter caseConstructorExecution(ConstructorExecution object)
      {
        return createConstructorExecutionAdapter();
      }
      @Override
      public Adapter caseSubCall(SubCall object)
      {
        return createSubCallAdapter();
      }
      @Override
      public Adapter caseDeclarator(Declarator object)
      {
        return createDeclaratorAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseCall(Call object)
      {
        return createCallAdapter();
      }
      @Override
      public Adapter caseArgumentList(ArgumentList object)
      {
        return createArgumentListAdapter();
      }
      @Override
      public Adapter caseNamedArgument(NamedArgument object)
      {
        return createNamedArgumentAdapter();
      }
      @Override
      public Adapter caseQualifiedPrefix(QualifiedPrefix object)
      {
        return createQualifiedPrefixAdapter();
      }
      @Override
      public Adapter caseQualifiedName(QualifiedName object)
      {
        return createQualifiedNameAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseNumValue(NumValue object)
      {
        return createNumValueAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseTypeParameters(TypeParameters object)
      {
        return createTypeParametersAdapter();
      }
      @Override
      public Adapter caseContainerInitializer(ContainerInitializer object)
      {
        return createContainerInitializerAdapter();
      }
      @Override
      public Adapter caseContainerInitializerExpression(ContainerInitializerExpression object)
      {
        return createContainerInitializerExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.LanguageUnit <em>Language Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.LanguageUnit
   * @generated
   */
  public Adapter createLanguageUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Advice <em>Advice</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.Advice
   * @generated
   */
  public Adapter createAdviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.VersionSpec <em>Version Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.VersionSpec
   * @generated
   */
  public Adapter createVersionSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.VersionedId <em>Versioned Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.VersionedId
   * @generated
   */
  public Adapter createVersionedIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ParameterList
   * @generated
   */
  public Adapter createParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.VersionStmt <em>Version Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.VersionStmt
   * @generated
   */
  public Adapter createVersionStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionStatement <em>Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionStatement
   * @generated
   */
  public Adapter createExpressionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.LogicalExpression <em>Logical Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.LogicalExpression
   * @generated
   */
  public Adapter createLogicalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.LogicalExpressionPart <em>Logical Expression Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.LogicalExpressionPart
   * @generated
   */
  public Adapter createLogicalExpressionPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.EqualityExpression
   * @generated
   */
  public Adapter createEqualityExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.EqualityExpressionPart <em>Equality Expression Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.EqualityExpressionPart
   * @generated
   */
  public Adapter createEqualityExpressionPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.RelationalExpression
   * @generated
   */
  public Adapter createRelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.RelationalExpressionPart <em>Relational Expression Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.RelationalExpressionPart
   * @generated
   */
  public Adapter createRelationalExpressionPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.AdditiveExpression
   * @generated
   */
  public Adapter createAdditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.AdditiveExpressionPart <em>Additive Expression Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.AdditiveExpressionPart
   * @generated
   */
  public Adapter createAdditiveExpressionPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.MultiplicativeExpression
   * @generated
   */
  public Adapter createMultiplicativeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.MultiplicativeExpressionPart <em>Multiplicative Expression Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.MultiplicativeExpressionPart
   * @generated
   */
  public Adapter createMultiplicativeExpressionPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.PostfixExpression <em>Postfix Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.PostfixExpression
   * @generated
   */
  public Adapter createPostfixExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionOrQualifiedExecution <em>Expression Or Qualified Execution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionOrQualifiedExecution
   * @generated
   */
  public Adapter createExpressionOrQualifiedExecutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.UnqualifiedExecution <em>Unqualified Execution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.UnqualifiedExecution
   * @generated
   */
  public Adapter createUnqualifiedExecutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.SuperExecution <em>Super Execution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.SuperExecution
   * @generated
   */
  public Adapter createSuperExecutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.ConstructorExecution <em>Constructor Execution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ConstructorExecution
   * @generated
   */
  public Adapter createConstructorExecutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.SubCall <em>Sub Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.SubCall
   * @generated
   */
  public Adapter createSubCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Declarator <em>Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.Declarator
   * @generated
   */
  public Adapter createDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.Call
   * @generated
   */
  public Adapter createCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.ArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ArgumentList
   * @generated
   */
  public Adapter createArgumentListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.NamedArgument <em>Named Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.NamedArgument
   * @generated
   */
  public Adapter createNamedArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.QualifiedPrefix <em>Qualified Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.QualifiedPrefix
   * @generated
   */
  public Adapter createQualifiedPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.QualifiedName
   * @generated
   */
  public Adapter createQualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.NumValue <em>Num Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.NumValue
   * @generated
   */
  public Adapter createNumValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.TypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.TypeParameters
   * @generated
   */
  public Adapter createTypeParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.ContainerInitializer <em>Container Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ContainerInitializer
   * @generated
   */
  public Adapter createContainerInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_hildesheim.sse.vil.expressions.expressionDsl.ContainerInitializerExpression <em>Container Initializer Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_hildesheim.sse.vil.expressions.expressionDsl.ContainerInitializerExpression
   * @generated
   */
  public Adapter createContainerInitializerExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ExpressionDslAdapterFactory
