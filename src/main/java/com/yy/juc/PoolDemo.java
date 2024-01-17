package com.yy.juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author gongcy
 * @date 2024/1/15 3:29 下午
 * @Description
 */
public class PoolDemo {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(16,32,300, TimeUnit.SECONDS,null,null,null);

    }
}
