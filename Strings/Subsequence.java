// 392. Is Subsequence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Subsequence{
    public static boolean sequence(String s,String t){
        int left = 0;
        int right = 0;
        while(left < s.length() && right < t.length()){
            if(s.charAt(left) == t.charAt(right)){
                left++;
            }
            right++;
        }
        return left == s.length();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s = scan.nextLine();
        System.out.println("Enter the String 2");
        String t = scan.nextLine();
        boolean result = sequence(s,t);
        System.out.println(result);
    }
}