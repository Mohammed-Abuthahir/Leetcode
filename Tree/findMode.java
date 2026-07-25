// 501. Find Mode in Binary Search Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findMode{
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void mostFrequently(TreeNode root, HashMap<Integer, Integer> map){
        if(root == null) return;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        mostFrequently(root.left, map);
        mostFrequently(root.right, map);
    }
    public static int[] findmode(TreeNode root){
        HashMap<Integer, Integer> map = new HashMap<>();
        mostFrequently(root, map);
        int max = Collections.max(map.values());
        int[] nums = new int[map.size()]; int idx = 0;
        for(int num : map.keySet()){
            if(map.get(num) == max){
                nums[idx++] = num;
            }
        }
        return Arrays.copyOf(nums, idx);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        int[] result = findmode(root);
        System.out.println(Arrays.toString(result));
    }
}