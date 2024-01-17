package com.yy.function.lambda;

/**
 * @author gongcy
 * @date 2023/7/21 4:29 下午
 * @Description
 */
public class Person {

    private String name;
    private int age;
    private String address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
