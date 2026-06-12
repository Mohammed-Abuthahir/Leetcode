// 2181. Merge Nodes in Between Zeros
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mergeNodes{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = next;
        }
    }
    public static void getFillthelist(List<Integer> list , ListNode head){
        ListNode currNode = head;
        while(currNode != null){
            list.add(currNode.val);
            currNode = currNode.next;
        }
    }
    public static ListNode createLinkedList(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return null;
        }
        ListNode head = new ListNode(arr.get(0));
        ListNode current = head;
        for (int i = 1; i < arr.size(); i++) {
            current.next = new ListNode(arr.get(i));
            current.next.next = null; 
            current = current.next;
        }
        return head;
    }
    public static void displayLinkedList(ListNode head){
        ListNode currNode = head;
        while(currNode != null){
            System.out.println(currNode.val + "->");
            currNode = currNode.next;
        }
    }
    public static ListNode mergenodes(ListNode head){
         List<Integer> list = new ArrayList<>();
        getFillthelist(list, head);
        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        for(int num : list){
            if(num != 0){
                sum = sum + num;
            }
            else{
               if(sum != 0){
                   arr.add(sum);
               }
                sum = 0;
            }
        }
        return createLinkedList(arr); 
    }
    public static void main(String[] args){
        ListNode head = new ListNode(0);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(0);
        ListNode result = mergenodes(head);
        displayLinkedList(result);

    }
}