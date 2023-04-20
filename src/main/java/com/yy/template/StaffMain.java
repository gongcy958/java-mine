package com.yy.template;

/**
 * @author gongcy
 * @date 2023/4/20 4:18 下午
 * @Description
 */
public class StaffMain {

    public static void main(String[] args) {
//        Manager boss = new Manager();
//        boss.setBonus(5000);

//        Manager boss = new Manager("Carl",80000,1987,12,15);
//        boss.setBonus(5000);
//
//        Employee[] staff = new Employee[3];
//        staff[0] = boss;
//        staff[1] = new Employee("Harry",50000,1989,10,1);
//        staff[2] = new Employee("Tony",40000,1990,3,15);

//        Manager boss2 = (Manager) staff[1];
//        System.out.println(boss2);

//        Employee boss3 = (Employee) staff[0];
//        System.out.println(boss3);
//        Manager boss3 = null;
//        if (staff[1] instanceof Manager) {
//            boss3 = (Manager) staff[1];
//        }

//        staff[2] = null;
//        if (staff[2] instanceof Manager) {
//            int a = 1;
//        }
//
//        for (Employee e : staff) {
//            System.out.println(e.getName() + " " + e.getSalary());
//        }

//        Manager[] managers = new Manager[10];
//        Employee[] staff2 = managers;

//        staff2[0] = new Employee("Harry Hacker",30000,1999,1,1);
//        managers[0].setBonus(4000);
//        System.out.println(managers[0]);

//        double x = 3.405;
//        int nx = (int) x;
//        System.out.println(nx);

        Person[] people = new Person[2];
        people[0] = new Employee("Harry",50000,1989,10,1);
        people[1] = new Student("Maria","Computer science");

        for (Person p : people) {
            System.out.println(p.getName() + " " + p.getDescription());
        }
    }
}
