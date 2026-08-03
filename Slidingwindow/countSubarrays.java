// 3392. Count Subarrays of Length Three With a Condition
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class countSubarrays{
    public static int countsubarray(int[] nums){
        if(nums.length < 3) return 0;
        int k = 3;
        int left = 0;
        int count = 0;
        for(int right = 0;right < nums.length; right++){
            while(right - left + 1 == k){
                int mid = (left + right) / 2;
                if(2 * (nums[left] + nums[right]) == nums[mid]) count++;
                left++;
            }
        }
        return count;
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
        int result = countsubarray(nums);
        System.out.println(result);
    }
}