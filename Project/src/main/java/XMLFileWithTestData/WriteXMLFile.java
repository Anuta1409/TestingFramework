package XMLFileWithTestData;

import org.dom4j.Document;
import org.dom4j.io.XMLWriter;
import org.dom4j.io.OutputFormat;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Anna on 14.01.2016.
 */
public class WriteXMLFile {
    public void write(Document document,String XMLFileName) throws IOException {

        // lets write to a file
        XMLWriter writer = new XMLWriter(new FileWriter(XMLFileName));
        writer.write(document);
        writer.close();

        // Pretty print the document to System.out
        OutputFormat format = OutputFormat.createPrettyPrint();
        writer = new XMLWriter( System.out, format );
        writer.write(document);


        // Compact format to System.out
        format = OutputFormat.createCompactFormat();
        writer = new XMLWriter( System.out, format );
        writer.write(document);

    }
}

