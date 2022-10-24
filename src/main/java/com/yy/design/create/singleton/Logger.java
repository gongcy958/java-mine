package com.yy.design.create.singleton;

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

    public Logger() {
        File file = new File("/Users/mine/log.txt");
        try {
            writer = new FileWriter(file,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        synchronized (Logger.class) {
            try {
                writer.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
