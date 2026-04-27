// 680. Valid Palindrome II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class validpalindromes{
    public static boolean ispalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean palindromecheck(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return ispalindrome(s, left + 1, right) || ispalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = palindromecheck(s);
        System.out.println(result);
    }
}