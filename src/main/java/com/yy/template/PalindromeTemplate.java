package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/14 10:04 上午
 * @Description
 */
public class PalindromeTemplate {

    public static void main(String[] args) {
        boolean flag = isPalindrome("abba");
        System.out.println(flag);
        boolean palindrome = isPalindrome("abca");
        System.out.println(palindrome);
    }

    static boolean isPalindrome(String s) {
        int left = 0,right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    // 在s中寻找以s[l]和s[r]为中心的最长回文串
    String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        return s.substring(l + 1,r);
    }

}
