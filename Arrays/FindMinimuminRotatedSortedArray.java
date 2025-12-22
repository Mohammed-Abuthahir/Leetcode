// 153. Find Minimum in Rotated Sorted Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class FindMinimuminRotatedSortedArray{
    public static int Minimum(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while(left <= right){
            min = Math.min(min,Math.min(nums[left],nums[right])) ;
            left++;
            right--;
        }
        return min;
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
        int result = Minimum(nums);
        System.out.println("Minimum Number :"+result);
    }
}