package eu.qualimaster.families.inf;

import java.io.Serializable;
import eu.qualimaster.base.algorithm.IFamily;
import eu.qualimaster.base.algorithm.IDirectGroupingInfo;

/**
 * Defines the interface for the algorithm family "IRandomFamily" (GEN).
 */
public interface IRandomFamily extends IFamily{

    /**
     * Defines the data input interface for the {@link IIRandomFamilyRandomDataInput} algorithm (over all defined input tuples).
     */
    public static interface IIRandomFamilyRandomDataInput extends Serializable {

        /**
         * Returns the input value for tuple field "randomInteger".
         * @return the tuple value
         */
        public int getRandomInteger();

        /**
         * Changes the output value for tuple field "randomInteger".
         * @param randomInteger the field value
         */
        public void setRandomInteger(int randomInteger);
        /**
         * Returns the input value for tuple field "timestamp".
         * @return the tuple value
         */
        public long getTimestamp();

        /**
         * Changes the output value for tuple field "timestamp".
         * @param timestamp the field value
         */
        public void setTimestamp(long timestamp);
    }

    /**
     * Defines the data output interface for the {@link IIRandomFamilyRandomDataOutput} algorithm (over all defined output tuples).
     */
    public static interface IIRandomFamilyRandomDataOutput extends Serializable, eu.qualimaster.base.algorithm.IOutputItem<IIRandomFamilyRandomDataOutput>, IDirectGroupingInfo {

        /**
         * Returns the input value for tuple field "randomInteger".
         * @return the tuple value
         */
        public int getRandomInteger();

        /**
         * Changes the output value for tuple field "randomInteger".
         * @param randomInteger the field value
         */
        public void setRandomInteger(int randomInteger);
        /**
         * Returns the input value for tuple field "timestamp".
         * @return the tuple value
         */
        public long getTimestamp();

        /**
         * Changes the output value for tuple field "timestamp".
         * @param timestamp the field value
         */
        public void setTimestamp(long timestamp);
    }

    /**
     * Calculates the actual <code>result</code> for <code>input</code>.
     *
     * @param input the algorithm input taken from the input stream
     * @param result the result calculated by the algorithm
     */
    public void calculate(IIRandomFamilyRandomDataInput input, IIRandomFamilyRandomDataOutput randomDataResult);

    /**
     * Sets the algorithm parameter "delay".
     *
     * @param value the new value of the algorithm parameter
     */
    public void setParameterDelay(int value);

    /**
     * Sets the algorithm parameter "flag".
     *
     * @param value the new value of the algorithm parameter
     */
    public void setParameterFlag(boolean value);

    /**
     * Sets the algorithm parameter "windowSize".
     *
     * @param value the new value of the algorithm parameter
     */
    public void setParameterWindowSize(int value);

}
