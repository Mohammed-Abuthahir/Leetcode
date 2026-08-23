// 199. Binary Tree Right Side View
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class rightSideView{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void fillthelist(TreeNode root, List<List<Integer>> result){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
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
    public static List<Integer> rightside(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        fillthelist(root, result);
        List<Integer> nums = new ArrayList<>();
        for(List<Integer> subset : result){
            nums.add(subset.getLast());
        }
        return nums;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        List<Integer> result = rightside(root);
        System.out.println(result);
    }
}