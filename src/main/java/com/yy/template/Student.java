package com.yy.template;

/**
 * @author gongcy
 * @date 2023/4/20 7:25 下午
 * @Description
 */
public class Student extends Person{

    private String major;

    public Student(String name,String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
