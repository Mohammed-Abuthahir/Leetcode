// 415. Add Strings
import java.util.*;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
class addString{
    public static String addstring(String num1,String num2){
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger ans = n1.add(n2);
        return ans.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String num1 = scan.nextLine();
        System.out.println("Enter the String 2");
        String num2 = scan.nextLine();
        String result = addstring(num1,num2);
        System.out.println(result);
    }
}