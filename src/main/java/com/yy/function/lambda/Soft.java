package com.yy.function.lambda;

/**
 * @author gongcy
 * @date 2022/11/2 6:00 下午
 * @Description
 */
public class Soft implements Strategy{
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}
