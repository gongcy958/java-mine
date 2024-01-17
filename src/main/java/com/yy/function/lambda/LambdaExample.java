package com.yy.function.lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.IntConsumer;

/**
 * @author gongcy
 * @date 2023/7/21 1:50 下午
 * @Description
 */
public class LambdaExample {

    public static void main(String[] args) {

//        String[] planets = new String[]{"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
//        System.out.println(Arrays.toString(planets));
//
//        Arrays.sort(planets,String::compareToIgnoreCase);
//        Arrays.sort(planets,(x,y) -> x.compareToIgnoreCase(y));
//
//        Arrays.sort(planets);
//        System.out.println(Arrays.toString(planets));
//
//        Arrays.sort(planets, Comparator.comparingInt(String::length));
//        System.out.println(Arrays.toString(planets));
//
//        // 定时器
//
//        Timer timer = new Timer(1000,event -> System.out.println("This time is " + new Date()));
//        timer.start();
//
//        JOptionPane.showMessageDialog(null,"Quit program?");
//        System.exit(0);
//
//        BiFunction<String,String,Integer> comp = (first,second) -> first.length() - second.length();
//
////        Date day = new Date();
////        LocalDate hireDay = Objects.requireNonNull(day,() -> new LocalDate(1970,1,1));
//
//        Timer timer1 = new Timer(1000, System.out::println);

//        repeatMessage("Hello",1000);

//        repeat(10,() -> System.out.println("Hello,World!"));

//        repeat(10,i -> System.out.println("Countdown: " + (9 - i)));

        Person p1 = new Person("mine",18);
        Person p2 = new Person("xiaopi",19);
        Person p3 = new Person("jack",20);

        Person[] peoples = {p1,p2,p3};
        System.out.println(Arrays.toString(peoples));

        Arrays.sort(peoples,Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        System.out.println(Arrays.toString(peoples));

        // 变体
        Arrays.sort(peoples,Comparator.comparing(Person::getName,(s,t) -> Integer.compare(s.length(),t.length())));
        // 变体
        Arrays.sort(peoples,Comparator.comparingInt(p -> p.getName().length()));


        Arrays.sort(peoples,Comparator.comparing(Person::getName,Comparator.nullsFirst(Comparator.naturalOrder())));


    }

    public static void repeatMessage(String text, int delay) {

        ActionListener listener = event -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay,listener).start();
    }

//    public static void countDown(int start, int delay) {
//        ActionListener listener = event -> {
//            start--;
//            System.out.println(start);
//        };
//        new Timer(delay,listener).start();
//    }

//    public static void repeat(String text, int count) {
//        for (int i = 0; i <= count; i++) {
//            ActionListener listener = event -> {
//                System.out.println(i + ": " + text);
//            };
//            new Timer(1000,listener).start();
//        }
//    }

//    public static void same() {
//        int first = 1;
//        Comparator<String> comp = (first,second) -> first.length() - second.length();
//
//    }

    public void init() {
        ActionListener listener = event -> {
            System.out.println(this.toString());
        };
    }

//    public static void repeat(int n, Runnable action) {
//        for (int i = 0; i < n; i++) {
//            action.run();
//        }
//    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }
}
