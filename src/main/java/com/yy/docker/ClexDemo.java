package com.yy.docker;

/**
 * @author gongcy
 * @date 2022/10/16 12:25 下午
 * @Description
 */
public class ClexDemo {

    public static void main(String[] args) {

        // 这段代码呢执行过程 明面上 实际上
        // 本质是基于内存 没利用到磁盘
        int a = 1;
        int b = 1;
        int sum = 2;
        System.out.println("两数相加的和是: " + sum);
    }
}
