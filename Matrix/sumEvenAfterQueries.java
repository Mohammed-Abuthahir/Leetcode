// 985. Sum of Even Numbers After Queries
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class sumEvenAfterQueries{
    public static int[] sumevenqueries(int[] nums, int[][] queries){
         List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < queries.length; i++){
            for(int j = 0;j < queries[i].length; j++){
                arr.add(queries[i][j]);
            }
        }
        int[] newArr = new int[queries.length];
        int idx = 0;
        for(int i = 0; i < arr.size(); i = i + 2){
            nums[arr.get(i + 1)] = arr.get(i) + nums[arr.get(i + 1)];
            int sum = 0;
            for(int num : nums){
                if(Math.abs(num) % 2 == 0){
                    sum = sum + num;
                }
            }
            newArr[idx++] = sum;
        }
        return newArr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Row :");
        int row = scan.nextInt();
        System.out.println("Enter the Cols :");
        int cols = scan.nextInt();
        System.out.println("Enter the Matrix :");
        int[][] queries = new int[row][cols];
        for(int i = 0;i < queries.length; i++){
            for(int j = 0;j < queries[i].length; j++){
                queries[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the Nums :");
        int[] nums = new int[n];
        for(int i = 0;i <nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = sumevenqueries(nums, queries);
        System.out.println(Arrays.toString(result));
    }
}