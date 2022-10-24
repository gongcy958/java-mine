package com.yy.design.create.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author gongcy
 * @date 2022/10/19 1:35 下午
 * @Description
 */
public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();

    private IdGenerator() {

    }

    public static IdGenerator getInstance() {
        return instance;
    }

    public Long getId() {
        return id.incrementAndGet();
    }
}
