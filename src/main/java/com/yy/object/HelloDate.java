package com.yy.object;

import java.util.Date;

/**
 * @author gongcy
 * @date 2022/10/20 10:35 上午
 * @Description
 */
public class HelloDate {

    public static void main(String[] args) {
        System.out.println(new Date());
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
