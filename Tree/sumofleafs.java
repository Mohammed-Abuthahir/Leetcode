// 1022. Sum of Root To Leaf Binary Numbers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumofleafs{
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
    public static void fillthelist(List<String> list, TreeNode root,StringBuilder sb){
        if(root == null) return;
        sb.append(root.val);
        if(root.left == null && root.right == null){
            list.add(sb.toString());
        }
        fillthelist(list, root.left ,sb);
        fillthelist(list, root.right, sb);
        sb.setLength(sb.length() - 1);
    }
    public static int sumRoottoLeaf(TreeNode root){
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        fillthelist(list,root, sb);
         int sum = 0;
        for(String num : list){
            sum = sum + Integer.parseInt(num, 2);
        }
        return sum;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        int result = sumRoottoLeaf(root);
        System.out.println(result);
    }
}