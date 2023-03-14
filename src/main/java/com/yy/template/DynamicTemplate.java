package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/14 11:55 上午
 * @Description
 */
public class DynamicTemplate {

    int dp(int[] coins,int amount) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblem = dp(coins,amount - coin);
            // 子问题无解则跳过
            if (subProblem == -1) {
                continue;
            }

            res = Math.min(res,subProblem + 1);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    int dpFramework(int amount) {
        int[] coins = new int[16];
        for (int coin : coins) {
            dpFramework(amount - coin);
        }

        return 0;
    }
}
