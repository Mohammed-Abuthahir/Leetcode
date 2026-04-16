// 1161. Maximum Level Sum of a Binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxLevelSum{
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
    public static void fillthelist(List<List<Integer>> result,TreeNode root){
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
    public static int maxLevelSum(TreeNode root){
         List<List<Integer>> result = new ArrayList<>();
        fillthelist(result, root);
        int max = Integer.MIN_VALUE;
        for(List<Integer> subset : result){
            int currSum = 0;
            for(int i = 0;i < subset.size();i++){
                currSum += subset.get(i);
            }
            max = Math.max(currSum, max);
        }
        int count  = 0;
        for(List<Integer> subset : result){
            count++;
            int currSum = 0;
            for(int i = 0;i < subset.size();i++){
                currSum += subset.get(i);
            }
            if(currSum == max) return count;
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);
        int result = maxLevelSum(root);
        System.out.println(result);
    }
}