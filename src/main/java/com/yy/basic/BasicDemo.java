package com.yy.basic;

/**
 * @author gongcy
 * @date 2023/12/7 4:16 下午
 * @Description
 */
public class BasicDemo {

    public static void main(String[] args) {
        int max = 2147483647;
        System.out.println(max);

        byte b1 = -3;
        int i = Byte.toUnsignedInt(b1);
        System.out.println(i);

        byte b2 = -128;
        byte b3 = 127;

        double positiveInfinity = Double.POSITIVE_INFINITY;
        System.out.println(positiveInfinity);
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println(negativeInfinity);
        double naN = Double.NaN;
        System.out.println(naN);

        System.out.println(2.0-1.1);
    }
}
