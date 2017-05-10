/*
 * Copyright 2009-2016 University of Hildesheim, Software Systems Engineering
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.uni_hildesheim.sse.vil.templatelang.ui.hyperlinking;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.resource.XtextResource;

import de.uni_hildesheim.sse.vil.expressions.ui.hyperlinking.AbstractEcoreModelQuery;
import de.uni_hildesheim.sse.vil.templatelang.templateLang.LanguageUnit;
import de.uni_hildesheim.sse.vil.templatelang.templateLang.Stmt;
import de.uni_hildesheim.sse.vil.templatelang.templateLang.VilDef;
import net.ssehub.easy.dslCore.ui.editors.CommonXtextEditor;
import net.ssehub.easy.instantiation.core.model.common.ILanguageElement;
import net.ssehub.easy.instantiation.core.model.templateModel.Def;
import net.ssehub.easy.instantiation.core.model.templateModel.Template;
import net.ssehub.easy.instantiation.core.model.templateModel.TypeDef;
import net.ssehub.easy.instantiation.core.model.templateModel.VariableDeclaration;

public class VtlEcoreModelQuery extends AbstractEcoreModelQuery<LanguageUnit, ILanguageElement> {

    @Override
    public String getName(LanguageUnit project) {
        return project.getName();
    }

    @Override
    public LanguageUnit getProject(ICompositeNode rootNode) {
        LanguageUnit result = null;
        if (rootNode != null && rootNode.getSemanticElement() != null 
            && rootNode.getSemanticElement() instanceof LanguageUnit) {
            result = (LanguageUnit) rootNode.getSemanticElement();
        }
        return result;
    }

    @Override
    public EObject getEcoreElement(CommonXtextEditor<?, LanguageUnit> editor, ILanguageElement declaration) {
        EObject desiredElement = null;
        if (editor != null && null != declaration) {
            XtextResource editorResource = getXtextResource(editor);
            LanguageUnit unit = getLanguageUnit(editorResource);
            if (unit != null) {
                // TODO consider parameters!
                if (declaration instanceof VariableDeclaration && declaration.getParent() instanceof Template) {
                    desiredElement = findVariableDeclaration(unit.getVars(), (VariableDeclaration) declaration);
                }
                if (null == desiredElement && declaration instanceof TypeDef 
                    && declaration.getParent() instanceof Template) {
                    desiredElement = findTypedef(unit.getTypeDefs(), (TypeDef) declaration);
                }
                if (null == desiredElement) {
                    desiredElement = findInDefs(unit, declaration);
                }
            }
        }
        return desiredElement;
    }

    /**
     * Tries finding <code>element</code> in the defs of <code>unit</code>.
     * 
     * @param defs the unit to search
     * @param element the element to search for
     * @return the found EObject or <b>null</b>
     */
    private EObject findInDefs(LanguageUnit unit, ILanguageElement element) {
        EObject result = null;
        if (element instanceof Def && element.getParent() instanceof Template) {
            String name = ((Def) element).getName();
            List<VilDef> defs = unit.getDefs();
            for (int d = 0; null == result && d < defs.size(); d++) {
                if (name.equals(defs.get(d).getId())) {
                    result = defs.get(d);
                }
            }
        }
        if (element instanceof VariableDeclaration && !(element.getParent() instanceof Template)) {
            List<VilDef> defs = unit.getDefs();
            int level = 0;
            ILanguageElement iter = element.getParent();
            while (null != iter && !(iter instanceof VilDef)) {
                iter = iter.getParent();
                level++;
            }
            for (int d = 0; null == result && d < defs.size(); d++) {
                result = findInStmts(defs.get(d).getStmts().getStmts(), element, level);
            }
        }
        return result;
    }

    /**
     * Tries finding <code>element</code> in <code>stmts</code>.
     * 
     * @param stmts the statements to search
     * @param element the element to search for
     * @param level the actual nesting level starting with the one of <code>element</code>, if greater 0 recurse to the 
     *   next levels
     * @return the found EObject or <b>null</b> if there is none
     */
    private EObject findInStmts(List<Stmt> stmts, ILanguageElement element, int level) {
        EObject result = null;
        if (null != stmts) {
            for (int s = 0; null == result && s < stmts.size(); s++) {
                result = findInStmt(stmts.get(s), element, level); // same level!
            }
        }
        return result;
    }

    /**
     * Tries finding <code>element</code> in <code>stmt</code>.
     * 
     * @param stmts the statements to search
     * @param element the element to search for
     * @param level the actual nesting level starting with the one of <code>element</code>, if greater 0 recurse to the 
     *   next levels
     * @return the found EObject or <b>null</b> if there is none
     */
    private EObject findInStmt(Stmt stmt, ILanguageElement element, int level) {
        EObject result = null;
        if (null != stmt) {
            if (0 == level) {
                if (null != stmt.getVar() && element instanceof VariableDeclaration) {
                    if (((VariableDeclaration) element).getName().equals(stmt.getVar().getName())) {
                        result = stmt.getVar();
                    }
                }
            } else {
                int nextLevel = level - 1;
                if (null != stmt.getAlt()) {
                    result = findInStmt(stmt.getAlt().getIf(), element, nextLevel);
                    if (null == result) {
                        result = findInStmt(stmt.getAlt().getElse(), element, nextLevel);
                    }
                } else if (null != stmt.getBlock()) {
                    result = findInStmts(stmt.getBlock().getStmts(), element, nextLevel);
                } else if (null != stmt.getLoop()) {
                    result = findInStmt(stmt.getLoop().getStmt(), element, nextLevel);
                } else if (null != stmt.getSwitch()) {
                    // only expressions in here
                } else if (null != stmt.getWhile()) {
                    result = findInStmt(stmt.getWhile().getStmt(), element, nextLevel);
                }
            }
        }
        return result;
    }

    /**
     * Returns the {@link LanguageUnit} in the given resource (VTL-file).
     * 
     * @param resource the {@link XtextResource} from which the {@link LanguageUnit} should be retrieved
     * @return the {@link LanguageUnit} in the given resource. May return <code>null</code> if the
     * given resource is <code>null</code>, cannot be parsed, or there is no {@link LanguageUnit} in that file
     */
    protected LanguageUnit getLanguageUnit(XtextResource resource) {
        LanguageUnit unit = null;
        ICompositeNode rootNode = getRootNode(resource);
        if (rootNode != null) {
            EObject rootObject = rootNode.getSemanticElement();
            if (rootObject != null && rootObject instanceof LanguageUnit) {              
                unit = (LanguageUnit) rootObject;
            }
        }
        return unit;
    }

}