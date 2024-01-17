package com.yy.juc;


import java.util.concurrent.CompletableFuture;

/**
 * @author gongcy
 * @date 2023/6/26 10:31 上午
 * @Description
 */
public class CompletefutureExample {

    public static void main(String[] args) {

//        CompletableFuture.runAsync(CompletefutureExample::processDemo);
    }

    private static void processDemo() {

        try {
            int i = 1 / 0 ;
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
