// 1827. Minimum Operations to Make the Array Increasing
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class minOperations1{
    public static int minOperations(int[] nums){
        int sum = 0;
        for(int i = 1;i < nums.length; i++){
            if(nums[i - 1] >= nums[i]){
                sum = sum + (nums[i - 1] - nums[i] + 1);
                nums[i] = nums[i] + (nums[i - 1] - nums[i] + 1);
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = minOperations(nums);
        System.out.println(result);
    }
}