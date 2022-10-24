package com.yy.design.create.factory;

/**
 * @author gongcy
 * @date 2022/10/24 3:47 下午
 * @Description
 */
public class InvalidRuleConfigException extends RuntimeException{

    private String errMsg;

    public InvalidRuleConfigException(String message) {
        this.errMsg = message;
    }
}
