// 62. Unique Paths
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class UniquePaths{
    public static int Paths(int m, int n){
        int[][] memo = new int[m + 1][n + 1];
        for (int[] row : memo) {
            java.util.Arrays.fill(row, -1);
        }
        return solve(1, 1, m, n, memo);
    }
    public static int solve(int sr,int sc,int er,int ec,int[][] memo){
        if (sr > er || sc > ec) return 0;
        if (sr == er && sc == ec) return 1;
        if (memo[sr][sc] != -1) {
            return memo[sr][sc];
        }
        int downWays = solve(sr + 1, sc, er, ec, memo);
        int rightWays = solve(sr, sc + 1, er, ec, memo);
        memo[sr][sc] = downWays + rightWays;
        return memo[sr][sc];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the M :");
        int m = scan.nextInt();
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        int result = Paths(m,n);
        System.out.println(result);
    }
}