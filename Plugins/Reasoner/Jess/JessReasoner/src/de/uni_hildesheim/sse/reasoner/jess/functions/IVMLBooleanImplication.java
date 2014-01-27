package de.uni_hildesheim.sse.reasoner.jess.functions;

import jess.Context;
import jess.JessException;
import jess.RU;
import jess.Userfunction;
import jess.Value;
import jess.ValueVector;
/**
 * This is custom made Jess function for boolean implies, i.e. boolean a implies boolean b. 
 * There is no direct method in Jess.
 * @author Phani
 *
 */
public class IVMLBooleanImplication implements Userfunction {

    @Override
    public Value call(ValueVector vv, Context context) throws JessException {
        
        String a = vv.get(1).symbolValue(context);
        String b = vv.get(2).symbolValue(context);
        String result = "";
        if (a.equals("TRUE") && b.equals("FALSE")) {
            result = "FALSE";
        } else {
            result = "TRUE";
        }
       
        return new Value(result, RU.SYMBOL);
    }

    @Override
    public String getName() {
        return "IVMLBooleanImplication";
    }

}
