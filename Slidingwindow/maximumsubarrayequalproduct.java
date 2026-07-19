// 3411. Maximum Subarray With Equal Products
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumsubarrayequalproduct{
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long lcm(long a, long b) {
        return (a / gcd((int)a, (int)b)) * b;
    }
    public static long lcmOfArray(int[] arr) {
        long ans = arr[0];
        for (int i = 1; i < arr.length; i++) ans = lcm(ans, arr[i]);
        return ans;
    }
    public static int maxLength(int[] nums){
        int max = 0;
        for(int start = 0; start < nums.length; start++){
            for(int end = start;end < nums.length; end++){
                int product = 1;
                int ans = nums[start];
                long ans1 = nums[start];
                for(int i = start; i <= end; i++){
                    product = product * nums[i];
                    ans = gcd(ans, nums[i]);
                    ans1 = lcm(ans1, nums[i]);
                }
                if(product == (ans * ans1)){
                    max = Math.max(max, end - start + 1);
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = maxLength(nums);
        System.out.println(result);
    }
}