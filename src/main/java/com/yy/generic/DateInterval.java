package com.yy.generic;

import org.apache.poi.ss.formula.functions.T;

import java.time.LocalDate;

/**
 * @author gongcy
 * @date 2023/7/25 3:07 下午
 * @Description
 */
public class DateInterval extends Pair<LocalDate>{
    public DateInterval(LocalDate first, LocalDate second) {
        super(first, second);
    }

    public void setSecond(LocalDate second) {
        if (second.compareTo(getFirst()) >= 0) {
            super.setSecond(second);
        }
    }

    public void test() {
        String a = "mine";
//        if (a instanceof Pair<String>) {
//
//        }

//        if (a instanceof Pair<T>) {
//
//        }

//        Pair<String> p = (Pair<String>) a;

    }

}
