// 2236. Root Equals Sum of Children
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class rootequalstochildren{
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static TreeNode BuildArraytotree(int[] arr,int index){
        if(index >= arr.length){
            return null;
        }
        TreeNode root = new TreeNode(arr[index]);
        root.left = BuildArraytotree(arr, 2 * index + 1);
        root.right = BuildArraytotree(arr, 2 * index + 2);
        return root;
    }
    public static void getValues(TreeNode root,List<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        getValues(root.left , list);
        getValues(root.right, list);
    }
    public static boolean checktree(TreeNode root){
        List<Integer> list = new ArrayList<>();
        getValues(root,list);
        int sum = root.val;
        int totalsum = 0;
        for(int num : list){
            totalsum = totalsum + num;
        }
        return totalsum == sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        TreeNode root = BuildArraytotree(nums, 0);
        boolean result = checktree(root);
        System.out.println(result);
    }
}