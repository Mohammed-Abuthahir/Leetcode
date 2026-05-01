// 3340. Check Balanced String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class checkbalancestring{
    public static boolean balance(String s){
        int oddsum = 0; int evensum = 0;
        for(int i = 0;i < s.length(); i++){
            if(i % 2 == 0) evensum = evensum + s.charAt(i) - '0';
            else {oddsum = oddsum + s.charAt(i) - '0'};
        }
        return oddsum == evensum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = balance(s);
        System.out.println(result);
    }
}