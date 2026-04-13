// 637. Average of Levels in Binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class avaragelevelofBT{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void fillthelist( List<List<Integer>> result, TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i < size;i++){
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
    public static List<Double> averagelevel(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        fillthelist(result, root);
        List<Double> list = new ArrayList<>();
        for(List<Integer> subset : result){
            long currSum = 0;
            for(int i = 0;i < subset.size();i++){
                currSum += subset.get(i);
            }
            Double number = (double) currSum / subset.size();
            list.add(number);
        }
        return list;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<Double> result = averagelevel(root);
        System.out.println(result);
    }
}