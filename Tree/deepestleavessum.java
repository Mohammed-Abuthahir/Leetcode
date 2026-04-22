// 1302. Deepest Leaves Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class deepestleavessum{
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
    public static void fillthelist(List<List<Integer>> result, TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                TreeNode current = queue.poll();
                arr.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            result.add(arr);
        }
    }
    public static int deepestLeavesSum(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        fillthelist(result, root);
        List<List<Integer>> list = new ArrayList<>();
        list.add(result.get(result.size() - 1));
        int sum = 0;
        for(List<Integer> subset : list){
            for(int num : subset){
                sum = sum + num;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(7);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(8);
        int sum = deepestLeavesSum(root);
        System.out.println(sum);
    }
}