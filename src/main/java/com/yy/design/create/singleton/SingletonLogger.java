package com.yy.design.create.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author gongcy
 * @date 2022/10/19 1:24 下午
 * @Description
 */
public class SingletonLogger {

    private FileWriter fileWriter;
    private static final SingletonLogger instance = new SingletonLogger();

    public SingletonLogger() {
        File file = new File("/Users/mine/log.txt");
        try {
            fileWriter = new FileWriter(file,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SingletonLogger getInstance() {
        return instance;
    }

    public void log(String message) {
        try {
            fileWriter.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
