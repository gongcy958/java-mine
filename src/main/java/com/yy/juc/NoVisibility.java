package com.yy.juc;

/**
 * @author gongcy
 * @date 2022/12/31 6:08 下午
 * @Description
 */
public class NoVisibility {

    private static int number;
    private static boolean ready;

    static class ReaderThread implements Runnable{

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }


                                                                                                                                                                                                                                                                                                                                                        public                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               static void main(String[] args) {
        new ReaderThread().run();
        ready = true;
        number = 42;
    }
}
