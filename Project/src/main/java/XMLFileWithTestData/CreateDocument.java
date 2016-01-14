package XMLFileWithTestData;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.IOException;

/**
 * Create XML-file
 */
public class CreateDocument {
    private Document XMLdoc;
    private int numberOfSameElements = 3;
    private int numberOfParamsElement = 3;

    public CreateDocument(){
        XMLdoc = DocumentHelper.createDocument();
    }


    public Document XMLFileStructure() throws IOException {

        Element root = addRootElement("config");
        Element webDriver = addElement(root, "webDriver");
        Element tests = addElement(root,"tests");

        for (int i = 0;i < numberOfSameElements; i++) {
            Element test = addElement(tests, "test" + i, "nameOfUsedMethod", "Method.com");
            Element params = addParams(test, "params");
            for (int j = 0; j < numberOfParamsElement; j++) {
                Element param = addParamWithAttribute(params, "param" , "name"+ j, "value", "type");
            }
        }

        printDocument(this.XMLdoc);
        writeDoc(this.XMLdoc);
        return null;
    }

   //creating document root element
    private Element addRootElement(String rootElementName) {
        return XMLdoc.addElement(rootElementName);
    }

    private Element addElement(Element element,String elementName){
        return element.addElement(elementName);
    }

    private Element addElement(Element element,String elementName, String attributeName, String attributeValue){
        return element.addElement(elementName).addAttribute(attributeName, attributeValue);
    }

    private Element addParams(Element element,String paramsName){
        return element.addElement(paramsName);
    }

    private Element addParamWithAttribute(Element element,String paramsName,String paramName,String paramValue, String paramType){
        return element.addElement(paramsName).
                       addAttribute("parameterName",paramName).
                       addAttribute("parameterValue",paramValue).
                       addAttribute("parameterType",paramType);
    }



    public void printDocument(Document XMLdoc) throws IOException {
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer;
        writer = new XMLWriter( System.out, format );
        writer.write( XMLdoc );
    }

    public void writeDoc(Document XMLdoc) {
        WriteXMLFile writeXMLFile = new WriteXMLFile();
        try {
            writeXMLFile.write(XMLdoc, "TestXML.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }








}
