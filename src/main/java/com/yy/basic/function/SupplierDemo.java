package com.yy.basic.function;

import java.util.function.Supplier;

/**
 * @author gongcy
 * @date 2023/2/27 7:16 上午
 * @Description
 */
public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "hello,world";
        String result = supplier.get();

//        Student student = new Student();
//        System.out.println(student.getName());

        Supplier<Student> stuSupplier = Student::new;
        System.out.println(stuSupplier.get().getName());


    }

}
