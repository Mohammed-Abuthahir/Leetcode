// 1646. Get Maximum in Generated Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class getMaximumGenerated{
    public static int getMaximum(int n){
        if(n <= 1) return n;
        int[] nums = new int[n + 1];
        nums[0] = 0; nums[1] = 1;
        int max = 0;
        for(int i = 1;i < nums.length; i++){
            if((2 * i) <= n){
                nums[2 * i] = nums[i];
                max = Math.max(max, nums[i]);
            }
            if(( 2 * i + 1 ) <= n){
                nums[(2 * i) + 1] = nums[i] + nums[i + 1];
                max = Math.max(max, (nums[i] + nums[i + 1]));
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int result = getMaximum(n);
        System.out.println(result);
    }
}