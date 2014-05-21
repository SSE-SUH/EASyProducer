package de.uni_hildesheim.sse.easy_producer.instantiator.model.buildlangModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.uni_hildesheim.sse.easy_producer.instantiator.model.buildlangModel.Rule.Side;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.buildlangModel.ruleMatch.AbstractRuleMatchExpression;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.buildlangModel.ruleMatch.MatchFactory;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.Expression;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions.ExpressionException;

/**
 * Defines the complex parts of a rule. Instances of this class are just for
 * creating rules. More or less direct access to the attributes is ok for this class.
 * 
 * @author Holger Eichelberger
 */
public class RuleDescriptor {
    
    public static final String MATCH_VAR_POSTFIX = "MATCH";
    
    private AbstractRuleMatchExpression[] lhsRuleMatches;
    private RuleCallExpression[] lhsRuleCalls;
    private AbstractRuleMatchExpression[] rhsRuleMatches;
    private RuleCallExpression[] rhsRuleCalls;
    private VariableDeclaration[] parameters;
    private IRuleElement[] body;
    private VariableDeclaration[] lhsVariables;
    private VariableDeclaration[] rhsVariables;
    private VariableDeclaration[] lhsMatchVariables;
    private VariableDeclaration[] rhsMatchVariables;

    /**
     * Creates an empty descriptor.
     */
    public RuleDescriptor() {
    }

    /**
     * Creates a rule descriptor carrying the complex parts of a rule (here for an empty rule).
     * 
     * @param parameters the parameters of this rule (may be <b>null</b>)
     */
    public RuleDescriptor(VariableDeclaration[] parameters) {
        this.parameters = parameters;
    }
    
    /**
     * Defines the rule conditions on the given side. Rule calls and rule condition expressions
     * are separated in here. 
     * 
     * @param side the side to return the calls for (LHS, RHS)
     * @param conditions the conditions (may be <b>null</b> if there are none)
     * @throws RuleDescriptorException in case that the given expressions cannot be applied (in the given sequence)
     */
    public void setRuleExpressions(Side side, List<Expression> conditions) throws RuleDescriptorException {
        AbstractRuleMatchExpression[] matches = null;
        RuleCallExpression[] calls = null;
        if (null != conditions) {
            List<AbstractRuleMatchExpression> matchTmp = new ArrayList<AbstractRuleMatchExpression>();
            List<RuleCallExpression> callsTmp = new ArrayList<RuleCallExpression>();
            for (int c = 0; c < conditions.size(); c++) {
                Expression expr = conditions.get(c);
                try {
                    AbstractRuleMatchExpression matchExpr = MatchFactory.INSTANCE.create(expr);
                    if (null != matchExpr) {
                        matchTmp.add(matchExpr);
                        if (!callsTmp.isEmpty()) {
                            throw new RuleDescriptorException("conditions must not be mixed with calls", c);
                        }
                    } else if (expr instanceof RuleCallExpression) {
                        callsTmp.add((RuleCallExpression) expr);
                        // can only be added at the end
                    } else {
                        throw new RuleDescriptorException("unrecongnized expression of type " 
                            + expr.inferType().getVilName(), c);
                    }
                } catch (ExpressionException e) {
                    throw new RuleDescriptorException(e, c);
                }
            }
            if (!matchTmp.isEmpty()) {
                matches = new AbstractRuleMatchExpression[matchTmp.size()];
                matchTmp.toArray(matches);
            }
            if (!callsTmp.isEmpty()) {
                calls = new RuleCallExpression[callsTmp.size()];
                callsTmp.toArray(calls);
            }
        }
        if (Side.LHS == side) {
            lhsRuleMatches = matches;
            lhsRuleCalls = calls;
        } else {
            rhsRuleMatches = matches;
            rhsRuleCalls = calls;
        }
    }

    /**
     * Returns the rule match conditions on the specified side.
     * 
     * @param side the side to return the calls for (LHS, RHS)
     * @return the rule match conditions (may be <b>null</b>)
     */
    public AbstractRuleMatchExpression[] getRuleMatches(Side side) {
        AbstractRuleMatchExpression[] result;
        if (Side.LHS == side) {
            result = lhsRuleMatches;
        } else {
            result = rhsRuleMatches;
        }
        return result;
    }
    
    /**
     * Returns the number of match expressions on the specified side.
     * 
     * @param side the side to return the calls for (LHS, RHS)
     * 
     * @return the number of match expressions
     */
    public int getRuleMatchCount(Side side) {
        AbstractRuleMatchExpression[] calls = getRuleMatches(side);
        return null == calls ? 0 : calls.length;
    }

    /**
     * Returns the rule calls on the specified side.
     * 
     * @param side the side to return the calls for (LHS, RHS)
     * 
     * @return the rule calls (may be <b>null</b>)
     */
    public RuleCallExpression[] getRuleCalls(Side side) {
        RuleCallExpression[] result;
        if (Side.LHS == side) {
            result = lhsRuleCalls;
        } else {
            result = rhsRuleCalls;
        }
        return result;
    }

    /**
     * Returns the number of rule calls on the specified side.
     * 
     * @param side the side to return the calls for (LHS, RHS)
     * 
     * @return the number of rule calls
     */
    public int getRuleCallCount(Side side) {
        RuleCallExpression[] calls = getRuleCalls(side);
        return null == calls ? 0 : calls.length;
    }
    
    /**
     * Changes the body. 
     * 
     * @param body the body
     */
    public void setBody(IRuleElement[] body) {
        this.body = body;
    }

    /**
     * Returns the body.
     * 
     * @return the body (may be <b>null</b>)
     */
    public IRuleElement[] getBody() {
        return body;
    }
    
    /**
     * Changes the parameters. 
     * 
     * @param parameters the parameters
     */
    public void setParameters(VariableDeclaration[] parameters) {
        this.parameters = parameters;
    }
    
    /**
     * Returns the parameters.
     * 
     * @return the parameters (may be <b>null</b>)
     */
    public VariableDeclaration[] getParameters() {
        return parameters;
    }

    /**
     * Registers the LHS variable in <code>resolver</code> if applicable.
     * 
     * @param resolver the resolver instance
     * @throws ExpressionException in case that resolving one of the expressions fails
     */
    public void registerVariables(Resolver resolver) throws ExpressionException {
        Map<String, Integer> known = new HashMap<String, Integer>();
        registerVariables(Side.LHS, resolver, known);
        registerVariables(Side.RHS, resolver, known);
    }
    
    /**
     * Registers the variables in <code>resolver</code> if applicable.
     * 
     * @param side the side to register variables for (LHS, RHS)
     * @param resolver the resolver instance
     * @param names a mapping of names and a related counter how often the variable name (without number) has been used
     *    so far in this rule head
     * @throws ExpressionException in case that resolving one of the expressions fails
     */
    private void registerVariables(Side side, Resolver resolver, Map<String, Integer> names) 
        throws ExpressionException {
        VariableDeclaration[] result;
        VariableDeclaration[] matchResult;
        String predefined;
        if (Side.LHS == side) {
            predefined = "LHS";
        } else {
            predefined = "RHS";
        }
        List<VariableDeclaration> vars = null;
        List<VariableDeclaration> matchVars = null; // match vars only in front if needed
        AbstractRuleMatchExpression[] matches = getRuleMatches(side);
        if (null != matches) {
            vars = new ArrayList<VariableDeclaration>();
            if (Side.RHS == side) {
                matchVars = new ArrayList<VariableDeclaration>();
            }
            for (int m = 0; m < matches.length; m++) {
                String name = predefined;
                if (m > 0) {
                    name += m;
                }
                // register the match expression itself (for instantiators which work e.g. with path matches)
                if (Side.RHS == side) {
                    VariableDeclaration matchDecl 
                        = new VariableDeclaration(name + MATCH_VAR_POSTFIX, matches[m].inferType());
                    matchVars.add(matchDecl);
                    resolver.add(matchDecl);
                }
                // register the iterator expression
                VariableDeclaration varDecl = new VariableDeclaration(name, matches[m].getEntryType());
                vars.add(varDecl);
                resolver.add(varDecl);
            }
        }
        RuleCallExpression[] calls = getRuleCalls(side);
        if (null != calls) {
            if (null == vars) {
                vars = new ArrayList<VariableDeclaration>();    
            }
            for (int c = 0; c < calls.length; c++) {
                RuleCallExpression call = calls[c];
                String name = call.getName();
                if (!names.containsKey(name)) {
                    names.put(name, 1);
                } else {
                    int count = names.get(name) + 1;
                    names.put(name, count);
                    name += count;
                }
                VariableDeclaration varDecl = new VariableDeclaration(name, call.inferType());
                vars.add(varDecl);
                resolver.add(varDecl);
            }            
        }
        result = toArray(vars);
        matchResult = toArray(matchVars);
        if (Side.LHS == side) {
            lhsVariables = result;
            //lhsMatchVariables = matchResult;
        } else {
            rhsVariables = result;
            rhsMatchVariables = matchResult;
        }
    }
    
    /**
     * Turns a list of variable declarations into an array and considers <b>null</b> as input.
     * 
     * @param vars the list of variables to be turned into an array
     * @return the array, <b>null</b> if the input is empty or <b>null</b>
     */
    private static VariableDeclaration[] toArray(List<VariableDeclaration> vars) {
        VariableDeclaration[] result;
        if (null != vars && !vars.isEmpty()) {
            result = new VariableDeclaration[vars.size()];
            vars.toArray(result);
        } else {
            result = null;
        }
        return result;
    }
    
    /**
     * Returns the variables on the given side.
     * 
     * @param side the side to return the variables for (LHS, RHS)
     * @return the LHS variables or <b>null</b> if there is none
     */
    public VariableDeclaration[] getVariables(Side side) {
        VariableDeclaration[] result;
        if (Side.LHS == side) {
            result = lhsVariables;
        } else {
            result = rhsVariables;
        }
        return result;
    }

    /**
     * Returns the match variables on the given side.
     * 
     * @param side the side to return the match variables for (LHS, RHS)
     * @return the LHS variables or <b>null</b> if there is none
     */
    public VariableDeclaration[] getMatchVariables(Side side) {
        VariableDeclaration[] result;
        if (Side.LHS == side) {
            result = lhsMatchVariables;
        } else {
            result = rhsMatchVariables;
        }
        return result;
    }
 
}