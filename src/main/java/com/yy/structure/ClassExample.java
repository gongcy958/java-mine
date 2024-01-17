package com.yy.structure;

import com.yy.function.lambda.Employee;
import com.yy.function.lambda.Manager;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @author gongcy
 * @date 2023/7/20 1:26 下午
 * @Description
 */
public class ClassExample {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Employee employee = new Employee("mine",100000);
//        Class<? extends Employee> clazz = employee.getClass();
//        System.out.println(clazz.getName() + " " + employee.getName());
//        System.out.println(clazz);

//        String className = "Employee";
//        Class<?> aClass = Class.forName(className);
//        System.out.println(aClass);

//        Class<Employee> clazz = Employee.class;
//        Class<Integer> integerClass = int.class;
//        Class<Double[]> aClass1 = Double[].class;

//        Employee employee = new Employee("mine",100000);
//        if (employee.getClass() == Employee.class) {
//            System.out.println("等式成立");
//        }

//        Employee e2 = new Manager("小屁",300000);
//        if (e2 instanceof Employee) {
//            System.out.println("instanceof测试OK");
//        }
//
//        if (e2.getClass() == Manager.class) {
//            System.out.println("==测试OK");
//        }

        Class<Employee> clazz = Employee.class;
        Constructor<Employee> constructor = clazz.getConstructor();
        Employee employee = constructor.newInstance();

        Field[] fields = clazz.getFields();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            int modifiers = field.getModifiers();
            boolean aPrivate = Modifier.isPrivate(modifiers);
            System.out.println("test");
        }

        System.out.println("hhhh");
    }
}
