package com.yy.basic.function;

/**
 * @author gongcy
 * @date 2023/2/27 7:22 上午
 * @Description
 */
public class Student {

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name = "mine";
    private int age = 20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
