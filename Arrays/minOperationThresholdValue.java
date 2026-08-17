// 3065. Minimum Operations to Exceed Threshold Value I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minOperationThresholdValue{
    public static int minOperations(int[] nums, int k){
        int count = 0;
        for(int num : nums){
            if(num > k) count++;
        }
        return count;
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = minOperations(nums, k);
        System.out.println(result);
    }
}
