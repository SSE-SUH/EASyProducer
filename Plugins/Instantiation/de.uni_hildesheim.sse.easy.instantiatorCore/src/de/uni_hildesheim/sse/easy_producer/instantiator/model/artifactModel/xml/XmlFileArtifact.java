package de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.w3c.dom.CDATASection;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import de.uni_hildesheim.sse.easy_producer.instantiator.Bundle;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.ArtifactCreator;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.ArtifactFactory;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.ArtifactModel;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.FileArtifact;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.artifactModel.FragmentArtifact;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.ArraySet;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.ArtifactException;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.OperationMeta;
import de.uni_hildesheim.sse.easy_producer.instantiator.model.vilTypes.Set;
import de.uni_hildesheim.sse.utils.logger.EASyLoggerFactory;

/**
 * Represents a parsed XML file artifact. Due to Java internal intelligent processing, it 
 * might be that the original encoding name is replaced by a normalized one. If this is not
 * intended, the official encoding table of the JDK needs to be redefined (system property
 * "com.sun.org.apache.xalan.internal.serialize.encodings"), e.g., to exclude the specific
 * encoding... with possible side effects. Please note, that there is a comment end-of-line 
 * workaround in this class which is required for proper operation on some JDKs (OpenJDK 1.7). 
 * In future, this may be circumvented by using a distinct version of XALAN instead of the builtin
 * one....
 * 
 * @author Holger Eichelberger
 * @author Patrik Pastuschek
 */
@ArtifactCreator(DefaultXmlFileArtifactCreator.class)
public class XmlFileArtifact extends FileArtifact implements IXmlContainer {

    private XmlElement rootElement;
    
    private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    private TransformerFactory transformerFactory = TransformerFactory.newInstance();
    private Transformer transformer;
    private Document doc;
    private File file;
    private DtdParser dtdParser = new DtdParser();
    private Dtd dtd;
    
    /**
     * Creates a new XML file artifact.
     * 
     * @param file the file to read the artifact contents from
     * @param model the artifact model to create this folder artifact within
     * @throws ArtifactException if artifact could not be created.
     */
    XmlFileArtifact(File file, ArtifactModel model) throws ArtifactException {
        super(file, model);
        
        this.file = file;
        initialize();
    }

    /**
     * (Re)initializes this artifact.
     * 
     * @throws ArtifactException if artifact could not be created.
     */
    private void initialize() throws ArtifactException {
        readDtd();
        load(file);
        if (null != doc) {
            rootElement = build(doc.getDocumentElement(), null);
            if (null != doc.getDocumentElement()) {
                cleanTree(doc.getDocumentElement());
            }
        }
    }
    
    /**
     * Creates a temporary file artifact.
     * 
     * @return the created file artifact
     * @throws ArtifactException in case that the creation fails
     */
    public static FileArtifact create() throws ArtifactException {
        try {
            File file = File.createTempFile("xmlFileArtifact", "vil");
            file.deleteOnExit();
            return ArtifactFactory.createArtifact(XmlFileArtifact.class, file, null);
        } catch (IOException e) {
            throw new ArtifactException(e, ArtifactException.ID_IO);
        }
    }
    
    @Override
    public void artifactChanged(Object cause) throws ArtifactException {
        initialize();
    }

    @Override
    public void store() throws ArtifactException {
        this.writeToFile();     
    }
    
    @Override
    @OperationMeta(returnGenerics = FragmentArtifact.class)
    public Set<? extends FragmentArtifact> selectAll() {
        XmlElement[] elements = null;
        if (this.rootElement != null) {
            elements = new XmlElement[1];
            elements[0] = this.rootElement;
        }
        return new ArraySet<XmlElement>(elements, FragmentArtifact.class);
    }
    
    /**
     * Returns the Root Element.
     * 
     * @return the representation of the root element
     */
    public XmlElement getRootElement() {
        return this.rootElement;
    }
    
    /**
     * Returns a set of all childs of the root element.
     * 
     * @return Set of all childs of the root element.
     * @throws ArtifactException 
     */
    @OperationMeta(returnGenerics = XmlElement.class)
    public Set<? extends XmlElement> selectChilds() throws ArtifactException {
        XmlElement[] elements = null;
        if (this.rootElement != null) {
            elements = new XmlElement[this.rootElement.selectAll().size()];
            Iterator<XmlElement> iter = this.rootElement.elements().iterator();
            for (int i = 0; i < elements.length; i++) {
                elements[i] = (XmlElement) iter.next();
            }
        }
        return new ArraySet<XmlElement>(elements, FragmentArtifact.class);
    }
    
    /**
     * Loads and builds the jdom-tree.
     * 
     * @param file the file that is to be parsed.
     * @throws ArtifactException in case domTree could not be built.
     */
    private void load(File file) throws ArtifactException {
        
        if (file != null && file.length() > 0) {
        
            DocumentBuilder builder;
            try {
                builder = factory.newDocumentBuilder();
                doc = builder.parse(file);
            } catch (ParserConfigurationException exc) {
                EASyLoggerFactory.INSTANCE.getLogger(getClass(), Bundle.ID).exception(exc);
                throw new ArtifactException(file.getAbsolutePath() + ":" + exc.getMessage(), 
                    ArtifactException.ID_RUNTIME_RESOURCE);
            } catch (SAXException exc) {
                EASyLoggerFactory.INSTANCE.getLogger(getClass(), Bundle.ID).exception(exc);
                throw new ArtifactException(file.getAbsolutePath() + ":" + exc.getMessage(), 
                    ArtifactException.ID_RUNTIME_RESOURCE);
            } catch (IOException exc) {
                EASyLoggerFactory.INSTANCE.getLogger(getClass(), Bundle.ID).exception(exc);
                throw new ArtifactException(file.getAbsolutePath() + ":" + exc.getMessage(), 
                    ArtifactException.ID_RUNTIME_RESOURCE);
            }
        
        }
                
    }
    
    /**
     * Building up the representing object structure.
     * 
     * @param node the node to parse. (Will parse all childs aswell).
     * @param parent the representation of the parent node. (Null if root element).
     * @return an array of XmlElements including all child elements.
     */
    private XmlElement build(Node node, XmlElement parent) {
     
        //add elements only        
        int amountOfElem = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            
            if (node.getChildNodes().item(i).getNodeType() == Node.ELEMENT_NODE) {
                amountOfElem++;
                list.add(i);
            }
            
        }
        
        XmlElement element = null;
        XmlElement[] elements = new XmlElement[amountOfElem];
        
        XmlAttribute[] attributes = this.createAttributes(node, element);
        
        element = new XmlElement(parent, node.getNodeName(), attributes, node); 
        
        //try to add textual representation
        //TODO: Test whether CDATA needs to be trimmed too.
        try {
            if (node.hasChildNodes()) {
                if (node.getFirstChild().getNodeType() == Node.CDATA_SECTION_NODE) {
                    element.setCdata(((CDATASection) node.getFirstChild()).getData());
                } else if (node.getFirstChild().getNodeType() == Node.TEXT_NODE) {
                    //trim the text, otherwise indent can cause lots of spaces in front of the text.
                    String text = node.getFirstChild().getNodeValue().trim();
                    element.getText().setText(text);
                }
            }
        } catch (ArtifactException e1) {
            EASyLoggerFactory.INSTANCE.getLogger(getClass(), Bundle.ID).exception(e1);
        } catch (DOMException e1) {
            EASyLoggerFactory.INSTANCE.getLogger(getClass(), Bundle.ID).exception(e1);
        }
        
        Iterator<XmlAttribute> iter = null;
        
        try {
            iter = element.attributes().iterator();
        } catch (ArtifactException e) {
            EASyLoggerFactory.INSTANCE.getLogger(getClass(), Bundle.ID).exception(e);
        }
        
        if (null != iter) {
            
            while (iter.hasNext()) {
                
                iter.next().setParent(element);                
                
            }
            
        }
              
        //build child elements
        for (int i = 0; i < amountOfElem; i++) {
            
            elements[i] = build(node.getChildNodes().item(list.get(i)), element);
            
        }
        
        element.setElements(elements);
        
        return element;
        
    }

    /**
     * Return all line ended comments in sequence of their occurrence in {@link #file}. This is part of a workaround
     * as in some JDKs the line ends of comments seem to be omitted.
     * 
     * @return the line ends in sequence
     */
    private List<String> getLineEndedComments() {
        List<String> lineEndedComments = new ArrayList<String>();
        LineNumberReader reader = null;
        try {
            reader = new LineNumberReader(new FileReader(this.file));
            String line;
            do {
                line = reader.readLine();
                if (null != line && line.endsWith("-->")) {
                    lineEndedComments.add(line);
                }
            } while (null != line);
            reader.close();
        } catch (IOException e) {
            IOUtils.closeQuietly(reader);
            // don't care for exception
        }
        return lineEndedComments;
    }
    
    /**
     * Ensures line the line ends in {@link #file} according to the previously collected line ends 
     * by {@link #getLineEndedComments()}. This is part of a workaround
     * as in some JDKs the line ends of comments seem to be omitted.
     * 
     * @param lineEndedComments the line ended comments in sequence of their occurrence
     */
    private void ensureLineEndedComments(List<String> lineEndedComments) {
        try {
            final String sep = System.getProperty("line.separator");
            List<String> lines = FileUtils.readLines(file);
            int c = 0;
            int l = 0;
            int lPos = 0;
            while (c < lineEndedComments.size() && l < lines.size()) {
                String line = lines.get(l);
                String comment = lineEndedComments.get(c);
                int pos = line.indexOf(comment, lPos);
                if (pos >= 0) {
                    int ePos = pos + comment.length();
                    if (ePos < line.length()) {
                        int tmpPos = ePos;
                        while (ePos < line.length() && isLineEndChar(line.charAt(ePos))) {
                            ePos++;
                        }
                        if (tmpPos == ePos) {
                            line = line.substring(0, ePos) + sep + line.substring(ePos);
                            lines.set(l, line);
                            lPos = ePos + sep.length();
                        }
                    }
                    c++;
                } else {
                    l++;
                    lPos = 0;
                }
            }
            FileUtils.writeLines(file, lines);
        } catch (IOException e) {
            // don't care
        }
    }

    /**
     * Returns whether <code>ch</code> is a line end character.
     * 
     * @param ch the character to be analyzed
     * @return <code>true</code> if it is a line end character, <code>false</code> else
     */
    private static boolean isLineEndChar(char ch) {
        return '\r' == ch || '\n' == ch;
    }
    
    /**
     * Writes the Dom tree back to the file.
     */
    private void writeToFile() {
        
        if (null != doc) {
            
            //Added for Testing: Add Element wiht number of elements in this Document (-1 this element)
            /*int amount = 0;
            for (int i = 0; i < doc.getChildNodes().getLength() - 1; i++) {
                amount += countNodes(doc.getChildNodes().item(i)) + 1;
            }
            Node counter = doc.createElement("Amount");
            counter.setTextContent("" + amount);
            doc.getDocumentElement().appendChild(counter);*/
            
            List<String> lineEndedComments = getLineEndedComments();
            
            DOMSource source = new DOMSource(doc);
            StreamResult result = null;

            result = new StreamResult(this.file);
            
            try {
                transformerFactory = TransformerFactory.newInstance();
                transformer = transformerFactory.newTransformer();
                // might be doc.getXmlEncoding();  but this is properly taken over... but may also normalized
                //transformer.setOutputProperty("encoding", encoding); 
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                //transformer.setOutputProperty("{http://xml.apache.org/xalan}line-separator", "\r\n");
                transformer.transform(source, result);
            } catch (TransformerException exc) {
                EASyLoggerFactory.INSTANCE.getLogger(getClass(), Bundle.ID).exception(exc);
            }
            
            if (!lineEndedComments.isEmpty()) {
                ensureLineEndedComments(lineEndedComments);
            }
        
            if (this.dtd != null && this.dtd.getContent() != null && !this.dtd.getContent().isEmpty()) {
                try {
                    this.dtdParser.writeDtd(this.file, this.dtd);
                } catch (FileNotFoundException e) {
                    EASyLoggerFactory.INSTANCE.getLogger(getClass(), Bundle.ID).exception(e);
                }
            }            
            
        }
        
    }
    
    /**
     * Creates and returns all Attributes for given node and XmlElement.
     * 
     * @param node The node for which to return all attributes
     * @param element The element that represents the node.
     * @return Array with XmlAttributes
     */
    private XmlAttribute[] createAttributes(Node node, XmlElement element) {
        
        XmlAttribute[] attributes;
        
        if (null != node.getAttributes()) {
            int amountOfAtt = node.getAttributes().getLength();
            attributes = new XmlAttribute[amountOfAtt];
               
            for (int i = 0; i < amountOfAtt; i++) {
                
                attributes[i] = new XmlAttribute(element, 
                        node.getAttributes().item(i).getNodeName(),
                        node.getAttributes().item(i).getNodeValue());            
            }
        } else {
            attributes = null;
        }
        
        return attributes;
        
    }

    @Override
    @OperationMeta(returnGenerics = XmlElement.class)
    public Set<XmlElement> selectByName(String name) throws ArtifactException {
        return this.rootElement.selectByName(name);
    }

    @Override
    @OperationMeta(returnGenerics = XmlElement.class)
    public Set<XmlElement> selectByPath(String path) throws ArtifactException {
        return PathUtils.selectByPath(this, PathUtils.normalize(path));
    }
    
    /**
     * Returns a set of all XmlElements that start with prefix and end with suffix.
     * To get a set of all XmlElements having a certain pre- and suffix use:
     * "prefix.*suffix" (replace prefix and suffix).
     * 
     * @param regEx a regular expression specifying the elements to be selected.
     * @return Set of XmlElements matching the regEx.
     * @throws ArtifactException in case that invalid Elements are used.
     */
    @OperationMeta(returnGenerics = XmlElement.class)
    public Set<XmlElement> selectByRegEx(String regEx) throws ArtifactException {
        if (this.rootElement == null) {
            throw new ArtifactException("Root Element does not exist", 30003);
        }
        return this.rootElement.selectByRegEx(regEx);
    }

    @Override
    public void update() throws ArtifactException {
        initialize();
    }
    
    /**
     * Cleans the dom tree from empty text nodes. These nodes are used for internal indent representation.
     * These empty text nodes cause bugs in indentation if not removed.
     * @param parent The parentNode that is to clean.
     */
    private void cleanTree(Node parent) {
        Node child = parent.getFirstChild();
        while (null != child) {
            Node nextChild = child.getNextSibling();
            
            if (Node.TEXT_NODE == child.getNodeType() && !child.hasChildNodes()) {
                if (child.getNodeValue().trim().isEmpty()) {
                    parent.removeChild(child);
                }
            }
            child = nextChild;
        }
    }
    
    /**
     * Checks the base file for embedded DTDs.
     * @throws ArtifactException If File not found.
     */
    private void readDtd() throws ArtifactException {
        
        if (null != file && file.length() > 0) {
            try {
                this.dtd = dtdParser.extractDTD(file);
            } catch (FileNotFoundException e) {
                throw new ArtifactException("File not found: " + file.getAbsolutePath(), 
                        ArtifactException.ID_RUNTIME_RESOURCE);
            }
        }
        
    }

}