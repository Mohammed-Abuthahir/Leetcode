// LinkedList Cycle
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Cycliclist{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static boolean LinkedListCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next = head.next;
        boolean result = LinkedListCycle(head);
        System.out.println(result);
    }
}