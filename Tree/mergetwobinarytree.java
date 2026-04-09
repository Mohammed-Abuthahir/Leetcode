// 617. Merge Two Binary Trees

import java.util.*;
class mergetwobinarytree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
    public static TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < arr.length) {
            TreeNode curr = q.poll();
            if (i < arr.length && arr[i] != null) {
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("null");
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr != null) {
                System.out.print(curr.val + " ");
                q.add(curr.left);
                q.add(curr.right);
            } else {
                System.out.print("null ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] t1Arr = {1};
        Integer[] t2Arr = {1,2};
        TreeNode root1 = buildTree(t1Arr);
        TreeNode root2 = buildTree(t2Arr);
        System.out.println("Merging Trees...");
        TreeNode result = mergeTrees(root1, root2);
        System.out.print("Resulting Tree (Level Order): ");
        printLevelOrder(result);
    }
}