package de.uni_hildesheim.sse.vil.rt.ui.hyperlinking;

import de.uni_hildesheim.sse.vil.rt.rtVil.LanguageUnit;
import net.ssehub.easy.dslCore.ui.hyperlinking.GenericHyperlinkHelper;

/**
 * This class enables the creation of hyperlinks for any
 * VIL-element in an VIL-file if the user selects such an element either via
 * pressing the "F3"-key or by clicking on that element while pressing the
 * "CTRL"-key.
 * 
 * @author Holger Eichelberger
 */
public class RtVilHyperlinkHelper extends GenericHyperlinkHelper<LanguageUnit> {

    /**
     * Creates an instance of this {@link RtVilHyperlinkHelper}.
     */
    public RtVilHyperlinkHelper() {
        super(RtVilHyperlinkFactory.MODEL_QUERY_INSTANCE, RtVilHyperlinkFactory.INSTANCE);
    }

}
