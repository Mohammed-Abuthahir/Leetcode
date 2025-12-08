// Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ReverseInteger{
    public static int reverse(int num){
        int rem;
        long reverse = 0;
        while(num != 0){
            rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }
        int reversing = 0;
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        else{
            reversing = (int) reverse;
        }
        return reversing;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        int result = reverse(num);
        System.out.println("After Reversing Number : "+result);
    }
}