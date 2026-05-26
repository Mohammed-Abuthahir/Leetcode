// 1325. Delete Leaves With a Given Value
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class DeleteLeafNode{
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
    public static TreeNode removeLeafNodes(TreeNode root, int target){
        if(root == null){
            return null;
        }
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if(root.left == null && root.right == null && root.val == target){
            return null;
        }
        return root;
    }
    public static void display(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " -> ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        int target = 2;
        TreeNode result = removeLeafNodes(root, target);
        display(root);
    }
}