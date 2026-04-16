// 1609. Even Odd Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class evenoddtree{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void fillthelist(List<List<Integer>> result, TreeNode root){
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
    public static boolean isEvenOddTree(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        fillthelist(result, root);
        int level = 0;
        for (List<Integer> subset : result) {
        for (int i = 0; i < subset.size(); i++) {
            int val = subset.get(i);
            if (level % 2 == 0) { 
                if (val % 2 == 0) return false; 
            } else { 
                if (val % 2 != 0) return false;
            }
            if (i < subset.size() - 1) {
                int nextVal = subset.get(i + 1);
                if (level % 2 == 0) {
                    if (val >= nextVal) return false; 
                } else {
                    if (val <= nextVal) return false; 
                }
            }
        }
        level++;
    }
    return true;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        boolean result = isEvenOddTree(root);
        System.out.println(result); 
    }
}