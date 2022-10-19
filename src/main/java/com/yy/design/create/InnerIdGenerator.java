package com.yy.design.create;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author gongcy
 * @date 2022/10/19 1:53 下午
 * @Description
 */
public class InnerIdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private InnerIdGenerator() {}

    private static class SingletonHolder{
        private static final InnerIdGenerator instance = new InnerIdGenerator();
    }

    public static InnerIdGenerator getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
