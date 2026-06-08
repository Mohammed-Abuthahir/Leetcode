import java.util.*;

class pairSum {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static void fillthelist(List<Integer> nums, ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            nums.add(currNode.val);
            currNode = currNode.next;
        }
    }
    public static int pairsum(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        fillthelist(nums, head);
        int max = 0;
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            max = Math.max(max, nums.get(left) + nums.get(right));
            left++;
            right--;
        }
        return max;
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(5);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);
        head.next = second;
        second.next = third;
        third.next = fourth;
        int result = pairsum(head);
        System.out.println(result);
    }
}