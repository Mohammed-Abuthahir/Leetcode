// 3895. Count Digit Appearances
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countdigitOccur{
     public static int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int num : nums){
            while(num > 0){
                int rem = num % 10;
                if(rem == digit) count++;
                num = num / 10;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i <nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter te Digit :");
        int digit = scan.nextInt();
        int result = countDigitOccurrences(nums, digit);
        System.out.println(result);
    }
}