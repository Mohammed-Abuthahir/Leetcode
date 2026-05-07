import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ToeplitzMatrix{
    public static boolean isToeplitzMatrix(int[][] nums){
        for(int i = 0;i < nums.length - 1;i++){
            for(int j = 0;j < nums[0].length - 1; j++){
                if(nums[i][j] != nums[i + 1][j + 1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0;j < nums[0].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        boolean result = isToeplitzMatrix(nums);
        System.out.println(result);
    }
}