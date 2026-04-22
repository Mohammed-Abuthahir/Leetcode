// 872. Leaf-Similar Trees
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class leftsimilartree{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val,TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void fillthelist1(List<Integer> tree1, TreeNode root1){
        if(root1 == null) return;
        if(root1.left == null && root1.right == null){
            tree1.add(root1.val);
        }
        fillthelist1(tree1, root1.left);
        fillthelist1(tree1, root1.right);
    }
    public static void fillthelist2(List<Integer> tree2, TreeNode root2){
        if(root2 == null) return;
        if(root2.left == null && root2.right == null){
            tree2.add(root2.val);
        }
        fillthelist2(tree2, root2.left);
        fillthelist2(tree2, root2.right);
    }
    public static boolean leafsimilar(TreeNode root1, TreeNode root2){
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();
        fillthelist1(tree1, root1);
        fillthelist2(tree2, root2);
        if(tree1.size() != tree2.size()) return false;
        for(int i = 0;i < tree1.size();i++){
            if(!tree1.get(i).equals(tree2.get(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);
        boolean result = leafsimilar(root1, root2);
        System.out.println(result);
    }
}