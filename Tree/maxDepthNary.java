// 559. Maximum Depth of N-ary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxDepthNary{
    static class Node{
        int val;
        List<Node> children;
        Node(int val){
            this.val = val;
            this.children = new ArrayList<>();
        }
    }
    public static void fillthelist(List<List<Integer>> result, Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> arr = new ArrayList<>();
            int size = queue.size();
            for(int i = 0;i < size; i++){
                Node current = queue.poll();
                arr.add(current.val);
                for(Node child : current.children){
                    queue.add(child);
                }
            }
            result.add(arr);
        }
    }
    public static int maxDepth(Node root){
        List<List<Integer>> result = new ArrayList<>();
        fillthelist(result, root);
        return result.size();
    }
    public static void main(String[] args){
        Node root = new Node(1);
        Node child1 = new Node(3);
        Node child2 = new Node(2);
        Node child3 = new Node(4);
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);
        child1.children.add(new Node(5));
        child1.children.add(new Node(6));
        int result = maxDepth(root);
        System.out.println(result);
    }
}