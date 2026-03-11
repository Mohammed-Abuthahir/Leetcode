// 3726. Remove Zeros in Decimal Representation
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removezeros{
    public static long zeros(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int rem = n % 10;
            if(rem > 0){
                sb.append(rem);
            }
            n = n / 10;
        }
        return Long.parseLong(sb.reverse().toString());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        long result = zeros(n);
        System.out.println(result);
    }
}