package com.yy.function.lambda;

import java.io.IOException;

/**
 * @author gongcy
 * @date 2023/7/20 1:26 下午
 * @Description
 */
public class Manager extends Employee{

    public double bony;

    public double getBony() {
        return bony;
    }

    public void setBony(double bony) {
        this.bony = bony;
    }

    public Manager(String name, double salary) {
        super(name, salary);
    }

    private void test() {
        System.out.println("test.");
    }

    public void run() throws IOException {
        System.out.println("run..");
    }


}
