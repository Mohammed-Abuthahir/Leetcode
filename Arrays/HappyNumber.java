import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class HappyNumber{
    public static boolean happynumornot(int num){
        while(num > 5){
            int sum = 0;
            while(num > 0){
                int rem = num % 10;
                sum = sum + (int) Math.pow(rem,2);
                num = num / 10;
            }
            num = sum;
        }
        if(num == 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the Number :");
        int num = scan.nextInt();
        boolean result = happynumornot(num);
        System.out.println("Happy Number Or Not :"+ result);
    }
}