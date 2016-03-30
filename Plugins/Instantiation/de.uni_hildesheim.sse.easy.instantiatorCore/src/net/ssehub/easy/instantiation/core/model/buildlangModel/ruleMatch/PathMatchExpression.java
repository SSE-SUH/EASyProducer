/*
 * Copyright 2009-2014 University of Hildesheim, Software Systems Engineering
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
package net.ssehub.easy.instantiation.core.model.buildlangModel.ruleMatch;

import net.ssehub.easy.instantiation.core.model.artifactModel.IFileSystemArtifact;
import net.ssehub.easy.instantiation.core.model.artifactModel.Path;
import net.ssehub.easy.instantiation.core.model.common.VilException;
import net.ssehub.easy.instantiation.core.model.expressions.Expression;
import net.ssehub.easy.instantiation.core.model.expressions.IExpressionVisitor;
import net.ssehub.easy.instantiation.core.model.vilTypes.Collection;
import net.ssehub.easy.instantiation.core.model.vilTypes.TypeDescriptor;
import net.ssehub.easy.instantiation.core.model.vilTypes.TypeRegistry;

/**
 * Denotes the special expression regarding a path match.
 * 
 * @author Holger Eichelberger
 */
public class PathMatchExpression extends AbstractPathRuleMatchExpression {

    private Expression pathExpression;
    private transient Path resolved;

    /**
     * Creates a path match expression.
     * 
     * @param expression the path expression
     * @throws VilException in case that the expression is invalid
     */
    public PathMatchExpression(Expression expression) throws VilException {
        if (TypeRegistry.DEFAULT.getType(Path.class) != expression.inferType()) {
            throw new VilException("expression does not evaluate to a path", VilException.ID_SEMANTIC);
        }
        this.pathExpression = expression;
    }
    
    /**
     * Returns the text used for creating the expression.
     * 
     * @return the text
     */
    public Expression getExpression() {
        return pathExpression;
    }
    
    @Override
    public TypeDescriptor<?> getEntryType() {
        return TypeRegistry.DEFAULT.getType(IFileSystemArtifact.class);
    }


    @Override
    protected Object accept(IMatchVisitor visitor) throws VilException {
        return visitor.visitPathMatchExpression(this);
    }

    /**
     * Sets the resolved value of the match expression, in particular in case of mixed expressions.
     * 
     * @param resolved the resolved path
     */
    void resolve(Path resolved) {
        this.resolved = resolved;
    }
    
    /**
     * Returns the resolved expression.
     * 
     * @return the resolved expression
     */
    public Path getResolved() {
        return resolved;
    }

    @Override
    public Collection<?> evaluate(IExpressionVisitor evaluator) throws VilException {
        // requires resolve() before - must return a collection
        Collection<?> result;
        Path path = getResolved();
        if (null != path) {
            result = path.selectAll();    
        } else {
            result = null;
        }
        return result;
    }

}