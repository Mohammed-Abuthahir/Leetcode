// 2373. Largest Local Values in a Matrix
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class largestLocal{
    public static int[][] localValues(int[][] nums){
        int numRows = 3;
        int numCols = 3;
        for(int r = 0;r <= nums.length - numRows; i++){
            for(int c = 0; c <= nums.length - numCols; j++){
                int max = 0;
                for(int i = 0;i < numRows; i++){
                    for(int j = 0;j < numCols; j++){
                        max = Math.max(max, nums[i + r][j + c]);
                    }
                }
                nums.add(max);
            }
            count++;
        }
        int[] arr = new int[count][count];
        int idx = 0;
        for(int i = 0; i < count; i++){
            for(int j = 0;j < count; j++){
                arr[i][j] = nums.get(idx++);
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int r = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int c = scan.nextInt();
        System.out.println("Enter the Matrix : ");
        int[][] nums = new int[r][c];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int[][] result = localValues(nums);
        System.out.println(Arrays.toString(result));
    }
}