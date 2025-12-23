// 125. Valid Palindrome
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class validpalindrome{
    public static boolean palindromeornot(String s){
        if(s.length() == 1 ||  s.length() == 0){
            return true;
        }
        String original = s.replaceAll("[^a-zA-Z-0-9]","").toLowerCase();
        String revword = new StringBuilder(original).reverse().toString();
        return revword.equals(original);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        boolean result = palindromeornot(s);
        System.out.println("String Palindrome or Not :"+result);
    }
}