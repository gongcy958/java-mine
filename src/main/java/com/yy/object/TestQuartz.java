package com.yy.object;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author gongcy
 * @date 2022/12/14 10:33 上午
 * @Description
 */
public class TestQuartz {

    public static void main(String[] args) {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder
                    .simpleSchedule()
                    .withIntervalInSeconds(2)
                    .withRepeatCount(10);

            // 创建一个触发器
            SimpleTrigger trigger = TriggerBuilder
                    .newTrigger()
                    .withIdentity("trigger1","group1")
                    .startNow()
                    .withSchedule(scheduleBuilder)
                    .build();

            JobDetail jobDetail = JobBuilder.newJob(MailJob.class)
                    .withIdentity("mailjob1","mailgroup")
                    .usingJobData("email","chengyao.gong27@gmail.com")
                    .build();

            scheduler.scheduleJob(jobDetail,trigger);
            scheduler.start();

            try {
                Thread.sleep(20 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            scheduler.shutdown(true);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
