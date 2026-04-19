// 3190. Find Minimum Operations to Make All Elements Divisible by Three
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class divisablebythree{
    public static int minimumOperations(int[] nums){
        int count = 0;
        for(int num : nums){
            if(num % 3 != 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = minimumOperations(nums);
        System.out.println(result);
    }
}