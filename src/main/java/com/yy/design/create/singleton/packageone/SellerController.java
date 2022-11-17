package com.yy.design.create.singleton.packageone;

/**
 * @author gongcy
 * @date 2022/11/3 2:14 下午
 * @Description 模拟业务侧 售卖
 */
public class SellerController {

//    private SampleLogger logger = new SampleLogger();

    // 类级锁 -> 单例类
    private SampleLogger logger = SampleLogger.getInstance();

    public void getSellerProduct(String userName) {
        logger.log(userName + "seller");
    }


}
