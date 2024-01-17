package com.yy.juc;

/**
 * @author gongcy
 * @date 2023/6/20 1:59 下午
 * @Description
 */
public class SynchronizedTest {

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        // 创建并启动多个线程
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        thread1.start();
        thread2.start();

        // 等待线程执行完毕
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 输出最终的count值
        System.out.println("Count: " + example.getCount());
    }
}
