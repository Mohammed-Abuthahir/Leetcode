import java.util.*;

class searchbinaryclonetree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static TreeNode ans = null;
    public static void searchNode(TreeNode original, TreeNode target, TreeNode cloned) {
        if (original == null) return;
        if (original == target) {
            ans = cloned;
            return;
        }
        searchNode(original.left, target, cloned.left);
        searchNode(original.right, target, cloned.right);
    }

    public static TreeNode getTargetCopy(TreeNode original, TreeNode cloned, TreeNode target) {
        ans = null; 
        searchNode(original, target, cloned);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);
        TreeNode cloned = new TreeNode(7);
        cloned.left = new TreeNode(4);
        cloned.right = new TreeNode(3);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);
        TreeNode target = original.right;
        TreeNode result = getTargetCopy(original, cloned, target);
        System.out.println(result.val);
    }
}