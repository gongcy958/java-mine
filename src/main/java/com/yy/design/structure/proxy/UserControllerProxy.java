package com.yy.design.structure.proxy;

/**
 * @author gongcy
 * @date 2023/2/17 3:05 下午
 * @Description
 */
public class UserControllerProxy implements IUserController{

    private MetricsCollector metricsCollector;
    private UserController userController;

    public UserControllerProxy(UserController userController) {
        this.userController = userController;
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        // 委托
        UserVo userVo = userController.login(telephone, password);
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);
        return userVo;

    }

    @Override
    public UserVo register(String telephone, String password) {
        return null;
    }
}
