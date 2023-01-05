package com.yy.object;

import java.util.regex.Pattern;

/**
 * @author gongcy
 * @date 2022/12/13 3:17 下午
 * @Description
 */
public class OtherClient {

    public static void main(String[] args) {

        long sum = 0L;
        long start = System.currentTimeMillis();
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        System.out.println("int正整数值总和是: " + sum + " 耗费时间 : " + (System.currentTimeMillis() - start) + "ms" );
    }
}
