// 4030. Check ASCII Palindromic
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class isPalindromic{
    public static boolean isPalindromic(String s){
        String str = "";
        for(char c : s.toCharArray()){
            int num = (int) c;
            String binaryStr = String.format("%8s", Integer.toBinaryString(num & 0xFF)).replace(' ', '0');
            str = str + binaryStr;
        }
        String revword = new StringBuilder(str).reverse().toString();
        return revword.equals(str);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Scanner :");
        String s = scan.next();
        boolean result = isPalindromic(s);
        System.out.println(result);
    }
}