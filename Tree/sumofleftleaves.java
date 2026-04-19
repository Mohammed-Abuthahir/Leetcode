// 404. Sum of Left Leaves
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumofleftleaves{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void fillthelist(List<Integer> list, TreeNode root, boolean found){
        if(root == null) return;
        if(root.left == null && root.right == null & found){
            list.add(root.val);
        }
        fillthelist(list,root.left, true);
        fillthelist(list,root.right,false);
    }
    public static int sumOfLeftLeaves(TreeNode root){
        List<Integer> list = new ArrayList<>();
        fillthelist(list, root, false);
        int sum = 0;
        for(int num : list) sum = sum + num;
        return sum;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int result = sumOfLeftLeaves(root);
        System.out.println(result);
    }
}