package com.yy.interface0;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @author gongcy
 * @date 2023/7/21 11:39 上午
 * @Description
 */
public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("print.." + e.getWhen());
        System.out.println(Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
