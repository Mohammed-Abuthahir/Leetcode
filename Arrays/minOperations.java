// 2869. Minimum Operations to Collect Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minOperations{
    public static int minoperation(int[] nums, int k){
    List<Integer> arr = new ArrayList<>();
       for(int i = 1; i <= k; i++){
           arr.add(i);
       }
       int count = 0;
       for(int i = nums.length - 1;i >= 0;i--){
           if(arr.contains(nums[i])){
               arr.remove(Integer.valueOf(nums[i]));
           }
           count++;
           if(arr.isEmpty()) break;
       }
       return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the  Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the k :");
        int k = scan.nextInt();
        int result = minoperation(nums, k);
        System.out.println(result);
    }
}