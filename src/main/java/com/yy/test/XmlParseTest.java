package com.yy.test;

import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;


/**
 * @author gongcy
 * @date 2023/5/17 9:29 上午
 * @Description
 */
public class XmlParseTest {

    public static void main(String[] args) {
        String xmlContent = "<operation>阑尾炎 &#1;</operation>";

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            EntityResolver entityResolver = new CustomerEntityResolver();
            builder.setEntityResolver(entityResolver);

            String s = xmlContent.replaceAll("&#1;", "");
            InputSource inputSource = new InputSource(new StringReader(s));
            Document document = builder.parse(inputSource);
            String operation = document.getDocumentElement().getTextContent();
            System.out.println("operation info: " + operation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
