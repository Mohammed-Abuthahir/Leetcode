// 988. Smallest String Starting From Leaf
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class smallestFromLeaf{
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
     public static void getFillthelist(List<String> list, StringBuilder sb,TreeNode root, HashMap<Integer, Character> map){
        if (root == null) return;
        int lengthBefore = sb.length();
        sb.append(map.get(root.val));
        if (root.left == null && root.right == null) {
            list.add(new StringBuilder(sb).reverse().toString());
        } else {
            getFillthelist(list, sb, root.left, map);
            getFillthelist(list, sb, root.right, map);
        }
        sb.setLength(lengthBefore);
    }
    public static String smallestlexicographically (TreeNode root){
         List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap<>();
        int idx = 0;
        for(int i = 97;i <= 122 ; i++){
            map.put(idx++, (char) i);
        }
        getFillthelist(list, sb, root, map);
        String smallest = list.get(0);
        for(int i = 1;i < list.size(); i++){
            if(list.get(i).compareTo(smallest) < 0){
                smallest = list.get(i);
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        String result = smallestlexicographically(root);
        System.out.println(result);
    }
}