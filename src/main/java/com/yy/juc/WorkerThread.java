package com.yy.juc;

import java.util.concurrent.CountDownLatch;

/**
 * @author gongcy
 * @date 2023/6/19 4:21 下午
 * @Description
 */
public class WorkerThread extends Thread{

    private String name;
    private CountDownLatch latch;

    public WorkerThread(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(name + " 开始执行");
        // 模拟工作线程执行任务的耗时
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " 执行完成");
        latch.countDown(); // 工作线程完成任务，计数器减一
    }
}
