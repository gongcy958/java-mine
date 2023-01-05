package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/3 11:40 上午
 * @Description
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static Person getInstance() {
        return new Student("mine",18);
    }
}
