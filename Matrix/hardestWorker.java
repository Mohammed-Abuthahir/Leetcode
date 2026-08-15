// 2432. The Employee That Worked on the Longest Task
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class hardestWorker{
    public static int harder(int[][] nums){
        int max = nums[0][1];
        for(int i = 1;i < nums.length; i++){
            max = Math.max(max, Math.abs(nums[i][1] - nums[i - 1][1]));
        }
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max1 = 0;
        if(max == nums[0][1]){
            count = 1;
            min = nums[0][0];
            max1 = nums[0][0];
        }
        for(int i = 1; i < nums.length; i++){
            if(Math.abs(nums[i][1] - nums[i - 1][1]) == max) count++;
        }

        if(count > 0){
            for(int i = 1;i < nums.length; i++){
                if(Math.abs(nums[i][1] - nums[i - 1][1]) == max){
                    min = Math.min(nums[i][0], min);
                }
            }
            return min;
        }
        else {
            for(int i = 1;i < nums.length; i++){
                if(Math.abs(nums[i][1] - nums[i - 1][1]) == max){
                    max1 = Math.max(max1, nums[i][0]);
                }
            }
        }
        return max1; 
    }
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the row : ");
        int row = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][2];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = harder(nums);
        System.out.println(result);
    }
}