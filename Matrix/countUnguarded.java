// 2257. Count Unguarded Cells in the Grid
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
class countUnguarded{
    public static int countungurded(int m, int n, int[][] guards,int[][] walls){
       char[][] nums = new char[m][n];

        for(int i = 0;i < nums.length; i++){
            Arrays.fill(nums[i], ' ');
        }

        for(int[] g : guards){
            nums[g[0]][g[1]] = 'G';
        }

        for(int[] w : walls){
            nums[w[0]][w[1]] = 'W';
        }
        for(int[] g : guards){
            int r = g[0];
            int c = g[1];
            
            // top
            for (int i = r - 1; i >= 0; i--) {
                if (nums[i][c] == 'W' || nums[i][c] == 'G')
                    break;
                nums[i][c] = 'X';
            }
            // Down
            for (int i = r + 1; i < m; i++) {
                if (nums[i][c] == 'W' || nums[i][c] == 'G')
                    break;
                nums[i][c] = 'X';
            }
            // Left
            for (int j = c - 1; j >= 0; j--) {
                if (nums[r][j] == 'W' || nums[r][j] == 'G')
                    break;
                nums[r][j] = 'X';
            }
            // Right
            for (int j = c + 1; j < n; j++) {
                if (nums[r][j] == 'W' || nums[r][j] == 'G')
                    break;
                nums[r][j] = 'X';
            }
        }
        int count = 0;
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j  < nums[0].length; j++){
                if(nums[i][j] == ' ') count++;
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
        System.out.println("Enter the Gurded :");
        int[][] guards = new int[3][2];
        for(int i = 0;i < guards.length; i++){
            for(int j = 0;j <guards[i].length; j++){
                guards[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the Walls :");
        int[][] walls = new int[3][2];
        for(int i = 0;i < walls.length; i++){
            for(int j = 0; j < walls[i].length; j++){
                walls[i][j] = scan.nextInt();
            }
        }
        int result = countungurded(m, n, guards, walls);
        System.out.println(result);
    }
}