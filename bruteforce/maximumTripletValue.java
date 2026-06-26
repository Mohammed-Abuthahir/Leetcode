// 2873. Maximum Value of an Ordered Triplet I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumTripletValue{
    public static long maximumvalue(int[] nums){
         long max = 0;
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                for(int k = 0;k < nums.length; k++){
                    if(i < j && j < k){
                        max = Math.max((long) (nums[i] - nums[j]) * nums[k], max);
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        long result = maximumvalue(nums);
        System.out.println(result);
    }
}