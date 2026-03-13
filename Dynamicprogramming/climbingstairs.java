// 70. Climbing Stairs
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class climbingstairs{
    public static int helper(int n , int[] dp){
        if(n <= 1) return 1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
    }
    public static int climbingstair(int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(n , dp);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = climbingstair(n);
        System.out.println(result);
    }
}
// / Tabulation
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class climbingstairs{
    public static int climbingstair(int n){
        int[] dp = new int[n + 1];
         if(n == 1) return n;
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2;i < n;i++){
                dp[i] = dp[i - 1] + dp[i - 2];
        }
       return dp[n - 1];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        int result = climbingstair(n);
        System.out.println(result);
    }
}