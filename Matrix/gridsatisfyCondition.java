// 3142. Check if Grid Satisfies Conditions
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class gridsatisfyCondition{
    public static boolean satisfiesConditions(int[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0;j < grid[i].length; j++){
                if(i + 1 < grid.length){
                    if(grid[i][j] != grid[i + 1][j]){
                        return false;
                    }
                }
                if(j + 1 < grid[i].length){
                    if(grid[i][j] == grid[i][j + 1]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        boolean result = satisfiesConditions(nums);
        System.out.println(result);
    }
}