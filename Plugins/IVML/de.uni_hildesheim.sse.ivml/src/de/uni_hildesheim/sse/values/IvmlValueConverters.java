package de.uni_hildesheim.sse.values;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractIDValueConverter;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.ssehub.easy.dslCore.values.VersionValueConverter;

/**
 * Factory for the value converters.
 * 
 * @author Holger Eichelberger
 */
@Singleton
public class IvmlValueConverters extends
        AbstractDeclarativeValueConverterService {

    @Inject
    private AbstractIDValueConverter idValueConverter;

    @Inject
    private STRINGValueConverter stringValueConverter;

    @Inject
    private VersionValueConverter versionValueConverter;

    // identifier removed due to overlap with version in restriction expressions

    // checkstyle: stop method name check
    
    // do not change the method names in here - dynamic dispatch
    // due to terminal names in the grammar
    
    /**
     * Returns the value converter for IDs.
     * 
     * @return the value converter for IDs.
     */
    @ValueConverter(rule = "ID")
    public IValueConverter<String> ID() {
        return idValueConverter;
    }

    /**
     * Returns the value converter for strings.
     * 
     * @return the value converter for strings.
     */
    @ValueConverter(rule = "STRING")
    public IValueConverter<String> STRING() {
        return stringValueConverter;
    }

    /**
     * Returns the value converter for version numbers.
     * 
     * @return the value converter for version numbers.
     */
    @ValueConverter(rule = "VERSION")
    public IValueConverter<String> VERSION() {
        return versionValueConverter;
    }
    
    // identifier removed due to overlap with version in restriction expressions

    // checkstyle: resume method name check
}
