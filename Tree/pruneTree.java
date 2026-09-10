// 814. Binary Tree Pruning
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class pruneTree{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode pruneTree(TreeNode root){
        if(root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left == null && root.right == null && root.val == 0){
            return null;
        }
        return root;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode result = pruneTree(root);
        display(result);
    }
    public static void display(TreeNode root){
        if(root == null) return;
        display(root.left);
        System.out.println(root.val);
        display(root.right);
    }

}
