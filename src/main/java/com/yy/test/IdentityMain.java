package com.yy.test;

import com.yy.template.Employee;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author gongcy
 * @date 2023/4/21 9:34 上午
 * @Description
 */
public class IdentityMain {

    public static void main(String[] args) {

//        Employee employee = new Employee("jack",5000,1999,1,1);
//        Class<? extends Employee> clazz = employee.getClass();
//
//        System.out.println(clazz);

//        System.out.println(employee);

//        String s = "OK";
//        StringBuilder sb = new StringBuilder(s);
//        int i = sb.hashCode();
//        System.out.println(s.hashCode() + " " + sb.hashCode());
//
//        String t = new String("OK");
//        StringBuilder tb = new StringBuilder(t);
//        System.out.println(t.hashCode() + " " + tb.hashCode());

        int[] luckyNumbers = {2,3,5,7,11,13};
//        String s = "" + luckyNumbers;
//        System.out.println(s);

        String s = Arrays.toString(luckyNumbers);
        System.out.println(s);

        var staff = new ArrayList<Employee>();
        var a = "Java";
        System.out.println(a.getClass());

        staff.add(new Employee("jack",10000,1999,1,1));
        staff.add(new Employee("tony",20000,2000,1,1));
        staff.ensureCapacity(100);

        System.out.println(staff.size());
        staff.trimToSize();

        Employee marie = staff.set(1, new Employee("marie", 30000, 2002, 1, 1));
        System.out.println(marie);

        Integer n = 10;
        int i = n.intValue();
        System.out.println(i);

        String s1 = n.toString();
        System.out.println(s1);

        String s2 = Integer.toString(301);
    }
}
