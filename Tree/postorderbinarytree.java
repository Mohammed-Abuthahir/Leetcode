// 145. Binary Tree Postorder Traversal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class postorderbinarytree{
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
    public static TreeNode buildTreeFromArray(int[] nums, int index) {
        if (index >= nums.length) {
            return null;
        }

        TreeNode root = new TreeNode(nums[index]);
        root.left = buildTreeFromArray(nums, 2 * index + 1);
        root.right = buildTreeFromArray(nums, 2 * index + 2);

        return root;
    }
    public static void postorder(TreeNode root, List<Integer> nums){
        if(root == null) return;
        postorder(root.left , nums);
        postorder(root.right , nums);
        nums.add(root.val);
    }
     public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        postorder(root, nums);
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Size:");
        int n = scan.nextInt();

        System.out.println("Enter the Elements:");
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        TreeNode root = buildTreeFromArray(nums, 0);

        List<Integer> result = postorderTraversal(root);

        System.out.println("Postorder Traversal: " + result);
    }
}