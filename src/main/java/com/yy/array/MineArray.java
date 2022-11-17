package com.yy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author gongcy
 * @date 2022/11/2 5:10 下午
 * @Description
 */
public class MineArray {

    public static void main(String[] args) {

        List<String> array = new CopyOnWriteArrayList<>();
        array.add("jack");
        array.add("rose");
        array.add("tom");

        List<String> normalList = new ArrayList<>();
        normalList.add("hades");
        normalList.add("gong");

        List<String> nom = new CopyOnWriteArrayList<>(normalList);

        List<String> bak = new CopyOnWriteArrayList<>(array);
        System.out.println("bak是：" + bak);

        List<Object> l = new ArrayList<Object>(Arrays.asList("foo","bar"));
        l.set(0,new Object());


        Object[] objects = Arrays.copyOf(normalList.toArray(), 1);



        System.out.println(array);
    }
}
