import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumproductsubarray{
    public static int maximumproduct(int[] nums){
        int prefix = 1;
        int suffix = 1;
        int maximum = Integer.MIN_VALUE;
        for(int num : nums){
            prefix = prefix * num;
            maximum = Math.max(maximum , prefix);
            if(prefix == 0){
                prefix = 1;
            }
        }
        for(int i = nums.length - 1;i>=0;i--){
            suffix = suffix * nums[i];
            maximum = Math.max(maximum,suffix);
            if(suffix == 0){
                suffix = 1;
            }
        }
        return maximum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = maximumproduct(nums);
        System.out.println("Maximum Product Subarray is :"+result);
    }
}