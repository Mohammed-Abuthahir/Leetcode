import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class TwosuminBST{
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
    public static void getNumbers(TreeNode root, List<Integer> result){
        if(root == null) return;
        result.add(root.val);
        getNumbers(root.left, result);
        getNumbers(root.right, result);
    }
    public static boolean findTarget(TreeNode root, int target) {
        List<Integer> result = new ArrayList<>();
        getNumbers(root,result);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < result.size();i++){
            int complement = target - result.get(i);
            if(map.containsKey(complement)){
                return true;
            }
            else{
                map.put(result.get(i), i);
            }
        }
        return false;
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
        System.out.println("Enter the Target :");
        int target = scan.nextInt();
        TreeNode root = BuildArraytotree(nums, 0);
        boolean result = findTarget(root,target);
        System.out.println(result);
    }
}