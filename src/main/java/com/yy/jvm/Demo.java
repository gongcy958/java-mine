package com.yy.jvm;

/**
 * @author gongcy
 * @date 2023/5/25 5:26 下午
 * @Description
 */
public class Demo {

    public static void main(String[] args) {
        String s = "LAB_WBC";
        String t = "labWbc";

        boolean b = s.equalsIgnoreCase(t);
        System.out.println(b);
    }
}
