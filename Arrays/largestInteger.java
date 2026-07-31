// 4000. Largest Integer With Given Digit Sum
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class largestInteger{
    public static int largestinteger(int n, int s){
         if(s == 0) return 0;
        int size = n;
        if(n == 1) n = 10;
        else if(n == 2) n = 100;
        else if(n == 3) n = 1000;
        else if(n == 4) n = 10000;
        else n = 100000;
        int max = -1;
        for(int i = 1;i < n; i++){
            String num = String.valueOf(i);
            int sum = 0;
            if(num.length() == size){
                for(char c : num.toCharArray())
                    sum = sum + (c - '0');
            }
            if(sum == s) max = Math.max(max, i);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the S :");
        int s = scan.nextInt();
        int result = largestinteger(n, s);
        System.out.println(result);
    }
}