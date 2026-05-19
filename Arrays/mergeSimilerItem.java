// 2363. Merge Similar Items
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mergeSimileritem{
    public static List<List<Integer>> mergeSimilarItems(int[][] item1, int[][] item2){
        ArrayList<Integer> nums1 = new ArrayList<>();
        for(int i = 0;i < item1.length; i++){
            for(int j = 0; j < item1[i].length; j++){
                nums1.add(item1[i][j]);
            }
        }
        for(int i = 0;i < item2.length; i++){
            for(int j = 0;j < item2[i].length; j++){
                nums1.add(item2[i][j]);
            }
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums1.size(); i = i + 2) {
            int key = nums1.get(i);
            int newValue = nums1.get(i + 1);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + newValue);
            } else {
                map.put(key, newValue);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int key : map.keySet()){
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(key);
            arr.add(map.get(key));
            result.add(arr);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row 1 :");
        int row1 = scan.nextInt();
        System.out.println("Enter the Col 1 :");
        int col1 = scan.nextInt();
        System.out.println("Enter the Row 2 :");
        int row2 = scan.nextInt();
        System.out.println("Enter the Cols 2 :");
        int col2 = scan.nextInt();
        System.out.println("Enter the items 1 :");
        int[][] item1 = new int[row1][col2];
        for(int i = 0;i < item1.length; i++){
            for(int j = 0;j < item1[i].length; j++){
                item1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the items 2");
        int[][] item2 = new int[row2][col2];
        for(int i = 0;i < item2.length; i++){
            for(int j = 0;j < item2[i].length;j++){
                item2[i][j] = scan.nextInt();
            }
        }
        List<List<Integer>> result = mergeSimilarItems(item1, item2);
        System.out.println(result);
    }
}