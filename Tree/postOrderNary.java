// 590. N-ary Tree Postorder Traversal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class postOrder{
    static class Node{
        int val;
        List<Node> children;
        Node(int val){
            this.val = val;
            this.children = new ArrayList<>();
        }
    }
    public static void fillthelist(Node root, List<Integer> result){
        if(root == null) return;
        for(Node child : root.children){
            fillthelist(child, result);
        }
        result.add(root.val);
    }
    public static List<Integer> postOrder(Node root){
        List<Integer> result = new ArrayList<>();
        fillthelist(root, result);
        return result;
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
        List<Integer> result = postOrder(root);
        System.out.println(result);
    }
}