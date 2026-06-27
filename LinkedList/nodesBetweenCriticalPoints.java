// 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class nodesBetweenCriticalPoints{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
     public static void fillthelist(List<Integer> nums, ListNode head){
        ListNode currNode = head;
        while(currNode != null){
            nums.add(currNode.val);
            currNode = currNode.next;
        }
    }
    public static int[] nodebetweencritical(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        fillthelist(nums, head);
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i < nums.size() - 1; i++){
            if((nums.get(i - 1) < nums.get(i) && nums.get(i) > nums.get(i + 1)) ||
                    (nums.get(i - 1) > nums.get(i) && nums.get(i) < nums.get(i + 1))){
                list.add(i + 1);
            }
        }
        Collections.sort(list);
        if (nums.size() <= 2 || list.size() <= 1) return new int[]{-1, -1};
        int maxdistance = list.get(list.size() - 1) - list.get(0);
        int mindistance = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            mindistance = Math.min(mindistance, list.get(i) - list.get(i - 1));
        }

        return new int[]{mindistance, maxdistance};
    }
    public static void main(String[] args){
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);
        int[] result = nodebetweencritical(head);
        System.out.println(Arrays.toString(result));
        
    }
}