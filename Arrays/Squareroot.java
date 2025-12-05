// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Squareroot{
    public static int squareroot(int n){
        double a = Math.sqrt(n);
        int b = (int) a;
        return b;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int N = scan.nextInt();
        int sqrt = squareroot(N);
        System.out.println( N + " th square root is :"+ sqrt);
    }
}