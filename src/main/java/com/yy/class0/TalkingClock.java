package com.yy.class0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @author gongcy
 * @date 2023/7/21 5:01 下午
 * @Description
 */
public class TalkingClock {

    private int interval;
    private boolean beep;

    private static String FLAG = "TRUE";

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {

        ActionListener listener = this.new TimePrinter();
        Timer timer = new Timer(interval,listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener{

        private static final int EMPTY_VALUE = 100;

        private String val;

        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone,the time is " + Instant.ofEpochMilli(event.getWhen()));
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }

        public void test() {
            System.out.println("具体实现");
        }
    }
}
