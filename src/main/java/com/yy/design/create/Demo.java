package com.yy.design.create;

import sun.reflect.misc.ReflectUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author gongcy
 * @date 2022/10/21 2:07 下午
 * @Description
 */
public class Demo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {

        SingletonLogger instance = SingletonLogger.getInstance();

        Class<SingletonLogger> singletonLoggerClass = SingletonLogger.class;



//        SingletonLogger o1 = (SingletonLogger) ReflectUtil.newInstance(SingletonLogger.class);

        Constructor<?>[] constructors = singletonLoggerClass.getDeclaredConstructors();
        for (Constructor<?> c : constructors) {

            SingletonLogger o =(SingletonLogger) c.newInstance();
        }


        System.out.println("Hhh");

        float f = 1.39e-43f;

        double e = Math.E;
        System.out.println(e);

        float f2 = 2e4f;
        System.out.println(f2);

        // 1010
        int a = 10;
        System.out.println(a << 1);

        int b = 15;
        System.out.println(b << 1);

        int c = 10;
        System.out.println(c >> 1);

        int d = 0b10001010;
        System.out.println(Integer.toBinaryString(d));

        int g = -10;
        System.out.println(g >> 1);



    }
}
