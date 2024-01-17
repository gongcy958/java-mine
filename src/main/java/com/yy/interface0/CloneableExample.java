package com.yy.interface0;

import com.yy.function.lambda.Employee;
import com.yy.function.lambda.Manager;

import java.util.Date;

/**
 * @author gongcy
 * @date 2023/7/21 12:08 下午
 * @Description
 */
public class CloneableExample{

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee("mine",1000);
        employee.setDate(new Date());
//        Employee copy = employee;
//        copy.setName("boy");
        System.out.println("hhhh");

        Employee clone = employee.clone();
        clone.setName("xm");
        System.out.println("---");

        // 子类克隆
//        Manager manager = new Manager("mine",1000);
//        Employee clone1 = manager.clone();
//        System.out.println("...");

        int[] luckyNumbers = {2,3,5,7,11,13};
        int[] cloned = luckyNumbers.clone();
        cloned[5] = 12;
        System.out.println("....");

        Employee employee1 = new Employee("jack",1);
        Employee employee2 = new Employee("tom",2);
        Employee employee3 = new Employee("rose",3);
        Employee[] employees = {employee1,employee2,employee3};
        Employee[] clone1 = employees.clone();
        System.out.println("00");


    }
}
