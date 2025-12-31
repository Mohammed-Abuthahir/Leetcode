// 48. Rotate Image
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Rotateimage{
    public static void Rotating(int[][] matrix){
        for(int i = 0;i<matrix.length;i++){
            for(int j = i;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i<matrix.length;i++){
            int left = 0;
            int right = matrix[i].length - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Columns :");
        int col = scan.nextInt();
        int[][] matrix = new int[row][col];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                System.out.println("Enter the :"+ i + "," + j);
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("before Rotating:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Rotating(matrix);
        System.out.println("After Rotating:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
