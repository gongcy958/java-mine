package com.yy.function.lambda;


import java.util.Objects;

/**
 * @author gongcy
 * @date 2023/4/6 4:26 下午
 * @Description
 */
public class Employee {

    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Harry",5000);
        System.out.println(e.getName() + " " + e.getSalary());

        Employee b = new Employee("jack",3000);
        swap(e,b);
        int a = 0;
    }

    private static void raiseSalary(Employee e) {
        e.salary = e.salary * 3;
    }

    public static void swap(Employee x,Employee y){
        Employee tmp = x;
        x = y;
        y = tmp;
    }
}
