// 674. Longest Continuous Increasing Subsequence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findLengthOfLCIS{
    public static int findLengthofLCIS(int[] nums){
        int count = 1; int max = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] < nums[i]){
                count++;
                max = Math.max(max, count);
            }
            else count = 1;
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
        int result = findLengthofLCIS(nums);
        System.out.println(result);
    }
}