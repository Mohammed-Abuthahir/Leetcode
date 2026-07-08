// 1588. Sum of All Odd Length Subarrays
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumOddLengthSubarrays{
    public static int sumofoddlength(int[] nums){
        int sum = 0;
        for(int i = 0;i < nums.length; i++){
            int currSum = 0;
            for(int j = i;j < nums.length; j++){
                currSum = currSum + nums[j];
                int len = j - i + 1;
                if(len % 2 != 0){
                    sum = sum + currSum;
                }
            }
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
        int result = sumofoddlength(nums);
        System.out.println(result);
    }
}