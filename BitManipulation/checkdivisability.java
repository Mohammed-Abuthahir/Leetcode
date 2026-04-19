// 3622. Check Divisibility by Digit Sum and Product
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class checkdivisability{
    public static boolean checkDivisability(int num){
        int sum = 0; int product = 1; int temp = num;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            product = product * rem;
            num = num / 10;
        }
        return temp % (sum + product) == 0 ? true : false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int num = scan.nextInt();
        boolean result = checkDivisability(num);
        System.out.println(result);
    }
}