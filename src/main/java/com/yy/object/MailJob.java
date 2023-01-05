package com.yy.object;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gongcy
 * @date 2022/12/14 10:30 上午
 * @Description
 */
public class MailJob implements Job {


    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDetail jobDetail = context.getJobDetail();
        String email = jobDetail.getJobDataMap().getString("email");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        String now = simpleDateFormat.format(new Date());
        System.out.printf("给邮件地址 %s 发出了一封定时邮件, 当前时间是: %s%n", email, now);
    }
}
