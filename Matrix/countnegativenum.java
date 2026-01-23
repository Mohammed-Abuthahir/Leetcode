// 1351. Count Negative Numbers in a Sorted Matrix
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countnegativenum{
    public static int negativenumber(int[][] nums){
        int row = 0;
        int cols = 0;
        int negativecount = 0;
        while(row < nums.length){
            while(cols < nums[0].length){
                if(nums[row][cols] < 0){
                    negativecount++;
                }
                cols++;
            }
            cols = 0;
            row++;
        }
        // for(int i = 0;i < nums.length;i++){
        //     for(int j = 0;j < nums[i].length;j++){
        //         if(nums[i][j] < 0){
        //             negativecount++;
        //         }
        //     }
        // }
        return negativecount;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = negativenumber(nums);
        System.out.println("Number of Negative Number is :"+result);
    }
}