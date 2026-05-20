// 2807. Insert Greatest Common Divisors in Linked List
import java.util.*;

class insertGCD {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { 
            this.val = val; 
            this.next = null; 
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
    
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) return head;
        List<Integer> arr = new ArrayList<>();
        ListNode currNode = head;
        while (currNode != null) {
            arr.add(currNode.val);
            currNode = currNode.next;
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            int a = arr.get(i);
            int b = arr.get(i + 1);
            while (b != 0) {
                int rem = a % b;
                a = b;
                b = rem;
            }
            arr.add(i + 1, a);
            i++; 
        }
        return createLinkedList(arr);
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(18);
        ListNode second = new ListNode(6); 
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(3);
        head.next = second; 
        second.next = third;
        third.next = fourth;
        ListNode result = insertGreatestCommonDivisors(head);
        while (result != null) {
            System.out.print(result.val + "->");
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
        System.out.println();
    }
}