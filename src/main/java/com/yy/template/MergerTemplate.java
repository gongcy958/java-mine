package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/15 10:52 上午
 * @Description
 */
public class MergerTemplate {

    void sort(int[] nums, int lo, int hi) {
        int mid = (lo + hi) / 2;

        sort(nums,lo,mid);
        sort(nums,mid+1,hi);

        merge(nums,lo,mid,hi);
    }

    private void merge(int[] nums, int lo, int mid, int hi) {

    }
}
