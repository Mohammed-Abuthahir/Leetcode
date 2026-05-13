// 3794. Reverse String Prefix
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class reversePrefix{
    public static String reverse(String s, int k){
        char[] nums = s.toCharArray();
        int left = 0;
        int right = k - 1;
        while(left <= right){
            char temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return new String(nums);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Strring :");
        String s = scan.next();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        String result = reverse(s, k);
        System.out.println(result);
    }
}