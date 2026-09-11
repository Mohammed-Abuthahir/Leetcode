// 110. Balanced Binary Tree

import java.util.*;

class isBalanced {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    boolean ans = true;
    public int dfs(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);

        if (Math.abs(right - left) > 1) {
            ans = false;
        }

        return 1 + Math.max(left, right);
    }

    public static boolean isBalance(TreeNode root) {

        isBalanced obj = new isBalanced();

        obj.dfs(root);

        return obj.ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        boolean result = isBalance(root);

        System.out.println(result);
    }
}