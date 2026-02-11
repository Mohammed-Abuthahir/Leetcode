// 896. Monotonic Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class monotonicarray{
    public static boolean monotonic(int[] nums){
        if(nums.length == 1 ||  nums.length == 0) return true;
        int i = 0;
        int n = nums.length;
        while(i < n - 1 && nums[i] <= nums[i + 1]){
            i++;
        }
        if(i != 0 && i == nums.length - 1) return true;
        i = 0;
        while(i < n - 1 & nums[i] >= nums[i + 1]){
            i++;
        }
        if(i != 0 && i == nums.length - 1) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        boolean result = monotonic(nums);
        System.out.println("Monotonic Array or Not :"+result);
        
    }
}