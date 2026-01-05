// 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class EqualtoThreshold{
    public static int Average(int[] nums,int k,int threshold){
        int count = 0;
        int windowAvg = 0;
        for(int i = 0;i < k;i++){
            windowAvg = windowAvg + nums[i];
        }
        if(windowAvg / k >= threshold){
            count++;
        }
        for(int i = k;i<nums.length;i++){
            windowAvg = windowAvg - nums[i - k] + nums[i];
            if(windowAvg / k >= threshold){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        System.out.println("Enter the Threshold");
        int threshold = scan.nextInt();
        int result = Average(nums,k,threshold);
        System.out.println("average greater than or equal to threshold. :" + result);
    }
}