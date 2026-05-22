// 3300. Minimum Element After Replacement With Digit Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minElement{
    public static int minelement(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            int sum = 0;
            while(num > 0){
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            min = Math.min(sum , min);
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the Size :");
        int n = scan.nextInt();
        System.out.println("ENter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = minelement (nums);
        System.out.println(result);
    }
}