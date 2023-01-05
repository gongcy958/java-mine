package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/7 4:11 下午
 * @Description
 */
public class AlertClient {

    public static void main(String[] args) {

        ApiStatInfo apiStatInfo = new ApiStatInfo();
        apiStatInfo.setApi("/api/test");
        apiStatInfo.setErrorCount(20);
        apiStatInfo.setDurationOfSeconds(1);
        apiStatInfo.setRequestCount(10);
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
