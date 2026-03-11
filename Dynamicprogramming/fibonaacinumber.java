// 509. Fibonacci Number 

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class fibonaacinumber{
    public static int fibonacci(int n){
        // Bottom - up Approach
        if(n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0; dp[1] = 1;
        for(int i = 2;i <= n;i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
        // Top-down approach
        //  if(n <= 1) return n;
        // if(dp[n] != 0) return dp[n];
        // return  dp[n] = fib(n - 1,dp) + fib(n - 2,dp);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
    }
}