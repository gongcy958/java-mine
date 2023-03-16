package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/15 10:15 上午
 * @Description
 */
public class QuickSortTemplate {

    void sort(int[] nums, int lo, int hi) {
        // 前序遍历位置
        // 通过交换元素构建分界点

        int p = partition(nums,lo,hi);

        sort(nums,lo,p - 1);
        sort(nums,p + 1,hi);
    }

    private int partition(int[] nums, int lo, int hi) {
        return 0;
    }
}
