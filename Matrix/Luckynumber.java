// 1380. Lucky Numbers in a Matrix
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Luckynumber{
    public static ArrayList<Integer> luckynumber(int[][] nums){
        int row = 0;
        int cols = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        HashSet<Integer> arr = new HashSet<>();
        while(row < nums.length){
            while(cols < nums[0].length){
                min = Math.min(min,nums[row][cols]);
                cols++;
            }
            arr.add(min);
            min = Integer.MAX_VALUE;
            cols = 0;
            row++;
        }
        row = 0;
        cols = 0;
        while(cols < nums[0].length){
            while(row < nums.length){
                max = Math.max(nums[row][cols],max);
                row++;
            }
            if(arr.contains(max)){
                return new ArrayList<>(Arrays.asList(max));
            }
            else{
                arr.add(max);
            }
            max = 0;
            row = 0;
            cols++;
        }
        return new ArrayList<>();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[0].length;j++){
                nums[i][j] = scan.nextInt();
            }
        }
        ArrayList<Integer> result = luckynumber(nums);
        System.out.println(result);
    }
}