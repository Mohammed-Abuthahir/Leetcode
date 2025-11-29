// 121. Best Time to Buy and Sell Stock
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class besttimetobuyandsell{
    public static int maximumprofit(int[] nums){
        int min = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int price : nums){
            min = Math.min(min , price);
            MaxProfit = Math.max(MaxProfit , price - min);
        }
        return MaxProfit;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = maximumprofit(nums);
        System.out.println("Maximum Profit is to :" + result);
    }
}