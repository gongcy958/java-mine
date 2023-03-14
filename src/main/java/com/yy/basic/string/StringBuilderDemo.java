package com.yy.basic.string;

/**
 * @author gongcy
 * @date 2023/1/29 11:00 上午
 * @Description
 */
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("watch ");
        builder.append("tv");
        String result = builder.toString();
        System.out.println(result);
    }
}
