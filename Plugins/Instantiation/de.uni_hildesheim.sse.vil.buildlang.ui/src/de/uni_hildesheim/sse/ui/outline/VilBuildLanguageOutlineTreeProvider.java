/*
 * generated by Xtext
 */
package de.uni_hildesheim.sse.ui.outline;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;

import com.google.inject.Inject;

import de.uni_hildesheim.sse.vil.buildlang.ui.resources.Images;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Advice;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Import;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.Parameter;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.VariableDeclaration;
import de.uni_hildesheim.sse.vil.expressions.expressionDsl.VersionStmt;
import de.uni_hildesheim.sse.vil.expressions.translation.Utils;
import de.uni_hildesheim.sse.vilBuildLanguage.ImplementationUnit;
import de.uni_hildesheim.sse.vilBuildLanguage.LanguageUnit;
import de.uni_hildesheim.sse.vilBuildLanguage.LoadProperties;
import de.uni_hildesheim.sse.vilBuildLanguage.RuleDeclaration;
import de.uni_hildesheim.sse.vilBuildLanguage.VilBuildLanguagePackage;

/**
 * customization of the default outline structure.
 * 
 * @author Dernek
 */
public class VilBuildLanguageOutlineTreeProvider extends DefaultOutlineTreeProvider {

    @Inject
    private IImageHelper imageHelper;

    /**
     * Creates the children for the ImplementationUnit.
     * 
     * @param parentNode
     *            parentNode
     * @param unit
     *            Create children for unit-object
     */
    protected void _createChildren(DocumentRootNode parentNode, ImplementationUnit unit) {
        if (unit != null && unit.getScripts() != null && !unit.getScripts().isEmpty()) {
            for (LanguageUnit script : unit.getScripts()) {
                // List vilScript
                if (script != null) {
                    createScriptNodes(script, parentNode);
                }
            }
        }
    }

    /**
     * creates a node for every Advice-Statement.
     * 
     * @param adviceList
     *            List with all Advices
     * @param parentNode
     *            parentnode
     */
    private void createAdviceNodes(EList<Advice> adviceList, VirtualOutlineNode parentNode) {
        for (Advice advice : adviceList) {
            if (checkAdviceName(advice)) {
                StyledString displayString = new StyledString();
                displayString.append("" + advice.getName().getPrefix().getQname().get(0));
                if (advice.getName().getPrefix().getQname().size() > 1) {
                    displayString.append(", ...");
                }
                displayString.append(" : Advice", StyledString.QUALIFIER_STYLER);
                createEStructuralFeatureNode(parentNode, (EObject) advice, ExpressionDslPackage.Literals.ADVICE__NAME,
                        imageHelper.getImage(Images.NAME_ADVICE), displayString, true);
            }
        }
    }

    /**
     * creates a node for the vilScript.
     * 
     * @param script
     *            the vilScript
     * @param parentNode
     *            parentnode
     */
    private void createScriptNodes(LanguageUnit script, DocumentRootNode parentNode) {
        VirtualOutlineNode vilNode = null;
        StyledString displayString = new StyledString();
        if (checkScriptParent(script)) {
            if (script.getName() != null && !script.getName().isEmpty()) {
                String parentName = script.getParent().getName();
                // vilScript Name with parent
                displayString.append("" + script.getName());
                displayString.append(" extends " + parentName);
                // create virtualNode for vilScript
                vilNode = new VirtualOutlineNode(parentNode, imageHelper.getImage(Images.NAME_VILSCRIPT),
                        displayString, false);
            }
        } else {
            if (script.getName() != null && !script.getName().isEmpty()) {
                // vilScript Name without parent
                displayString.append("" + script.getName());
                // create virtualNode for vilScript
                vilNode = new VirtualOutlineNode(parentNode, imageHelper.getImage(Images.NAME_VILSCRIPT),
                        displayString, false);
            }
        }
        if (vilNode != null) {
            // create Nodes for Advices
            if (!isEmpty(script.getAdvices())) {
                createAdviceNodes(script.getAdvices(), vilNode);
            }
            // create VirtualNode for vilParameters
            if (script.getParam() != null && !isEmpty(script.getParam().getParam())) {
                VirtualOutlineNode virtualParamNode = new VirtualOutlineNode(vilNode,
                        imageHelper.getImage(Images.NAME_PARAMLIST), "Parameters", false);
                createParametersNodes(script.getParam().getParam(), virtualParamNode);
            }
            // create versionNode
            if (script.getVersion() != null) {
                createVersionNode(script.getVersion(), vilNode);
            }
            // create ImportNodes
            if (!isEmpty(script.getImports())) {
                createImportNodes(script.getImports(), vilNode);
            }
            // create PropertyNodes
            if (!isEmpty(script.getLoadProperties())) {
                createPropertyNodes(script.getLoadProperties(), vilNode);
            }
            // ScriptContents
            if (script.getContents() != null && !isEmpty(script.getContents().getElements())) {
                // create VirtualNode for ScriptContent
                StyledString scriptContentsString = new StyledString();
                scriptContentsString.append("Script Contents", StyledString.QUALIFIER_STYLER);
                VirtualOutlineNode scriptContentNode = new VirtualOutlineNode(vilNode,
                        imageHelper.getImage(Images.NAME_SCRIPTCONTENT), scriptContentsString, false);
                createScriptContentNodes(script.getContents().getElements(), scriptContentNode);
            }
        }
    }

    /**
     * Creates the version node.
     * 
     * @param version
     *            version
     * @param parentNode
     *            version will be displayed under this node
     */
    private void createVersionNode(VersionStmt version, IOutlineNode parentNode) {
        if (version.getVersion() != null) {
            createEStructuralFeatureNode(parentNode, version, ExpressionDslPackage.Literals.VERSION_STMT__VERSION,
                    imageHelper.getImage(Images.NAME_VERSION), "v" + version.getVersion(), true);
        }
    }

    /**
     * Creates the Nodes for the parameters.
     * 
     * @param paramList
     *            List with the parameters
     * @param parentNode
     *            all parameters will be displayed under this node
     */
    private void createParametersNodes(EList<Parameter> paramList, VirtualOutlineNode parentNode) {
        for (Parameter param : paramList) {
            if (checkParameter(param)) {
                StyledString displayString = new StyledString();
                displayString.append("" + param.getName());
                displayString.append(" : " + param.getType().getName(), StyledString.QUALIFIER_STYLER);
                createEStructuralFeatureNode(parentNode, param, ExpressionDslPackage.Literals.PARAMETER__NAME,
                        imageHelper.getImage(Images.NAME_PARAM), displayString, true);
            }
        }
    }

    /**
     * Creates the nodes for the properties.
     * 
     * @param propList
     *            List with all properties
     * @param parentNode
     *            all properties will be displayed under this node
     */
    private void createPropertyNodes(EList<LoadProperties> propList, VirtualOutlineNode parentNode) {
        for (LoadProperties prop : propList) {
            if (prop.getPath() != null && !prop.getPath().isEmpty()) {
                StyledString displayString = new StyledString();
                displayString.append(prop.getPath());
                displayString.append(" : property", StyledString.QUALIFIER_STYLER);
                createEStructuralFeatureNode(parentNode, prop, VilBuildLanguagePackage.Literals.LOAD_PROPERTIES__PATH,
                        imageHelper.getImage(Images.NAME_PROP), displayString, true);
            }
        }
    }

    /**
     * Creates the nodes for the imports.
     * 
     * @param importList
     *            List with all imports
     * @param parentNode
     *            all imports will be displayed under this node
     */
    private void createImportNodes(EList<Import> importList, VirtualOutlineNode parentNode) {
        for (Import importvar : importList) {
            if (importvar.getName() != null && !importvar.getName().isEmpty()) {
                StyledString displayString = new StyledString();
                displayString.append("" + importvar.getName());
                displayString.append(" : import", StyledString.QUALIFIER_STYLER);
                createEStructuralFeatureNode(parentNode, importvar, ExpressionDslPackage.Literals.IMPORT__NAME,
                        imageHelper.getImage(Images.NAME_IMPORT), displayString, true);
            }
        }
    }

    /**
     * Creates the RuleDeclarations and the VariableDeclarations.
     * 
     * @param content
     *            ScriptContents
     * @param parentNode
     *            all Rules and Variables will be displayed under this node
     */
    private void createScriptContentNodes(EList<EObject> content, VirtualOutlineNode parentNode) {
        // RuleDeclarations
        for (EObject rule : content) {
            try {
                RuleDeclaration ruleCast = (RuleDeclaration) rule;
                if (checkRuleDeclaration(ruleCast)) {
                    StyledString displayString = new StyledString();
                    displayString.append("" + ruleCast.getName());
                    displayString.append(" : Rule", StyledString.QUALIFIER_STYLER);
                    createEStructuralFeatureNode(parentNode, ruleCast,
                            VilBuildLanguagePackage.Literals.RULE_DECLARATION__NAME,
                            imageHelper.getImage(Images.NAME_RULE_INSTANCE), displayString, true);
                }
            } catch (ClassCastException e) {
                // Do nothing
            }
        }
        // VariableDeclarations
        for (EObject var : content) {
            try {
                VariableDeclaration varCast = (VariableDeclaration) var;
                if (checkVariableDeclaration(varCast)) {
                    StyledString displayString = new StyledString();
                    displayString.append("" + varCast.getName());
                    displayString.append(" : " + varCast.getType().getName(), StyledString.QUALIFIER_STYLER);
                    createEStructuralFeatureNode(parentNode, varCast,
                            VilBuildLanguagePackage.Literals.RULE_DECLARATION__NAME,
                            imageHelper.getImage(Images.NAME_VARIABLEDECLARATION), displayString, true);
                }
            } catch (ClassCastException e) {
                // Do nothing
            }
        }
    }

    /**
     * Returns the value if the script is a leaf or not.
     * 
     * @param script
     * @return true, if the script is leaf.
     */
    public boolean _isLeaf(LanguageUnit script) {
        return true;
    }

    /**
     * Check whether a given EList is <b>null</b> or empty.
     * 
     * @param list
     *            The list to be checked.
     * @return <b>True</b> if the list is <b>null</b> or has no elements. <b>False</b> otherwise.
     */
    private static boolean isEmpty(EList<?> list) {
        return null == list || list.isEmpty();
    }

    /**
     * Checks whether a given script is not <b>null</b> and has a name.
     * 
     * @param script
     *            the script to be checked
     * @return <b>True</b> if the script is not <b>null</b> and has a name. <b>False</b> otherwise.
     */
    private boolean checkScriptParent(LanguageUnit script) {
        return script.getParent() != null && script.getParent().getName() != null
                && !script.getParent().getName().isEmpty();
    }

    /**
     * Checks whether a given advice is not <b>null</b> and has a name.
     * 
     * @param advice
     *            the advice to be checked
     * @return <b>True</b> if the advice is not <b>null</b> and has a name. <b>False</b> otherwise.
     */
    private boolean checkAdviceName(Advice advice) {
        return advice != null && advice.getName() != null && advice.getName().getPrefix() != null
                && advice.getName().getPrefix().getQname() != null && !isEmpty(advice.getName().getPrefix().getQname());
    }

    /**
     * Checks whether a given parameter is not <b>null</b>, has a name and a type (name).
     * 
     * @param param
     *            the parameter to be checked.
     * @return <b>True</b> if the parameter is completely defined. <b>False</b> otherwise.
     */
    private boolean checkParameter(Parameter param) {
        return param != null && param.getName() != null && !param.getName().isEmpty() && param.getType() != null
                && param.getType().getName() != null && !Utils.isEmpty(param.getType().getName());
    }

    /**
     * Checks whether a given rule declaration is not <b>null</b> and has a name.
     * 
     * @param ruleDecl
     *            the rule declaration to be checked.
     * @return <b>True</b> if the rule declaration is not <b>null</b> and has a name. <b>False</b> otherwise.
     */
    private boolean checkRuleDeclaration(RuleDeclaration ruleDecl) {
        return ruleDecl != null && ruleDecl.getName() != null && !ruleDecl.getName().isEmpty();
    }

    /**
     * Checks whether a given variable declaration is not <b>null</b>, has a name and a type (name).
     * 
     * @param varDecl
     *            the variable declaration to be checked
     * @return <b>True</b> if the variable declaration is completely defined. <b>False</b> otherwise.
     */
    private boolean checkVariableDeclaration(VariableDeclaration varDecl) {
        return varDecl != null && varDecl.getName() != null && !varDecl.getName().isEmpty()
                && varDecl.getType() != null && varDecl.getType().getName() != null
                && !Utils.isEmpty(varDecl.getType().getName());
    }
}
