package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/7 3:56 下午
 * @Description
 */
public class ApplicationContext {

    private AlertRule rule;
    private Notification notification;
    private Alert alert;

    public void initializeBeans() {
        rule = new AlertRule();
        notification = new Notification();
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(rule,notification));
        alert.addAlertHandler(new ErrorAlertHandler(rule,notification));
    }

    public Alert getAlert() {
        return alert;
    }

    // 饿汉式单例
    private static final ApplicationContext instance = new ApplicationContext();
    private ApplicationContext() {
        initializeBeans();
    }

    public static ApplicationContext getInstance() {
        return instance;
    }

}
