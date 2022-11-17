package com.yy.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gongcy
 * @date 2022/11/15 11:07 上午
 * @Description
 */
public class HelloWorld1 {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("com.yy.log.HelloWorld1");
        logger.debug("Hello World. ");
    }
}
