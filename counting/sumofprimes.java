// 3918. Sum of Primes Between Number and Its Reverse
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class sumofprimes{
    public static boolean isprime(int num){
        if(num <= 1) return false;
        for(int i = 2;i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrimesInRange(int num){
        String revnum = new StringBuilder(String.valueOf(num)).reverse().toString();
        int min = Math.min(num, Integer.parseInt(revnum));
        int max = Math.max(num, Integer.parseInt(revnum));
        int sum = 0;
        for(int i = min; i <= max ; i++){
            if(isprime(i)){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        int result = sumOfPrimesInRange(num);
        System.out.println(result);
    }
}