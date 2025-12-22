// 2108. Find First Palindromic String in the Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class firstPalindromicString{
    public static String Palindromic(String[] words){
        String output = "";
        for(String word : words){
            StringBuilder str = new StringBuilder(word);
            String reversed = str.reverse().toString();

            if (reversed.equals(word)) {
                output = word;
                break;
            }

        }
        return output;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextLine();
        }
        String result = Palindromic(nums);
        System.out.println("First Palindromic :"+result);
    }
}