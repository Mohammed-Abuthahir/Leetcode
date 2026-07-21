// 1260. Shift 2D Grid
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class shiftGrid{
    public static List<List<Integer>> shiftgrid(int[][] nums, int k){
        int m = nums.length;
        int n = nums[0].length;
        while(k-- > 0){
            int[][] arr = new int[m][n];
            arr[0][0] = nums[m - 1][n - 1];
            for(int i = 0;i < nums.length; i++){
                for(int j = 0;j < nums[0].length; j++){
                    if(j != n - 1){
                        arr[i][j + 1] = nums[i][j];
                    }
                    else {
                        if(i != m - 1){
                            arr[i + 1][0] = nums[i][j];
                        }
                    }
                }
            }
            for(int i = 0; i < nums.length; i++){
                for(int j = 0;j < nums[0].length; j++){
                    nums[i][j] = arr[i][j];
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i < nums.length; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0;j < nums[i].length; j++){
                row.add(nums[i][j]);
            }
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int m = scan.nextInt();
        System.out.println("Enter the Cols :");
        int n = scan.nextInt();
        System.out.print("Enter the Matrix :");
        int[][] nums = new int[m][n];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[0].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        List<List<Integer>> result = shiftgrid(nums, k);
        System.out.println(result);
    }
}