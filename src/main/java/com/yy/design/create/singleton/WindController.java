package com.yy.design.create.singleton;

import com.yy.design.create.singleton.Logger;
import com.yy.design.create.singleton.SingletonLogger;

/**
 * @author gongcy
 * @date 2022/10/19 1:12 下午
 * @Description
 */

public class WindController {

    private Logger logger = new Logger();

    public void test() {
        logger.log("test wind");

        SingletonLogger.getInstance().log("test singleton class");
    }


}
