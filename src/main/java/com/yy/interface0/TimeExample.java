package com.yy.interface0;


import javax.swing.*;

/**
 * @author gongcy
 * @date 2023/7/21 11:42 上午
 * @Description
 */
public class TimeExample {

    public static void main(String[] args) {
        TimePrinter listener = new TimePrinter();
        Timer t = new Timer(1000,listener);
        t.start();
    }
}
