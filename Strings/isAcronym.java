// 2828. Check if a String Is an Acronym of Words
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isAcronym{
    public static String acronym(String s){
         if(words.size() != s.length()) return false;
        int idx = 0;
        for(String word : words){
            if(word.charAt(0) != s.charAt(idx++)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = acronym(s);
        System.out.println(result);
    }
}