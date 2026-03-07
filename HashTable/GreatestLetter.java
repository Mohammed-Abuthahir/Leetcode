import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class GreatestLetter{
    public static String greatestone(String s){
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
        for(char c : s.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                upper.add((Character.toLowerCase(c)));
            }
        }
        for(char c : s.toCharArray()){
            if (c >= 'a' && c <= 'z') {
                lower.add(c);
            }
        }
        int max = 0;
        for(char c : lower){
            if(upper.contains(c)){
                max = Math.max(max,(int) c);
            }
        }
        if(max == 0) return "";
        String str = String.valueOf(Character.toUpperCase((char) max));
        return str;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = greatestone(s);
        System.out.println(result);
    }
}