// 700. Search in a Binary Search Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class searchBST{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode searchbstTree(TreeNode root, int val){
        if(root == null)
            return null;
        if(root.val == val)
            return root;
        if(val < root.val)
            return searchbstTree(root.left, val);
        return searchbstTree(root.right, val);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        int val = 2;
        TreeNode result = searchbstTree(root, val);
        display(result);
    }
    public static void display(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }
}
