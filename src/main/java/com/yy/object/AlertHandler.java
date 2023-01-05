package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/7 3:49 下午
 * @Description
 */
public abstract class AlertHandler {

    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);


}
