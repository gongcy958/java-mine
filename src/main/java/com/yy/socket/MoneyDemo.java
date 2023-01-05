package com.yy.socket;

/**
 * @author gongcy
 * @date 2022/11/18 1:56 下午
 * @Description
 */
public class MoneyDemo {

    public static void main(String[] args) {

        double basic = 10000;

        for (int i = 1; i <= 50; i++) {
            double sum = basic * 1.15;
            System.out.println("第" + i + "年本息和是: " + sum);
            basic = sum;
        }
    }

}
