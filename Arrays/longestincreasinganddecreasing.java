// 3105. Longest Strictly Increasing or Strictly Decreasing Subarray
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class longestincreasinganddecreasing{
    public static int increasinganddecreasing(int[] nums){
        int count = 1;
        int max = 1;
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] < nums[i + 1]){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 1;
            }
        }
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] > nums[i + 1]){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 1;
            }
        }
        return max;
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
        int result = increasinganddecreasing(nums);
        System.out.println("longest increasing or decreasing : "+result);
    }
}