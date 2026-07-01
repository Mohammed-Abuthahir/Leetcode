// 530. Minimum Absolute Difference in BST
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class getMinimumDifference{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
     public static void fillthelist(TreeNode root, List<Integer> nums){
        if(root == null) return;
        fillthelist(root.left, nums);
        nums.add(root.val);
        fillthelist(root.right, nums);
    }
    public static int getdiff(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        fillthelist(root, nums);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.size() - 1; i++){
            min = Math.min(min, nums.get(i + 1) - nums.get(i));
        }
        return min;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int result = getdiff(root);
        System.out.println(result);
    }
}