// 3349. Adjacent Increasing Subarrays Detection I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class hasIncreasingSubarrays{
    public static boolean increasing(int[] nums){
        for(int i = 0;i <= nums.length - 2 * k; i++){
            boolean first = true;
            boolean second = true;
            for(int j = i; j < i + k - 1; j++){
                if(nums[j] >= nums[j + 1]){
                    first = false;
                    break;
                }
            }
            for(int j = i + k; j < i + 2 * k - 1 ; j++){
                if(nums[j] >= nums[j + 1]){
                    second = false;
                    break;
                }
            }
            if(first && second) return true;
        }
        return false;
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
        boolean result = increasing(nums);
        System.out.println(result);
    }
}