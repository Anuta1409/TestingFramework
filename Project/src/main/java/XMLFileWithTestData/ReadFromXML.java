package XMLFileWithTestData;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;
import javax.xml.soap.*;

public class ReadFromXML {
    public void readFromFile(String fileName) {

//
        File inputFile = new File(fileName);
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read( inputFile );
        } catch (DocumentException e) {
            e.printStackTrace();
        }

      System.out.println("Root element :"+ document.getRootElement().getName());

//      Element classElement = document.getRootElement();
//
//        List<Node> nodes = document.selectNodes("" );
//        System.out.println("----------------------------");
//        for (Node node : nodes) {
//            System.out.println("\nCurrent Element :"
//                    + node.getName());
//            System.out.println("Student roll no : "
//                    + node.valueOf("@rollno") );
//            System.out.println("First Name : " + node.selectSingleNode("firstname").getText());
//            System.out.println("Last Name : " + node.selectSingleNode("lastname").getText());
//            System.out.println("First Name : " + node.selectSingleNode("nickname").getText());
//            System.out.println("Marks : " + node.selectSingleNode("marks").getText());
//        }
   }
}
