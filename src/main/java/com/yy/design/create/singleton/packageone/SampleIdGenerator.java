package com.yy.design.create.singleton.packageone;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author gongcy
 * @date 2022/11/3 2:38 下午
 * @Description
 */
public class SampleIdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static final SampleIdGenerator instance = new SampleIdGenerator();

    private SampleIdGenerator() {
    }

    public static SampleIdGenerator getInstance() {
        return instance;
    }

    public Long getId() {
        return id.incrementAndGet();
    }
}
