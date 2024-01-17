package com.yy.structure;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * @author gongcy
 * @date 2023/6/1 10:35 上午
 * @Description
 */
public class XPathTest {

    public static void main(String[] args) throws ParserConfigurationException {

        // 获取工厂实例
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 获取builder
        DocumentBuilder builder = factory.newDocumentBuilder();

//        builder.setEntityResolver(CatalogManager.catalogResolver);
    }
}
