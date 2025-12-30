// 1732. Find the Highest Altitude
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findhighestalititude{
    public static int findhighestalititude(int[] nums){
        int[] pref = new int[nums.length + 1];
        pref[0] = 0;
        for(int i = 1;i<=nums.length;i++){
            pref[i] = pref[i-1] + nums[i-1];
        }
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = pref.length - 1;
        while(left <= right){
            max = Math.max(max,Math.max(pref[left],pref[right]));
            left++;
            right--;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = findhighestalititude(nums);
        System.out.println("Highest Alititude is :"+result);
    }
}