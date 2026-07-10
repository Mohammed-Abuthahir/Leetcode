// 1624. Largest Substring Between Two Equal Characters
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxLength{
    public static int maxlength(String s) {
        return s.length() >= 2 && s.charAt(0) == s.charAt(s.length() - 1) ? s.length() - 2 : -1;
    }
    public static int maxLengthBetweenEqualCharacters(String s){
        int max = -1;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j <= s.length(); j++) {
                    max = Math.max(max, maxlength(s.substring(i, j)));
                }
            }
        return max; 
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = maxLengthBetweenEqualCharacters(s);
        System.out.println(result);
    }
}