// 3402. Minimum Operations to Make Columns Strictly Increasing
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumOperations{
    public static int minimumoperation(int[] nums){
        int sum = 0;
        for(int i = 0;i < nums[0].length; i++){
            for(int j = 1;j < nums.length; j++){
                if(nums[j][i] <= nums[j - 1][i]){
                    sum = sum + (nums[j - 1][i] - nums[j][i]) + 1;
                    nums[j][i] = (nums[j - 1][i] - nums[j][i]) + nums[j][i] + 1;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int cols = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = minimumoperation(nums);
        System.out.println(result);
    }
}