package com.yy.test;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author gongcy
 * @date 2023/5/17 10:09 上午
 * @Description
 */
public class CustomerEntityResolver implements EntityResolver {

    @Override
    public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
        if (containsSpecialCharacters(systemId)) {
            return new InputSource(new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private boolean containsSpecialCharacters(String systemId) {
        return systemId.contains("&#1;");
    }

}
