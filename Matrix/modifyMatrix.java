// 3033. Modify the Matrix
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class modifyMatrix{
    public static int[][] modifiedMatrix(int[][] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                if(nums[i][j] == -1){
                    int max = 0;
                    for(int k = 0;k < nums.length; k++){
                        max = Math.max(max, nums[k][j]);
                    }
                    nums[i][j] = max;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int col = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][col];
        for(int i = 0;i <nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int[][] result = modifiedMatrix(nums);
        System.out.println(Arrays.deepToString(result));
    }
}