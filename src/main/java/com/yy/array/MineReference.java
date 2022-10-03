package com.yy.array;

/**
 * @author gongcy
 * @date 2022/10/3 10:17 上午
 * @Description
 */
public class MineReference {

    static int[] a2;

    public static void main(String[] args) {

        int[] a1 = {1,2,3,4,5};
        a2 = a1;
        a2[3] = 9;
        System.out.println("-------");
        System.out.println(a1.toString());
    }
}
