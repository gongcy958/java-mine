package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/14 12:04 下午
 * @Description
 */
public class DiffPoint {

    void diff(int[] nums) {

        int[] diff = new int[nums.length];
        diff[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }

        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = res[i-1] + diff[i];
        }
    }

    class Difference {

        // 差分数组
        private int[] diff;

        // 输入一个初始数组，区间操作都在这个数组上进行
        public Difference(int[] nums) {
            assert nums.length > 0;
            diff = new int[nums.length];

            // 根据初始数组构造差分数组
            diff[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                diff[i] = nums[i] - nums[i - 1];
            }
        }

        // 给闭区间[i,j]增加val
        public void increment(int i, int j, int val) {
            diff[i] += val;
            if (j + 1 < diff.length) {
                diff[j + 1] -= val;
            }
        }

        public int[] result() {
            int[] res = new int[diff.length];
            // 根据差分数组构造结果数组
            res[0] = diff[0];
            for (int i = 1; i < diff.length; i++) {
                res[i] = res[i - 1] + diff[i];
            }
            return res;
        }


    }
}
