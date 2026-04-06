import java.util.*;

class oddevenLinkedList {
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
    public static void oddevenlist(ArrayList<Integer> odd, ArrayList<Integer> even, ListNode head) {
        ListNode currNode = head;
        int index = 1;
        while (currNode != null) {
            if (index % 2 != 0) {
                odd.add(currNode.val); 
            } else {
                even.add(currNode.val); 
            }
            currNode = currNode.next;
            index++;
        }
    }
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        oddevenlist(odd, even, head);
        ArrayList<Integer> resultArr = new ArrayList<>();
        resultArr.addAll(odd);
        resultArr.addAll(even);
        return createLinkedListFromList(resultArr);
    }
    public static ListNode createLinkedListFromList(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return null;
        ListNode head = new ListNode(arr.get(0));
        ListNode curr = head;
        for (int i = 1; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        if (!scan.hasNextInt()) return;
        int n = scan.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        ListNode head = createLinkedList(nums);
        ListNode result = oddEvenList(head);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}