package net.ssehub.easy.instantiation.serializer.xml;

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;
import com.sun.management.HotSpotDiagnosticMXBean;

/**
 * Use this the dump heap snapshots to analyze with <a href="http://wiki.eclipse.org/index.php/MemoryAnalyzer">Eclipse
 * Memory Analyzer</a>. Code obtained from <a
 * href="https://blogs.oracle.com/sundararajan/entry/programmatically_dumping_heap_from_java">here</a>
 * 
 * @author Sass
 * 
 */
public class HeapDumper {

    // This is the name of the HotSpot Diagnostic MBean
    private static final String HOTSPOT_BEAN_NAME = "com.sun.management:type=HotSpotDiagnostic";

    // field to store the hotspot diagnostic MBean
    private static volatile HotSpotDiagnosticMXBean hotspotMBean;

    /**
     * Call this method from your application whenever you want to dump the heap snapshot into a file.
     * 
     * @param fileName
     *            name of the heap dump file
     * @param live
     *            flag that tells whether to dump only the live objects
     */
    static void dumpHeap(String fileName, boolean live) {
        // initialize hotspot diagnostic MBean
        initHotspotMBean();
        try {
            hotspotMBean.dumpHeap(fileName, live);
        } catch (RuntimeException re) {
            throw re;
        } catch (Exception exp) {
            throw new RuntimeException(exp);
        }
    }

    // initialize the hotspot diagnostic MBean field
    private static void initHotspotMBean() {
        if (hotspotMBean == null) {
            synchronized (HeapDumper.class) {
                if (hotspotMBean == null) {
                    hotspotMBean = getHotspotMBean();
                }
            }
        }
    }

    // get the hotspot diagnostic MBean from the
    // platform MBean server
    private static HotSpotDiagnosticMXBean getHotspotMBean() {
        try {
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            HotSpotDiagnosticMXBean bean = ManagementFactory.newPlatformMXBeanProxy(server, HOTSPOT_BEAN_NAME,
                    HotSpotDiagnosticMXBean.class);
            return bean;
        } catch (RuntimeException re) {
            throw re;
        } catch (Exception exp) {
            throw new RuntimeException(exp);
        }
    }

    public static void main(String[] args) {
        // default heap dump file name
        String fileName = "heap.bin";
        // by default dump only the live objects
        boolean live = true;

        // simple command line options
        switch (args.length) {
        case 2:
            live = args[1].equals("true");
        case 1:
            fileName = args[0];
        }
        // dump the heap
        dumpHeap(fileName, live);
    }
}