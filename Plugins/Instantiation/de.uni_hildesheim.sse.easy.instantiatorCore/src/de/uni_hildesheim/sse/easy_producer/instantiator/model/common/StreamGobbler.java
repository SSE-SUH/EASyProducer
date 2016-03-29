package de.uni_hildesheim.sse.easy_producer.instantiator.model.common;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import de.uni_hildesheim.sse.easy_producer.instantiator.Bundle;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.execution.IInstantiatorTracer;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.execution.TracerFactory;
import net.ssehub.easy.basics.logger.EASyLoggerFactory;

/**
 * Implements a stream Gobbler that emits to the {@link TracerFactory#createInstantiatorTracer() instantiator tracer}. 
 * This is a helpful class if output/error streams of system processes shall be emitted to the EASy instantiation 
 * console.
 * 
 * @author Holger Eichelberger
 */
public class StreamGobbler extends Thread {

    private InputStream is;
    private boolean isErrorStream;
    private IMsgManipulator manipulator;

    /**
     * Allows to manipulate messages.
     * 
     * @author Holger Eichelberger
     */
    public interface IMsgManipulator {

        /**
         * Manipulates a message.
         * 
         * @param message the message to be manipulated
         * @return the manipulated message, suppress if <b>null</b>
         */
        public String manipulate(String message);
    }
    
    /**
     * Creates a stream gobbler.
     * 
     * @param is the input stream to be gobbled and emitted
     * @param isErrorStream whether <code>is</code> is an error or an input stream
     */
    public StreamGobbler(InputStream is, boolean isErrorStream) {
        this(is, isErrorStream, null);
    }
    
    /**
     * Creates a stream gobbler.
     * 
     * @param is the input stream to be gobbled and emitted
     * @param isErrorStream whether <code>is</code> is an error or an input stream
     * @param manipulator an optional message manipulator
     */
    public StreamGobbler(InputStream is, boolean isErrorStream, IMsgManipulator manipulator) {
        this.is = is;
        this.isErrorStream = isErrorStream;
        this.manipulator = manipulator;
    }

    /**
     * Creates standard gobblers for the given process.
     * 
     * @param proc the process to gobble
     */
    public static void gobble(Process proc) {
        gobble(proc, null);
    }
    
    /**
     * Creates standard gobblers for the given process.
     * 
     * @param proc the process to gobble
     * @param manipulator an optional message manipulator
     */
    public static void gobble(Process proc, IMsgManipulator manipulator) {
        StreamGobbler errorGobbler = new StreamGobbler(proc.getErrorStream(), true, manipulator);
        errorGobbler.start();
        StreamGobbler outGobbler = new StreamGobbler(proc.getInputStream(), false, manipulator);
        outGobbler.start();
    }

    @Override
    public void run() {
        IInstantiatorTracer tracer = TracerFactory.createInstantiatorTracer();
        try {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                if (null != manipulator) {
                    line = manipulator.manipulate(line);
                }
                if (null != line) {
                    if (isErrorStream) {
                        tracer.traceError(line);
                    } else {
                        tracer.traceMessage(line);
                    }
                }
            }
        } catch (EOFException eof) {
            // ok, terminate
        } catch (IOException ioe) {
            EASyLoggerFactory.INSTANCE.getLogger(StreamGobbler.class, Bundle.ID).exception(ioe);
        }
    }
}
