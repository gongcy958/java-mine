package com.yy.template;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author gongcy
 * @date 2023/4/19 9:00 下午
 * @Description
 */
public class ScheduleDemo {

    private static int count = 0;
    public static void main(String[] args) {

        scheduled();
    }

    private static void scheduled() {
        ScheduledThreadPoolExecutor scheduled = new ScheduledThreadPoolExecutor(2);
        scheduled.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                count++;
                System.out.println("定时线程执行,第" + count + "次");
                scheduled();
            }
        },0,3600, TimeUnit.SECONDS);
    }
}
