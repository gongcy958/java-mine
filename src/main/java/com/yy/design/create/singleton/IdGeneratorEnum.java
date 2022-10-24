package com.yy.design.create.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author gongcy
 * @date 2022/10/19 1:56 下午
 * @Description
 */
public enum IdGeneratorEnum {

    INSTANCE;
    private AtomicLong id = new AtomicLong(0);
    public long getId() {
        return id.incrementAndGet();
    }
}
