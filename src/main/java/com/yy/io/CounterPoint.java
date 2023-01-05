package com.yy.io;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author gongcy
 * @date 2022/12/16 4:40 下午
 * @Description
 */
public class CounterPoint extends Point{

    private static final AtomicInteger counter = new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public static int numberCreated() {
        return counter.get();
    }
}
