package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/7 5:09 下午
 * @Description
 */
public class UrgencyNotification extends NotificationNew{
    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
