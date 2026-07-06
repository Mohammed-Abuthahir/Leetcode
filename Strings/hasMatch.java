// 3407. Substring Matching Pattern
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class hasMatch{
    public static boolean hasmatch(String s, String p){
        for(int i = 0;i < s.length(); i++){
            for(int j = i + 1;j <= s.length(); j++){
                String sub = s.substring(i, j);
                String temp = p.replace("*", sub);
                if(s.contains(temp)){
                    return true;
                }
            }
        }
        return s.contains(p.replace("*", ""));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the String :");
        String p = scan.next();
        boolean result = hasmatch(s, p);
        System.out.print(result);
    }
}