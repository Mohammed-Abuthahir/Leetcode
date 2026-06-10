// 1016. Binary String With Substrings Representing 1 To N
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class QueryString{
    public static boolean querystring(String s , int n){
        for(int i = 1; i <= n ; i++){
            String sub = Integer.toBinaryString(i);
            if(!s.contains(sub)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        boolean result = querystring(s, n);
        System.out.println(result);
    }
}
