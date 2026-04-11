// 405. Convert a Number to Hexadecimal
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class hexadecimal{
    public static String hexadecimal(int num){
        return Integer.toHexString(num);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        String result = hexadecimal(num);
        System.out.println(result);
    }
}