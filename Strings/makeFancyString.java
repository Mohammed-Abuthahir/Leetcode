// 1957. Delete Characters to Make Fancy String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class makeFancyString{
    public static String makefancyString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length(); i++){
            int len = sb.length();
            char c = s.charAt(i);
            if(len >= 2 && sb.charAt(len - 1) == c && sb.charAt(len - 2) == c){
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = makefancyString(s);
        System.out.println(result);
    }
}