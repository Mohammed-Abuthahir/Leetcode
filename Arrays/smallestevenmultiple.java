// 2413. Smallest Even Multiple
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class smallestevenmultiple{
    public static int smallest(int n){
        return (n & 1) == 0 ? n : n * 2;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int result = smallest(n);
        System.out.println(result);
    }
}