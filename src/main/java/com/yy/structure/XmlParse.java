package com.yy.structure;

import com.google.common.collect.ImmutableMap;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author gongcy
 * @date 2023/5/31 10:50 上午
 * @Description
 */
public class XmlParse {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = factory.newDocumentBuilder();
//
//        File file = new File("doc/FCT_testParseData_data.xml");
//        Document document = builder.parse(file);
//
//        // 启动文档内容分析
//        Element root = document.getDocumentElement();
//        String tagName = root.getTagName();
//        System.out.println(tagName);
//
//        NodeList children = root.getChildNodes();
//        for (int i = 0; i < children.getLength(); i++) {
//            Node child = children.item(i);
//            if (child instanceof Element) {
//                Element childElement = (Element) child;
//                Text firstChild = (Text) childElement.getFirstChild();
//                String data = firstChild.getData().trim();
//                String tagName1 = childElement.getTagName();
//                System.out.println(data);
//            }
//        }


        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        File file = new File("doc/test.xml");
        Document document = builder.parse(file);

        String name = null;
        Integer size = null;

        Element root = document.getDocumentElement();

//        System.out.println(convert(root,0));
//        NodeList childNodes = root.getChildNodes();
//        for (int i = 0; i < childNodes.getLength(); i++) {
//            Node child = childNodes.item(i);
//            if (child instanceof Element) {
//                Element childElement = (Element) child;
//                Text textNode = (Text) childElement.getFirstChild();
//                String text = textNode.getData().trim();
//                if (childElement.getTagName().equals("name")) {
//                    name = text;
//                } else if (childElement.getTagName().equals("size")) {
//                    size = Integer.parseInt(text);
//                }
//            }
//        }

    }

//    private static StringBuilder convert(Node node, int level) {
//        if (node instanceof Element) {
//            return elementObject((Element)node,level);
//        } else if (node instanceof CharacterData) {
//            return characterString((CharacterData)node,level);
//        } else {
//            return pad(new StringBuilder(),level).append(
//                    jsonEscape(node.getClass().getName())
//            );
//        }
//    }

    private static Map<Character,String> replacements = ImmutableMap.of('\b',"\\b",'\f',"\\f",'\n',"\\n",'\r',"\\r",'\t',"\\t");

}
