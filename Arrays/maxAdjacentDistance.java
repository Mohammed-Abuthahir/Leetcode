// 3423. Maximum Difference Between Adjacent Elements in a Circular Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class maxAdjacentDistance{
    public static int maxadjecent(int[] nums){
        int max = 0;
        max = Math.max(max, Math.abs(nums[0] - nums[nums.length - 1]));
        for(int i = 0;i < nums.length - 1; i++){
            max = Math.max(max, Math.abs(nums[i] - nums[i + 1]));
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = maxadjecent(nums);
        System.out.println(result);
    }
}
