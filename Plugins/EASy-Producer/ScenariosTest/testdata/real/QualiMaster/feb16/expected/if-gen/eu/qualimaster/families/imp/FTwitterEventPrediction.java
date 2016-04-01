package eu.qualimaster.families.imp;

import eu.qualimaster.families.inf.*;
import eu.qualimaster.observables.IObservable;
import eu.qualimaster.dataManagement.serialization.SerializerRegistry;

/**
 * The implementation for the algorithm family "IFTwitterEventPrediction" (GEN).
 */
public class FTwitterEventPrediction implements IFTwitterEventPrediction {

    /**
     * Provides a default implementation of the data input for the {@link IFTwitterEventPredictionAnalysisInput} algorithm.
     * Actual execution system code may also directly wrap the respective tuple concept.
     */
    public static class IFTwitterEventPredictionAnalysisInput implements IIFTwitterEventPredictionAnalysisInput {

        private Object status;

        @Override
        public Object getStatus(){
            return status;
        }

        @Override
        public void setStatus(Object status){
            this.status = status;
        }
        static {
            SerializerRegistry.register("IFTwitterEventPredictionAnalysisInput", FTwitterEventPredictionSerializers.IFTwitterEventPredictionAnalysisInputSerializer.class);
        }
    }

    /**
     * Provides a default implementation of the data output for the {@link IFTwitterEventPredictionAnalysisOutput} algorithm.
     * Actual execution system code may also directly wrap the respective tuple concept.
     */
    public static class IFTwitterEventPredictionAnalysisOutput extends eu.qualimaster.base.algorithm.AbstractOutputItem<IIFTwitterEventPredictionAnalysisOutput> implements IIFTwitterEventPredictionAnalysisOutput {

        /**
         * Creates the item.
         */
        public IFTwitterEventPredictionAnalysisOutput() {
            this(true);
        }

        /**
         * Creates a sub-item.
         *
         * @param topLevel whether it is a top-level item
         */
        private IFTwitterEventPredictionAnalysisOutput(boolean topLevel) {
            super(topLevel);
            setParent(this);
        }

        @Override
        protected IFTwitterEventPredictionAnalysisOutput createItem() {
            return new IFTwitterEventPredictionAnalysisOutput(false);
        }
        private java.util.List<eu.qualimaster.families.datatypes.events.IFEvent> events;
        private java.util.List<eu.qualimaster.families.datatypes.events.IFEvent> symbols;
        private eu.qualimaster.families.datatypes.common.IFTimeInterval timeInterval;

        @Override
        public java.util.List<eu.qualimaster.families.datatypes.events.IFEvent> getEvents(){
            return events;
        }

        @Override
        public void setEvents(java.util.List<eu.qualimaster.families.datatypes.events.IFEvent> events){
            this.events = events;
        }
        @Override
        public java.util.List<eu.qualimaster.families.datatypes.events.IFEvent> getSymbols(){
            return symbols;
        }

        @Override
        public void setSymbols(java.util.List<eu.qualimaster.families.datatypes.events.IFEvent> symbols){
            this.symbols = symbols;
        }
        @Override
        public eu.qualimaster.families.datatypes.common.IFTimeInterval getTimeInterval(){
            return timeInterval;
        }

        @Override
        public void setTimeInterval(eu.qualimaster.families.datatypes.common.IFTimeInterval timeInterval){
            this.timeInterval = timeInterval;
        }
        static {
            SerializerRegistry.register("IFTwitterEventPredictionAnalysisOutput", FTwitterEventPredictionSerializers.IFTwitterEventPredictionAnalysisOutputSerializer.class);
        }
    }

    /**
     * Calculates the actual <code>result</code> for <code>input</code>.
     *
     * @param input the algorithm input taken from the input stream
     * @param result the result calculated by the algorithm
     */
    @Override
    public void calculate(IIFTwitterEventPredictionAnalysisInput input, IIFTwitterEventPredictionAnalysisOutput result){
    }


    /**
     * Sets the algorithm parameter "timeSeriesGranularity".
     *
     * @param value the new value of the algorithm parameter
     */
    public void setParameterTimeSeriesGranularity(int value) {
    }

    @Override
    public void switchState(State arg0) {
    }

    @Override
    public Double getMeasurement(IObservable arg0) {
	    return null;
    }
}
