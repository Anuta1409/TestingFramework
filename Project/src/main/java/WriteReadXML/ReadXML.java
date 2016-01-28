package WriteReadXML;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;


/**
 * Dom parser work
 * 1)save ierarchy
 *
 */
public class ReadXML {
    public void getXML(){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            try {
                Document document = documentBuilder.parse(new File("newXML.xml"));
                document.getDocumentElement().normalize();
                //get root element
                String title=  document.getDocumentElement().getNodeName();
                System.out.println("Root element: "+ title);

                Node nodeTestCase = (Node) document.getElementsByTagName("testCase").item(0);
                String testCase = nodeTestCase.getNodeName();
                System.out.println("testCase: "+ testCase);

                Node nodeParams = (Node) document.getElementsByTagName("parameters").item(0);
                String parameters = nodeParams.getNodeName();
                System.out.println("paramaters: "+ parameters);


                //class Node work with concrete element
                //NodeList includes multiple value

                NodeList nList = document.getElementsByTagName("parameter");
                for (int i = 0;i < nList.getLength();i++) {
//                    Element element = (Element) nodeList.item(i);
//                    title = element.getElementsByTagName("parameterName").item(0).getChildNodes().item(0).getNodeValue();
                    Node nNode = nList.item(i);
                    System.out.println("\nCurrent Element :"
                            + nNode.getNodeName());
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        System.out.println("parameter id : "
                                + eElement.getAttribute("id"));
                        System.out.println("Parameter Name : "
                                + eElement
                                .getElementsByTagName("parameterName")
                                .item(0)
                                .getTextContent());
                        System.out.println("Parameter Type : "
                                + eElement
                                .getElementsByTagName("parameterType")
                                .item(0)
                                .getTextContent());
                        System.out.println("Parameter Value : "
                                + eElement
                                .getElementsByTagName("parameterValue")
                                .item(0)
                                .getTextContent());
                    }
                }
            } catch (SAXException e) {
            } catch (IOException e) {
            }
        } catch (ParserConfigurationException e) {
        }

    }

}
