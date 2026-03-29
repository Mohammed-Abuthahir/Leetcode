// 965. Univalued Binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

class univaluedbinarytree{
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
    public static TreeNode buildTreefromArray(int[] nums, int index) {
        if (index >= nums.length) {
            return null;
        }
        TreeNode root = new TreeNode(nums[index]);
        root.left = buildTreefromArray(nums, 2 * index + 1);
        root.right = buildTreefromArray(nums, 2 * index + 2);
        return root;
    }
    public static void unitreeorNot(TreeNode root, HashSet<Integer> arr){
        if(root == null) return;
        arr.add(root.val);
        unitreeorNot(root.left , arr);
        unitreeorNot(root.right, arr);
    }
    public static boolean univaluedorder(TreeNode root){
        HashSet<Integer> arr = new HashSet<>();
        unitreeorNot(root , arr);
        return arr.size() == 1 ? true : false;
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
        boolean result = univaluedorder(root);
        System.out.println("If the tree are Univalue Or Not :" +result);
    }
}
// del *.class