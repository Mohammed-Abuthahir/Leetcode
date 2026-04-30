// 2133. Check if Every Row and Column 
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class checkmatrix{
    public static boolean checkvalid(int[][] matrix){
         int n = matrix.length;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> rowSet = new HashSet<>();
            HashSet<Integer> colSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (!rowSet.add(matrix[i][j])) return false;
                if (!colSet.add(matrix[j][i])) return false;
            }
            if (rowSet.size() != n || colSet.size() != n) {
                return false;
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
        int[][] nums = new int[row][cols];
        System.out.println("Enter the Arrays :");
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        boolean result = checkvalid(nums);
        System.out.println(result);
    }
}