import java.util.*;

class mergetwoLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null; // Fixed: next should be initialized to null
        }
    }

    // Fills ArrayLists from Linked List nodes
    public static void fillthelist(List<Integer> nums1, List<Integer> nums2, ListNode list1, ListNode list2) {
        ListNode currNode1 = list1;
        while (currNode1 != null) {
            nums1.add(currNode1.val);
            currNode1 = currNode1.next;
        }
        ListNode currNode2 = list2;
        while (currNode2 != null) {
            nums2.add(currNode2.val);
            currNode2 = currNode2.next;
        }
    }

    // Creates a Linked List from an ArrayList
    public static ListNode createLinkedList(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) return null;
        ListNode head = new ListNode(arr.get(0));
        ListNode curr = head;
        for (int i = 1; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }
        return head;
    }

    // Logic to merge list2 into list1 between index a and b
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        fillthelist(nums1, nums2, list1, list2);

        ArrayList<Integer> newList = new ArrayList<>();
        // Part 1: Front of list1
        for (int i = 0; i < a; i++) newList.add(nums1.get(i));
        // Part 2: All of list2
        for (int i = 0; i < nums2.size(); i++) newList.add(nums2.get(i));
        // Part 3: Tail of list1
        for (int i = b + 1; i < nums1.size(); i++) newList.add(nums1.get(i));

        return createLinkedList(newList);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input List 1
        System.out.print("Enter the Size of List 1: ");
        int n1 = scan.nextInt();
        int[] nums1Arr = new int[n1];
        System.out.println("Enter the elements for List 1:");
        for (int i = 0; i < n1; i++) nums1Arr[i] = scan.nextInt();

        // Input List 2
        System.out.print("Enter the Size of List 2: ");
        int n2 = scan.nextInt();
        int[] nums2Arr = new int[n2];
        System.out.println("Enter the elements for List 2:");
        for (int i = 0; i < n2; i++) nums2Arr[i] = scan.nextInt();

        System.out.print("Enter index A: ");
        int a = scan.nextInt();
        System.out.print("Enter index B: ");
        int b = scan.nextInt();

        // Convert arrays to initial Linked Lists
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int x : nums1Arr) l1.add(x);
        ArrayList<Integer> l2 = new ArrayList<>();
        for (int x : nums2Arr) l2.add(x);

        ListNode head1 = createLinkedList(l1);
        ListNode head2 = createLinkedList(l2);

        // Execute Merge
        ListNode resultHead = mergeInBetween(head1, a, b, head2);

        // Print Result
        System.out.print("Result: ");
        ListNode curr = resultHead;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println(" -> null");
        
        scan.close();
    }
}