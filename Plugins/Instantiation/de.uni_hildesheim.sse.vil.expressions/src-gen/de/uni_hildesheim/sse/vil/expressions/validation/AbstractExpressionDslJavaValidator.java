/*
* generated by Xtext
*/
package de.uni_hildesheim.sse.vil.expressions.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractExpressionDslJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.uni_hildesheim.sse.vil.expressions.expressionDsl.ExpressionDslPackage.eINSTANCE);
		return result;
	}

}
