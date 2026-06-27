// 2558. Take Gifts From the Richest Pile
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class picksGifts{
    public static long picksgifts(int[] nums,int k){
         long sum = 0;
        while(k > 0){
            int max = 0;
            int idx = 0;
            for(int i = 0;i < nums.length; i++){
                if(nums[i] > max){
                    max = nums[i];
                    idx = i;
                }
            }
            nums[idx] = (int) Math.sqrt(max);
            k--;
        }
        for(int num : nums) sum = sum + num;
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size  :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        long result = picksgifts(nums,k);
        System.out.println(result);
    }
}