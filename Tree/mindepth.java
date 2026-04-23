// 111. Minimum Depth of Binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mindepth{
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
    public static void fillthelist(List<List<Integer>> result, ArrayList<Integer> arr, TreeNode root){
        if(root == null) return;
        arr.add(root.val);
        if(root.left == null && root.right == null){
            result.add(new ArrayList<>(arr));
        }
        fillthelist(result, arr, root.left);
        fillthelist(result, arr, root.right);
        arr.remove(arr.size() - 1);
    }
    public static int minDepth(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        fillthelist(result, new ArrayList<>(), root);
        int min = Integer.MAX_VALUE;
        for(List<Integer> subset : result){
            min = Math.min(min, subset.size());
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int result = minDepth(root);
        System.out.println(result);
    }
}