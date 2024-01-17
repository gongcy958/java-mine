package com.yy.fielddriver.class04;

import jdk.internal.loader.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author gongcy
 * @date 2024/1/16 9:56 下午
 * @Description
 */

public class ProductResource extends Resource {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public URL getURL() {
        return null;
    }

    @Override
    public URL getCodeSourceURL() {
        return null;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return null;
    }

    @Override
    public int getContentLength() throws IOException {
        return 0;
    }
}
