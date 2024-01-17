package com.yy.interface0;

import com.yy.function.lambda.Employee;

/**
 * @author gongcy
 * @date 2023/7/20 9:36 下午
 * @Description
 */
public interface BootInterface {

    Comparable x = new Patient();
    Employee e = new Employee();

    void boot();

    Integer CAPACITY = 10;

    default void test(){
        System.out.println("hello");
    }

    void add();

    static void peek() {
        System.out.println("hhhh");
    }
}
