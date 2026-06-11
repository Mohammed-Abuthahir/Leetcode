// 3079. Find the Sum of Encrypted Integers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumOfEncryptedInt{
    public static int sumofencrypted(int[] nums){
         int sum = 0;
        for(int num : nums){
            int max = 0;
            StringBuilder sb = new StringBuilder();
            int temp = num;
            while(temp > 0){
                int rem = temp % 10;
                max = Math.max(max, rem);
                temp = temp / 10;
            }
            for(int i = 0;i < String.valueOf(num).length(); i++){
                sb.append(max);
            }
            sum = sum + Integer.parseInt(sb.toString());
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = sumofencrypted(nums);
        System.out.println(result);
    }
}