package com.yy.juc;

import java.util.concurrent.Semaphore;

/**
 * @author gongcy
 * @date 2023/6/19 10:19 上午
 * @Description
 */
public class SemaphoreExample {

    public static void main(String[] args) {

        Semaphore printerSemaphore = new Semaphore(1,true);

        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            PrinterTask task = new PrinterTask("任务" + (i + 1), printerSemaphore);
            threads[i] = new Thread(task);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
