// 3750. Minimum Number of Flips to Reverse Binary String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumFlips{
    public static int minimumflips(int n){
        String reverse = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
        String num = Integer.toBinaryString(n);
        int count = 0;
        int i = 0;
        while(i < reverse.length()){
            if((reverse.charAt(i) - '0') != (num.charAt(i) - '0')){
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scan.nextInt();
        int result = minimumflips(n);
        System.out.println(result);
    }
}