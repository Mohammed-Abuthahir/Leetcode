// 209. Minimum Size Subarray Sum
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Minimumsizesubarray{
    public static int subarray(int[] nums,int target){
        int left = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        for(int right = 0;right<nums.length;right++){
            sum = sum + nums[right];
            while(sum >= target){
                sum = sum - nums[left];
                minlen = Math.min(minlen,right - left + 1);
                left++;
            }
        }
        return minlen;  
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
        System.out.println("Enter the Target :");
        int target = scan.nextInt();
        int result = subarray(nums,target);
        System.out.println("Minimum sum subArray :"+result);
    }
}