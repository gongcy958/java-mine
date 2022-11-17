package com.yy.time;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author gongcy
 * @date 2022/11/15 5:00 下午
 * @Description
 */
public class TimeJob2 implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("在哪里触发呢 ");
    }
}
