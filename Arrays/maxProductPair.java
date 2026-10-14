// 4074. Maximum Product Pair With Target Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxProductPair{
    public static int[] maxProductPair(int[] nums, int target){
        int[] arr = new int[2];
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                int prod = nums[i] * nums[j];
                int sum = nums[i] + nums[j];
                if(i != j && sum == target && nums[i] > nums[j] && max < prod){
                    arr[0] = i;
                    arr[1] = j;
                    max = prod;
                }
            }
        }
        return (arr[0] == 0 && arr[1] == 0) ? new int[]{-1, -1} : arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Target : ");
        int[] result = maxProductPair(nums, target);
        System.out.println(Arrays.toString(result));
    }
}