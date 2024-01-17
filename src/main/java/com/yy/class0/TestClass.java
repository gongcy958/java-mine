package com.yy.class0;

/**
 * @author gongcy
 * @date 2023/7/21 5:24 下午
 * @Description
 */
public class TestClass {

    public static void main(String[] args) {

        TalkingClock talkingClock = new TalkingClock(1000,true);
        TalkingClock.TimePrinter listener = talkingClock.new TimePrinter();

    }
}
