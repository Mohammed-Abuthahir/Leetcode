// 817. Linked List Components
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class linkedlistComponents{
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static int numComponents(ListNode head, int[] nums){
       List<Integer> list = new ArrayList<>();
        ListNode currNode = head;
        while(currNode != null){
            list.add(currNode.val);
            currNode = currNode.next;
        }
        List<Integer> arr = new ArrayList<>();
        for(int num : nums) arr.add(num);
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (arr.contains(list.get(i))) {
                if (i == list.size() - 1 || !arr.contains(list.get(i + 1))) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        int[] nums = {0, 1, 3};
        int result = numComponents(head, nums);
        System.out.println(result);
    }
}