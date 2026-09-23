// 4010. Maximize Pair Strength Using GCD
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxPairStrength{
    public static long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long maxPairStrength(int[] nums){
        long max = 0;
        for(int i = 0;i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                long gcd = gcd(nums[i], nums[j]);
                long strength = (nums[i] / gcd) * (nums[j] / gcd);
                max = Math.max(max, strength);
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        long result = maxPairStrength(nums);
        System.out.println(result);
    }
}