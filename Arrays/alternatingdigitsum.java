// 2544. Alternating Digit Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class alternatingdigitsum{
    public static int alterdigit(int num){
        char[] s = String.valueOf(num).toCharArray();
        int[] arr = new int[s.length];
        int j = 0;
        for(char c : s){
            arr[j++] = c - '0';
        }
        int evensum = 0;
        int oddsum = 0;
        for(int i = 0;i < arr.length;i++){
            if(i % 2 == 0) evensum += arr[i];
            else if(i % 2 != 0) oddsum += arr[i];
        }
        return evensum - oddsum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        int result = alterdigit(num);
        System.out.println(result);
    }
}