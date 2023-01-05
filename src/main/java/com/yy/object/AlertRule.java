package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/7 3:06 下午
 * @Description
 */
public class AlertRule {

    public AlertRule getMatchedRule(String api) {
        return this;
    }

    public long getMaxTps() {
        return 200;
    }

    public long getMaxErrorCount() {
        return 10;
    }

    public long getMaxTimeoutTps() {
        return 3000;
    }
}
