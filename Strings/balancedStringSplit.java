// 1221. Split a String in Balanced Strings
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class balancedStringSplit{
    public static int balance(String s){
        int count = 0;
        int Lcount = 0;
        for(char c : s.toCharArray()){
            if(c == 'L') Lcount++;
            else Lcount--;
            if(Lcount == 0) count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        int result = balance(s);
        System.out.println(result);
    }
}