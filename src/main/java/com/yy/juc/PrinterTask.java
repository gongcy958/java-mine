package com.yy.juc;

import java.util.concurrent.Semaphore;

/**
 * @author gongcy
 * @date 2023/6/19 10:21 上午
 * @Description
 */
public class PrinterTask implements Runnable {

    private String taskName;
    private Semaphore printerSemaphore;

    public PrinterTask(String taskName, Semaphore printerSemaphore) {
        this.taskName = taskName;
        this.printerSemaphore = printerSemaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(taskName + " 正在等待打印机...");

            // 尝试获取信号量
            printerSemaphore.acquire();

            System.out.println(taskName + " 正在使用打印机打印...");

            // 模拟打印任务需要的时间
            Thread.sleep(1000);

            System.out.println(taskName + " 打印完成.");

            // 释放信号量
            printerSemaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
