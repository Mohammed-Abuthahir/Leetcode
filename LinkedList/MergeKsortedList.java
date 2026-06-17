// 23. Merge k Sorted Lists
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class MergeKsortedList{
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = next;
        }
    }
    public static void fillthelist(List<Integer> arr, ListNode[] lists){
        for(ListNode currNode : lists){
            while(currNode != null){
                arr.add(currNode.val);
                currNode = currNode.next;
            }
        }
    }
    public static ListNode buildLinkedList(List<Integer> list) {
        if (list == null || list.size() == 0) return null;
        ListNode head = new ListNode(list.get(0));
        ListNode current = head;
        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return head;
    }
    public static ListNode mergeKLists(ListNode[] lists){
        List<Integer> arr = new ArrayList<>();
        fillthelist(arr, lists);
        Collections.sort(arr);
        return buildLinkedList(arr);
    }
    public static void displayLinkedList(ListNode head){
        ListNode currNode = head;
        while(currNode != null){
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next = new ListNode(5);
        
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

       ListNode[] lists = {list1, list2, list3};
       ListNode result = mergeKLists(lists);
       displayLinkedList(result);
        
    }
}