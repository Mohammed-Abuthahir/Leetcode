// Count Good Nodes in Binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countGoodNodes{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static int dfs(TreeNode root, int max){
        if(root == null) return 0;
        int res = (root.val >= max) ? 1 : 0;
        max = Math.max(max, root.val);
        res = res + dfs(root.left, max);
        res = res + dfs(root.right, max);
        return res;
    }
    public static int goodNodes(TreeNode root){
        return dfs(root, root.val);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left = new TreeNode(0);
        int result = goodNodes(root);
        System.out.println(result);
    }
}