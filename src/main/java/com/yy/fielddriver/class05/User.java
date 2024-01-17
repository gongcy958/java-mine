package com.yy.fielddriver.class05;

import com.yy.fielddriver.class01.Entity;

/**
 * @author gongcy
 * @date 2024/1/17 9:21 下午
 * @Description
 */
public class User extends Entity {

    private String username;

    protected void setUsername(String aUsername) {
        if (this.username != null) {
            throw new IllegalStateException("The username already exist.");
        }
        if (aUsername == null) {
            throw new IllegalArgumentException("The username may not be null.");
        }
        this.username = aUsername;
    }
}
