package com.yy.object;

import java.util.List;

/**
 * @author gongcy
 * @date 2022/12/6 10:22 上午
 * @Description
 */
public class Notification {

    private List<String> emailAddress;
    private List<String> telephones;
    private List<String> wechatIds;

    public Notification() {
    }

    public void setEmailAddress(List<String> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTelephones(List<String> telephones) {
        this.telephones = telephones;
    }

    public void setWechatIds(List<String> wechatIds) {
        this.wechatIds = wechatIds;
    }

    public void notify(NotificationEmergencyLevel level, String message) {
        if (level.equals(NotificationEmergencyLevel.SEVERE)) {
            System.out.println("自动语音电话通知.. API报警" + message);
        } else if (level.equals(NotificationEmergencyLevel.URGENCY)) {
            System.out.println("微信消息通知..");
        } else if (level.equals(NotificationEmergencyLevel.TRIVIAL)) {
            System.out.println("邮件通知..");
        }
    }
}
