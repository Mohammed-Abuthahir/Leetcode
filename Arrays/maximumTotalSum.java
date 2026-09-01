// 3301. Maximize the Total Height of Unique Towers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumTotalSum{
    public static long maximumTotal(int[] nums){
       Arrays.sort(nums);
        long sum = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            nums[i] = Math.min(nums[i], nums[i + 1] - 1);
            if(nums[i] <= 0) return -1;
            sum = sum + nums[i];
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
        long result = maximumTotal(nums);
        System.out.println(result);
    }
}