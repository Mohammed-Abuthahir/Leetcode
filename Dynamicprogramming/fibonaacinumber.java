// 509. Fibonacci Number 
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class fibonaacinumber{
    public static int fibonacci(int n){
        if(n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0; dp[1] = 1;
        for(int i = 2;i <= n;i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
    }
}