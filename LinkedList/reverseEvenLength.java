// 2074. Reverse Nodes in Even Length Groups
import java.util.*;
class reverseEvenLength {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static void fillthelist(List<Integer> nums, ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            nums.add(currNode.val);
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
    public static ListNode reverseEvenLengthGroups(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        fillthelist(nums, head);
        LinkedHashMap<Integer, List<Integer>> map = new LinkedHashMap<>();
        int idx = 0;
        int count = 1;
        while (idx < nums.size()) {
            map.putIfAbsent(count, new ArrayList<>());
            for (int j = 0; j < count && idx < nums.size(); j++) {
                map.get(count).add(nums.get(idx));
                idx++;
            }
            count++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (List<Integer> subset : map.values()) {
            if (subset.size() % 2 == 0) {
                Collections.reverse(subset);
            }
            list.addAll(subset);
        }
        return createLinkedList(list);
    }
    public static void DisplayLinkedList(ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val);
            if (currNode.next != null) {
                System.out.print(" -> ");
            }
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(5);
        ListNode result = reverseEvenLengthGroups(head);
        DisplayLinkedList(result);
    }
}