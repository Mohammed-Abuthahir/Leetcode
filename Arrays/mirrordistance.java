// 3783. Mirror Distance of an Integer
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mirrordistance{
    public static int mirrorDistance(int n){
        int temp = n;
        int reverse = 0;
        while(temp > 0){
            int rem = temp % 10;
            reverse = (reverse * 10) + rem;
            temp = temp / 10;
        }
        return Math.abs(n - reverse);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int result = mirrorDistance(n);
        System.out.println(result);
    }
}