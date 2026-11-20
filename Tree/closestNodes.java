// 2476. Closest Nodes Queries in a Binary Search Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class closestNodes{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void inorder(TreeNode root, List<Integer> nums){
        if(root == null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
    public static List<List<Integer>> closestNode(TreeNode root, List<Integer> queries){
        List<Integer> nums = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        inorder(root, nums);
        for(int i = 0;i < queries.size(); i++){
            int key = queries.get(i);
            int floor = -1; int ceil = -1;
            int low = 0; int high = nums.size() - 1;
            boolean find = true;
            while(low <= high){
                int mid = low + (high - low) / 2;
                int val = nums.get(mid);
                if(val == key){
                    result.add(Arrays.asList(val, val));
                    find = false;
                    break;
                }
                else if(val < key){
                    floor = val;
                    low = mid + 1;
                }
                else {
                    ceil = val;
                    high = mid - 1;
                }
            }
            if(find) result.add(Arrays.asList(floor, ceil));
        }
        return result;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(15);
        root.right.right.left = new TreeNode(14);
        List<Integer> queries = new ArrayList<>(Arrays.asList(2,5,16));
        List<List<Integer>> result = closestNode(root, queries);
        System.out.println(result);
    }
}