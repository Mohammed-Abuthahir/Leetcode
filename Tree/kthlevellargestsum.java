// 2583. Kth Largest Sum in a Binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class kthlevellargestsum{
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
    public static void fillthelist(TreeNode root, List<List<Integer>> result){
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
    public static long kthLargestLevelSum(TreeNode root, int k){
        List<List<Integer>> result = new ArrayList<>();
        fillthelist(root , result);
        List<Long> levelSum = new ArrayList<>();
        for(List<Integer> subset : result){
            long currsum = 0;
            for(int i = 0;i < subset.size();i++){
                currsum = currsum + subset.get(i);
            }
            levelSum.add(currsum);
        }
        Collections.sort(levelSum, Collections.reverseOrder());
        if(k > levelSum.size()) return -1;
        return levelSum.get(k - 1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        long result = kthLargestLevelSum(root, k);
        System.out.println(result);
    }
}