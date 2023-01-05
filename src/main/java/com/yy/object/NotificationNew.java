package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/7 5:06 下午
 * @Description
 */
public abstract class NotificationNew {

    protected MsgSender msgSender;

    public NotificationNew(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String msgSender);
}
