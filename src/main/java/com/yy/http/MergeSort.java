package com.yy.http;

/**
 * @author gongcy
 * @date 2023/11/16 2:55 下午
 * @Description
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = new int[]{11,8,3,9,7,1,2,5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("----------");
        mergeSort(nums,nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void mergeSort(int[] nums, int n) {
        // 1.递推公式 merge_sort(p...r) = merge(merge_sort(p...q),merge_sort(q+1,r))
        // 2.终止条件 p >= r 不再继续分解
        t_sort(nums,0,n - 1);
    }

    private static void t_sort(int[] nums, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = (p + r) / 2;
        t_sort(nums,p,q);
        t_sort(nums,q+1,r);

    }
}
