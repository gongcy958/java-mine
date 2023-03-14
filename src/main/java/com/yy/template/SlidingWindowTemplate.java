package com.yy.template;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author gongcy
 * @date 2023/3/14 2:54 下午
 * @Description
 */
public class SlidingWindowTemplate {

//    void slide(String s) {
//        int left = 0,right = 0;
//        Set<String> window = new HashSet<>();
//
//        while (right < s.length()) {
//            window.add(s[right]);
//            right++;
//
//            while (window needs shrink){
//                window.remove(s[left]);
//                left++;
//            }
//        }
//    }

//    void slidingWindow(String s) {
//        Map<Character,Integer> window;
//        int left = 0,right = 0;
//
//        while (right < s.length()) {
//            // c 是将移入窗口的字符
//            char c = s.charAt(right);
//            // 增大窗口
//            right++;
//            // 进行窗口内一系列数据的更新
//
//            // 判断左侧窗口是否要收缩
//            while (window needs shringk){
//                char d = s.charAt(left);
//                left++;
//            }
//        }
//    }

//    public static void main(String[] args) {
//        String s = "hello";
//        for (char c : s.toCharArray()) {
//            System.out.println(c);
//        }
//    }


    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String target = "ABC";
        String result = minWindow(s, target);
        System.out.println(result);
    }

    public static String minWindow(String s, String t) {

        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c,need.getOrDefault(c, 0) + 1);
        }

        int left = 0,right = 0;
        int valid = 0;

        // 记录最小覆盖子串的起始索引及长度
        int start = 0,len = Integer.MAX_VALUE;
        while (right < s.length()) {
            // c 是将移入窗口的字符
            char c = s.charAt(right);
            // 扩大窗口
            right++;
            // 进行窗口内数据一系列更新
            if (need.containsKey(c)) {
                window.put(c,window.getOrDefault(c,0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            // 判断左侧窗口是否要收缩
            while (valid == need.size()) {
                // 在这里更新最小覆盖子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }

                // d 是将移出窗口的字符
                char d = s.charAt(left);
                // 缩小窗口
                left++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d,window.getOrDefault(d,0) - 1);
                }
            }
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(start,start + len);
    }
}
