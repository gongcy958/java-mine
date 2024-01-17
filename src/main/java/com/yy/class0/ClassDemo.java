package com.yy.class0;

import javax.swing.*;

/**
 * @author gongcy
 * @date 2023/7/21 4:49 下午
 * @Description
 */
public class ClassDemo {

    public static void main(String[] args) {

//        DynamicClassGenerator.NamePolicy namePolicy = new DynamicClassGenerator.NamePolicy();
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);


    }
}
