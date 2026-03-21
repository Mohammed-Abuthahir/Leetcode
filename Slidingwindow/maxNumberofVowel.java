// 1456. Maximum Number of Vowels in a Substring of Given Length
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxNumberofVowel{
    public static boolean isVowel(char s){
        return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u';
    }
    public static int lengthofsubstring(String s,int k){
        int count = 0;
        int maxlen = 0;
        for(int i = 0;i < k;i++){
            if(isVowel(s.charAt(i))) count++;
        }
        maxlen = count;
        for(int i = k;i < s.length();i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i - k))) count--;
            maxlen = Math.max(maxlen , count);
            if(maxlen == k) return maxlen;
        }
        return maxlen;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = lengthofsubstring(s, k);
        System.out.println(result);
    }
}