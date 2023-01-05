package com.yy.io;

import java.io.*;
import java.util.stream.Collectors;

/**
 * @author gongcy
 * @date 2022/12/14 5:17 下午
 * @Description
 */
public class BufferedInputFile {

    public static String read(String fileName) {

        try {
            Reader reader = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(reader);
            return bf.lines().collect(Collectors.joining("\n"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

//        try(BufferedReader in = new BufferedReader(
//               new FileReader(fileName))){
//            return in.lines().collect(Collectors.joining("\n"));
//        }catch (IOException ex){
//            throw new RuntimeException(ex);
//        }
    }

    public static void main(String[] args) {
        System.out.print(read("/Users/mine/ownenv/java-mine/src/main/java/com/yy/io/BufferedInputFile.java"));
    }
}
