import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countsubstring{
    public static int countingString(String s,char c){
        int count = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count * (count + 1) / 2;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the Char :");
        char c = scan.next().charAt(0);
        int result = countingString(s,c);
        System.out.println(result);
    }
}