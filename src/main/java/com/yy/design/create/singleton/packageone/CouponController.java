package com.yy.design.create.singleton.packageone;

/**
 * @author gongcy
 * @date 2022/11/3 2:13 下午
 * @Description 模拟业务侧 卡券
 */
public class CouponController {

//    private SampleLogger logger = new SampleLogger();

    // 类级锁 -> 单例类
    private SampleLogger logger = SampleLogger.getInstance();

    public void getCouponId(String userName,String password) {
        logger.log(userName + "query");
    }


}
