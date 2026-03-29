import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

class inorderbinarytree {
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

    // Build Tree from Array
    public static TreeNode buildTreeFromArray(int[] arr, int index) {
        if (index >= arr.length) {
            return null;
        }

        TreeNode root = new TreeNode(arr[index]);
        root.left = buildTreeFromArray(arr, 2 * index + 1);
        root.right = buildTreeFromArray(arr, 2 * index + 2);

        return root;
    }

    // Inorder Traversal
    public static void inorderTraversal(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, arr);
        arr.add(root.val);  
        inorderTraversal(root.right, arr);
    }

    public static List<Integer> inorder(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Size:");
        int n = scan.nextInt();

        System.out.println("Enter the Elements:");
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        TreeNode root = buildTreeFromArray(nums, 0);

        List<Integer> result = inorder(root);

        System.out.println("Inorder Traversal: " + result);
    }
}