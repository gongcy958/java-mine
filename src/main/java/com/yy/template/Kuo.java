package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/22 8:37 下午
 * @Description
 */
public class Kuo {

    public static void main(String[] args) {

        String s = "()";
        boolean valid = isValid(s);
        System.out.println(valid);

    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right){
            if(chars[left] != chars[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
