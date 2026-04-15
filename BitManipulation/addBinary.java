// 67. Add Binary
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;
class addBinary{
    public static String binaryNum(String a,String b){
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b , 2);
        BigInteger add = num1.add(num2);
        return add.toString(2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the A :");
        String a = scan.next();
        System.out.println("Enter the B :");
        String b = scan.next();
        String result = binaryNum(a, b);
        System.out.println(result);
    }
}