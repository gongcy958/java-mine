package com.yy.structure;

/**
 * @author gongcy
 * @date 2023/7/14 4:50 下午
 * @Description
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("位运算Demo-------");
        int oldCapacity = 16;
        int newCapacity = oldCapacity >> 1;  // 计算原始容量的一半

        System.out.println("Old Capacity: " + oldCapacity);
        System.out.println("New Capacity: " + newCapacity);

        System.out.println("操作数栈Demo-------");

        int size = 5;

        System.out.println("--size: " + --size);
        System.out.println("Updated size: " + size);

        System.out.println("size--: " + size--);
        System.out.println("Updated size: " + size);


    }
}
