// 1800. Maximum Ascending Subarray Sum
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Maximumascnsubarray{
    public static int subarraysum(int[] nums){
        int sum = 0;
        int max = 0;
        for(int i = nums.length - 2;i >= 0;i--){
            if(nums[i] < nums[i + 1]){
                sum = sum + nums[i + 1];
                max = Math.max(max,(sum + nums[i]));
            }
            else{
                sum = 0;
            }
        }
        for(int i = 0;i < nums.length;i++){
            max = Math.max(nums[i],max);
        }
        return max;
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
        int result = subarraysum(nums);
        System.out.print("Maximum sum subArrays is to : "+result);
    }
}