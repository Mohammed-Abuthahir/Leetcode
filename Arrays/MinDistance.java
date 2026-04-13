// 1848. Minimum Distance to the Target Element
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class MinDistance{
    public static int getMinDistance(int[] nums,int target,int start){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target){
                min = Math.min(min , Math.abs(i - start));
            }
        }
        return min;
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
        System.out.println("Enter the target :");
        int target = scan.nextInt();
        System.out.println("Enter the Start :");
        int start = scan.nextInt();
        int result = getMinDistance(nums, target, start);
        System.out.println(result);

    }
}