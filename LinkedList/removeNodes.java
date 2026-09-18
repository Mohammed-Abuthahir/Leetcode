// 2487. Remove Nodes From Linked List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removeNodes{
    static class ListNode{
        int val;
        ListNode next;
        ListNode (int val){
            this.val = val;
        }
    }
    public static ListNode createLinkedList(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListNode head = new ListNode(list.get(0));
        ListNode current = head;
        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return head; 
    }
    public static ListNode removeNode(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        List<Integer> nums = new ArrayList<>();
        int max = head.val;
        nums.add(max);
        while(prev != null){
            if(prev.val >= max){
                nums.add(prev.val);
                max = Math.max(max, prev.val);
            }
            prev = prev.next;
        }
        Collections.reverse(nums);
        nums.remove(nums.size() -1);
        return createLinkedList(nums);

    }
    public static void main(String[] args){
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);
        ListNode result = removeNode(head);
        ListNode curr = result;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}