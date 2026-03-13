// 198. House Robber - memozation
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class houserobber{
    public static int amount(int[] nums,int idx,int[] dp){
        if(idx >= nums.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        int take = nums[idx] + amount(nums, idx + 2, dp);
        int skip = amount(nums, idx + 1 , dp);
        return dp[idx] = Math.max(take , skip);
    }
    public static int HouseRobbering(int[] nums){
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return amount(nums,0 , dp);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = HouseRobbering(nums);
        System.out.println("Total Amount :"+result);
    }
}
// Tabulation
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class houserobber{
    public static int HouseRobbering(int[] nums){
        int[] dp = new int[nums.length];
        if(nums.length == 1) return nums[0];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i < nums.length;i++){
            dp[i] = Math.max(nums[i] + dp[i - 2],dp[i -1]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[nums.length - 1];

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = HouseRobbering(nums);
        System.out.println("Total Amount :"+result);
    }
}