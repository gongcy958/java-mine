package com.yy.object;

/**
 * @author gongcy
 * @date 2022/10/21 10:44 上午
 * @Description
 */
public class LiteralDemo {

    public static void main(String[] args) {

        int i1 = 0x2f;
        System.out.println(i1);
        System.out.println(Integer.toBinaryString(i1));
        int i2 = 0X2f;
        System.out.println(i2);

        int i3 = 0177;
        System.out.println(i3);
        System.out.println(Integer.toBinaryString(i3));

        int i4 = 010;
        System.out.println(i4);

        int i5 = 0;
        System.out.println(0);

        char i6 = 0xffff;

        System.out.println(i6);
        System.out.println(Integer.toBinaryString(i6));

        int i7 = 0x7f;
        System.out.println(i7);
        System.out.println(Integer.toBinaryString(i7));


        int i9 = 0b11111111;
        System.out.println(Integer.toBinaryString(i9));

    }
}
