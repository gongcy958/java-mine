package com.yy.structure;

/**
 * @author gongcy
 * @date 2023/7/14 9:49 上午
 * @Description
 */
public class CloneExample {

    public static void main(String[] args) {

        CloneEntity entity = new CloneEntity();
        entity.setName("jack");
        entity.setAge(18);
        entity.setUser(new UserInfo());

        try {
            CloneEntity clone = entity.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
