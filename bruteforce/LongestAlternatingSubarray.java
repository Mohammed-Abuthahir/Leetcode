// 2765. Longest Alternating Subarray
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class LongestAlternatingSubarray{
    public static int alternatingsubarray(int[] nums){
        int max = -1;
        for(int start = 0; start < nums.length; start++){
            for(int end = start; end < nums.length; end++){
                int count = 0;
                for(int i = start; i < end; i++){
                    int diff = nums[i + 1] - nums[i];
                    if(count % 2 == 1 && diff == 1){
                        count++;
                        max = Math.max(max, count);
                    }
                    else if(count % 2 == 0 && diff == -1){
                        count++;
                        max = Math.max(max, count);
                    }
                    else{
                        count = 1;
                    }
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
        int result = alternatingsubarray(nums);
        System.out.println(result);
    }
}