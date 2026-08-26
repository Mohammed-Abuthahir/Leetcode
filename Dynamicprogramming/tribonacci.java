// 1137. N-th Tribonacci Number
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class tribonacci{
    public static int fillthelist(int n, int[] dp){
        if(n == 0) return n;
        if(n == 1 || n == 2) return 1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fillthelist(n - 1, dp) + fillthelist(n - 2, dp) + fillthelist(n - 3, dp);
    }

    public static int tribonacci(int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        fillthelist(n , dp);
        return dp[n];
    }
    // public static int tribonacci(int n){
    //     if(n == 0) return 0; 
    //     if(n == 1 && n == 2) return 1;
    //     int[] dp = new int[n + 1];
    //     dp[0] = 0; dp[1] = 1; dp[2] = 1;
    //     for(int i = 3; i < dp.length; i++){
    //         dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    //     }
    //     return dp[n];
    // }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int result = tribonacci(n);
        System.out.println(result);
    }
}