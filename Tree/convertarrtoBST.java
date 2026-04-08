// 108. Convert Sorted Array to Binary Search Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class convertarrtoBST{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static TreeNode convertarrtobst(int[] nums,int left, int right){
        Arrays.sort(nums);
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convertarrtobst(nums, left , mid - 1);
        root.right = convertarrtobst(nums, mid + 1, right);
        return root;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        TreeNode result = convertarrtobst(nums, 0 , nums.length - 1);
        System.out.println(result);
    }
}