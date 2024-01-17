package com.yy.spring;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author gongcy
 * @date 2024/1/12 5:27 下午
 * @Description
 */
public class RedissonTest {


    public static void main(String[] args) {
        RLock anyLock = Redisson.create().getLock("anyLock");
        anyLock.lock();

        anyLock.unlock();
    }
}
