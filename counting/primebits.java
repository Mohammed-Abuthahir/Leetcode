import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class primebits{
    public static boolean isprime(int n){
        if(n <= 1) return false;

        for(int i = 2;i * i <= n;i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int primecount(int left , int right){
        int prime = 0;
        for(int i = left; i <= right; i++){
            if(isprime(Integer.bitCount(i))){
                prime++;
            }
        }
        return prime;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Starting :");
        int left = scan.nextInt();
        System.out.println("Enter the Ending :");
        int right = scan.nextInt();
        int result = primecount(left,right);
        System.out.println("The prime Count is to :"+ result);
    }
}