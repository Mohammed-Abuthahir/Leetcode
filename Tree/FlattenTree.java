// 114. Flatten Binary Tree to Linked List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class FlattenTree{
     static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void display(TreeNode root){
        if(root == null) return ;
        System.out.print(root.val + "->");
        display(root.left);
        display(root.right);
    }
    public static void flatten(TreeNode root){
        if(root == null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode curr = root;
        while(curr.right != null){
            curr = curr.right;
        }
        curr.right = temp;
        display(root);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        flatten(root);
    }
}