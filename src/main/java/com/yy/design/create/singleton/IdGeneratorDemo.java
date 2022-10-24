package com.yy.design.create.singleton;

/**
 * @author gongcy
 * @date 2022/10/19 1:54 下午
 * @Description
 */
public class IdGeneratorDemo {

    public static void main(String[] args) {

        InnerIdGenerator instance = InnerIdGenerator.getInstance();
        long id = instance.getId();
        System.out.println(id);

        IdGeneratorEnum instance1 = IdGeneratorEnum.INSTANCE;
        long id1 = instance1.getId();

    }
}
