//  Reverse Nodes in k-Group
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reverseKGroups{
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { 
            this.val = val; 
            this.next = null; 
        }
    }
    public static void SwappingList(ArrayList<Integer> list , ListNode head, int k){
        ListNode currNode = head;
        while(currNode != null){
            list.add(currNode.val);
            currNode = currNode.next;
        }
    }
    public static ListNode createLinkedList(ArrayList<Integer> arr) {
        if (arr.size() == 0) return null;
        ListNode head = new ListNode(arr.get(0));
        ListNode curr = head;
        for (int i = 1; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }
        return head;
    }
    public static void display(ListNode head){
        ListNode currNode = head;
        while(currNode != null){
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
    }
    public static ListNode reversekgroup(ListNode head, int k){
        ArrayList<Integer> arr = new ArrayList<>();
        SwappingList(arr, head , k);
        for(int i = 0; i <= arr.size() - k; i = i + k){
            int left = i;
            int right = i + k - 1;
            while(left < right){
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
        return createLinkedList(arr);
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);
        int k = 3;
        ListNode result = reversekgroup(head, k);
        display(result);
    }
}
