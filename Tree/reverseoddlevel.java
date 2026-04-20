// 2415. Reverse Odd Levels of Binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reverseoddlevel{
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
    public static void filltheList(List<List<Integer>> result, TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i < size; i++){
                TreeNode current = queue.poll();
                list.add(current.val);
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            result.add(list);
        }
    }
    public static TreeNode BuildTree(List<Integer> arr, int index){
        if(index >= arr.size() || arr.get(index) == null) return null;
        TreeNode root = new TreeNode(arr.get(index));
        root.left = BuildTree(arr, 2 * index + 1);
        root.right = BuildTree(arr, 2 * index + 2);
        return root;
    }
    public static TreeNode reverseOdd(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        filltheList(result, root);
        int count = 0;
        for(List<Integer> subset : result) {
            if(count % 2 != 0){
                Collections.reverse(subset);
            }
            count++;
        }
        System.out.println(result);
        List<Integer> arr = new ArrayList<>();
        for(List<Integer> subset : result){
            for(int i = 0;i < subset.size();i++){
                arr.add(subset.get(i));
            }
        }
        return BuildTree(arr, 0);
    }
    public static void DisplayTree(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + "->");
        DisplayTree(root.left);
        DisplayTree(root.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(13);
        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(34);
        TreeNode result = reverseOdd(root);
        DisplayTree(root);
    }
}
