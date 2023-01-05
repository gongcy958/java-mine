package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/3 5:34 下午
 * @Description
 */
public class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(int age, String name) {
        super(age, name);
    }
}
