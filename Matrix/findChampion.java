// 2923. Find Champion I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findChampion{
    public static int findchampion(int[][] nums){
        int max = 0;
        for(int i = 0;i < nums.length; i++){
            int count = 0;
            for(int j = 0;j < nums[i].length; j++){
                if(nums[i][j] == 1){
                    count++;
                }
            }
            if(max < count){
                max = Math.max(max, i);
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row : ");
        int row = scan.nextInt();
        System.out.println("Enter the Cols : ");
        int cols = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        int result = findchampion(nums);
        System.out.println(result);
    }
}