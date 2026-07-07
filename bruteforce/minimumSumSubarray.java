// 3364. Minimum Positive Sum Subarray 
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumSumSubarray{
    public static int minimumsumsubarray(int[] nums, int l, int r){
        int min = Integer.MAX_VALUE; 
        for(int i = 0;i < nums.length; i++){
            int currSum = 0;
            for(int j = i ; j < nums.length; j++){
                currSum = currSum + nums[j];
                if(j - i + 1 >= l && j - i + 1 <= r && currSum > 0){
                    min = Math.min(min, currSum);
                }
            }
        }
        return min == Integer.MAX_VALUE || min == 0 ? -1 : min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i <nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the L :");
        int l = scan.nextInt();
        System.out.println("Enter the R :");
        int r = scan.nextInt();
        int result = minimumsumsubarray(nums, l, r);
        System.out.println(result);
    }
}