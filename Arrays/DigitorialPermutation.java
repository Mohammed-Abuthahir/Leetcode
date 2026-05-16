// 3848. Check Digitorial Permutation
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class DigitorialPermutation{
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1;i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static boolean isDigitorialPermutation(int n){
        if(n == 1 || n == 0 || n == 2) return true;
        if(n < 10) return false;
        String num = String.valueOf(n);
        int sum = 0;
        for(char c : num.toCharArray()){
            sum = sum + factorial(c - '0');
        }
        char[] arr1 = num.toCharArray();
        char[] arr2 = String.valueOf(sum).toCharArray();
        if(arr1.length != arr2.length) return false;
        Arrays.sort(arr1); Arrays.sort(arr2);
        for(int i = 0;i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        boolean result = isDigitorialPermutation(n);
        System.out.println(result);
    }
}

