// 3452. Sum of Good Numbers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumOfGoodNumbers{
    public static int sumOfGoodNumbers(int[] nums , int k){
        int sum = 0;
        for(int i = 0;i < nums.length; i++){
            int idx1 = i + k;
            int idx2 = i - k;
            boolean good = true;
            if(idx1 >= 0 && idx1 < nums.length && nums[idx1] < nums[i] || idx2 >= 0 && idx2 < nums.length && nums[idx2] < nums[i]){
                good = false;
            }
            if(good) sum = sum + nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i <nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = sumOfGoodNumbers(nums, k);
        System.out.println(result);
    }
}