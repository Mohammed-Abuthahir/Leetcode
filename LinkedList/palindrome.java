// 234. Palindrome Linked List
import java.util.*;
class Palindrome {
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
    public static boolean isPalindrome(ListNode head){
        List<Integer> original = new ArrayList<>();
        List<Integer> reversearr = new ArrayList<>();
        ListNode currNode = head;
        while(currNode != null){
            original.add(currNode.val);
            reversearr.add(currNode.val);
            currNode = currNode.next;
        }
        int left = 0;
        int right = reversearr.size() - 1;
        while(left < right){ 
            int temp = reversearr.get(left);
            reversearr.set(left, reversearr.get(right));
            reversearr.set(right, temp);
            left++;
            right--;    
        }
        for(int i = 0; i < original.size(); i++){
            if(!original.get(i).equals(reversearr.get(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n = scan.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            nums[i] = scan.nextInt();
        }
        ListNode head = createLinkedList(nums);
        boolean result = isPalindrome(head);
        System.out.println("Is the Linked List a palindrome :" + result);
        scan.close();
    }
}