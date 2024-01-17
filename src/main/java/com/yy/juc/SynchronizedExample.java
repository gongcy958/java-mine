package com.yy.juc;

/**
 * @author gongcy
 * @date 2023/6/20 1:59 下午
 * @Description
 */
public class SynchronizedExample {

    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
