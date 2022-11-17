package com.yy.time;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author gongcy
 * @date 2022/11/15 5:03 下午
 * @Description
 */
public class TimeJobTrigger {

    public static void main(String[] args) throws SchedulerException {

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        JobDetail job = JobBuilder.newJob(TimeJob2.class)
                .withIdentity("job1","group1")
                .build();


    }
}
