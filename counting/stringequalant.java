// 2068. Check Whether Two Strings are Almost Equivalent
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class stringequalant{
    public static boolean stringequalant(String s1,String s2){
        int[] freq = new int[26];
        for(int i = 0;i < s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']++;
        }
        for(int diff : freq){
            if(Math.abs(diff) > 3){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String s1 = scan.next();
        System.out.println("Enter the String 2 :");
        String s2 = scan.next();
        boolean result = stringequalant(s1,s2);
        System.out.println(result);
    }
}