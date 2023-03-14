package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/14 1:26 下午
 * @Description
 */
public class BitTemplate {

    public static void main(String[] args) {

        // 利用或操作|和空格将英文转为小写
        System.out.println(('a' | ' ') == 'a');
        System.out.println(('A' | ' ') == 'a');

        // 利用与操作&和下划线将英文字符转换为大写
//        ('b' & '_') = 'B';

        // 利用异或和空格对英文字符大小写互换


        // 不用临时变量交换两个数

        int a = 1,b = 2;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a);
        System.out.println(b);

        // 不使用+操作符加1
        int n = 1;
        n = -~n;
        System.out.println(n);

        // 不使用-操作符减1
        int m = 2;
        m = ~-n;
        System.out.println(m);

        // 判断两数是否异号 原理很棒
        int x = -1,y = 2;
        boolean f = ((x ^ y) < 0);
    }

    void model() {
        int[] arr = {1,2,3,4};
        int index = 0;

        while (true) {
//            System.out.println(arr[index % arr.length]);
            System.out.println(arr[index & (arr.length - 1)]);
            index++;
        }
    }
}
