// 143. Reorder List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reorderList{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void reorderList(ListNode head){
        ListNode curr = head;
        List<Integer> nums = new ArrayList<>();
        while(curr != null){
            nums.add(curr.val);
            curr = curr.next;
        }
        List<Integer> list = new ArrayList<>();
        int left = 0; int right = nums.size() - 1;
        while(left <= right){
            if(left == right){
                list.add(nums.get(left));
                break;
            }
            list.add(nums.get(left));
            list.add(nums.get(right));
            left++;
            right--;
        }
        curr = head;
        for(int i = 0; i < list.size(); i++){
            curr.val = list.get(i);
            curr = curr.next;
        }
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        reorderList(head);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}