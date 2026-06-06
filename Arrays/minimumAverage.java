// 3194. Minimum Average of Smallest and Largest Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumAverage{
    public static double minimumaverage(int[] nums){
        Arrays.sort(nums);
        double min = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            min = Math.min(min,(double) (nums[left] + nums[right]) / 2);
            left++;
            right--;
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        double result = minimumaverage(nums);
        System.out.println(result);
    }
}