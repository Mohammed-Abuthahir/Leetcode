// 1200. Minimum Absolute Difference
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class minimumAbsDifference{
    public static List<List<Integer>> minimimdiff(int[] arr){
         Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i < arr.length - 1; i++){
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i + 1] - arr[i] == min){
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        List<List<Integer>> result = minimimdiff(nums);
        System.out.println(result);
    }
}