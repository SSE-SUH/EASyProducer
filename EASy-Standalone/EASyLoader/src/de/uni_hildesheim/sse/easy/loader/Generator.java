package de.uni_hildesheim.sse.easy.loader;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;

import de.uni_hildesheim.sse.easy.loader.framework.BundleException;
import de.uni_hildesheim.sse.easy.loader.framework.BundleInfo;
import de.uni_hildesheim.sse.easy.loader.framework.BundleRegistry;
import de.uni_hildesheim.sse.easy.loader.framework.EasyDependency;
import de.uni_hildesheim.sse.easy.loader.framework.FakeBundle;
import de.uni_hildesheim.sse.easy.loader.framework.FakeBundleContext;
import de.uni_hildesheim.sse.easy.loader.framework.FakeComponentContext;
import de.uni_hildesheim.sse.easy.loader.framework.Feature;
import de.uni_hildesheim.sse.easy.loader.framework.Log;
import de.uni_hildesheim.sse.easy.loader.framework.Options;
import de.uni_hildesheim.sse.easy.loader.framework.Utils;

/**
 * Provides generator factilities for static loading.
 * 
 * @author Holger Eichelberger
 * @author Patrik Pastuschek
 */
public class Generator extends AbstractLoader {
    
    private static final Class<?>[] RUNTIME_CLASSES;
    private List<BundleInfo> data;
    private List<URL> urls;
    private Map<URL, BundleInfo> urlBundleMapping = new HashMap<URL, BundleInfo>();
    private List<BundleInfo> checkedBundles;
    private List<String> checkedClasspaths = new ArrayList<String>();
    private boolean aspectJProcessed;

    static {
        Options.setConsiderLoadedClasses(false);
        initializeRegistry();
        List<Class<?>> rtCls = new ArrayList<Class<?>>();
        addRuntimeClass(ListLoader.class, rtCls);
        addRuntimeClass(Log.class, rtCls);
        addRuntimeClass(Utils.class, rtCls);
        addRuntimeClass(BundleException.class, rtCls);
        addRuntimeClass(FakeBundle.class, rtCls);
        addRuntimeClass(FakeBundleContext.class, rtCls);
        addRuntimeClass(FakeComponentContext.class, rtCls);
        Class<?>[] tmp = new Class<?>[rtCls.size()];
        rtCls.toArray(tmp);
        RUNTIME_CLASSES = tmp;
    }
    
    /**
     * Creates the generator instance.
     * 
     * @param base the base folder
     */
    protected Generator(File base) {
        super(base);
        bootstrap();
        aspectJProcessed = false;
        
        List<BundleInfo> roots = BundleRegistry.getInstance().getRootBundles();
        
        urls = new ArrayList<URL>();
        data = new ArrayList<BundleInfo>();
        Set<BundleInfo> done = new HashSet<BundleInfo>();
        Utils.sortByContainment(roots);
        for (BundleInfo info : roots) {
            collectBootstrapData(info, urls, data, done, TAG_EASY);                    
        }
        File libsDir = new File(base, "libs");
        File[] libs = libsDir.listFiles();
        if (null != libs) {
            for (File lib : libs) {
                try {
                    urls.add(lib.toURI().toURL());
                } catch (MalformedURLException e) {
                    Log.warn("malformed URL", e);
                }
            }
        }
    }
    
    /**
     * Returns all files that are called feature.xml, even in subfolders.
     * @param file The basefile.
     * @return A list of all files.
     */
    public static List<File> getFeatureFilesFromDir(File file) {
    
        List<File> files = new ArrayList<File>();
    
        String[] sub = file.list();
    
        if (null != sub) {
            for (String name : sub) {
    
                File subFile = new File(file.getAbsolutePath() + "\\" + name);
                if (subFile.isDirectory()) {
                    files.addAll(getFeatureFilesFromDir(subFile));
                } else if (subFile.isFile() && subFile.getName().equalsIgnoreCase("feature.xml")) {
                    files.add(subFile);
                }
    
            }
        }

        return files;
    
    }
    
    /**
     * Transforms a list of files into a list of Features.
     * @param files A list of the files to use.
     * @return A list of features. Can be empty if no (valid) files were given.
     */
    public static List<Feature> filesToFeature(List<File> files) {
    
        List<Feature> features = new ArrayList<Feature>();
    
        for (int i = 0; i < files.size(); i++) {
        
            Feature feat = new Feature(files.get(i));
            features.add(feat);
        
        }
        
        return features;
        
    }
    
    /**
     * Returns (if possible) the feature with given symbolic name.
     * @param features A list of features from which to extract.
     * @param name The symbolic name of the feature.
     * @return The feature (or null).
     */
    public static Feature getFeatureFromListByName(List<Feature> features, String name) {
    
        Feature found = null;
    
        for (int i = 0; i < features.size(); i++) {
            if (features.get(i).getId().equals(name)) {
                found = features.get(i);
                i = features.size();
            }
        }
    
        return found;
    
    }
    
    /**
     * Wrapps the generation into one single method for easier access.
     * @param mainFeature The file or path where the main feature(s) are.
     * @param allFeatures The file or path where other features are.
     * @param forceBuild False will interrupt the build if problem occur.
     * @return The list of generated Bundles.
     */
    public static List<BundleInfo> autoGenerate(List<File> mainFeature, List<File> allFeatures, boolean forceBuild) {
    
        List<BundleInfo> bundles = new ArrayList<BundleInfo>();
    
        List<File> mainFeatFiles = new ArrayList<File>();
        List<File> allFeatureFiles = new ArrayList<File>();
        for (File file : mainFeature) {
            mainFeatFiles.addAll(getFeatureFilesFromDir(file));
        }
        List<Feature> mainFeat = filesToFeature(mainFeatFiles);
     
        for (File file: allFeatures) {
            allFeatureFiles.addAll(getFeatureFilesFromDir(file));
        }
        List<Feature> allFeat = filesToFeature(allFeatureFiles);
        
        bundles = generate(mainFeat, allFeat, forceBuild);
        
        return bundles;
    
    }
    
    /**
     * Gathers Bundles for a list of features, depending on version restrictions.
     * @param features A list of features for the build.
     * @param forceBuild if true, ignore missing plugins and version issues.
     * @param additionalFeatures A list of features that could be used by the main features.
     * @return List<BundleInfo> a list containing all needed Bundles.
     */
    public static List<BundleInfo> generate(
        List<Feature> features, List<Feature> additionalFeatures, boolean forceBuild) { 
        Generator gen = new Generator(new File("."));
        boolean failed = false;     
        gen.checkedClasspaths = new ArrayList<String>();    
        System.out.println("Generating...");
        System.out.println("ForceBuild = " + forceBuild);    
        List<BundleInfo> bundles = new ArrayList<BundleInfo>();
        Map<String, EasyDependency> dependencies = new HashMap<String, EasyDependency>();     
        dependencies = collectDependencies(features, additionalFeatures);      
        Object[] keys = dependencies.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            BundleInfo bundle = BundleRegistry.getInstance().get(dependencies.get(keys[i]).getBundleSymbolicName(), 
                    dependencies.get(keys[i]));
            if (bundle != null && !bundles.contains(bundle)) {
                bundles.add(bundle);
            } else {
                String error = "ERROR - missing BundleInfo for the following Plugin: " 
                        + dependencies.get(keys[i]).getBundleSymbolicName() + " [" 
                        + dependencies.get(keys[i]).getBundleVersionMin();
                if (null != dependencies.get(keys[i]).getBundleVersionMax()) {
                    error += ";" + dependencies.get(keys[i]).getBundleVersionMax();
                }
                error += "]";
                System.out.println(error);
                if (forceBuild) {
                    dependencies.get(keys[i]).setBundleVersionMin(null);
                    dependencies.get(keys[i]).setBundleVersionMax(null);
                    bundle = BundleRegistry.getInstance().get(dependencies.get(keys[i]).getBundleSymbolicName(), 
                        dependencies.get(keys[i]));
                    if (bundle != null) {
                        bundles.add(bundle);
                        System.out.println("    Plugin compensated with: " + bundle.getName() + " " 
                            + bundle.getVersion());
                    }
                } else {
                    failed = true;
                }
            }
        }              
        subGenerate(bundles);      
        for (BundleInfo test : bundles) {
            System.out.println(test.getName() + " " + test.getVersion());
            for (int i = 0; i < test.getClasspathEntryCount(); i++) {
                gen.checkedClasspaths.add(test.getClasspathEntry(i));
                System.out.println("# " + test.getName() + " WANTS " + test.getClasspathEntry(i));
            }
        }       
        List<String> solved = new ArrayList<String>();
        for (String path : gen.checkedClasspaths) {      
            boolean doubled = false;
            for (BundleInfo test: bundles) {
                if (path.contains(test.getName())) {
                    doubled = true;
                }
            }
            if (!solved.contains(path) && !doubled) {
                solved.add(path);
            }      
        }       
        gen.checkedClasspaths = solved;        
        gen.checkedBundles = new ArrayList<BundleInfo>();
        gen.checkedBundles = bundles;      
        if (!failed) {
            gen.generateJarFiles(new File("newGenerator/bundles/"), true);
            gen.generateJarFiles(new File("newGenerator/unbundled/"), false);
        } else {
            System.out.println("BUILD FAILED! Please consider a forced build.");
        }
        return bundles;     
    }
    
    /**
     * .
     * @param bundles .
     */
    private static void subGenerate(List<BundleInfo> bundles) {
        boolean changed = false;
        for (int i = 0; i < bundles.size(); i++) {
            for (int k = 0; k < bundles.get(i).getRequiredBundlesCount(); k++) {
                boolean found = false;
                BundleInfo toAdd = null;
                for (BundleInfo check : bundles) {
                    if (check.getName().equalsIgnoreCase(bundles.get(i).getRequiredBundle(k).getName())) {
                        
                        found = true;
                        
                        if (bundles.get(i).getRequiredBundle(k).getVersion() != null 
                                && check.getVersion() != null ) {
                            if (check.getVersion().compareTo(bundles.get(i).getRequiredBundle(k).getVersion()) == -1) {
                                bundles.remove(check);
                                EasyDependency vs = new EasyDependency();
                                vs.setBundleVersionMin(bundles.get(i).getRequiredBundle(k).getVersion());
                                BundleInfo nB = BundleRegistry.getInstance().get(
                                    bundles.get(i).getRequiredBundle(k).getName(), vs);
                                toAdd = nB;
                            }
                        } 
                        
                    } 
                }
                
                if (!found) {
                    BundleInfo nB = BundleRegistry.getInstance().get(
                            bundles.get(i).getRequiredBundle(k).getName(), new EasyDependency());
                    toAdd = nB;
                }
                
                if (null != toAdd) {
                    bundles.add(toAdd);
                    changed = true;
                } else if (!found) {
                    System.err.println("MISSING " + bundles.get(i).getRequiredBundle(k).getName());
                }

            }
        }
        if (changed) {
            subGenerate(bundles);
        }
    }
    
    /**
     * Collects all required features.
     * @param features A list of features.
     * @param additionalFeatures A list of additional Features that maybe required by the main features.
     * @return Map<String, EasyDependency> a map with all required dependencies.
     */
    private static List<Feature> collectFeatures(List<Feature> features, List<Feature> additionalFeatures) {
        List<Feature> result = features;
        
        for (int i = 0; i < features.size(); i++) {
            
            for (int j = 0; j < features.get(i).getRequirements().size(); j++) {

                Feature feat = getFeatureFromListByName(
                    additionalFeatures, features.get(i).getRequirements().get(j).getBundleSymbolicName());
                if (!result.contains(feat)) {
                    result.add(feat);
                }
                List<Feature> newFeat = new ArrayList<Feature>();
                List<Feature> result2 = new ArrayList<Feature>();
                newFeat.add(feat);
                result2.addAll(collectFeatures(newFeat, additionalFeatures));
                
                for (int k = 0; k < result2.size(); k++) {
                    if (!result.contains(result2.get(k))) {
                        result.add(result2.get(k));
                    }
                }
                
                System.err.println(feat.getId() + " CAME FROM: " + features.get(i).getId());
            }
            
        }
        
        return result;
    }
    
    /**
     * Collects all required dependencies for a list of features.
     * @param features A list of features.
     * @param additionalFeatures A list of additional Features that maybe required by the main features.
     * @return Map<String, EasyDependency> a map with all required dependencies.
     */
    private static Map<String, EasyDependency> collectDependencies(
        List<Feature> features, List<Feature> additionalFeatures) {
        
        Map<String, EasyDependency> dependencies = new HashMap<String, EasyDependency>();
        
        List<Feature> allFeatures = collectFeatures(features, additionalFeatures);
        
        for (int i = 0; i < allFeatures.size(); i++) {
            
            Map<String, EasyDependency> featureDependencies = allFeatures.get(i).getDependencies();
            Object[] keys = featureDependencies.keySet().toArray();
    
            for (int j = 0; j < keys.length; j++) {
                
                if (dependencies.containsKey(keys[j])) {
    
                    dependencies.get(keys[j]).mergeVersions(featureDependencies.get(keys[j]));
    
                } else {  
                    dependencies.put((String) keys[j], featureDependencies.get(keys[j])); 
                }
    
            }
        }
        
        return dependencies;
    }
    
    /**
     * Adds a runtime class for being packed with the generated jars.
     * 
     * @param cls the class to be packed (including nested classes)
     * @param rtClasses the classes to be loaded (modified as a side effect)
     */
    private static void addRuntimeClass(Class<?> cls, List<Class<?>> rtClasses) {
        rtClasses.add(cls);
        Class<?>[] inner = cls.getDeclaredClasses();
        if (null != inner) {
            for (Class<?> innerCls : inner) {
                rtClasses.add(innerCls);
            }
        }
    }
    
    /**
     * Executes the generator.
     * 
     * @param args ignored
     */
    public static void main(String[] args) {
        File base = new File(".");
        Generator generator = new Generator(new File("."));
        generator.generateJarFiles(new File(base, "dist"), true);
        generator.generateJarFiles(new File(base, "dist-unbundled"), false);
    }
    
    /**
     * Helper class for carrying unbundling information. To be used incrementally on each classpath URL.
     *  
     * @author Holger Eichelberger
     */
    private class UnbundleInfo {
        
        private File target;
        private String name;
        private boolean eclipsePart;
        private BundleInfo bundle;
        
        /**
         * Create an instance for bundling (not unbundling).
         */
        UnbundleInfo() {
        }
        
        /**
         * Crates an instance for unbundling to <code>target</code>.
         * 
         * @param target the target folder
         */
        UnbundleInfo(File target) {
            this.target = target;
        }
        
        /**
         * Sets the target name just as given.
         * 
         * @param name the target name
         */
        void setName(String name) {
            this.name = name;
        }
        
        /**
         * Sets the target name from the name of the <code>url</code>.
         * 
         * @param url the url to take the name from
         */
        void setName(URL url) {
            String tmp = url.toString();
            int pos = tmp.lastIndexOf('/');
            if (pos > 0) {
                name = tmp.substring(pos + 1);
            } else {
                name = "tmp.tmp";
            }
        }
        
        /**
         * Returns the target name.
         * 
         * @return the name
         */
        String getName() {
            return name;
        }
        
        /**
         * Defines the bundle information.
         * 
         * @param bundle the bundle information
         */
        void setBundleInfo(BundleInfo bundle) {
            this.bundle = bundle;
        }
        
        /**
         * Indicates that the denoted element belongs to eclipse (not to easy).
         * 
         * @param eclipsePart whether it belongs to eclipse
         */
        void setEclipsePart(boolean eclipsePart) {
            this.eclipsePart = eclipsePart;
        }
        
        /**
         * The target as file including location (based on the folder given during initialization).
         * 
         * @return the targer
         */
        File getTarget() {
            return new File(target, name);
        }
        
        /**
         * Returns whether the denoted element is a bundle.
         * 
         * @return <code>true</code> if it is a bundle, <code>false</code> else
         */
        boolean isBundle() {
            return null != bundle;
        }
        
        /**
         * Returns whether the denoted element is an eclipse part.
         * 
         * @return <code>true</code> if it is an eclipse part, <code>false</code> else
         */
        boolean isEclipsePart() {
            return eclipsePart;
        }
        
        /**
         * Returns whether this info is enabled (unbundling) or disabled (bundling).
         * 
         * @return <code>true</code> for unbundling, <code>false</code> for bundling
         */
        boolean enabled() {
            return null != target;
        }
        
    }
    
    /**
     * Generates the JAR files for static loading.
     * 
     * @param targetDir the target dire where to put the final jar files to
     * @param bundle whether libraries shall be bundled or not
     */
    protected void generateJarFiles(File targetDir, boolean bundle) {
        List<BundleInfo> backup = new ArrayList<BundleInfo>();
        UnbundleInfo unbundle = bundle ? new UnbundleInfo() : new UnbundleInfo(targetDir);
        targetDir.mkdirs();
        Log.info("generating Jar files into " + targetDir.getPath());
        File easyJarFile = new File(targetDir, "easy-headless.jar");
        File eclipseJarFile = new File(targetDir, "eclipse-part.jar");
        List<URL> deferList = new ArrayList<URL>();
        JarOutputStream easyJar = null;
        JarOutputStream eclipseJar = null;
        try {
            easyJar = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(easyJarFile)));
            if (unbundle.enabled()) {
                eclipseJar = null;
            } else {
                eclipseJar = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(eclipseJarFile)));
            }
            URLProcessor processor = new URLProcessor(unbundle, easyJar, eclipseJar);
            for (URL url : urls) {
                
                boolean classpath = false;  
                for (String classP : this.checkedClasspaths) {
                    if (url.toString().contains(classP)) {
                        classpath = true;
                    }
                }      
                boolean fitsConditions = false;
                if (this.checkedBundles == null
                        || this.checkedBundles.contains(this.urlBundleMapping.get(url))
                        || url.toString().contains("org.eclipse.osgi")
                        || url.toString().contains("javax.inject")) {
                    fitsConditions = true;
                }
                
                if (classpath 
                        || fitsConditions) {
                    //|| url.getPath().contains("/eclipse/")) { //|| url.getPath().contains("/libs/")
                    backup.add(this.urlBundleMapping.get(url));
                    if (checkedBundles != null) {
                        this.checkedBundles.remove(this.urlBundleMapping.get(url));
                    }
                    if (processor.processURL(url, true)) {
                        deferList.add(url);
                    }
                } 
            }
            if (this.checkedBundles != null) {
                System.out.println("***************************     " + backup.size());
                this.checkedBundles.addAll(backup);
            }            
            for (URL url : deferList) {
                processor.processURL(url, false);
            }
            Utils.closeQuietly(eclipseJar);
            Log.info("adding startup spec to " + easyJarFile);
            produceStartupList(easyJar);
            Log.info("adding loader classes to " + easyJarFile);
            addRuntimeLoaderClasses(easyJar);
            easyJar.close();
        } catch (IOException e) {
            Log.warn("I/O problem while generating Jars", e);
            Utils.closeQuietly(easyJar);
            Utils.closeQuietly(eclipseJar);
        }
        /*System.out.println("### ### Missing: " + this.checkedBundles.size());
        for (BundleInfo miss : checkedBundles) {
            System.out.println("      miss: " + miss.getName() + " " + miss.getVersion());
        }*/

    }

    /**
     * Processes URLs for packing and bundling.
     * 
     * @author Holger Eichelberger
     */
    private class URLProcessor {

        private Set<String> classpathEntries = new HashSet<String>();
        private Set<String> done = new HashSet<String>();
        private UnbundleInfo unbundle;
        private JarOutputStream easyJar;
        private JarOutputStream eclipseJar;

        /**
         * Creates an URL processor.
         * 
         * @param unbundle the unbundle information instance
         * @param easyJar the EASy jar stream
         * @param eclipseJar the Eclipse jar stream
         */
        URLProcessor(UnbundleInfo unbundle, JarOutputStream easyJar, JarOutputStream eclipseJar) {
            this.unbundle = unbundle;
            this.easyJar = easyJar;
            this.eclipseJar = eclipseJar;
        }
        
        /**
         * Processes the given <code>url</code>.
         * 
         * @param url the URL to be processed
         * @param defer in case of problematic libs, defer them (whether more recent clases
         *   have been packed in) or process hem
         * @return if the given URL shall be deferred
         * @throws IOException in case of I/O problems
         */
        boolean processURL(URL url, boolean defer) throws IOException {
            boolean deferred = false;
            String path = url.getPath();
            BundleInfo info = urlBundleMapping.get(url);
            classpathEntries.clear();
            unbundle.setBundleInfo(info);
            unbundle.setEclipsePart(path.contains("/eclipse/") || path.contains("/libs/"));
            unbundle.setName(url);
            if (defer && unbundle.getName().startsWith("ecj-")) { // special case - included
                deferred = true;
            }
            if (!deferred && null != info) {
                for (int c = 0; c < info.getClasspathEntryCount(); c++) {
                    String cpe = info.getClasspathEntry(c);
                    classpathEntries.add(cpe);
                    // specific rule for drools2!
                    if (cpe.startsWith("lib/slf4j") && !done.contains("libs/slf4j-simple-1.6.4.jar")) {
                        File file = new File("libs/slf4j-simple-1.6.4.jar");
                        unbundle.setName(file.getName());
                        unbundle.setBundleInfo(null); // this is not a bundle
                        InputStream is = new FileInputStream(file);
                        handleJar(is, easyJar, done, new HashSet<String>(), unbundle);
                        is.close();
                    }
                }
            }
            if (!deferred) {
                InputStream is = url.openStream();
                Log.info(" - processing " + path);
                if (unbundle.isEclipsePart()) {
                    handleJar(is, eclipseJar, done, classpathEntries, unbundle);
                } else {
                    handleJar(is, easyJar, done, classpathEntries, unbundle);
                }
                is.close();
            }
            return deferred;
        }
        
    }
    
    /**
     * Copies the entries of an entire JAR in <code>is</code> to the target JAR in <code>os</code> without
     * duplicating entries. Considers {@link #irrelevantInJar(String)} in order to filter out irrelevant
     * entries.
     * 
     * @param is the input JAR as stream
     * @param os the output JAR as stream
     * @param done already processed entries to avoid duplicates
     * @param exclude JAR entries not to be added (in addition to {@link #irrelevantInJar(String)})
     * @param unbundle information about unbunding the current stream <code>is</code>
     * @throws IOException in case that reading from or writing to a JAR stream fails
     */
    private void handleJar(InputStream is, JarOutputStream os, Set<String> done, Set<String> exclude, 
        UnbundleInfo unbundle) throws IOException {
        boolean copy;
        boolean include = false;
        if (unbundle.enabled()) {
            copy = unbundle.isEclipsePart() || !unbundle.isBundle(); // remainder shall be from EASy
            if ("aspectjrt.jar".equals(unbundle.getName()) && !aspectJProcessed) {
                include = true; // special case for aspect library
                aspectJProcessed = true;
            }
        } else {
            copy = false;
        }
        if (include) {
            JarEntry osEntry = new JarEntry(unbundle.getName());
            os.putNextEntry(osEntry);
            Utils.copy(is, os);
            os.closeEntry();
        } else if (copy) {
            FileOutputStream fos = new FileOutputStream(unbundle.getTarget());
            Utils.copy(is, fos);
            fos.close();
        } else {
            JarEntry isEntry = null;
            JarInputStream jis = new JarInputStream(is);
            do {
                isEntry = jis.getNextJarEntry();
                if (null != isEntry) {
                    String name = isEntry.getName();
                    String key = name.toLowerCase();
                    if (!done.contains(key) && !irrelevantInJar(name) && !exclude.contains(name)) {
                        done.add(key);
                        JarEntry osEntry = new JarEntry(name);
                        os.putNextEntry(osEntry);
                        Utils.copy(jis, os);
                        os.closeEntry();
                    }
                }
            } while (null != isEntry);
        }
    }
    
    /**
     * Produces the JAR entry containing the EASy startup list to be read and interpreted at loading time.
     * 
     * @param os the output stream
     * @throws IOException in case of problems writing to <code>os</code>
     */
    private void produceStartupList(JarOutputStream os) throws IOException {
        List<BundleInfo> processed = new ArrayList<BundleInfo>(); 
        List<String> processedDS = new ArrayList<String>();
        JarEntry listEntry = new JarEntry(ListLoader.EASY_STARTUP_FILE_NAME);
        os.putNextEntry(listEntry);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(os));
        for (BundleInfo info : data) {
            System.err.println(info);
            if (null != info.getActivatorClassName()) {
                
                if (this.checkedBundles != null) {
                    for (int i = 0; i < this.checkedBundles.size(); i++) {   
                        if (this.checkedBundles.get(i) != null
                                && !processed.contains(this.checkedBundles.get(i))
                                && this.checkedBundles.get(i).getActivatorClassName() != null
                                && info.getActivatorClassName().contains(
                                    this.checkedBundles.get(i).getActivatorClassName())) {
                            out.print(ListLoader.InitType.ACTIVATOR.name());
                            out.print(":");
                            out.println(info.getActivatorClassName());
                            processed.add(this.checkedBundles.get(i));
                        }
                    }          
                } else {
                    out.print(ListLoader.InitType.ACTIVATOR.name());
                    out.print(":");
                    out.println(info.getActivatorClassName());
                }

            }
            
            for (int i = 0; i < this.checkedBundles.size(); i++) {
                
                if (this.checkedBundles.get(i) != null) {
                    
                    for (int j = 0; j < this.checkedBundles.get(i).getDsClassesCount(); j++) {
                        
                        for (int c = 0; c < info.getDsClassesCount(); c++) {
                            
                            if (!processedDS.contains(info.getDsClass(c))
                                    && info.getDsClass(c).equals(this.checkedBundles.get(i).getDsClass(c))) {
                                out.print(ListLoader.InitType.DS.name());
                                out.print(":");
                                out.println(info.getDsClass(c));
                                processedDS.add(info.getDsClass(c));
                            }
        
                        }
                    
                    }
                    
                }
                
            }

        }
        out.flush();
        os.closeEntry();
    }
    
    /**
     * Adds the classes needed for runtime loading to <code>os</code>.
     * 
     * @param os the JAR output stream
     * @throws IOException in case that reading the class file or writing to <code>os</code> fails
     */
    private void addRuntimeLoaderClasses(JarOutputStream os) throws IOException {
        for (Class<?> rtClass : RUNTIME_CLASSES) {
            String name = rtClass.getName().replace('.', '/') + Utils.CLASS_SUFFIX;
            File file = new File(getBase(), "bin/" + name);
            if (file.exists()) {
                FileInputStream is = null;
                try {
                    JarEntry entry = new JarEntry(name);
                    os.putNextEntry(entry);
                    is = new FileInputStream(file);
                    Utils.copy(is, os);
                    os.closeEntry();
                    Utils.closeQuietly(is);
                } catch (IOException e) {
                    Utils.closeQuietly(is);
                    throw e;
                }
            } else {
                Log.warn("Class file " + name + "does not exist. Generation incomplete.");
            }
        }
    }

    @Override
    protected void notifyMapping(URL url, BundleInfo info) {
        urlBundleMapping.put(url, info);
    }

    @Override
    protected boolean irrelevantInJar(String name) {
        boolean result;
        if (name.startsWith("META-INF") && !name.equals("META-INF/MANIFEST.MF")) {
            result = false;
        } else {
            result = super.irrelevantInJar(name);
        }
        return result;
    }

}
