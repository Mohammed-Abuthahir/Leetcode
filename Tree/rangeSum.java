// 938. Range Sum of BST
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class rangeSum{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void fillthelist(List<Integer> arr, TreeNode root){
        if(root == null) return ;
        arr.add(root.val);
        fillthelist(arr, root.left);
        fillthelist(arr, root.right);
    }
    public static int rangesumBST(TreeNode root, int low, int high){
        List<Integer> arr = new ArrayList<>();
        fillthelist(arr, root);
        int sum = 0;
        for(int num : arr){
            if(num >= low && num <= high){
                sum = sum + num;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        System.out.println("Enter the Low :");
        int low = scan.nextInt();
        System.out.println("Enter the High :");
        int high = scan.nextInt();
        int result = rangesumBST(root, low, high);
        System.out.println(result);
    }
}