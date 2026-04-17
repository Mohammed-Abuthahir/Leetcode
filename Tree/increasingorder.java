// 897. Increasing Order Search Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class icreasingorder{
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
    public static void fillthelist(List<Integer> list, TreeNode root){
        if(root == null) return;
        list.add(root.val);
        fillthelist(list, root.left);
        fillthelist(list, root.right);
    }
    public static TreeNode increasingBST(TreeNode root){
        List<Integer> list = new ArrayList<>();
        fillthelist(list, root);
        Collections.sort(list);
        TreeNode root1 = new TreeNode(list.get(0));
        TreeNode current = root1;
        for(int i = 1;i < list.size(); i++){
            current.right = new TreeNode(list.get(i));
            current = current.right;
        }

        return root1;
    }
    public static  void displayLevelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current == null) {
                System.out.print("null ");
                continue;
            }
            System.out.print(current.val + " ");
            queue.add(current.left);
            queue.add(current.right);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
        TreeNode result = increasingBST(root);
        displayLevelOrder(result);

    }
}