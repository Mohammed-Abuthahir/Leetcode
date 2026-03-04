// 1582. Special Positions in a Binary Matrix
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class specialposition{
    public static int special(int[][] mat){
        int[] rowsum = new int[mat.length];
        int[] colssum = new int[mat[0].length];
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[0].length;j++){
                if(mat[i][j] == 1){
                    rowsum[i]++;
                    colssum[j]++;
                }
            }
        }
        int specialcount = 0;
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[0].length;j++){
                if(mat[i][j] == 1 && rowsum[i] == 1 && colssum[j] == 1){
                    specialcount++;
                }
            }
        }
        return specialcount;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] mat = new int[row][cols];
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[0].length;j++){
                mat[i][j] = scan.nextInt();
            }
        }
        int result = special(mat);
        System.out.println("Special Number is to :"+result);
    }
}