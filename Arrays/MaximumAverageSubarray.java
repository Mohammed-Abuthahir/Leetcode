// 643. Maximum Average Subarray I
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class MaximumAverageSubarray{
    public static double Average(int[] nums,int k){
        double windowSum = 0;
        double avg = 0;
        for(int i = 0;i < k; i++){
            windowSum = windowSum + nums[i];
        }
        avg = windowSum / k;
        for(int i = k;i<nums.length;i++){
            windowSum = windowSum - nums[i - k] + nums[i];
            double currAvg = windowSum / k;
            avg = Math.max(currAvg,avg);
        }
        return avg;
    }
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        double result = Average(nums,k);
        System.out.println("Maximum Avarage Subarray :"+result);
    }
}