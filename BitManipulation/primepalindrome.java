// 866. Prime Palindrome
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class primepalindrome{
    public static boolean isprime(int n){
        if(n <= 1) return false;
        for(int i = 2;i * i <= n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int primepalindrome(int n){
        if(n <= 11){
           HashSet<Integer> set = new HashSet<>();
           set.add(2); set.add(3); set.add(5); set.add(7); set.add(11);
           while(!set.contains(n)){
                n++;
           }
           return n;
        }
        for(int i = 1;i < 100000;i++){
            String original = String.valueOf(i);
            String revword = new StringBuilder(original.substring(0, original.length() - 1)).reverse().toString();
            int num = Integer.parseInt(original + revword);
            if(num >= n && isprime(num)){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = primepalindrome(n);
        System.out.println(result);
    }
}