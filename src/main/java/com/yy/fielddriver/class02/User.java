package com.yy.fielddriver.class02;

/**
 * @author gongcy
 * @date 2024/1/16 9:15 下午
 * @Description
 */
public class User {

    private String userName;
    private Person person;

    public boolean hasPermissionTo() {
        return false;
    }

    public String userName() {
        return this.userName;
    }

    public Person person() {
        return this.person;
    }
}
