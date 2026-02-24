// 2562. Find the Array Concatenation Value
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ConcatenationValue{
    public static long concatenation(int[] nums){
        long sum = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            String num = "" + nums[left] + nums[right];
            sum = sum + Long.parseLong(num);
            left++;
            right--;
        }
        int mid = left + (right - left) / 2;
        return nums.length % 2 != 0 ? (sum + nums[mid]) : sum;
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
        long result = concatenation(nums);
        System.out.println("After Concatination :"+result);

    }
}