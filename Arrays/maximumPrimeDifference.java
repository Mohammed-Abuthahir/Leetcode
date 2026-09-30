// 3115. Maximum Prime Difference
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumPrimeDifference{
    public static boolean isprime(int n){
        if(n <= 1) return false;
        for(int i = 2;i * i <= n; i++){
            if(n % i == 0){
                return true;
            }
        }
        return false;
    }
    public static int maximumPrimeDiff(int[] nums){
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i < nums.length; i++){
            if(isprime(nums[i])){
                arr.add(nums[i]);
            }
        }
        return arr.getLast() - arr.getFirst();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = maximumPrimeDiff(nums);
        System.out.println(result);
    }
}