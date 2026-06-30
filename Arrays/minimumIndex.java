// 3861. Minimum Capacity Box
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumIndex{
    public static int minimumindex(int[] capacity, int itemSize){
       int min = Integer.MAX_VALUE;
       for(int num : capacity){
           if(num >= itemSize){
               min = Math.min(num, min);
           }
       }
       for(int i = 0;i < capacity.length; i++){
           if(min == capacity[i]){
               return i;
           }
       }
       return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i <nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the ItemSize :");
        int itemSize = scan.nextInt();
        int result = minimumindex(nums, itemSize);
        System.out.println(result);
    }
}