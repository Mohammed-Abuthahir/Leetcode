// 1281. Subtract the Product and Sum of Digits of an Integer
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class subractsumandproduct{
    public static int sumandproduct(int num){
        int product = 1;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            product = product * rem;
            sum = sum + rem;
            num = num / 10;
        }
        return product - sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scan.nextInt();
        int result = sumandproduct(n);
        System.out.println("Subract sum and product ans is :"+result);
    }
}