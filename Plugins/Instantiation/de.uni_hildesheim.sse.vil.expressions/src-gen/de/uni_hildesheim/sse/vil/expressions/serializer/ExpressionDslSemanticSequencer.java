/*
 * generated by Xtext
 */
package de.uni_hildesheim.sse.vil.expressions.serializer;

import com.google.inject.Inject;
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
import de.uni_hildesheim.sse.vil.expressions.services.ExpressionDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ExpressionDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpressionDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ExpressionDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ExpressionDslPackage.ADDITIVE_EXPRESSION:
				sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
				return; 
			case ExpressionDslPackage.ADDITIVE_EXPRESSION_PART:
				sequence_AdditiveExpressionPart(context, (AdditiveExpressionPart) semanticObject); 
				return; 
			case ExpressionDslPackage.ADVICE:
				sequence_Advice(context, (Advice) semanticObject); 
				return; 
			case ExpressionDslPackage.ARGUMENT_LIST:
				sequence_ArgumentList(context, (ArgumentList) semanticObject); 
				return; 
			case ExpressionDslPackage.CALL:
				sequence_Call(context, (Call) semanticObject); 
				return; 
			case ExpressionDslPackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case ExpressionDslPackage.CONSTRUCTOR_EXECUTION:
				sequence_ConstructorExecution(context, (ConstructorExecution) semanticObject); 
				return; 
			case ExpressionDslPackage.CONTAINER_INITIALIZER:
				sequence_ContainerInitializer(context, (ContainerInitializer) semanticObject); 
				return; 
			case ExpressionDslPackage.CONTAINER_INITIALIZER_EXPRESSION:
				sequence_ContainerInitializerExpression(context, (ContainerInitializerExpression) semanticObject); 
				return; 
			case ExpressionDslPackage.DECLARATION:
				sequence_Declaration(context, (Declaration) semanticObject); 
				return; 
			case ExpressionDslPackage.DECLARATION_UNIT:
				sequence_DeclarationUnit(context, (DeclarationUnit) semanticObject); 
				return; 
			case ExpressionDslPackage.DECLARATOR:
				sequence_Declarator(context, (Declarator) semanticObject); 
				return; 
			case ExpressionDslPackage.EQUALITY_EXPRESSION:
				sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
				return; 
			case ExpressionDslPackage.EQUALITY_EXPRESSION_PART:
				sequence_EqualityExpressionPart(context, (EqualityExpressionPart) semanticObject); 
				return; 
			case ExpressionDslPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case ExpressionDslPackage.EXPRESSION_OR_QUALIFIED_EXECUTION:
				sequence_ExpressionOrQualifiedExecution(context, (ExpressionOrQualifiedExecution) semanticObject); 
				return; 
			case ExpressionDslPackage.EXPRESSION_STATEMENT:
				sequence_ExpressionStatement(context, (ExpressionStatement) semanticObject); 
				return; 
			case ExpressionDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ExpressionDslPackage.LANGUAGE_UNIT:
				sequence_LanguageUnit(context, (LanguageUnit) semanticObject); 
				return; 
			case ExpressionDslPackage.LOGICAL_EXPRESSION:
				sequence_LogicalExpression(context, (LogicalExpression) semanticObject); 
				return; 
			case ExpressionDslPackage.LOGICAL_EXPRESSION_PART:
				sequence_LogicalExpressionPart(context, (LogicalExpressionPart) semanticObject); 
				return; 
			case ExpressionDslPackage.MULTIPLICATIVE_EXPRESSION:
				sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
				return; 
			case ExpressionDslPackage.MULTIPLICATIVE_EXPRESSION_PART:
				sequence_MultiplicativeExpressionPart(context, (MultiplicativeExpressionPart) semanticObject); 
				return; 
			case ExpressionDslPackage.NAMED_ARGUMENT:
				sequence_NamedArgument(context, (NamedArgument) semanticObject); 
				return; 
			case ExpressionDslPackage.NUM_VALUE:
				sequence_NumValue(context, (NumValue) semanticObject); 
				return; 
			case ExpressionDslPackage.PARAMETER:
				sequence_Parameter(context, (de.uni_hildesheim.sse.vil.expressions.expressionDsl.Parameter) semanticObject); 
				return; 
			case ExpressionDslPackage.PARAMETER_LIST:
				sequence_ParameterList(context, (ParameterList) semanticObject); 
				return; 
			case ExpressionDslPackage.POSTFIX_EXPRESSION:
				sequence_PostfixExpression(context, (PostfixExpression) semanticObject); 
				return; 
			case ExpressionDslPackage.PRIMARY_EXPRESSION:
				sequence_PrimaryExpression(context, (PrimaryExpression) semanticObject); 
				return; 
			case ExpressionDslPackage.QUALIFIED_NAME:
				sequence_QualifiedName(context, (QualifiedName) semanticObject); 
				return; 
			case ExpressionDslPackage.QUALIFIED_PREFIX:
				sequence_QualifiedPrefix(context, (QualifiedPrefix) semanticObject); 
				return; 
			case ExpressionDslPackage.RELATIONAL_EXPRESSION:
				sequence_RelationalExpression(context, (RelationalExpression) semanticObject); 
				return; 
			case ExpressionDslPackage.RELATIONAL_EXPRESSION_PART:
				sequence_RelationalExpressionPart(context, (RelationalExpressionPart) semanticObject); 
				return; 
			case ExpressionDslPackage.SUB_CALL:
				sequence_SubCall(context, (SubCall) semanticObject); 
				return; 
			case ExpressionDslPackage.SUPER_EXECUTION:
				sequence_SuperExecution(context, (SuperExecution) semanticObject); 
				return; 
			case ExpressionDslPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case ExpressionDslPackage.TYPE_DEF:
				sequence_TypeDef(context, (TypeDef) semanticObject); 
				return; 
			case ExpressionDslPackage.TYPE_PARAMETERS:
				sequence_TypeParameters(context, (TypeParameters) semanticObject); 
				return; 
			case ExpressionDslPackage.UNARY_EXPRESSION:
				sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
				return; 
			case ExpressionDslPackage.UNQUALIFIED_EXECUTION:
				sequence_UnqualifiedExecution(context, (UnqualifiedExecution) semanticObject); 
				return; 
			case ExpressionDslPackage.VARIABLE_DECLARATION:
				sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
				return; 
			case ExpressionDslPackage.VERSION_SPEC:
				sequence_VersionSpec(context, (VersionSpec) semanticObject); 
				return; 
			case ExpressionDslPackage.VERSION_STMT:
				sequence_VersionStmt(context, (VersionStmt) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AdditiveExpressionPart returns AdditiveExpressionPart
	 *
	 * Constraint:
	 *     (op=AdditiveOperator ex=MultiplicativeExpression)
	 */
	protected void sequence_AdditiveExpressionPart(ISerializationContext context, AdditiveExpressionPart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.ADDITIVE_EXPRESSION_PART__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.ADDITIVE_EXPRESSION_PART__OP));
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.ADDITIVE_EXPRESSION_PART__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.ADDITIVE_EXPRESSION_PART__EX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdditiveExpressionPartAccess().getOpAdditiveOperatorParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAdditiveExpressionPartAccess().getExMultiplicativeExpressionParserRuleCall_1_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AdditiveExpression returns AdditiveExpression
	 *
	 * Constraint:
	 *     (left=MultiplicativeExpression right+=AdditiveExpressionPart*)
	 */
	protected void sequence_AdditiveExpression(ISerializationContext context, AdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Advice returns Advice
	 *
	 * Constraint:
	 *     (name=QualifiedName versionSpec=VersionSpec?)
	 */
	protected void sequence_Advice(ISerializationContext context, Advice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ArgumentList returns ArgumentList
	 *
	 * Constraint:
	 *     (param+=NamedArgument param+=NamedArgument*)
	 */
	protected void sequence_ArgumentList(ISerializationContext context, ArgumentList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Call returns Call
	 *
	 * Constraint:
	 *     (name=QualifiedPrefix decl=Declarator? param=ArgumentList?)
	 */
	protected void sequence_Call(ISerializationContext context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns Constant
	 *
	 * Constraint:
	 *     (
	 *         nValue=NumValue | 
	 *         sValue=STRING | 
	 *         qValue=QualifiedName | 
	 *         bValue='true' | 
	 *         bValue='false' | 
	 *         null='null' | 
	 *         version=VERSION
	 *     )
	 */
	protected void sequence_Constant(ISerializationContext context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstructorExecution returns ConstructorExecution
	 *
	 * Constraint:
	 *     (type=Type param=ArgumentList? calls+=SubCall*)
	 */
	protected void sequence_ConstructorExecution(ISerializationContext context, ConstructorExecution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContainerInitializerExpression returns ContainerInitializerExpression
	 *
	 * Constraint:
	 *     (logical=LogicalExpression | container=ContainerInitializer)
	 */
	protected void sequence_ContainerInitializerExpression(ISerializationContext context, ContainerInitializerExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ContainerInitializer returns ContainerInitializer
	 *
	 * Constraint:
	 *     (exprs+=ContainerInitializerExpression exprs+=ContainerInitializerExpression*)?
	 */
	protected void sequence_ContainerInitializer(ISerializationContext context, ContainerInitializer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeclarationUnit returns DeclarationUnit
	 *
	 * Constraint:
	 *     (id=Identifier deflt=Expression?)
	 */
	protected void sequence_DeclarationUnit(ISerializationContext context, DeclarationUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Declaration
	 *
	 * Constraint:
	 *     (type=Type? units+=DeclarationUnit units+=DeclarationUnit*)
	 */
	protected void sequence_Declaration(ISerializationContext context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declarator returns Declarator
	 *
	 * Constraint:
	 *     (decl+=Declaration decl+=Declaration*)
	 */
	protected void sequence_Declarator(ISerializationContext context, Declarator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EqualityExpressionPart returns EqualityExpressionPart
	 *
	 * Constraint:
	 *     (op=EqualityOperator ex=RelationalExpression)
	 */
	protected void sequence_EqualityExpressionPart(ISerializationContext context, EqualityExpressionPart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.EQUALITY_EXPRESSION_PART__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.EQUALITY_EXPRESSION_PART__OP));
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.EQUALITY_EXPRESSION_PART__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.EQUALITY_EXPRESSION_PART__EX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualityExpressionPartAccess().getOpEqualityOperatorParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getEqualityExpressionPartAccess().getExRelationalExpressionParserRuleCall_1_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EqualityExpression returns EqualityExpression
	 *
	 * Constraint:
	 *     (left=RelationalExpression right=EqualityExpressionPart?)
	 */
	protected void sequence_EqualityExpression(ISerializationContext context, EqualityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionOrQualifiedExecution returns ExpressionOrQualifiedExecution
	 *
	 * Constraint:
	 *     ((val=Constant | parenthesis=Expression) calls+=SubCall*)
	 */
	protected void sequence_ExpressionOrQualifiedExecution(ISerializationContext context, ExpressionOrQualifiedExecution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionStatement returns ExpressionStatement
	 *
	 * Constraint:
	 *     ((var=Identifier field=Identifier?)? expr=Expression)
	 */
	protected void sequence_ExpressionStatement(ISerializationContext context, ExpressionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (expr=LogicalExpression | init=ContainerInitializer)
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     (name=Identifier versionSpec=VersionSpec?)
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LanguageUnit returns LanguageUnit
	 *
	 * Constraint:
	 *     (advices+=Advice* name=Identifier version=VersionStmt? imports+=Import*)
	 */
	protected void sequence_LanguageUnit(ISerializationContext context, LanguageUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicalExpressionPart returns LogicalExpressionPart
	 *
	 * Constraint:
	 *     (op=LogicalOperator ex=EqualityExpression)
	 */
	protected void sequence_LogicalExpressionPart(ISerializationContext context, LogicalExpressionPart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.LOGICAL_EXPRESSION_PART__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.LOGICAL_EXPRESSION_PART__OP));
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.LOGICAL_EXPRESSION_PART__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.LOGICAL_EXPRESSION_PART__EX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLogicalExpressionPartAccess().getOpLogicalOperatorParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getLogicalExpressionPartAccess().getExEqualityExpressionParserRuleCall_1_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LogicalExpression returns LogicalExpression
	 *
	 * Constraint:
	 *     (left=EqualityExpression right+=LogicalExpressionPart*)
	 */
	protected void sequence_LogicalExpression(ISerializationContext context, LogicalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MultiplicativeExpressionPart returns MultiplicativeExpressionPart
	 *
	 * Constraint:
	 *     (op=MultiplicativeOperator expr=UnaryExpression)
	 */
	protected void sequence_MultiplicativeExpressionPart(ISerializationContext context, MultiplicativeExpressionPart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.MULTIPLICATIVE_EXPRESSION_PART__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.MULTIPLICATIVE_EXPRESSION_PART__OP));
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.MULTIPLICATIVE_EXPRESSION_PART__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.MULTIPLICATIVE_EXPRESSION_PART__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicativeExpressionPartAccess().getOpMultiplicativeOperatorParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getMultiplicativeExpressionPartAccess().getExprUnaryExpressionParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MultiplicativeExpression returns MultiplicativeExpression
	 *
	 * Constraint:
	 *     (left=UnaryExpression right=MultiplicativeExpressionPart?)
	 */
	protected void sequence_MultiplicativeExpression(ISerializationContext context, MultiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedArgument returns NamedArgument
	 *
	 * Constraint:
	 *     (name=Identifier? ex=Expression)
	 */
	protected void sequence_NamedArgument(ISerializationContext context, NamedArgument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NumValue returns NumValue
	 *
	 * Constraint:
	 *     val=NUMBER
	 */
	protected void sequence_NumValue(ISerializationContext context, NumValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.NUM_VALUE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.NUM_VALUE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumValueAccess().getValNUMBERTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterList returns ParameterList
	 *
	 * Constraint:
	 *     (param+=Parameter param+=Parameter*)
	 */
	protected void sequence_ParameterList(ISerializationContext context, ParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (type=Type name=Identifier)
	 */
	protected void sequence_Parameter(ISerializationContext context, de.uni_hildesheim.sse.vil.expressions.expressionDsl.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.PARAMETER__TYPE));
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIdentifierParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PostfixExpression returns PostfixExpression
	 *
	 * Constraint:
	 *     left=PrimaryExpression
	 */
	protected void sequence_PostfixExpression(ISerializationContext context, PostfixExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.POSTFIX_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.POSTFIX_EXPRESSION__LEFT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPostfixExpressionAccess().getLeftPrimaryExpressionParserRuleCall_0(), semanticObject.getLeft());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryExpression returns PrimaryExpression
	 *
	 * Constraint:
	 *     (otherEx=ExpressionOrQualifiedExecution | unqEx=UnqualifiedExecution | superEx=SuperExecution | newEx=ConstructorExecution)
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, PrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QualifiedName returns QualifiedName
	 *
	 * Constraint:
	 *     (prefix=QualifiedPrefix (qname+='.' qname+=Identifier)*)
	 */
	protected void sequence_QualifiedName(ISerializationContext context, QualifiedName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QualifiedPrefix returns QualifiedPrefix
	 *
	 * Constraint:
	 *     (qname+=Identifier (qname+='::' qname+=Identifier)*)
	 */
	protected void sequence_QualifiedPrefix(ISerializationContext context, QualifiedPrefix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelationalExpressionPart returns RelationalExpressionPart
	 *
	 * Constraint:
	 *     (op=RelationalOperator ex=AdditiveExpression)
	 */
	protected void sequence_RelationalExpressionPart(ISerializationContext context, RelationalExpressionPart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.RELATIONAL_EXPRESSION_PART__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.RELATIONAL_EXPRESSION_PART__OP));
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.RELATIONAL_EXPRESSION_PART__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.RELATIONAL_EXPRESSION_PART__EX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelationalExpressionPartAccess().getOpRelationalOperatorParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getRelationalExpressionPartAccess().getExAdditiveExpressionParserRuleCall_1_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RelationalExpression returns RelationalExpression
	 *
	 * Constraint:
	 *     (left=AdditiveExpression right=RelationalExpressionPart?)
	 */
	protected void sequence_RelationalExpression(ISerializationContext context, RelationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SubCall returns SubCall
	 *
	 * Constraint:
	 *     (((type='.' | type='->') call=Call) | arrayEx=Expression)
	 */
	protected void sequence_SubCall(ISerializationContext context, SubCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuperExecution returns SuperExecution
	 *
	 * Constraint:
	 *     (call=Call calls+=SubCall*)
	 */
	protected void sequence_SuperExecution(ISerializationContext context, SuperExecution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeDef returns TypeDef
	 *
	 * Constraint:
	 *     (name=Identifier type=Type)
	 */
	protected void sequence_TypeDef(ISerializationContext context, TypeDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.TYPE_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.TYPE_DEF__NAME));
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.TYPE_DEF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.TYPE_DEF__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeDefAccess().getNameIdentifierParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeParameters returns TypeParameters
	 *
	 * Constraint:
	 *     (param+=Type param+=Type*)
	 */
	protected void sequence_TypeParameters(ISerializationContext context, TypeParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (
	 *         name=QualifiedPrefix | 
	 *         (set='setOf' param=TypeParameters) | 
	 *         (seq='sequenceOf' param=TypeParameters) | 
	 *         (map='mapOf' param=TypeParameters) | 
	 *         (call='callOf' return=Type? param=TypeParameters)
	 *     )
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnaryExpression returns UnaryExpression
	 *
	 * Constraint:
	 *     (op=UnaryOperator? expr=PostfixExpression)
	 */
	protected void sequence_UnaryExpression(ISerializationContext context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnqualifiedExecution returns UnqualifiedExecution
	 *
	 * Constraint:
	 *     (call=Call calls+=SubCall*)
	 */
	protected void sequence_UnqualifiedExecution(ISerializationContext context, UnqualifiedExecution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VariableDeclaration returns VariableDeclaration
	 *
	 * Constraint:
	 *     (const='const'? type=Type name=Identifier expression=Expression?)
	 */
	protected void sequence_VariableDeclaration(ISerializationContext context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VersionSpec returns VersionSpec
	 *
	 * Constraint:
	 *     restriction=Expression
	 */
	protected void sequence_VersionSpec(ISerializationContext context, VersionSpec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.VERSION_SPEC__RESTRICTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.VERSION_SPEC__RESTRICTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVersionSpecAccess().getRestrictionExpressionParserRuleCall_1_0(), semanticObject.getRestriction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VersionStmt returns VersionStmt
	 *
	 * Constraint:
	 *     version=VERSION
	 */
	protected void sequence_VersionStmt(ISerializationContext context, VersionStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpressionDslPackage.Literals.VERSION_STMT__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionDslPackage.Literals.VERSION_STMT__VERSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVersionStmtAccess().getVersionVERSIONTerminalRuleCall_1_0(), semanticObject.getVersion());
		feeder.finish();
	}
	
	
}
