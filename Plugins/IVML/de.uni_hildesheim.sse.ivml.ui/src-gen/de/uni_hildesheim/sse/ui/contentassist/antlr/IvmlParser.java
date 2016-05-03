/*
 * generated by Xtext
 */
package de.uni_hildesheim.sse.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.uni_hildesheim.sse.services.IvmlGrammarAccess;

public class IvmlParser extends AbstractContentAssistParser {
	
	@Inject
	private IvmlGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.uni_hildesheim.sse.ui.contentassist.antlr.internal.InternalIvmlParser createParser() {
		de.uni_hildesheim.sse.ui.contentassist.antlr.internal.InternalIvmlParser result = new de.uni_hildesheim.sse.ui.contentassist.antlr.internal.InternalIvmlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getProjectContentsAccess().getAlternatives_1(), "rule__ProjectContents__Alternatives_1");
					put(grammarAccess.getTypedefAccess().getAlternatives(), "rule__Typedef__Alternatives");
					put(grammarAccess.getTypedefCompoundAccess().getAlternatives_5(), "rule__TypedefCompound__Alternatives_5");
					put(grammarAccess.getAttrAssignmentAccess().getAlternatives_7(), "rule__AttrAssignment__Alternatives_7");
					put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getValueAccess().getBValueAlternatives_3_0(), "rule__Value__BValueAlternatives_3_0");
					put(grammarAccess.getDerivedTypeAccess().getAlternatives_0(), "rule__DerivedType__Alternatives_0");
					put(grammarAccess.getAnnotateToAccess().getSnameAlternatives_0_0(), "rule__AnnotateTo__SnameAlternatives_0_0");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getAssignmentExpressionPartAccess().getAlternatives_1(), "rule__AssignmentExpressionPart__Alternatives_1");
					put(grammarAccess.getImplicationOperatorAccess().getAlternatives(), "rule__ImplicationOperator__Alternatives");
					put(grammarAccess.getLogicalOperatorAccess().getAlternatives(), "rule__LogicalOperator__Alternatives");
					put(grammarAccess.getEqualityExpressionPartAccess().getAlternatives_1(), "rule__EqualityExpressionPart__Alternatives_1");
					put(grammarAccess.getEqualityOperatorAccess().getAlternatives(), "rule__EqualityOperator__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
					put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getPostfixExpressionAccess().getAlternatives(), "rule__PostfixExpression__Alternatives");
					put(grammarAccess.getCallAccess().getAlternatives(), "rule__Call__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives_0(), "rule__PrimaryExpression__Alternatives_0");
					put(grammarAccess.getExpressionListEntryAccess().getAlternatives_1(), "rule__ExpressionListEntry__Alternatives_1");
					put(grammarAccess.getIdentifierAccess().getAlternatives(), "rule__Identifier__Alternatives");
					put(grammarAccess.getVariabilityUnitAccess().getGroup(), "rule__VariabilityUnit__Group__0");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getProjectContentsAccess().getGroup(), "rule__ProjectContents__Group__0");
					put(grammarAccess.getTypedefEnumAccess().getGroup(), "rule__TypedefEnum__Group__0");
					put(grammarAccess.getTypedefEnumAccess().getGroup_4(), "rule__TypedefEnum__Group_4__0");
					put(grammarAccess.getTypedefEnumLiteralAccess().getGroup(), "rule__TypedefEnumLiteral__Group__0");
					put(grammarAccess.getTypedefEnumLiteralAccess().getGroup_1(), "rule__TypedefEnumLiteral__Group_1__0");
					put(grammarAccess.getTypedefCompoundAccess().getGroup(), "rule__TypedefCompound__Group__0");
					put(grammarAccess.getTypedefCompoundAccess().getGroup_3(), "rule__TypedefCompound__Group_3__0");
					put(grammarAccess.getAttrAssignmentAccess().getGroup(), "rule__AttrAssignment__Group__0");
					put(grammarAccess.getAttrAssignmentAccess().getGroup_3(), "rule__AttrAssignment__Group_3__0");
					put(grammarAccess.getAttrAssignmentPartAccess().getGroup(), "rule__AttrAssignmentPart__Group__0");
					put(grammarAccess.getTypedefMappingAccess().getGroup(), "rule__TypedefMapping__Group__0");
					put(grammarAccess.getTypedefConstraintAccess().getGroup(), "rule__TypedefConstraint__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_3(), "rule__VariableDeclaration__Group_3__0");
					put(grammarAccess.getVariableDeclarationPartAccess().getGroup(), "rule__VariableDeclarationPart__Group__0");
					put(grammarAccess.getVariableDeclarationPartAccess().getGroup_1(), "rule__VariableDeclarationPart__Group_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_0(), "rule__QualifiedName__Group_0__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_0_2(), "rule__QualifiedName__Group_0_2__0");
					put(grammarAccess.getAccessNameAccess().getGroup(), "rule__AccessName__Group__0");
					put(grammarAccess.getDerivedTypeAccess().getGroup(), "rule__DerivedType__Group__0");
					put(grammarAccess.getAnnotateToAccess().getGroup(), "rule__AnnotateTo__Group__0");
					put(grammarAccess.getAnnotateToAccess().getGroup_5(), "rule__AnnotateTo__Group_5__0");
					put(grammarAccess.getFreezeAccess().getGroup(), "rule__Freeze__Group__0");
					put(grammarAccess.getFreezeAccess().getGroup_4(), "rule__Freeze__Group_4__0");
					put(grammarAccess.getFreezeStatementAccess().getGroup(), "rule__FreezeStatement__Group__0");
					put(grammarAccess.getEvalAccess().getGroup(), "rule__Eval__Group__0");
					put(grammarAccess.getInterfaceDeclarationAccess().getGroup(), "rule__InterfaceDeclaration__Group__0");
					put(grammarAccess.getExportAccess().getGroup(), "rule__Export__Group__0");
					put(grammarAccess.getExportAccess().getGroup_2(), "rule__Export__Group_2__0");
					put(grammarAccess.getImportStmtAccess().getGroup(), "rule__ImportStmt__Group__0");
					put(grammarAccess.getImportStmtAccess().getGroup_2(), "rule__ImportStmt__Group_2__0");
					put(grammarAccess.getImportStmtAccess().getGroup_3(), "rule__ImportStmt__Group_3__0");
					put(grammarAccess.getConflictStmtAccess().getGroup(), "rule__ConflictStmt__Group__0");
					put(grammarAccess.getConflictStmtAccess().getGroup_2(), "rule__ConflictStmt__Group_2__0");
					put(grammarAccess.getVersionStmtAccess().getGroup(), "rule__VersionStmt__Group__0");
					put(grammarAccess.getOpDefStatementAccess().getGroup(), "rule__OpDefStatement__Group__0");
					put(grammarAccess.getOpDefParameterListAccess().getGroup(), "rule__OpDefParameterList__Group__0");
					put(grammarAccess.getOpDefParameterListAccess().getGroup_1(), "rule__OpDefParameterList__Group_1__0");
					put(grammarAccess.getOpDefParameterListAccess().getGroup_1_1(), "rule__OpDefParameterList__Group_1_1__0");
					put(grammarAccess.getOpDefParameterAccess().getGroup(), "rule__OpDefParameter__Group__0");
					put(grammarAccess.getOpDefParameterAccess().getGroup_2(), "rule__OpDefParameter__Group_2__0");
					put(grammarAccess.getExpressionStatementAccess().getGroup(), "rule__ExpressionStatement__Group__0");
					put(grammarAccess.getLetExpressionAccess().getGroup(), "rule__LetExpression__Group__0");
					put(grammarAccess.getAssignmentExpressionAccess().getGroup(), "rule__AssignmentExpression__Group__0");
					put(grammarAccess.getAssignmentExpressionPartAccess().getGroup(), "rule__AssignmentExpressionPart__Group__0");
					put(grammarAccess.getImplicationExpressionAccess().getGroup(), "rule__ImplicationExpression__Group__0");
					put(grammarAccess.getImplicationExpressionPartAccess().getGroup(), "rule__ImplicationExpressionPart__Group__0");
					put(grammarAccess.getLogicalExpressionAccess().getGroup(), "rule__LogicalExpression__Group__0");
					put(grammarAccess.getLogicalExpressionPartAccess().getGroup(), "rule__LogicalExpressionPart__Group__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
					put(grammarAccess.getEqualityExpressionPartAccess().getGroup(), "rule__EqualityExpressionPart__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionPartAccess().getGroup(), "rule__RelationalExpressionPart__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionPartAccess().getGroup(), "rule__AdditiveExpressionPart__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionPartAccess().getGroup(), "rule__MultiplicativeExpressionPart__Group__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup(), "rule__UnaryExpression__Group__0");
					put(grammarAccess.getPostfixExpressionAccess().getGroup_0(), "rule__PostfixExpression__Group_0__0");
					put(grammarAccess.getCallAccess().getGroup_0(), "rule__Call__Group_0__0");
					put(grammarAccess.getCallAccess().getGroup_1(), "rule__Call__Group_1__0");
					put(grammarAccess.getCallAccess().getGroup_2(), "rule__Call__Group_2__0");
					put(grammarAccess.getFeatureCallAccess().getGroup(), "rule__FeatureCall__Group__0");
					put(grammarAccess.getSetOpAccess().getGroup(), "rule__SetOp__Group__0");
					put(grammarAccess.getDeclaratorAccess().getGroup(), "rule__Declarator__Group__0");
					put(grammarAccess.getDeclaratorAccess().getGroup_1(), "rule__Declarator__Group_1__0");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup_2(), "rule__Declaration__Group_2__0");
					put(grammarAccess.getDeclarationAccess().getGroup_3(), "rule__Declaration__Group_3__0");
					put(grammarAccess.getActualParameterListAccess().getGroup(), "rule__ActualParameterList__Group__0");
					put(grammarAccess.getActualParameterListAccess().getGroup_1(), "rule__ActualParameterList__Group_1__0");
					put(grammarAccess.getExpressionAccessAccess().getGroup(), "rule__ExpressionAccess__Group__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup(), "rule__PrimaryExpression__Group__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_1(), "rule__PrimaryExpression__Group_0_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0_3(), "rule__PrimaryExpression__Group_0_3__0");
					put(grammarAccess.getCollectionInitializerAccess().getGroup(), "rule__CollectionInitializer__Group__0");
					put(grammarAccess.getExpressionListOrRangeAccess().getGroup(), "rule__ExpressionListOrRange__Group__0");
					put(grammarAccess.getExpressionListOrRangeAccess().getGroup_1(), "rule__ExpressionListOrRange__Group_1__0");
					put(grammarAccess.getExpressionListEntryAccess().getGroup(), "rule__ExpressionListEntry__Group__0");
					put(grammarAccess.getExpressionListEntryAccess().getGroup_0(), "rule__ExpressionListEntry__Group_0__0");
					put(grammarAccess.getExpressionListEntryAccess().getGroup_0_1(), "rule__ExpressionListEntry__Group_0_1__0");
					put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
					put(grammarAccess.getVariabilityUnitAccess().getProjectsAssignment_1(), "rule__VariabilityUnit__ProjectsAssignment_1");
					put(grammarAccess.getProjectAccess().getNameAssignment_1(), "rule__Project__NameAssignment_1");
					put(grammarAccess.getProjectAccess().getVersionAssignment_3(), "rule__Project__VersionAssignment_3");
					put(grammarAccess.getProjectAccess().getImportsAssignment_4(), "rule__Project__ImportsAssignment_4");
					put(grammarAccess.getProjectAccess().getConflictsAssignment_5(), "rule__Project__ConflictsAssignment_5");
					put(grammarAccess.getProjectAccess().getInterfacesAssignment_6(), "rule__Project__InterfacesAssignment_6");
					put(grammarAccess.getProjectAccess().getContentsAssignment_7(), "rule__Project__ContentsAssignment_7");
					put(grammarAccess.getProjectContentsAccess().getElementsAssignment_1_0(), "rule__ProjectContents__ElementsAssignment_1_0");
					put(grammarAccess.getProjectContentsAccess().getElementsAssignment_1_1(), "rule__ProjectContents__ElementsAssignment_1_1");
					put(grammarAccess.getProjectContentsAccess().getElementsAssignment_1_2(), "rule__ProjectContents__ElementsAssignment_1_2");
					put(grammarAccess.getProjectContentsAccess().getElementsAssignment_1_3(), "rule__ProjectContents__ElementsAssignment_1_3");
					put(grammarAccess.getProjectContentsAccess().getElementsAssignment_1_4(), "rule__ProjectContents__ElementsAssignment_1_4");
					put(grammarAccess.getProjectContentsAccess().getElementsAssignment_1_5(), "rule__ProjectContents__ElementsAssignment_1_5");
					put(grammarAccess.getProjectContentsAccess().getElementsAssignment_1_6(), "rule__ProjectContents__ElementsAssignment_1_6");
					put(grammarAccess.getProjectContentsAccess().getElementsAssignment_1_7(), "rule__ProjectContents__ElementsAssignment_1_7");
					put(grammarAccess.getTypedefAccess().getTEnumAssignment_0(), "rule__Typedef__TEnumAssignment_0");
					put(grammarAccess.getTypedefAccess().getTCompoundAssignment_1(), "rule__Typedef__TCompoundAssignment_1");
					put(grammarAccess.getTypedefAccess().getTMappingAssignment_2(), "rule__Typedef__TMappingAssignment_2");
					put(grammarAccess.getTypedefEnumAccess().getNameAssignment_1(), "rule__TypedefEnum__NameAssignment_1");
					put(grammarAccess.getTypedefEnumAccess().getLiteralsAssignment_3(), "rule__TypedefEnum__LiteralsAssignment_3");
					put(grammarAccess.getTypedefEnumAccess().getLiteralsAssignment_4_1(), "rule__TypedefEnum__LiteralsAssignment_4_1");
					put(grammarAccess.getTypedefEnumAccess().getConstraintAssignment_6(), "rule__TypedefEnum__ConstraintAssignment_6");
					put(grammarAccess.getTypedefEnumLiteralAccess().getNameAssignment_0(), "rule__TypedefEnumLiteral__NameAssignment_0");
					put(grammarAccess.getTypedefEnumLiteralAccess().getValueAssignment_1_1(), "rule__TypedefEnumLiteral__ValueAssignment_1_1");
					put(grammarAccess.getTypedefCompoundAccess().getAbstractAssignment_0(), "rule__TypedefCompound__AbstractAssignment_0");
					put(grammarAccess.getTypedefCompoundAccess().getNameAssignment_2(), "rule__TypedefCompound__NameAssignment_2");
					put(grammarAccess.getTypedefCompoundAccess().getSuperAssignment_3_1(), "rule__TypedefCompound__SuperAssignment_3_1");
					put(grammarAccess.getTypedefCompoundAccess().getElementsAssignment_5_0(), "rule__TypedefCompound__ElementsAssignment_5_0");
					put(grammarAccess.getTypedefCompoundAccess().getElementsAssignment_5_1(), "rule__TypedefCompound__ElementsAssignment_5_1");
					put(grammarAccess.getTypedefCompoundAccess().getElementsAssignment_5_2(), "rule__TypedefCompound__ElementsAssignment_5_2");
					put(grammarAccess.getTypedefCompoundAccess().getElementsAssignment_5_3(), "rule__TypedefCompound__ElementsAssignment_5_3");
					put(grammarAccess.getAttrAssignmentAccess().getPartsAssignment_2(), "rule__AttrAssignment__PartsAssignment_2");
					put(grammarAccess.getAttrAssignmentAccess().getPartsAssignment_3_1(), "rule__AttrAssignment__PartsAssignment_3_1");
					put(grammarAccess.getAttrAssignmentAccess().getElementsAssignment_7_0(), "rule__AttrAssignment__ElementsAssignment_7_0");
					put(grammarAccess.getAttrAssignmentAccess().getElementsAssignment_7_1(), "rule__AttrAssignment__ElementsAssignment_7_1");
					put(grammarAccess.getAttrAssignmentAccess().getElementsAssignment_7_2(), "rule__AttrAssignment__ElementsAssignment_7_2");
					put(grammarAccess.getAttrAssignmentPartAccess().getNameAssignment_0(), "rule__AttrAssignmentPart__NameAssignment_0");
					put(grammarAccess.getAttrAssignmentPartAccess().getValueAssignment_2(), "rule__AttrAssignmentPart__ValueAssignment_2");
					put(grammarAccess.getTypedefMappingAccess().getNewTypeAssignment_1(), "rule__TypedefMapping__NewTypeAssignment_1");
					put(grammarAccess.getTypedefMappingAccess().getTypeAssignment_2(), "rule__TypedefMapping__TypeAssignment_2");
					put(grammarAccess.getTypedefMappingAccess().getConstraintAssignment_3(), "rule__TypedefMapping__ConstraintAssignment_3");
					put(grammarAccess.getTypedefConstraintAccess().getExpressionsAssignment_2(), "rule__TypedefConstraint__ExpressionsAssignment_2");
					put(grammarAccess.getVariableDeclarationAccess().getConstAssignment_0(), "rule__VariableDeclaration__ConstAssignment_0");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1(), "rule__VariableDeclaration__TypeAssignment_1");
					put(grammarAccess.getVariableDeclarationAccess().getDeclsAssignment_2(), "rule__VariableDeclaration__DeclsAssignment_2");
					put(grammarAccess.getVariableDeclarationAccess().getDeclsAssignment_3_1(), "rule__VariableDeclaration__DeclsAssignment_3_1");
					put(grammarAccess.getVariableDeclarationPartAccess().getNameAssignment_0(), "rule__VariableDeclarationPart__NameAssignment_0");
					put(grammarAccess.getVariableDeclarationPartAccess().getDefaultAssignment_1_1(), "rule__VariableDeclarationPart__DefaultAssignment_1_1");
					put(grammarAccess.getBasicTypeAccess().getTypeAssignment_0(), "rule__BasicType__TypeAssignment_0");
					put(grammarAccess.getBasicTypeAccess().getTypeAssignment_1(), "rule__BasicType__TypeAssignment_1");
					put(grammarAccess.getBasicTypeAccess().getTypeAssignment_2(), "rule__BasicType__TypeAssignment_2");
					put(grammarAccess.getBasicTypeAccess().getTypeAssignment_3(), "rule__BasicType__TypeAssignment_3");
					put(grammarAccess.getBasicTypeAccess().getTypeAssignment_4(), "rule__BasicType__TypeAssignment_4");
					put(grammarAccess.getTypeAccess().getTypeAssignment_0(), "rule__Type__TypeAssignment_0");
					put(grammarAccess.getTypeAccess().getIdAssignment_1(), "rule__Type__IdAssignment_1");
					put(grammarAccess.getTypeAccess().getDerivedAssignment_2(), "rule__Type__DerivedAssignment_2");
					put(grammarAccess.getNumValueAccess().getValAssignment(), "rule__NumValue__ValAssignment");
					put(grammarAccess.getQualifiedNameAccess().getQNameAssignment_0_0(), "rule__QualifiedName__QNameAssignment_0_0");
					put(grammarAccess.getQualifiedNameAccess().getQNameAssignment_0_1(), "rule__QualifiedName__QNameAssignment_0_1");
					put(grammarAccess.getQualifiedNameAccess().getQNameAssignment_0_2_0(), "rule__QualifiedName__QNameAssignment_0_2_0");
					put(grammarAccess.getQualifiedNameAccess().getQNameAssignment_0_2_1(), "rule__QualifiedName__QNameAssignment_0_2_1");
					put(grammarAccess.getQualifiedNameAccess().getQNameAssignment_1(), "rule__QualifiedName__QNameAssignment_1");
					put(grammarAccess.getAccessNameAccess().getANameAssignment_0(), "rule__AccessName__ANameAssignment_0");
					put(grammarAccess.getAccessNameAccess().getANameAssignment_1(), "rule__AccessName__ANameAssignment_1");
					put(grammarAccess.getValueAccess().getNValueAssignment_0(), "rule__Value__NValueAssignment_0");
					put(grammarAccess.getValueAccess().getSValueAssignment_1(), "rule__Value__SValueAssignment_1");
					put(grammarAccess.getValueAccess().getQValueAssignment_2(), "rule__Value__QValueAssignment_2");
					put(grammarAccess.getValueAccess().getBValueAssignment_3(), "rule__Value__BValueAssignment_3");
					put(grammarAccess.getValueAccess().getSelfAssignment_4(), "rule__Value__SelfAssignment_4");
					put(grammarAccess.getValueAccess().getNullValueAssignment_5(), "rule__Value__NullValueAssignment_5");
					put(grammarAccess.getValueAccess().getVersionAssignment_6(), "rule__Value__VersionAssignment_6");
					put(grammarAccess.getDerivedTypeAccess().getOpAssignment_0_0(), "rule__DerivedType__OpAssignment_0_0");
					put(grammarAccess.getDerivedTypeAccess().getOpAssignment_0_1(), "rule__DerivedType__OpAssignment_0_1");
					put(grammarAccess.getDerivedTypeAccess().getOpAssignment_0_2(), "rule__DerivedType__OpAssignment_0_2");
					put(grammarAccess.getDerivedTypeAccess().getTypeAssignment_2(), "rule__DerivedType__TypeAssignment_2");
					put(grammarAccess.getAnnotateToAccess().getSnameAssignment_0(), "rule__AnnotateTo__SnameAssignment_0");
					put(grammarAccess.getAnnotateToAccess().getAnnotationTypeAssignment_1(), "rule__AnnotateTo__AnnotationTypeAssignment_1");
					put(grammarAccess.getAnnotateToAccess().getAnnotationDeclAssignment_2(), "rule__AnnotateTo__AnnotationDeclAssignment_2");
					put(grammarAccess.getAnnotateToAccess().getNamesAssignment_4(), "rule__AnnotateTo__NamesAssignment_4");
					put(grammarAccess.getAnnotateToAccess().getNamesAssignment_5_1(), "rule__AnnotateTo__NamesAssignment_5_1");
					put(grammarAccess.getFreezeAccess().getNamesAssignment_2(), "rule__Freeze__NamesAssignment_2");
					put(grammarAccess.getFreezeAccess().getIdAssignment_4_2(), "rule__Freeze__IdAssignment_4_2");
					put(grammarAccess.getFreezeAccess().getExAssignment_4_4(), "rule__Freeze__ExAssignment_4_4");
					put(grammarAccess.getFreezeStatementAccess().getNameAssignment_0(), "rule__FreezeStatement__NameAssignment_0");
					put(grammarAccess.getFreezeStatementAccess().getAccessAssignment_1(), "rule__FreezeStatement__AccessAssignment_1");
					put(grammarAccess.getEvalAccess().getNestedAssignment_3(), "rule__Eval__NestedAssignment_3");
					put(grammarAccess.getEvalAccess().getStatementsAssignment_4(), "rule__Eval__StatementsAssignment_4");
					put(grammarAccess.getInterfaceDeclarationAccess().getNameAssignment_1(), "rule__InterfaceDeclaration__NameAssignment_1");
					put(grammarAccess.getInterfaceDeclarationAccess().getExportsAssignment_3(), "rule__InterfaceDeclaration__ExportsAssignment_3");
					put(grammarAccess.getExportAccess().getNamesAssignment_1(), "rule__Export__NamesAssignment_1");
					put(grammarAccess.getExportAccess().getNamesAssignment_2_1(), "rule__Export__NamesAssignment_2_1");
					put(grammarAccess.getImportStmtAccess().getNameAssignment_1(), "rule__ImportStmt__NameAssignment_1");
					put(grammarAccess.getImportStmtAccess().getInterfaceAssignment_2_1(), "rule__ImportStmt__InterfaceAssignment_2_1");
					put(grammarAccess.getImportStmtAccess().getRestrictionAssignment_3_1(), "rule__ImportStmt__RestrictionAssignment_3_1");
					put(grammarAccess.getConflictStmtAccess().getNameAssignment_1(), "rule__ConflictStmt__NameAssignment_1");
					put(grammarAccess.getConflictStmtAccess().getRestrictionAssignment_2_1(), "rule__ConflictStmt__RestrictionAssignment_2_1");
					put(grammarAccess.getVersionStmtAccess().getVersionAssignment_1(), "rule__VersionStmt__VersionAssignment_1");
					put(grammarAccess.getOpDefStatementAccess().getStaticAssignment_1(), "rule__OpDefStatement__StaticAssignment_1");
					put(grammarAccess.getOpDefStatementAccess().getResultAssignment_2(), "rule__OpDefStatement__ResultAssignment_2");
					put(grammarAccess.getOpDefStatementAccess().getIdAssignment_3(), "rule__OpDefStatement__IdAssignment_3");
					put(grammarAccess.getOpDefStatementAccess().getParamAssignment_5(), "rule__OpDefStatement__ParamAssignment_5");
					put(grammarAccess.getOpDefStatementAccess().getImplAssignment_8(), "rule__OpDefStatement__ImplAssignment_8");
					put(grammarAccess.getOpDefParameterListAccess().getListAssignment_1_0(), "rule__OpDefParameterList__ListAssignment_1_0");
					put(grammarAccess.getOpDefParameterListAccess().getListAssignment_1_1_1(), "rule__OpDefParameterList__ListAssignment_1_1_1");
					put(grammarAccess.getOpDefParameterAccess().getTypeAssignment_0(), "rule__OpDefParameter__TypeAssignment_0");
					put(grammarAccess.getOpDefParameterAccess().getIdAssignment_1(), "rule__OpDefParameter__IdAssignment_1");
					put(grammarAccess.getOpDefParameterAccess().getValAssignment_2_1(), "rule__OpDefParameter__ValAssignment_2_1");
					put(grammarAccess.getExpressionStatementAccess().getExprAssignment_0(), "rule__ExpressionStatement__ExprAssignment_0");
					put(grammarAccess.getExpressionAccess().getLetAssignment_0(), "rule__Expression__LetAssignment_0");
					put(grammarAccess.getExpressionAccess().getExprAssignment_1(), "rule__Expression__ExprAssignment_1");
					put(grammarAccess.getExpressionAccess().getCollectionAssignment_2(), "rule__Expression__CollectionAssignment_2");
					put(grammarAccess.getLetExpressionAccess().getTypeAssignment_1(), "rule__LetExpression__TypeAssignment_1");
					put(grammarAccess.getLetExpressionAccess().getNameAssignment_2(), "rule__LetExpression__NameAssignment_2");
					put(grammarAccess.getLetExpressionAccess().getValueExprAssignment_4(), "rule__LetExpression__ValueExprAssignment_4");
					put(grammarAccess.getLetExpressionAccess().getSubExprAssignment_6(), "rule__LetExpression__SubExprAssignment_6");
					put(grammarAccess.getAssignmentExpressionAccess().getLeftAssignment_0(), "rule__AssignmentExpression__LeftAssignment_0");
					put(grammarAccess.getAssignmentExpressionAccess().getRightAssignment_1(), "rule__AssignmentExpression__RightAssignment_1");
					put(grammarAccess.getAssignmentExpressionPartAccess().getOpAssignment_0(), "rule__AssignmentExpressionPart__OpAssignment_0");
					put(grammarAccess.getAssignmentExpressionPartAccess().getExAssignment_1_0(), "rule__AssignmentExpressionPart__ExAssignment_1_0");
					put(grammarAccess.getAssignmentExpressionPartAccess().getCollectionAssignment_1_1(), "rule__AssignmentExpressionPart__CollectionAssignment_1_1");
					put(grammarAccess.getImplicationExpressionAccess().getLeftAssignment_0(), "rule__ImplicationExpression__LeftAssignment_0");
					put(grammarAccess.getImplicationExpressionAccess().getRightAssignment_1(), "rule__ImplicationExpression__RightAssignment_1");
					put(grammarAccess.getImplicationExpressionPartAccess().getOpAssignment_0(), "rule__ImplicationExpressionPart__OpAssignment_0");
					put(grammarAccess.getImplicationExpressionPartAccess().getExAssignment_1(), "rule__ImplicationExpressionPart__ExAssignment_1");
					put(grammarAccess.getLogicalExpressionAccess().getLeftAssignment_0(), "rule__LogicalExpression__LeftAssignment_0");
					put(grammarAccess.getLogicalExpressionAccess().getRightAssignment_1(), "rule__LogicalExpression__RightAssignment_1");
					put(grammarAccess.getLogicalExpressionPartAccess().getOpAssignment_0(), "rule__LogicalExpressionPart__OpAssignment_0");
					put(grammarAccess.getLogicalExpressionPartAccess().getExAssignment_1(), "rule__LogicalExpressionPart__ExAssignment_1");
					put(grammarAccess.getEqualityExpressionAccess().getLeftAssignment_0(), "rule__EqualityExpression__LeftAssignment_0");
					put(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1(), "rule__EqualityExpression__RightAssignment_1");
					put(grammarAccess.getEqualityExpressionPartAccess().getOpAssignment_0(), "rule__EqualityExpressionPart__OpAssignment_0");
					put(grammarAccess.getEqualityExpressionPartAccess().getExAssignment_1_0(), "rule__EqualityExpressionPart__ExAssignment_1_0");
					put(grammarAccess.getEqualityExpressionPartAccess().getCollectionAssignment_1_1(), "rule__EqualityExpressionPart__CollectionAssignment_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getLeftAssignment_0(), "rule__RelationalExpression__LeftAssignment_0");
					put(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1(), "rule__RelationalExpression__RightAssignment_1");
					put(grammarAccess.getRelationalExpressionPartAccess().getOpAssignment_0(), "rule__RelationalExpressionPart__OpAssignment_0");
					put(grammarAccess.getRelationalExpressionPartAccess().getExAssignment_1(), "rule__RelationalExpressionPart__ExAssignment_1");
					put(grammarAccess.getAdditiveExpressionAccess().getLeftAssignment_0(), "rule__AdditiveExpression__LeftAssignment_0");
					put(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1(), "rule__AdditiveExpression__RightAssignment_1");
					put(grammarAccess.getAdditiveExpressionPartAccess().getOpAssignment_0(), "rule__AdditiveExpressionPart__OpAssignment_0");
					put(grammarAccess.getAdditiveExpressionPartAccess().getExAssignment_1(), "rule__AdditiveExpressionPart__ExAssignment_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getLeftAssignment_0(), "rule__MultiplicativeExpression__LeftAssignment_0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1(), "rule__MultiplicativeExpression__RightAssignment_1");
					put(grammarAccess.getMultiplicativeExpressionPartAccess().getOpAssignment_0(), "rule__MultiplicativeExpressionPart__OpAssignment_0");
					put(grammarAccess.getMultiplicativeExpressionPartAccess().getExprAssignment_1(), "rule__MultiplicativeExpressionPart__ExprAssignment_1");
					put(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0(), "rule__UnaryExpression__OpAssignment_0");
					put(grammarAccess.getUnaryExpressionAccess().getExprAssignment_1(), "rule__UnaryExpression__ExprAssignment_1");
					put(grammarAccess.getPostfixExpressionAccess().getCallAssignment_0_0(), "rule__PostfixExpression__CallAssignment_0_0");
					put(grammarAccess.getPostfixExpressionAccess().getFCallsAssignment_0_1(), "rule__PostfixExpression__FCallsAssignment_0_1");
					put(grammarAccess.getPostfixExpressionAccess().getAccessAssignment_0_2(), "rule__PostfixExpression__AccessAssignment_0_2");
					put(grammarAccess.getPostfixExpressionAccess().getLeftAssignment_1(), "rule__PostfixExpression__LeftAssignment_1");
					put(grammarAccess.getCallAccess().getCallAssignment_0_1(), "rule__Call__CallAssignment_0_1");
					put(grammarAccess.getCallAccess().getSetOpAssignment_1_1(), "rule__Call__SetOpAssignment_1_1");
					put(grammarAccess.getCallAccess().getArrayExAssignment_2_1(), "rule__Call__ArrayExAssignment_2_1");
					put(grammarAccess.getFeatureCallAccess().getNameAssignment_0(), "rule__FeatureCall__NameAssignment_0");
					put(grammarAccess.getFeatureCallAccess().getParamAssignment_2(), "rule__FeatureCall__ParamAssignment_2");
					put(grammarAccess.getSetOpAccess().getNameAssignment_0(), "rule__SetOp__NameAssignment_0");
					put(grammarAccess.getSetOpAccess().getDeclAssignment_2(), "rule__SetOp__DeclAssignment_2");
					put(grammarAccess.getSetOpAccess().getDeclExAssignment_3(), "rule__SetOp__DeclExAssignment_3");
					put(grammarAccess.getDeclaratorAccess().getDeclAssignment_0(), "rule__Declarator__DeclAssignment_0");
					put(grammarAccess.getDeclaratorAccess().getDeclAssignment_1_1(), "rule__Declarator__DeclAssignment_1_1");
					put(grammarAccess.getDeclarationAccess().getTypeAssignment_0(), "rule__Declaration__TypeAssignment_0");
					put(grammarAccess.getDeclarationAccess().getIdAssignment_1(), "rule__Declaration__IdAssignment_1");
					put(grammarAccess.getDeclarationAccess().getIdAssignment_2_1(), "rule__Declaration__IdAssignment_2_1");
					put(grammarAccess.getDeclarationAccess().getInitAssignment_3_1(), "rule__Declaration__InitAssignment_3_1");
					put(grammarAccess.getActualParameterListAccess().getParamAssignment_0(), "rule__ActualParameterList__ParamAssignment_0");
					put(grammarAccess.getActualParameterListAccess().getParamAssignment_1_1(), "rule__ActualParameterList__ParamAssignment_1_1");
					put(grammarAccess.getExpressionAccessAccess().getNameAssignment_1(), "rule__ExpressionAccess__NameAssignment_1");
					put(grammarAccess.getExpressionAccessAccess().getCallsAssignment_2(), "rule__ExpressionAccess__CallsAssignment_2");
					put(grammarAccess.getExpressionAccessAccess().getAccessAssignment_3(), "rule__ExpressionAccess__AccessAssignment_3");
					put(grammarAccess.getPrimaryExpressionAccess().getLitAssignment_0_0(), "rule__PrimaryExpression__LitAssignment_0_0");
					put(grammarAccess.getPrimaryExpressionAccess().getExAssignment_0_1_1(), "rule__PrimaryExpression__ExAssignment_0_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getIfExAssignment_0_2(), "rule__PrimaryExpression__IfExAssignment_0_2");
					put(grammarAccess.getPrimaryExpressionAccess().getRefExAssignment_0_3_2(), "rule__PrimaryExpression__RefExAssignment_0_3_2");
					put(grammarAccess.getPrimaryExpressionAccess().getCallsAssignment_1(), "rule__PrimaryExpression__CallsAssignment_1");
					put(grammarAccess.getPrimaryExpressionAccess().getAccessAssignment_2(), "rule__PrimaryExpression__AccessAssignment_2");
					put(grammarAccess.getCollectionInitializerAccess().getTypeAssignment_1(), "rule__CollectionInitializer__TypeAssignment_1");
					put(grammarAccess.getCollectionInitializerAccess().getInitAssignment_3(), "rule__CollectionInitializer__InitAssignment_3");
					put(grammarAccess.getExpressionListOrRangeAccess().getListAssignment_0(), "rule__ExpressionListOrRange__ListAssignment_0");
					put(grammarAccess.getExpressionListOrRangeAccess().getListAssignment_1_1(), "rule__ExpressionListOrRange__ListAssignment_1_1");
					put(grammarAccess.getExpressionListEntryAccess().getNameAssignment_0_0(), "rule__ExpressionListEntry__NameAssignment_0_0");
					put(grammarAccess.getExpressionListEntryAccess().getAttribAssignment_0_1_1(), "rule__ExpressionListEntry__AttribAssignment_0_1_1");
					put(grammarAccess.getExpressionListEntryAccess().getValueAssignment_1_0(), "rule__ExpressionListEntry__ValueAssignment_1_0");
					put(grammarAccess.getExpressionListEntryAccess().getCollectionAssignment_1_1(), "rule__ExpressionListEntry__CollectionAssignment_1_1");
					put(grammarAccess.getLiteralAccess().getValAssignment(), "rule__Literal__ValAssignment");
					put(grammarAccess.getIfExpressionAccess().getIfExAssignment_1(), "rule__IfExpression__IfExAssignment_1");
					put(grammarAccess.getIfExpressionAccess().getThenExAssignment_3(), "rule__IfExpression__ThenExAssignment_3");
					put(grammarAccess.getIfExpressionAccess().getElseExAssignment_5(), "rule__IfExpression__ElseExAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.uni_hildesheim.sse.ui.contentassist.antlr.internal.InternalIvmlParser typedParser = (de.uni_hildesheim.sse.ui.contentassist.antlr.internal.InternalIvmlParser) parser;
			typedParser.entryRuleVariabilityUnit();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public IvmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IvmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
