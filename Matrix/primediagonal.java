// 2614. Prime In Diagonal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class primediagonal{
    public static boolean isprime(int n){
        if(n <= 1) return false;
        for(int i = 2;i * i <= n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int Maxprimenum(int[][] nums){
        int max = 0;
        for(int i = 0;i < nums.length;i++){
            if(isprime(nums[i][i]) && nums[i][i] != 1 && nums[i][i] != 0){
                max = Math.max(max,nums[i][i]);
            }
            if(isprime(nums[i][nums.length - 1 - i]) && nums[i][nums.length - 1 - i] != 1 && nums[i][nums.length - 1 - i] != 0){
                max = Math.max(max,nums[i][nums.length - 1 - i]);
            }
        }
        return max >= 1 ? max : 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = Maxprimenum(nums);
        System.out.println("Maximum Prime Number in Diagonal is :"+result);

    }
}