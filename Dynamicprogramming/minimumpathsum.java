// 64. Minimum Path Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumpathsum{
    public static int Minimumpaths(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[i].length;j++){
                if(i == 0 && j == 0) continue;
                else if(i == 0) grid[i][j] = grid[i][j] + grid[i][j - 1];
                else if(j == 0) grid[i][j] = grid[i][j] + grid[i - 1][j];
                else grid[i][j] = grid[i][j] + Math.min(grid[i][j - 1],grid[i - 1][j]);
            }
        }
        return grid[m - 1][n - 1];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the M :");
        int m = scan.nextInt();
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[m][n];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[0].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = Minimumpaths(nums);
        System.out.println(result);
    }
}