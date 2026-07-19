// 3095. Shortest Subarray With OR at Least K I
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class minimumSubarrayLength{
    public static int minimumsubarray(int[] nums, int k){
        if(k == 0 && nums[0] == 0) return 1;
        int min = Integer.MAX_VALUE;
        for(int start = 0; start < nums.length; start++){
            for(int end = start; end < nums.length; end++){
                int sum = 0;
                for(int i = start; i <= end; i++){
                    sum = sum | nums[i];
                }
                if(sum >= k){
                    min = Math.min(min, (end - start + 1));
                    break;
                }
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
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = minimumsubarray(nums, k);
        System.out.println(result);
    }
}