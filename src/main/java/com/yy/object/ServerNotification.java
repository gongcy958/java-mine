package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/7 5:07 下午
 * @Description
 */
public class ServerNotification extends NotificationNew{
    public ServerNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
