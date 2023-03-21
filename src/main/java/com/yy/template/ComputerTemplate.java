package com.yy.template;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author gongcy
 * @date 2023/3/17 1:03 下午
 * @Description
 */
public class ComputerTemplate {

//    static int change(String s) {
//        int n = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            n = 10 * n + (c - '0');
//        }
//
//        return n;
//    }
//
//
//    public static void main(String[] args) {
//        String s = "458";
//        int m = change(s);
//        System.out.println(m);
//
//    }
//
//    int calculate(String s) {
//        Stack<Integer> stk = new Stack<>();
//        int num = 0;
//        char sign = '+';
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (isDigital(c)) {
//                num = 10 * num + (c - '0');
//            }
//
//            if (!isDigital(c) && c != ' ' || i == s.length() - 1) {
//                int pre;
//                switch (sign) {
//                    case '+':
//                        stk.push(num);
//                        break;
//                    case '-':
//                        stk.push(-num);
//                        break;
//                    case '*':
//                        pre = stk.top();
//                        stk.pop();
//                        stk.push(pre * num);
//                        break;
//                    case '/':
//                        pre = stk.top();
//                        stk.pop();
//                        stk.push(pre / num);
//                        break;
//                }
//
//                sign = c;
//                num = 0;
//            }
//        }
//
//        int res = 0;
//        while (!stk.isEmpty()) {
//            res += stk.top();
//            stk.pop();
//        }
//
//        return res;
//    }
//
//    private boolean isDigital(char c) {
//        return false;
//    }
}
