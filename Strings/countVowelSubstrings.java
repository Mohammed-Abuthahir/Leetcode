// 2062. Count Vowel Substrings of a String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countVowelSubstrings{
    public static boolean isVowel(String s){
        if(s.length() < 5) return false;
        boolean a = false; boolean e = false;
        boolean i = false; boolean o = false;
        boolean u = false;
        for(char c : s.toCharArray()){
            if(c == 'a') a = true;
            else if(c == 'e') e = true;
            else if(c == 'i') i = true;
            else if(c == 'o') o = true;
            else if(c == 'u') u = true;
            else return false;
        }
        return a && e && i && o && u;
    }
    public static int countvowel(String s){
        int count = 0;
        for(int i = 0;i < s.length(); i++){
            for(int j = i; j <= s.length(); j++){
                if(isVowel(s.substring(i, j))){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = countvowel(s);
        System.out.println(result);
    }
}