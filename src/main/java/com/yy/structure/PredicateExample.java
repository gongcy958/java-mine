package com.yy.structure;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author gongcy
 * @date 2023/7/17 8:16 下午
 * @Description
 */
public class PredicateExample {

    public static void main(String[] args) {
        // 1.过滤集合中的元素
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
//        Predicate<String> startsWithAPredicate = name -> name.startsWith("A");
//        List<String> collect = names.stream().filter(startsWithAPredicate).collect(Collectors.toList());
//        System.out.println(collect);
//        List<String> a = names.stream().filter(t -> t.startsWith("A")).collect(Collectors.toList());
//        System.out.println(a);

        // 2.数据校验
//        Predicate<String> lengthValidator = str -> str.length() > 5;
//        System.out.println(lengthValidator.test("Hello"));
//        System.out.println(lengthValidator.test("Welcome"));

        // 3.函数组合
        // 传入一个num 看num对2取余是否为0 表达式1
//        Predicate<Integer> isEven = num -> num % 2 == 0;
//        // 看num是否大于0 表达式2
//        Predicate<Integer> isPositive = num -> num > 0;
//        // 合并成一个表达式 表达式1 && 表达式2
//        Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);
//        // 测试
//        System.out.println(isEvenAndPositive.test(6));
//        System.out.println(isEvenAndPositive.test(-5));

        PredicateInterface<String> isMarie = s -> s.equals("Marie");
        System.out.println(isMarie.test("Marie"));
        System.out.println(isMarie.test("hobby"));


    }
}
