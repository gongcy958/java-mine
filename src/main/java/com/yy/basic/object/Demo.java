package com.yy.basic.object;

import java.lang.reflect.Field;

/**
 * @author gongcy
 * @date 2023/2/22 9:15 上午
 * @Description
 */
public class Demo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = new String("abc");

        Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(s,"abcd".toCharArray());
        System.out.println(s);
    }
}
