import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class levelordertraversal{
   public static  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
    public static void levels(List<List<Integer>> result, TreeNode root){
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
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        levels(result, root);
        return result;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);
    }
}