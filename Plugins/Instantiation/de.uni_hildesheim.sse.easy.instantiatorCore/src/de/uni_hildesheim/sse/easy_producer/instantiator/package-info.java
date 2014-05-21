/**
 * This package contains the core of the VIL type system, the VIL build language object model, 
 * the VIL template language object model and the basis for all instantiators, which can be used in EASy.
 * The realization of VIL relies on some reuse strategies:
 * <ol>
 *  <li>{@link de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes vilTypes package} implements the
 *    extensible VIL type model which consists of basic types, instantiators and the
 *    {@link de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel artifact model}.</li>
 *  <li>{@link de.uni_hildesheim.sse.easy_producer.instantiator.model.expressions expressions package} 
 *    provides the common expression tree model for both VIL languages.</li>
 *  <li>{@link de.uni_hildesheim.sse.easy_producer.instantiator.model.common common package} implements the common
 *    language model elements (already relying on the foundations of the expressions package)</li>
 *  <li>{@link de.uni_hildesheim.sse.easy_producer.instantiator.model.buildlangModel buildlanguage model} implements 
 *    the specific language model elements for the VIL build language (relying on the foundations of the expressions 
 *    and the commons package)</li>
 *  <li>{@link de.uni_hildesheim.sse.easy_producer.instantiator.model.templateModel template language model} implements 
 *    the specific language model elements for the VIL template language (relying on the foundations of the expressions 
 *    and the commons package)</li>
 * </ol>
 * 
 * 
 */
package de.uni_hildesheim.sse.easy_producer.instantiator;