// 2500. Delete Greatest Value in Each Row
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class deleteGreatestValue{
    public static int deletegreatestvalue(int[][] nums){
        int m = nums.length; 
        int n = nums[0].length; 
        int ans = 0;
        int col = n;
        while(col > 0){
            int sum = 0;
            for(int i = 0;i < m; i++){
                int max = 0;
                int idx = 0;
                for(int j = 0;j < n; j++) {
                    if(nums[i][j] > max){
                        max = nums[i][j];
                        idx = j;
                    }
                }
                sum = Math.max(sum, max);
                nums[i][idx] = -1;
            }
            ans = ans + sum;
            col--;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int col = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[][] nums = new int[row][col];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = deletegreatestvalue(nums);
        System.out.println(result);
    }
}