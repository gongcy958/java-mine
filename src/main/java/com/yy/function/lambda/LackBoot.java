package com.yy.function.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2023/3/24 4:03 下午
 * @Description
 */
public class LackBoot {

    public static void main(String[] args) {

        final double PI = 2.54;

        List<String> words = new ArrayList<>();
        words.add("current");
        words.add("hello");
        words.add("java");

        int count = 0;
        for (String word : words) {
            if (word.length() > 4) {
                count++;
            }
        }

        System.out.println(count);
        System.out.println(15/2);

        System.out.println(2.0 - 1.1);
    }
}
