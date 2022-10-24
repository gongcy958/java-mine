package com.yy.object;

/**
 * @author gongcy
 * @date 2022/10/21 10:21 上午
 * @Description
 */
public class IntegerDemo {

    public static void main(String[] args) {

        Integer n1 = 47;
        Integer n2 = 47;

        System.out.println(n1 == n2);
        System.out.println(n1 != n2);


        Boot boot1 = new Boot();
        Boot boot2 = new Boot();

        boot2.i = boot1.i = 100;
        System.out.println(boot1.equals(boot2));
    }
}
