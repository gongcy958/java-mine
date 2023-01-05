package com.yy.object;

import java.util.List;

/**
 * @author gongcy
 * @date 2022/12/7 4:43 下午
 * @Description
 */
public class EmailMsgSender implements MsgSender{

    private List<String> emailAddresses;

    public EmailMsgSender(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @Override
    public void send(String message) {
        System.out.println("发送邮件通知");
    }
}
