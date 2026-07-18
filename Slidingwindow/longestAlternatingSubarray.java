// 2760. Longest Even Odd Subarray With Threshold
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class longestAlternatingSubarray{
    public static int longestAlternating(int[] nums, int threshold){
        int max = 0;
        for(int start = 0;start < nums.length; start++){
            if(nums[start] % 2 != 0) continue;
            for(int end = start; end < nums.length; end++){
                boolean valid = true;

                for(int i = start; i <= end; i++){
                    if(nums[i] > threshold){
                        valid = false;
                    }
                    if(i < end && (nums[i] % 2 == nums[i + 1] % 2)){
                        valid = false;
                    }
                }
                if(valid){
                    max = Math.max(max, end - start + 1);
                }
            }
        }
        return max;
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
        System.out.println("Enter the Threshold :");
        int threshold = scan.nextInt();
        int result = longestAlternating(nums, threshold);
        System.out.println(result);
    }
}