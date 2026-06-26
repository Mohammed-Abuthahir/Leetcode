// 2908. Minimum Sum of Mountain Triplets I
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class minimumSum{
    public static int minimumsum(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length ; i++){
            for(int j = 0;j < nums.length; j++){
                for(int k = 0;k < nums.length; k++){
                    if(i < j && j < k){
                        if(nums[i] < nums[j] && nums[k] < nums[j]){
                            int sum = (nums[i] + nums[j] + nums[k]) ;
                            min = Math.min(sum, min);
                        }
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
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
        int result = minimumsum(nums);
        System.out.println(result);
    }
}