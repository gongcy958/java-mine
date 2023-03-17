package com.yy.template;

import java.util.Stack;

/**
 * @author gongcy
 * @date 2023/3/16 1:32 下午
 * @Description
 */
public class SingleQueueTemplate {

    int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        // 存放答案的数组
        int[] res = new int[n];

        Stack<Integer> s = new Stack<>();
        // 倒着向栈里放
        for (int i = n - 1; i >= 0; i--) {
            // 判定个子高矮
            while (!s.isEmpty() && s.peek() <= nums[i]) {
                s.pop();
            }

            res[i] = s.isEmpty() ? -1 : s.peek();
            s.push(nums[i]);
        }

        return res;
    }
}
