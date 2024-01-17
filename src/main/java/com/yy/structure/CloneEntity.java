package com.yy.structure;

import org.apache.catalina.User;

import java.io.Serializable;

/**
 * @author gongcy
 * @date 2023/7/14 9:49 上午
 * @Description
 */
public class CloneEntity implements Cloneable, Serializable {

    private static final long serialVersionUID = 1699583587102884353L;

    private String name;
    private int age;
    private UserInfo user;

    public String getName() {
        return name;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
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

    @Override
    protected CloneEntity clone() throws CloneNotSupportedException {
        return (CloneEntity) super.clone();
    }
}
