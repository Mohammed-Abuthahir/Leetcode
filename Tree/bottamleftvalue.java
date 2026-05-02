// 513. Find Bottom Left Tree Value
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class bottamleftvalue{
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
    public static void fillthelist(List<List<Integer>> result, TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i < size ; i++){
                TreeNode current = queue.poll();
                arr.add(current.val);
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            result.add(arr);
        }
    }
    public static int findBottomLeftValue(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        fillthelist(result, root);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(result.get(result.size() - 1));
        for(List<Integer> subset : arr){
            for(int i = 0;i < subset.size(); i++){
                return subset.get(i);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        int result = findBottomLeftValue(root);
        System.out.println(result);
    }
}