package WriteReadXML;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by Anna on 23.01.2016.
 */
public class WriteXML {
    public void createXML() {


        // returns an xml element object
        // school is passed to make it root element in document

        Element testsSuite = new Element("testsSuite");

//         created an document object, all elements will be added to it
//         passes school as parameter to make it root element of document
        Document document = new Document(testsSuite);
        testsSuite.setAttribute(new Attribute("name", "FacebookLogin"));
        testsSuite.setAttribute(new Attribute("methodName", "FaceBookLogin"));

        // created other element to add to document
        Element testCase = new Element("testCase");
        testCase.setAttribute(new Attribute("id", "1")).setAttribute(new Attribute("testCaseName", "PositiveFaceBookLogin")).setAttribute(new Attribute("TestSuiteID", "1"));

        for (int j = 0; j < 3; j++){

            testCase.addContent(new Element("steps")
                            .addContent((new Element("step").setAttribute(new Attribute("stepName", "stepName"+j))).
                                            addContent(new Element("parameters")
                                                            .addContent(new Element("parameter").setAttribute(new Attribute("id",""+j))
                                                                            .addContent(new Element("parameterName").setText("Name1"))
                                                                            .addContent(new Element("parameterType").setText("boolean"))
                                                                            .addContent(new Element("parameterValue").setText("true"))
                                                            )
                                            )
                            )
            );
        }

            document.getRootElement().addContent(testCase);

            // get object to see output of prepared document
            XMLOutputter xmlOutput = new XMLOutputter();

            // passed System.out to see document content on console
            xmlOutput.setFormat(Format.getPrettyFormat());
            try {
                xmlOutput.output(document, System.out);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // passed fileWriter to write content in specified file
            xmlOutput.setFormat(Format.getPrettyFormat());
            try {
                xmlOutput.output(document, new FileWriter(
                        "newXML.xml"));
                System.out.println("File Saved!");
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}

