// 2443. Sum of Number and Its Reverse
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumOfNumberAndReverse{
    public static boolean sumOfNumber(int num){
        int sum = 0;
        for(int i = 0;i <= num ; i++){
            String reverse = new StringBuilder(String.valueOf(i)).reverse().toString();
            sum = i + Integer.parseInt(reverse);
            if(sum == num) {
                return true;
            }
            else{
                sum = 0;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Num :");
        int num = scan.nextInt();
        boolean result = sumOfNumber(num);
        System.out.println(result);
    }
}