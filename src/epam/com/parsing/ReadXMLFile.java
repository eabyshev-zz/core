package epam.com.parsing;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by Ermek_Abyshev on 3/21/2017.
 */
public class ReadXMLFile {

    public static void main(String[] args) {

        try {
            File file = new File("d:\\DEV\\JAVA\\core\\source\\staff.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(file);

            doc.getDocumentElement().normalize();

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("staff");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;

                    System.out.println("Staff id: " + element.getAttribute("id"));
                    System.out
                        .println("First name: " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out
                        .println("Last name: " + element.getElementsByTagName("lastname").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
