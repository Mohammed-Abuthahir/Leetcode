// 671. Second Minimum Node In a Binary Tree
import java.util.*;
import java.util.Scanner;
import  java.util.Arrays;
class secondminimum{
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
    public static TreeNode buildTreefromArray(int[] nums,int index){
        if(index >= nums.length){
            return null;
        }
        TreeNode root = new TreeNode(nums[index]);
        root.left = buildTreefromArray(nums, 2 * index + 1);
        root.right = buildTreefromArray(nums , 2 * index + 2);
        return root;
    }
    public static void secondminimumvalue(TreeNode root,HashSet<Integer> set){
        if(root == null) return;
        set.add(root.val);
        secondminimumvalue(root.left , set);
        secondminimumvalue(root.right, set);
    }
    public static int findSecondMinimumValue(TreeNode root){
        HashSet<Integer> set = new HashSet<>();
        secondminimumvalue(root,set);
        if(set.size() == 1) return -1;
        int min = Collections.min(set);
        set.remove(min);
        return Collections.min(set);
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
        TreeNode root  = buildTreefromArray(nums, 0);
        int result = findSecondMinimumValue(root);
        System.out.println("The Second Minimum Value in the Tree is to :"+result);
    }
}