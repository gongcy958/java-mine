package algorithm.doublepoint;

/**
 * @author gongcy
 * @date 2023/1/4 9:26 上午
 * @Description
 */
public class RemoveDuplicateItem {

    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2,3,3,4};
        int length = removeDuplicateItem(nums);
        System.out.println(length);
    }

    /**
     * No.26 删除有序数组重复项
     * @param nums
     * @return
     */
    private static int removeDuplicateItem(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0,fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        System.out.println("循环结束时slow所在索引位置: " + slow);
        return slow+1;
    }

    private static ListNode removeLinkedListDuplicateItem(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head,fast = head;
        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }

    /**
     *
     * No.83 删除排序链表中重复项
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


