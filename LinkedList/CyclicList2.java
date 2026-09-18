// 142. Linked List Cycle II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class CyclicList2{
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode detectCycle(ListNode head){
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;
        while(curr != null){
            if(set.contains(curr)) return curr;
            else set.add(curr);
            curr = curr.next;
        }
        return null;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        ListNode result = detectCycle(head);
        if (result == null) {
            System.out.println("No cycle detected.");
        } else {
            int idx = 0;
            ListNode curr = head;
            while (curr != result) { // Reference comparison!
                curr = curr.next;
                idx++;
            }
            System.out.println("tail connects to node index : " + idx);
        }
    }
}
