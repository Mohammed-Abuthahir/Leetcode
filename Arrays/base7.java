// 504. Base 7
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class base7{
    public static String base7representation(int n){
        if(n == 0){
            return "0";
        }
        int num = Math.abs(n);
        StringBuilder s = new StringBuilder();
        while(num > 0){
            int rem = num % 7;
            s.append(rem);
            num = num / 7;
        }
        s.reverse();
        String neg = "";
        if(n < 0){
            neg = "-" + s.toString();
        }
        return n > 0 ? s.toString() : neg;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        String result = base7representation(n);
        System.out.println(result);
    }
}