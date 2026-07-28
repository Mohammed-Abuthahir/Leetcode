// 213. House Robber II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class houserobber2{
    public static int Helper(int[] nums, int st, int end){
        int size = end - start + 1;
        int[] dp = new int[size];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = 2; i < size; i++) {
            int currentHouse = start + i;
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[currentHouse] );
        }
        return dp[size - 1];
    }
    public static int circularhouse(int[] nums){
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(Helper(nums, 0, nums.length - 2) , Helper(nums, 1, nums.length - 1));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = circularhouse(nums);
        System.out.println(result);
    }
}