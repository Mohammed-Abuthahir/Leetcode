// 867. Transpose Matrix
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class transposematrix{
    public static int[][] transpose(int[][] nums){
        int rows = nums.length;
        int cols = nums[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = nums[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row Size ");
        int row = scan.nextInt();
        System.out.println("Enter the Cols Size :");
        int cols = scan.nextInt();
        int[][] nums = new int[row][cols];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums[i].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int[][] result = transpose(nums);
        for(int i = 0;i<result.length;i++){
            for(int j = 0;j<result[i].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}