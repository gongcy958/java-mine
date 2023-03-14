package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/14 6:48 上午
 * @Description
 */
public class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            res += nums[i];
        }

        return res;
    }
}
