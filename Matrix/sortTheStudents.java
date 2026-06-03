// 2545. Sort the Students by Their Kth Score
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sortTheStudents{
    public static int[][] sortthestudents(int[][] nums, int k){
        Arrays.sort(nums, (a, b) -> Integer.compare(b[k],a[k]));
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[0].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int[][] result = sortthestudents(nums, k);
        System.out.println(Arrays.deepToString(nums));
    }
}