package com.yy.template;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author gongcy
 * @date 2023/4/20 4:12 下午
 * @Description
 */
public class Employee extends Person{

    private double salary;
    protected LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }

    //    public Employee() {
//    }
//
//    public Employee getBuddy() {
//        return new Employee();
//    }
}
