// 3745. Maximize Expression of Three Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximizeExpressionOfThree{
    public static int maximizeexpression(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                for(int k = 0;k < nums.length; k++){
                    if(i != j && j != k && k != i){
                        max = Math.max((nums[i] + nums[j]) - nums[k], max);
                    }
                }
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
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = maximizeexpression(nums);
        System.out.println(result);
    }
}