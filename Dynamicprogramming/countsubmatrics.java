// 1277. Count Square Submatrices with All Ones
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countsubmatrics{
    public static int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
    public static int counting(int[][] nums){
        int m = nums.length;
        int n = nums[0].length;
        int count = 0;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(nums[i][j] == 0) continue;
                if(i > 0 && j > 0){
                    nums[i][j] = nums[i][j] + min(nums[i - 1][j],nums[i][j - 1],nums[i -1][j - 1]);
                }
                count = count + nums[i][j];
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the M :");
        int m = scan.nextInt();
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[m][n];
        for(int i = 0;i < m ;i++){
            for(int j = 0;j < n;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = counting(nums);
        System.out.println(result);
    }
}