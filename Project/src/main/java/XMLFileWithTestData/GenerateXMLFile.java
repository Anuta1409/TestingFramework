package XMLFileWithTestData;
import org.dom4j.Document;
import org.dom4j.DocumentException;

import java.io.IOException;

/**
 * Created by Anna on 12.01.2016.
 */
public class GenerateXMLFile {
    public static void main(String[] args) throws IOException {
        CreateDocument d = new CreateDocument();
        try {
            Document doc = d.XMLFileStructure();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ReadFromXML read = new ReadFromXML();
        read.readFromFile("TestXML.xml");
    }



}
