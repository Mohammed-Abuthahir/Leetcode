// 1984. Minimum Difference Between Highest and Lowest of K Scores
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumDifference{
    public static int minimum(int[] nums, int k){
        int minimum = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0;right < nums.length; right++){
            int max = 0; int min = Integer.MAX_VALUE;
            if(right - left + 1 == k){
                for(int i = left; i <= right; i++){
                    max = Math.max(nums[i], max);
                    min = Math.min(nums[i], min);
                }
                minimum = Math.min(min, max);
                left++;
            }
        }
        return minimum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter teh Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = minimum(nums, k);
        System.out.println(result);
    }
}