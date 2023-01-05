package com.yy.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2022/12/7 2:41 下午
 * @Description
 */
public class Alert {

//    private AlertRule alertRule;
//    private Notification notification;
//
//    public Alert(AlertRule alertRule, Notification notification) {
//        this.alertRule = alertRule;
//        this.notification = notification;
//    }

    private List<AlertHandler> alertHandlerList = new ArrayList<>();

    public void addAlertHandler(AlertHandler handler) {
        this.alertHandlerList.add(handler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlerList) {
            handler.check(apiStatInfo);
        }
    }

    /**
     * 接口TPS超过某个预先设置的最大值
     * 接口请求出错数大于某个最大允许值
     * @param api
     * @param requestCount
     * @param errorCount
     * @param durationOfSeconds
     */
//    public void check(String api,long requestCount,long errorCount,long timeoutCount,long durationOfSeconds) {
//
//        long tps = requestCount/durationOfSeconds;
//        if (tps > alertRule.getMatchedRule(api).getMaxTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
//
//        if (errorCount > alertRule.getMatchedRule(api).getMaxErrorCount()) {
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
//
//        long timeoutTps = timeoutCount / durationOfSeconds;
//        if (timeoutTps > alertRule.getMatchedRule(api).getMaxTimeoutTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
//
//    }
}
