// 3427. Sum of Variable Length Subarrays
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class subarraySum{
    public static int subarray(int[] nums){
        int[] temp = nums.clone();
        temp[0] = nums[0];
        for(int i = 1;i < nums.length; i++){
            temp[i] = temp[i - 1] + nums[i];
        }
        int sum = 0;
        for(int i = 0;i < nums.length; i++){
            int max = Math.max(0, i - nums[i]);
            if(max == 0) sum = sum + temp[i];
            else sum = sum + (temp[i] - temp[max - 1]);
        }
        return sum;
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
        int result = subarray(nums);
        System.out.println(result);
    }
}