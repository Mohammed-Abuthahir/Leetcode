// 2319. Check if Matrix Is X-Matrix
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class xmatrix{
    public static boolean xmatrix(int[][] nums){
        for(int i = 0;i < nums.length;i++){
            if(nums[i][i] == 0){
                return false;
            }
        }
        for(int i = 0;i < nums.length;i++){
            if(nums[i][nums.length - 1 - i] == 0){
                return false;
            }
        }
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                if(i != j && i + j != nums.length - 1){
                    if(nums[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
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
            for(int j = 0;j < nums[i].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        boolean result = xmatrix(nums);
        System.out.println(result);
    }
}