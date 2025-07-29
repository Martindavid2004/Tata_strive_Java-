package martin;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;

public class Xml {
    public static void main(String[] args) {
        try {
          
            File xmlFile = new File("src/md.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);

            
            doc.getDocumentElement().normalize();

            Element root = doc.getDocumentElement();
            System.out.println("Root element: " + root.getNodeName());

            System.out.println("Program1: " + root.getElementsByTagName("Program1").item(0).getTextContent());
            System.out.println("Program2: " + root.getElementsByTagName("Program2").item(0).getTextContent());
            System.out.println("Program3: " + root.getElementsByTagName("Program3").item(0).getTextContent());
            System.out.println("Program4: " + root.getElementsByTagName("Program4").item(0).getTextContent());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}