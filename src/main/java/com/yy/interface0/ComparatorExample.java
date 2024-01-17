package com.yy.interface0;

import java.util.Arrays;

/**
 * @author gongcy
 * @date 2023/7/21 11:58 上午
 * @Description
 */
public class ComparatorExample {

    public static void main(String[] args) {
        LengthComparator comparator = new LengthComparator();
        // 对数组排序
        String[] friends = {"Peter","Paul","Mary"};
        Arrays.sort(friends,comparator);
        System.out.println("hhhh");
    }
}
