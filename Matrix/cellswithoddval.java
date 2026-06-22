// 1252. Cells with Odd Values in a Matrix
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class cellswithoddval{
    public static int oddCells(int m, int n, int[][] indices){
        List<Integer> nums = new ArrayList<>();
        for(int i = 0;i < indices.length; i++){
            for(int j = 0;j < indices[i].length; j++){
                nums.add(indices[i][j]);
            }
        }
        int[][] matrix = new int[m][n];
        for(int i = 0;i < nums.size() - 1;i = i + 2){
            int r1 = nums.get(i);
            int c1 = nums.get(i + 1);
            for(int j = 0;j < matrix[r1].length; j++){
                matrix[r1][j]++;
            }
            for(int r = 0;r < matrix.length; r++){
                matrix[r][c1]++;
            }
        }
        int count = 0;
        for(int i = 0;i < matrix.length; i++){
            for(int j = 0;j < matrix[i].length; j++){
                if(matrix[i][j] % 2 != 0){
                    count++;
                }
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
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        int[][] indices = new int[row][cols];
        for(int i = 0;i < indices.length; i++){
            for(int j = 0;j < indices[i].length; j++){
                indices[i][j] = scan.nextInt();
            }
        }
        int result = oddCells(m, n, indices);
        System.out.println(result);
    }
}