// 103. Binary Tree Zigzag Level Order Traversal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class zigzagtraversal{
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
    public static void getFillthelist(List<List<Integer>> result, TreeNode root, int count){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> arr = new ArrayList<>();
            int size = queue.size();
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
            if(count % 2 != 0){
                Collections.reverse(arr);
                result.add(arr);
                count++;
            }
            else{
                result.add(arr);
                count++;
            }
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        int count = 0;
        getFillthelist(result, root, count);
        return result;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3)    ;
        root.left = new TreeNode(9);
        root.right =  new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = zigzagLevelOrder(root);
        System.out.println(result);
    }
}