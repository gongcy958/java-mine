package com.yy.generic;

import com.yy.function.lambda.Employee;

/**
 * @author gongcy
 * @date 2023/7/25 5:01 下午
 * @Description
 */
public class GDemo {

    public static strictfp void main(String[] args) {
        System.out.println("Hello,World");
//        int n = 123456789;
//        float f = n;
//        System.out.println(f);
//
//        System.out.println(2 - 1.1);
//        System.out.println(2 - 0.1);
//        System.out.println(2.0 - 0.1);
//        System.out.println(2 - 1.2);
//
        System.out.println(0.1f + 0.6f);
        System.out.println(0.1d + 0.6d);
        System.out.println(0.01f + 0.06);
//        System.out.println(2.0f - 1.1f);
//
//        System.out.println(0.3 + 0.6);
        System.out.println(0.3f + 0.6f);
        System.out.println(0.3d + 0.6d);

        System.out.println(Integer.toBinaryString(Float.floatToIntBits(0.1f)));
        System.out.println(Long.toBinaryString(Double.doubleToLongBits(0.1d)));

    }
}
