// 3618. Split Array by Prime Indices
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class splitArray{
    public static boolean isprime(int n){
        if(n <= 1) return false;
        for(int i = 2;i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static long splitarray(int[] nums){
        long sumA = 0;
        long sumB = 0;
        for(int i = 0;i < nums.length; i++){
            if(isprime(i)) sumA = sumA + nums[i];
        }
        for(int i = 0;i < nums.length; i++){
            if(!isprime(i)) sumB = sumB + nums[i];
        }
        return Math.abs(sumA - sumB);
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
        long result = splitarray(nums);
        System.out.println(result);
    }
}