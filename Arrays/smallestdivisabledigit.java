// 3345. Smallest Divisible Digit Product I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class smallestdivisabledigit{
    public static int smallestNumber(int n, int t){
        for(int i = n;i < 1000; i++){
            int temp = i;
            int product = 1;
            while(temp > 0){
                int rem = temp % 10;
                product = product * rem;
                temp = temp / 10;
            }
            if(product % t == 0) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the T :");
        int t = scan.nextInt();
        int result = smallestNumber(n , t);
        System.out.println(result);
    }
}