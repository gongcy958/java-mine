package algorithm.doublepoint;

import java.util.Arrays;

/**
 * @author gongcy
 * @date 2023/1/4 10:10 上午
 * @Description
 */
public class RemoveItem {

    public static void main(String[] args) {
//        int[] nums = {0,1,3,4,2,4,5};
//        int val = 4;
//        int length = removeItem(nums,val);
//        System.out.println(length);

        int[] nums = {0,1,2,3,0};
        removeZero(nums);
    }

    private static void removeZero(int[] nums) {
        if (nums.length == 0) {
            return;
        }

        int slow = 0,fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
                slow++;
            }
            fast++;
        }
        System.out.println(Arrays.toString(nums));
    }

    private static int removeItem(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0,fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
