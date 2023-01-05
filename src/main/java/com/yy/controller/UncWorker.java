package com.yy.controller;

/**
 * @author gongcy
 * @date 2022/12/27 9:37 下午
 * @Description
 */
public class UncWorker implements Runnable{

    private int value = 0;

    @Override
    public void run() {
        System.out.println(value++);
    }
}
