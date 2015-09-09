package de.uni_hildesheim.sse.easy.java.artifacts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.ArtifactModel;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.IArtifactVisitor;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.representation.Binary;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.representation.Text;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.common.VilException;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.ExpressionEvaluator;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.ArraySet;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.Invisible;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.OperationMeta;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.Set;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.TypeDescriptor;

/**
 * Represents a Java annotation.
 * 
 * @author Holger Eichelberger, Sass
 */
public class JavaMethod extends JavaParentFragmentArtifact {

    private MethodDeclaration methodDeclaration;

    /**
     * Default Constructor.
     * 
     * @param node
     *            The Method Declaration
     * @param parent
     *            the parent fragment
     */
    public JavaMethod(MethodDeclaration node, IJavaParent parent) {
        super(parent);
        this.methodDeclaration = node;
    }

    /**
     * Returns all statements within a method.
     * 
     * @return Set of all statements
     */
    private ArraySet<AbstractJavaStatement> statements() {
        final List<AbstractJavaStatement> list = new ArrayList<AbstractJavaStatement>();
        methodDeclaration.accept(new ASTVisitor() {
            @Override
            public boolean visit(ExpressionStatement node) {
                if (node.getExpression() instanceof MethodInvocation) {
                    MethodInvocation methodInvocation = (MethodInvocation) node.getExpression();
                    visitMethodIn(methodInvocation);
                    String methodName = methodInvocation.getName().toString();
                    if (null != methodInvocation.getExpression()) {
                        ITypeBinding typeBinding = methodInvocation.getExpression().resolveTypeBinding();
                        if (null != typeBinding) {
                            JavaCall javaCall = new JavaCall(node, methodName, typeBinding, JavaMethod.this);
                            list.add(javaCall);
                        }
                    }
                }
                return false;
            }
        });
        return new ArraySet<AbstractJavaStatement>(list.toArray(new JavaCall[list.size()]), JavaCall.class);
    }

    /**
     * Visit the method and resolve the bindings.
     * @param node The method that should be visited.
     * @return true
     */
    public boolean visitMethodIn(MethodInvocation node) {
        resolveMethodBinding(node);
        resolveExpressionType(node.getExpression());
        return true;
    }

    /**
     * Resolves the method binding.
     * @param node the method invocation that should be resolved
     */
    private void resolveMethodBinding(MethodInvocation node) {
        IMethodBinding iMethod = (IMethodBinding) node.resolveMethodBinding();
        if (iMethod != null) {
//            System.out.println("Binding " + iMethod.getName());
            IAnnotationBinding[] annos = iMethod.getAnnotations();
//            for (IAnnotationBinding iAnnotationBinding : annos) {
//                System.out.println("\t" + iAnnotationBinding.getName());
//            }

            // IBinding binding = md.resolveBinding();
            // System.out.println((IMethod)binding.getJavaElement());
            // ICompilationUnit unit = (ICompilationUnit)
            // methodDeclaration.getRoot();
            // if (unit != null) {
            // ASTParser parser = ASTParser.newParser(AST.JLS4);
            // parser.setKind(ASTParser.K_COMPILATION_UNIT);
            // parser.setSource(methodDeclaration.getRoot().toString().toCharArray());
            // parser.setResolveBindings(true);
            // CompilationUnit cu = (CompilationUnit) parser.createAST(null);
            // MethodDeclaration decl = (MethodDeclaration)
            // cu.findDeclaringNode(iMethod.getKey());
            // System.out.println(decl);
            // JavaMethod method = new JavaMethod(decl, JavaMethod.this);
            // }

        }
    }

    /**
     * DELETE?
     * @param expression expression
     */
    private void resolveExpressionType(Expression expression) {
        if (expression != null) {
            ITypeBinding typeBinding = expression.resolveTypeBinding();
            // System.out.println("type: " + typeBinding.getName());
        }
    }

    /**
     * Returns all statements within a method.
     * 
     * @return Set of all statements
     */
    private ArraySet<AbstractJavaStatement> assignments() {
        final List<AbstractJavaStatement> list = new ArrayList<AbstractJavaStatement>();
        methodDeclaration.accept(new ASTVisitor() {
            @Override
            public boolean visit(Assignment node) {
                Expression lhs = node.getLeftHandSide();
                ITypeBinding typeBinding = lhs.resolveTypeBinding();
                Expression rhs = node.getRightHandSide();
                if (rhs instanceof ClassInstanceCreation && node.getParent() instanceof ExpressionStatement) {
                    ExpressionStatement parent = (ExpressionStatement) node.getParent();
                    JavaAssignment assignment = new JavaAssignment(JavaMethod.this, parent, lhs.toString(), typeBinding,
                            (ClassInstanceCreation) rhs);
                    list.add(assignment);
                }
                // TODO SE: (Static) method invocations, e.g. call of another
                // factory are not supported.

                return false;
            }
        });
        return new ArraySet<AbstractJavaStatement>(list.toArray(new JavaAssignment[list.size()]), JavaAssignment.class);
    }

    /**
     * Deletes a statement within a method. Right now only JavaCall can be
     * deleted.
     * 
     * @param evaluator
     *            A wrapper type to pass and evaluate
     * @throws VilException
     *             in case something goes wrong
     */
    public void deleteStatement(ExpressionEvaluator evaluator) throws VilException {
        // Check if type is JavaCall
        TypeDescriptor<?> obj = evaluator.getIteratorVariable().getType();
        ArraySet<AbstractJavaStatement> statements = null;
        if (obj.getTypeClass().isAssignableFrom(JavaCall.class)) {
            statements = statements();
        }
        if (obj.getTypeClass().isAssignableFrom(JavaAssignment.class)) {
            statements = assignments();
        }
        if (null != statements) {
            for (AbstractJavaStatement statement : statements) {
                Object object = evaluator.evaluate(statement);
                if (null != object && object instanceof Boolean && Boolean.TRUE == ((Boolean) object).booleanValue()) {
                    statement.delete();
                    notifyChanged();
                }
            }
        }
    }

    /**
     * Deletes a method and all calls relating to this method.
     * 
     * @throws VilException in case something goes wrong
     */
    public void deleteWithCalls() throws VilException {
        delete();
    }

    @Override
    public void delete() throws VilException {
        methodDeclaration.delete();
        super.delete();
    }

    @Override
    public String getName() throws VilException {
        return methodDeclaration.getName().toString();
    }

    @Override
    public void rename(String name) throws VilException {
        methodDeclaration.setName(methodDeclaration.getAST().newSimpleName(name));
        notifyChanged();
    }

    @Override
    public Text getText() throws VilException {
        return Text.CONSTANT_EMPTY;
    }

    @Override
    public Binary getBinary() throws VilException {
        return Binary.CONSTANT_EMPTY;
    }

    @Override
    public void accept(IArtifactVisitor visitor) {
        visitor.visitFragmentArtifact(this);
    }

    /**
     * Returns the annotations of this method.
     * 
     * @return the annotations
     */
    @SuppressWarnings("unchecked")
    @OperationMeta(returnGenerics = JavaAnnotation.class)
    public Set<JavaAnnotation> annotations() {
        return annotations(methodDeclaration.modifiers());
    }

    /**
     * Getter for the MethodDeclaration of the method.
     * 
     * @return Returns the MethodDeclaration of the method.
     */
    @Invisible
    MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    @Invisible
    @Override
    public String getStringValue(StringComparator comparator) {
        return "method '" + getNameSafe() + "'";
    }

    @Invisible
    @Override
    public ArtifactModel getArtifactModel() {
        return getParent().getArtifactModel();
    }

}
