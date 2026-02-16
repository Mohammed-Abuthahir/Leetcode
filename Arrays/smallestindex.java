// 3550. Smallest Index With Digit Sum Equal to Index
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class smallestindex{
    public static int minindex(int[] nums){
        int minindex = Integer.MAX_VALUE;
       int sum = 0;
       for(int i = 0;i < nums.length;i++){
           if(nums[i] < 9 && nums[i] == i){
               minindex = Math.min(minindex,i);
           }
           else{
               while(nums[i] > 0){
                   int rem = nums[i] % 10;
                   sum = sum + rem;
                   nums[i] = nums[i] / 10;
               }
               if(sum == i){
                   minindex = Math.min(i,minindex);
                   sum = 0;
               }
               sum = 0;
           }
       }
       return minindex == Integer.MIN_VALUE ? -1 : minindex;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = minindex(nums);
        System.out.println("Smallest index is to :"+result);
    }
}