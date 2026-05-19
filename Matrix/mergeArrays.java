// 2570. Merge Two 2D Arrays by Summing Values
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class mergeArrays{
    public static int[][] mergearrays(int[][] nums1, int[][] nums2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums1.length; i++){
            for(int j = 0;j < nums1[i].length; j++){
                list.add(nums1[i][j]);
            }
        }
        for(int i = 0;i < nums2.length; i++){
            for(int j = 0;j <nums2[i].length; j++){
                list.add(nums2[i][j]);
            }
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0;i < list.size(); i = i + 2){
            if(map.containsKey(list.get(i))){
                map.put(list.get(i), map.get(list.get(i)) + list.get(i + 1));
            }
            else{
                map.put(list.get(i), list.get(i + 1));
            }
        }
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int key : map.keySet()){
            newArr.add(key);
            newArr.add(map.get(key));
        }
        int idx = 0;
        int[][] nums = new int[newArr.size() / 2][2];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = newArr.get(idx++);
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row 1");
        int row1 = scan.nextInt();
        System.out.println("Enter the Cols 1");
        int col1 = scan.nextInt();
        System.out.println("Enter the Row 2 :");
        int row2 = scan.nextInt();
        System.out.println("Enter the Cols 2 :");
        int col2 = scan.nextInt();
        System.out.println("Enter the Matrix 1 :");
        int[][] nums1 = new int[row1][col1];
        for(int i = 0;i < nums1.length; i++){
            for(int j = 0;j < nums1[i].length; j++){
                nums1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the Matrix 2 :");
        int[][] nums2 = new int[row2][col2];
        for(int i = 0;i < nums2.length; i++){
            for(int j = 0;j < nums2[i].length;j++){
                nums2[i][j] = scan.nextInt();
            }
        }
        int[][] result = mergearrays(nums1, nums2);
        System.out.println(Arrays.deepToString(result));
    }
}