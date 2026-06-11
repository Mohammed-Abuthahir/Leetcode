// 2656. Maximum Sum With Exactly K Elements 
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximizeSum{
    public static int maximizesum(int[] nums, int k){
        int max = 0;
        for(int num : nums){
            max = Math.max(num, max);
        }
        int sum = 0;
        for(int i = max; i < max + k; i++){
            sum = sum + i ;
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = maximizesum(nums, k);
        System.out.println(result);
    }
}