package com.yy.socket;

import com.yy.template.Employee;

/**
 * @author gongcy
 * @date 2023/4/20 7:35 下午
 * @Description
 */
public class Administrator extends Employee {
    public Administrator(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public void test() {
        System.out.println(hireDay);
    }
}
