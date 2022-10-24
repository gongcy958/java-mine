package com.yy.design.create;

/**
 * @author gongcy
 * @date 2022/10/24 10:01 上午
 * @Description
 */
public class ComputeSignal {

    public static void main(String[] args) {

        String str = "abc";
        int x = 1,y = 2,z = 3;

        System.out.println(str + x + y + z);

        System.out.println(x + y + str + z);

        System.out.println(x + y + z + str);

        System.out.println("" + x);

        float a = 20;
        System.out.println(a);

        byte b = 20;
        int c = 30;
        c = b;
        System.out.println(c);

        b = (byte) c;
        System.out.println(b);

        int d = 139;
        b = (byte) d;

        System.out.println(b);

        float e = 29.7f;
        int f = (int) e;
        System.out.println(f);
        System.out.println(Math.round(e));

        byte g = 101;
        short k = 303;
        int m = g + k ;
        System.out.println(m);

        int big = Integer.MAX_VALUE;
        System.out.println(big * 4);
    }
}
