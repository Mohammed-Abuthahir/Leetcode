// 2352. Equal Row and Column Pairs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class EqualRowandCols{
    public static int equalPairs(int[][] nums){
        int[][] transport = new int[nums.length][nums[0].length];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                transport[j][i] = nums[i][j];
            }
        }
        HashMap<Integer, List<Integer>> map1 = new HashMap<>();
        HashMap<Integer, List<Integer>> map2 = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            map1.put(i, new ArrayList<>());
            for(int j = 0;j < nums[i].length; j++){
                map1.get(i).add(nums[i][j]);
            }
        }
        for(int i = 0;i < transport.length; i++){
            map2.put(i, new ArrayList<>());
            for(int j = 0;j < transport[i].length; j++){
                map2.get(i).add(transport[i][j]);
            }
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0;j < transport.length; j++){
                if(map1.get(i).equals(map2.get(j))){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("ENter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = equalPairs(nums);
        System.out.println(result);
    }
}