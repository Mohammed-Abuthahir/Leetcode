// 206. Reverse Linked 
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reverseLinkedList{
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n = scan.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            nums[i] = scan.nextInt();
        }
        ListNode head = createLinkedList(nums);
        ListNode result = reverseList(head);
        ListNode curr = result;
        List<Integer> displayList = new ArrayList<>();
        while (curr != null) {
            displayList.add(curr.val);
            curr = curr.next;
        }
        System.out.println(displayList);
    }

}