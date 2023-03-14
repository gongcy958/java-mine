package com.yy.basic.function;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author gongcy
 * @date 2023/3/6 7:03 下午
 * @Description
 */
public class ShotApplet {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("mine");
        words.add("pig");
        words.add("pit");
        words.add("hello");
//        long count = words.stream().filter(t -> t.length() > 3).count();
        long count = words.parallelStream().filter(t -> t.length() > 3).count();
        System.out.println(count);

        Stream<List<String>> stream = Stream.of(words);

        Stream<String> hello = Stream.of("hello", "java", "world");

        Stream<Object> empty = Stream.empty();

        Stream<String> generate = Stream.generate(() -> "Echo");

        Stream<Double> generate1 = Stream.generate(Math::random);
    }
}
