package com.yy.time;

import lombok.extern.slf4j.Slf4j;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author gongcy
 * @date 2023/4/20 7:48 下午
 * @Description
 */
@Slf4j
public class ScheduleDemo {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2);
//        ScheduledFuture<?> future = scheduledThreadPoolExecutor.schedule(() -> System.out.println("我要延迟5秒执行"), 10000, TimeUnit.MILLISECONDS);
//        System.out.println("继续向下执行");
//        try {
//            Object o = future.get();
//            System.out.println("阻塞后处理的值是 " + o);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//        scheduledThreadPoolExecutor.scheduleAtFixedRate(() -> {
//            log.info("send heart beat.");
//            long startTime = System.currentTimeMillis(),nowTime = startTime;
//            while (nowTime - startTime < 5000) {
//                nowTime = System.currentTimeMillis();
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                log.info("task over..");
//            }
////            throw new RuntimeException("unexpected error,stopping working.");
//        },1000,2000,TimeUnit.MILLISECONDS);
//
//        scheduledThreadPoolExecutor.scheduleAtFixedRate(() -> {
//            System.out.println("running..");
//        },1000,2000,TimeUnit.MILLISECONDS);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("running..");
                throw new RuntimeException("unexpected error,stopping working.");
            }
        },1000,2000);
    }

}
