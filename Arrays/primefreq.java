// 3591. Check if Any Element Has Prime Frequency
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class primefreq{
    public static boolean isprime(int n){
        if(n <= 1) return false;

        for(int i = 2;i * i <=n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;    
    }
    public static boolean primefrequency(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num : nums){
            if(isprime(map.get(num))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        boolean result = primefrequency(nums);
        System.out.println(result);
    }
}