package com.yy.design.create.singleton.packageone;

import com.yy.design.create.singleton.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author gongcy
 * @date 2022/11/3 2:10 下午
 * @Description
 */
public class SampleLogger {

    private FileWriter writer;

    // 方式三 类级锁 -> 单例类 静态全局一份
    private static final SampleLogger instance = new SampleLogger();

    // 构造器
    public SampleLogger() {

        File file = new File("/Users/mine/log.txt");
        try {
            writer = new FileWriter(file,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SampleLogger getInstance() {
        return instance;
    }

    public void log(String message){
        try {
            // 方式一 加锁 对象级别 锁不住
//            synchronized (this) {
//                writer.write(message);
//            }

            // 方式二 类级锁
            synchronized (SampleLogger.class) {
                writer.write(message);
            }

//            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
