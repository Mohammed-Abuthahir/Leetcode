// 3185. Count Pairs That Form a Complete Day II
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class countCompleteDayPairs{
    public static long countcomplete(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;
        for(int num : nums){
            int rem = num % 24;
            if(rem == 0) count = count + map.getOrDefault(0, 0);
            else count = count + map.getOrDefault(24 - rem , 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Scanner : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        long result = countcomplete(nums);
        System.out.println(result);
    }
}