// 1464. Maximum Product of Two Elements in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumproduct{
    public static int maximum(int[] nums){
        int max1 = 0;
        int max2 = 0;
        for(int num : nums){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }
            else if(num > max2){
                max2 = num;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = maximum(nums);
        System.out.println(result);
    }
}