// 1716. Calculate Money in Leetcode Bank
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class totalMoney{
    public static int totalmoney(int n){
        int weeks = n / 7;
        int days = n % 7;
        int total = 0;
        for(int i = 0;i < weeks; i++){
            total = total + (28 + (7 * i));
        }
        for(int i = 1;i <= days; i++){
            total = total + weeks + i;
        }
        return total;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int result = totalmoney(n);
        System.out.println(result);
    }
}