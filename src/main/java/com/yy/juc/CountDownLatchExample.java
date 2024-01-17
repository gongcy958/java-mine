package com.yy.juc;

import java.util.concurrent.CountDownLatch;

/**
 * @author gongcy
 * @date 2023/6/19 4:20 下午
 * @Description
 */
public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        int workerCount = 3;
        CountDownLatch latch = new CountDownLatch(workerCount);

        // 创建并启动多个工作线程
        for (int i = 0; i < workerCount; i++) {
            WorkerThread worker = new WorkerThread("Worker " + (i + 1), latch);
            worker.start();
        }

        // 主线程等待所有工作线程完成
        System.out.println("主线程等待工作线程完成...");
        latch.await();

        // 所有工作线程完成后，主线程继续执行
        System.out.println("所有工作线程已完成，主线程继续执行");
    }
}
