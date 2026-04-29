// 1008. Construct Binary Search Tree from Preorder Traversal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class preordertobinaryseach{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static TreeNode insert(TreeNode root,int val){
        if (root == null) return new TreeNode(val);
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static TreeNode coustractTree(int[] nums){
        TreeNode root = null;
        for(int num : nums){
            root = insert(root, num);
        }
        return root;
    }
    public static void display(TreeNode root){
        if(root == null) return;
        System.out.println(root.val + "->");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        TreeNode result = coustractTree(nums);
        display(result);
        
    }
}