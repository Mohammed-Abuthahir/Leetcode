// 3643. Flip Square Submatrix Vertically
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class flipmatrix{
    public static int[][] flipmatrixvertically(int[][] nums,int x, int y, int k){
        List<List<Integer>> result = new ArrayList<>();
        for(int i = y; i < y + k; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = x;j < x + k; j++){
                list.add(nums[j][i]);
            }
            Collections.reverse(list);
            result.add(list);
        }
        List<Integer> arr = new ArrayList<>();
        for(List<Integer> subset : result){
            arr.addAll(subset);
        }
        int idx = 0;
        for(int i = y; i < y + k; i++){
            for(int j = x; j < x + k; j++){
                nums[j][i] = arr.get(idx++);
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[][] nums = new int[row][cols];
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums[i].length; j++){
                nums[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the X :");
        int x = scan.nextInt();
        System.out.println("Enter the Y :");
        int y = scan.nextInt();
        System.out.println("ENter the K :");
        int k = scan.nextInt();
        int[][] result = flipmatrixvertically(nums,x, y,k);
        System.out.println(Arrays.deepToString(result));
    }
}