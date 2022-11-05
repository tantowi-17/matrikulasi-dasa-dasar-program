//import java.util.*;
//
//class LanguageStudent {
//    public List<String> getLanguages() {
//        List<String> lang = new ArrayList<>();
//        lang.add("france");
//        lang.add("italy");
//        lang.add("indonesia");
//        lang.add("malaysia");
//        lang.add("singapore");
//        return lang;
//    }
//}
//
//class LanguageTeacher {
//    public static void main(String[] args) {
//        LanguageTeacher teacher = new LanguageTeacher();
//        teacher.addLanguage("English");
//
//        LanguageStudent student = new LanguageStudent();
//        teacher.teach(student, "English");
//
//        for(String language : student.getLanguages())
//            System.out.println(language);
//    }
//
//    /**
//     *
//     * @param english
//     * @return
//     */
//    private List<String> addLanguage(String english) {
//        List<String> lang = new ArrayList<>();
//        lang.add(english);
//        return lang;
//    }
//
//    /**
//     *
//     * @param student
//     * @param language
//     * @return
//     */
//    public boolean teach(LanguageStudent student, String language) {
//
//        if (student.equals(language)) {
//            return false;
//        } else {
//            addLanguage(language);
//            return true;
//        }
//    }
//}

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.w3c.dom.Element;
import sun.tools.java.Parser;

public class TestCoding {
    /**
     * GetTimestampsByDescription
     * @param xml
     * @param description
     * @return
     * @throws Exception
     */
    public static List<Long> getTimestampsByDescription(String xml, String description) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        List<Long> timeStamp = new ArrayList<>();
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xml)));
            NodeList nodeList = doc.getElementsByTagName("event");
            for (int itr = 0; itr < nodeList.getLength(); itr++) {
                Node node = nodeList.item(itr);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    String timestamp = eElement.getAttribute("timestamp");
                    long l = Long.parseLong(timestamp);
                    timeStamp.add(l);
                    // if you get timestamp with format date
                    //DateFormat format = new SimpleDateFormat("MMddyyHH");
                    //Date date = format.parse(attVal);
                }
            }
        return timeStamp;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<log>\n" +
                        "    <event timestamp=\"1614285589\">\n" +
                        "        <description>Intrusion detected</description>\n" +
                        "    </event>\n" +
                        "    <event timestamp=\"1614286432\">\n" +
                        "        <description>Intrusion ended</description>\n" +
                        "    </event>\n" +
                        "</log>";

        List<Long> timestamps = getTimestampsByDescription(xml, "Intrusion ended");
        for(long timestamp: timestamps)
            System.out.println(timestamp);
    }
}