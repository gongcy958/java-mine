package com.yy.juc;


/**
 * @author gongcy
 * @date 2023/6/20 2:57 下午
 * @Description
 */
public class SynchronizeTheory {

    public synchronized void method() {

        System.out.println("进入同步代码块");

        // 省略同步逻辑...

        System.out.println("Synchronized code.");

    }

}
