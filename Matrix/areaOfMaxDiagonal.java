// 3000. Maximum Area of Longest Diagonal Rectangle
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class areaOfMaxDiagonal{
    public static int arearectangle(int[] nums){
        double max = 0;
        for(int i = 0;i < nums.length; i++){
            double num =  Math.sqrt(nums[i][0] * nums[i][0] + nums[i][1] * nums[i][1]);
            max = Math.max(num, max);
        }
        int max1 = 0;
        for(int i = 0;i < nums.length; i++){
                double num =  Math.sqrt(nums[i][0] * nums[i][0] + nums[i][1] * nums[i][1]);
                if(num == max) max1 = Math.max(max1, nums[i][0] * nums[i][1]);
         }
        return max1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row :");
        int row = scan.nextInt();
        System.out.println("Enter the Col :");
        int col = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][col];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = arearectangle(nums);
        System.out.println(result);
    }
}