// 101. Symmetric Tree
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class symmetricTree{
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
    public static boolean symmertric(TreeNode t1 , TreeNode t2){
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
            && symmertric(t1.left, t2.right)  
            && symmertric(t1.right, t2.left);
    }
    public static boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        return symmertric(root.left, root.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        boolean result = isSymmetric(root);
        System.out.println(result);
    }
}