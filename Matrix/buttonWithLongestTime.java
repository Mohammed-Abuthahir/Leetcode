// 3386. Button with Longest Push Time
import java.util.*;
import java.util.Scanner;
class buttonWithLongestTime{
    public static int button(int[][] nums){
        int max = 0;
        max = nums[0][1];
        for(int i = 1;i < nums.length; i++){
            max = Math.max(max, nums[i][1] - nums[i - 1][1]);
        }
        int min = Integer.MAX_VALUE;
        if(max == nums[0][1]) {
            min = Math.min(min, nums[0][0]);
        }
        for(int i = 1; i < nums.length; i++){
            if(max == nums[i][1] - nums[i - 1][1]){
                min = Math.min(min, nums[i][0]);
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int col = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[][] nums = new int[row][col];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = button(nums);
        System.out.println(result);
    }
}