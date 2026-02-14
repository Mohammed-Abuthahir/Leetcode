// 1672. Richest Customer Wealth
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class richestcustomer{
    public static int customer(int[][] accounts){
        int row = 0;
        int cols = 0;
        int sum = 0;
        int max = 0;
        while(row < accounts.length){
            while(cols < accounts[0].length){
                sum = sum + accounts[row][cols];
                max = Math.max(max,sum);
                cols++;
            }
            sum = 0;
            cols = 0;
            row++;
        }
        return max;
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
            for(int j = 0;j < nums[0].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = customer(nums);
        System.out.println("The richest customer is to :"+result);
    }
}