package com.yy.template;

/**
 * @author gongcy
 * @date 2023/4/20 4:14 下午
 * @Description
 */
public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name,salary,year,month,day);
        bonus = 0;
    }

//    public Manager() {
//    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

//    @Override
//    public Manager getBuddy() {
//        return new Manager();
//    }

    public void test() {
        System.out.println(hireDay);
    }
}
