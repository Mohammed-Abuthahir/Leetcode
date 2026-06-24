// 2367. Number of Arithmetic Triplets
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class arithmeticTriplets{
    public static int arithmetictriplets(int[] nums, int diff){
        int count = 0;
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                for(int k = 0;k < nums.length; k++){
                    if(i < j && j < k && (nums[j] - nums[i]) == diff && (nums[k] - nums[j]) == diff){
                        count++;
                    }
                }
            }
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
        System.out.println("Enter the Diff :");
        int diff = scan.nextInt();
        int result = arithmetictriplets(nums, diff);
        System.out.println(result);
    }
}