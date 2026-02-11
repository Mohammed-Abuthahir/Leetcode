// Kadane Algorithm
// 52 . maximum Sum Subarray
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class MaximumsumSubArray{
    public static int Maximumsum(int[] nums){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num : nums){
            currentSum += num;
            maxSum = Math.max(currentSum , maxSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = Maximumsum(nums);
        System.out.println("Maximum sum Subarray is :"+result);
    }
}