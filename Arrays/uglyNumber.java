// 263. Ugly Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class uglyNumber{
    public static boolean ugly(int n){
        int[] nums = {2,3,5};
        while(true){
            int count = 0;
            for(int num : nums){
                if(n % num == 0) n = n / num;
                else count++;
            }
            if(count == nums.length) return false;
            if(n == 1) return true;
            if(n == 0) break;
        }
        return n == 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        boolean result = ugly(n);
        System.out.println(result);
    }
}