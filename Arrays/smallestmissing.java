// i2996. Smallest Missing Integer Greater Than Sequential Prefix Sum
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class smallestmissing{
    public static int smallest(int[] nums){
        int max = nums[0];
        int sum = nums[0];
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i + 1] == nums[i] + 1){
                sum = sum + nums[i + 1];
            }
            else{
                break;
            }
            max = Math.max(max,sum);
        }
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == max){
                max++;
            }
        }
        return max;
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
        int result = smallest(nums);
        System.out.println("result :"+result);
    }
}