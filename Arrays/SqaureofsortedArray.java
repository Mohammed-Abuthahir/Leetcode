// 977. Squares of a Sorted Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class SqaureofsortedArray{
    public static int[] sqaureofarray(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        for(int i = n-1; i >= 0;i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[i] = nums[left] * nums[left];
                left++;
            }
            else{
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = sqaureofarray(nums);
        System.out.println("Square of the Array :"+ Arrays.toString(result));
    }
}