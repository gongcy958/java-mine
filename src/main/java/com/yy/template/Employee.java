package com.yy.template;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

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


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Employee other = (Employee) obj;

//        return getName().equals(other.getName()) && salary == other.salary && hireDay.equals(other.hireDay);
        return Objects.equals(this.getName(),other.getName()) && salary == other.salary && Objects.equals(hireDay,other.hireDay);
    }

    @Override
    public int hashCode() {
//        return 7 * Objects.hashCode(getName()) + 11 * Double.hashCode(salary) + 13 * Objects.hashCode(hireDay);
        return Objects.hash(getName(),salary,hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + getName()
                + ",salary=" + salary
                + ",hireDay=" + hireDay
                + "]";
    }
}
