import java.util.*;
import java.math.BigInteger;

class doubleLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static ListNode createLinkedList(ArrayList<Integer> arr) {
        if (arr == null || arr.isEmpty()) return null;
        ListNode head = new ListNode(arr.get(0));
        ListNode curr = head;
        for (int i = 1; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }
        return head;
    }
    public static ListNode createLinkedList(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num : arr) temp.add(num);
        return createLinkedList(temp);
    }
    public static void extractValues(ArrayList<Integer> nums, ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            nums.add(currNode.val);
            currNode = currNode.next;
        }
    }
    public static ListNode doubleIt(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> nums = new ArrayList<>();
        extractValues(nums, head);
        StringBuilder sb = new StringBuilder();
        for (int num : nums) sb.append(num);
        BigInteger bigNum = new BigInteger(sb.toString());
        bigNum = bigNum.multiply(BigInteger.valueOf(2));

        String s = bigNum.toString();
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (char c : s.toCharArray()) {
            resultArr.add(c - '0');
        }
        return createLinkedList(resultArr);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        if (!scan.hasNextInt()) return;
        int n = scan.nextInt();
        if (n <= 0) {
            System.out.println("null");
            return;
        }
        int[] nums = new int[n];
        System.out.println("Enter the elements (single digits):");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        ListNode head = createLinkedList(nums);
        ListNode result = doubleIt(head);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println(" -> null");
        scan.close();
    }
}