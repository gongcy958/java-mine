package com.yy.basic.string;

/**
 * @author gongcy
 * @date 2023/1/29 9:53 上午
 * @Description
 */
public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("hello,mine");
        buffer.append(",how are you?");
        String result = buffer.toString();
        System.out.println(result);

        char[] value = new char[16];
        byte[] bytes = new byte[16];
        System.out.println("hhh.");
    }
}
