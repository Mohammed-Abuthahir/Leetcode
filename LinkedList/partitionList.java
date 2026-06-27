// 82.partitionList
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class partitionList{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void fillthelist(ListNode head, List<Integer> arr){
        ListNode currNode = head;
        while(currNode != null){
            arr.add(currNode.val);
            currNode = currNode.next;
        }
    }
    public static ListNode createLinkedList(List<Integer> arr) {
        if (arr.size() == 0) return null;
        ListNode head = new ListNode(arr.get(0));
        ListNode curr = head;
        for (int i = 1; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }
        return head;
    }
    public static ListNode partition(ListNode head, int x){
        List<Integer> list = new ArrayList<>();
        fillthelist(head, list);
        List<Integer> newArr = new ArrayList<>();
        for(int i = 0;i < list.size(); i++){
            if(list.get(i) < x){
                newArr.add(list.get(i));
            }
        }
        for(int i = 0;i < list.size(); i++){
             if(list.get(i) >= x){
                newArr.add(list.get(i));
            }
        }
        return createLinkedList(newArr);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        System.out.println("Enter the X :");
        int x = scan.nextInt();
        ListNode result = partition(head, x);
        displayList(result);
    }
    public static void displayList(ListNode head){
        ListNode currNode = head;
        while(currNode != null){
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
    }
}