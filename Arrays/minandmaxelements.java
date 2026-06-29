// 3774. Absolute Difference Between Maximum and Minimum K Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minandmaxelements{
    public static int absDifference(int[] nums, int k){
        Arrays.sort(nums);
        int sum1 = 0;
        for(int i = 0;i < k; i++){
            sum1 = sum1 + nums[i];
        }
        int sum2 = 0;
        int left = 0; int right = nums.length - 1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        for(int i = 0;i < k; i++){
            sum2 = sum2 + nums[i];
        }
        return Math.abs(sum1 - sum2);
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
        System.out.println("Enter the k :");
        int k = scan.nextInt();
        int result = absDifference(nums,k);
        System.out.println(result);
    }
}