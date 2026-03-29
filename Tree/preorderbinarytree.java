// 144. Binary Tree Preorder Traversal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class preorderbinarytree{
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
    public static TreeNode BuildArraytotree(int[] arr,int index){
        if(index >= arr.length){
            return null;
        }
        TreeNode root = new TreeNode(arr[index]);
        root.left = BuildArraytotree(arr, 2 * index + 1);
        root.right = BuildArraytotree(arr, 2 * index + 2);
        return root;
    }
    public static void preordertraversal(TreeNode root,List<Integer> nums){
        if(root == null) return;
        nums.add(root.val);
        preordertraversal(root.left , nums);
        preordertraversal(root.right , nums);
    }
    public static List<Integer> preordertree(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        preordertraversal(root,nums);
        return nums;
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
        TreeNode root = BuildArraytotree(nums, 0);
        List<Integer> result = preordertree(root);
        System.out.println(result);
    }
}