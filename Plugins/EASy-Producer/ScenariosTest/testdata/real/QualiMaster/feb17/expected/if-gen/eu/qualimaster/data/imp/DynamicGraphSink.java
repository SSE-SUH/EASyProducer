package eu.qualimaster.data.imp;

import eu.qualimaster.data.inf.IDynamicGraphSink;
import eu.qualimaster.data.inf.IDynamicGraphSink.*;
import eu.qualimaster.dataManagement.strategies.*;
import eu.qualimaster.observables.*;
import eu.qualimaster.dataManagement.serialization.SerializerRegistry;

/**
* Define the data source class(GEN).
**/
public class DynamicGraphSink implements IDynamicGraphSink{

    /**
    * Define the source data input interface.
    **/
    public static class DynamicGraphSinkHubStreamInput implements IDynamicGraphSinkHubStreamInput {
        private String hubList;
        /**
        * Returns the input value for tuple field "hubList".
        * @return the tuple value
        */
        @Override
        public String getHubList() {
            return hubList;
        }

        /**
        * Sets the output value for tuple field "hubList".
        * @param hubList the field value
        */
        @Override
        public void setHubList(String hubList) {
            this.hubList = hubList;
        }
        static {
            SerializerRegistry.register("DynamicGraphSinkHubStreamInput", DynamicGraphSinkSerializers.DynamicGraphSinkHubStreamInputSerializer.class);
        }
    }


    /**
    * Posts a specific type of data sink.
    * @param data the sink data DynamicGraphSinkHubStreamInput
    **/
    @Override
    public void postDataHubStream(IDynamicGraphSinkHubStreamInput data) {
    }

    /**
    * Emits tuple along with a ticket.
    * @param ticket the ticket to identify the responses for application
    * @param tuple the tuple IDynamicGraphSinkHubStreamInput to be emitted 
    **/
    public void emit(int ticket, IDynamicGraphSinkHubStreamInput tuple) {
    }

    @Override
    public void connect() {}

    @Override
    public void disconnect(){}

    @Override
    public void setStrategy(IStorageStrategyDescriptor strategy) {}

    @Override
    public IStorageStrategyDescriptor getStrategy() { return NoStorageStrategyDescriptor.INSTANCE;}

    @Override
    public Double getMeasurement(IObservable observable) { return null;}
}
