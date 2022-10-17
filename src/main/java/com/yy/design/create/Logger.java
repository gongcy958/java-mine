

package com.yy.design.create;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author gongcy
 * @date 2022/10/17 8:37 下午
 * @Description
 */
public class Logger {

    private FileWriter writer;

    public Logger() throws IOException {
        File file = new File("/Users/songguo77/log.txt");
        writer = new FileWriter(file,true);
    }

    public void log(String message) throws IOException {
        synchronized (Logger.class) {
            writer.write(message);
        }
    }

}
