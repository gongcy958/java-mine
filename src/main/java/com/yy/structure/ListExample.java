package com.yy.structure;

import org.springframework.util.SerializationUtils;

import java.util.*;
import java.util.function.Predicate;

/**
 * @author gongcy
 * @date 2023/7/13 9:45 下午
 * @Description
 */
public class ListExample {

    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("banana");
//        list.add("cherry");
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//            if (element.equals("apple")) {
//                iterator.remove();
//            }
//        }

//        ArrayListPlus<String> listPlus = new ArrayListPlus<>();
//        listPlus.add("jack");
//        listPlus.add("rose");
//        listPlus.add("tom");
//
//        Iterator<String> iterator = listPlus.iterator();
//        String next = iterator.next();

//        ArrayList<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("banana");
//        list.add("cherry");
//
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//        }
//
//        while (iterator.hasPrevious()) {
//            String element = iterator.previous();
//            if (element.equals("banana")) {
//                iterator.set("new banana"); // 修改元素
//            }
//        }
//
//        System.out.println(list); // 输出：[apple, new banana, cherry]
//
//        ListIterator<String> iterator2 = list.listIterator(1);
//        String next = iterator2.next();
//        String previous = iterator2.previous();
//        System.out.println(next);
//        System.out.println(previous);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Spliterator<Integer> spliterator = list.spliterator();
        spliterator.forEachRemaining(e -> System.out.println(e * 2)); // 并行遍历并对每个元素进行操作

    }
}
