// 2733. Neither Minimum nor Maximum
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class neitherminnormax{
    public static int minnormax(int[] nums){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        for(int i =0;i < nums.length;i++){
            if(nums[i] != min && nums[i] != max){
                return nums[i];
            }
        }
        return -1;
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
        int result = minnormax(nums);
        System.out.println("Result is :"+result);
    }
}