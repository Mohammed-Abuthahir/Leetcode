// 2639. Find the Width of Columns of a Grid
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findColumnWidth{
    public static int[] findcolumn(int[][] nums){
        int[] arr = new int[nums[0].length];
        int idx = 0;
        for(int i = 0;i < nums[0].length; i++){
            int max = 0;
            for(int j = 0;j < nums.length; j++){
                char[] c = String.valueOf(nums[j][i]).toCharArray();
                max = Math.max(max, c.length);
            }
            arr[idx++] = max;
        }
        return arr; 
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int col = scan.nextInt();
        System.out.println("Enter teh Matrix :");
        int[][] nums = new int[row][col];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int[] result = findcolumn(nums);
        System.out.println(Arrays.toString(result));
    }
}