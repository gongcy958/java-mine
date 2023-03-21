package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/21 6:54 上午
 * @Description
 */
public class SortTemplate {

    // 定义 排序nums[lo..hi]
    // 归并排序模版
    void mergeSort(int[] nums,int lo,int hi) {
        int mid = (lo + hi) / 2;

        // 排序 nums[lo..mid]
        mergeSort(nums,lo,mid);
        // 排序 nums[mid+1..hi]
        mergeSort(nums,mid+1,hi);

        // 后序位置
        merge(nums,lo,mid,hi);
    }

    private void merge(int[] nums, int lo, int mid, int hi) {

    }

    void quickSort(int[] nums, int lo, int hi) {

        // 构造分界点
        int p = partition(nums,lo,hi);
        quickSort(nums,lo,p-1);
        quickSort(nums,p+1,hi);
    }

    private int partition(int[] nums, int lo, int hi) {
        return 0;
    }
}
