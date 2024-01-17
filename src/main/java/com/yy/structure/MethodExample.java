package com.yy.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author gongcy
 * @date 2023/7/20 9:12 下午
 * @Description
 */
public class MethodExample {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method square = MethodExample.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);
        Object invoke = square.invoke(MethodExample.class, 10);
        System.out.println(invoke);
//        printTable(1,10,10,square);
    }

    private static void printTable(int from, int to, int n, Method f) {
        System.out.println(f);

        // 例子很不友好
        double dx = (to - from) / (n - 1);

    }

    public static double square(double x){
        return x * x;
    }
}
