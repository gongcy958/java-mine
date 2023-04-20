package com.yy.template;

/**
 * @author gongcy
 * @date 2023/4/20 7:21 下午
 * @Description
 */
public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
