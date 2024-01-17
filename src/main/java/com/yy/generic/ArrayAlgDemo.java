package com.yy.generic;

import com.yy.function.lambda.Employee;

/**
 * @author gongcy
 * @date 2023/7/25 2:41 下午
 * @Description
 */
public class ArrayAlgDemo {

    public static void main(String[] args) {
//        String middle = ArrayAlg.<String>getMiddle("John", "Q.", "Public");
//        double middle = ArrayAlg.<Double>getMiddle(3.14, 1729, 0);
//        System.out.println(middle);

//        Pair<String> stringPair = new Pair<>("jack","rose");
//        Pair<Employee> employeePair = new Pair<>(new Employee("jack",1000),new Employee("rose",2000));
//
//        Class<? extends Pair> aClass = stringPair.getClass();
//        Class<? extends Pair> aClass1 = employeePair.getClass();
//
//        if (aClass == aClass1) {
//            System.out.println("类型擦除后正确");
//        }

//        Pair<String>[] table = new Pair<String>[10];
//        // 类型擦除后 Pair[] 可转换为 Object[]
//        Object[] objArray = table;
//        objArray[0] = "Hello";

        Pair<String> p = Pair.makePair(String::new);

    }
}
