package epam.com.parsing;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by Ermek_Abyshev on 3/21/2017.
 */
public class ReadLoopXMLFile {

    public static void main(String[] args) {

        try {
            File file = new File("d:\\DEV\\JAVA\\core\\source\\staff.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(file);

            doc.getDocumentElement().normalize();

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            if (doc.hasChildNodes()) {
                printNode(doc.getChildNodes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printNode(NodeList childNodes) {

        for (int count = 0; count < childNodes.getLength(); count++) {
            Node tempNode = childNodes.item(count);

            // make sure it's element node
            if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

                // get node name and value
                System.out.println("\nNode name: " + tempNode.getNodeName() + " [OPEN]");
                System.out.println("Node value: " + tempNode.getTextContent());

                if (tempNode.hasAttributes()) {

                    // get attributes names and values
                    NamedNodeMap nodeMap = tempNode.getAttributes();

                    for (int i = 0; i < nodeMap.getLength(); i++) {

                        Node node = nodeMap.item(i);
                        System.out.println("attr name : " + node.getNodeName());
                        System.out.println("attr value : " + node.getNodeValue());
                    }
                }

                if (tempNode.hasChildNodes()) {

                    // loop again if has child nodes
                    printNode(tempNode.getChildNodes());

                }
                System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");
            }
        }
    }
}
