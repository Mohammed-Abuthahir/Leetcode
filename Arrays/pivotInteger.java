// 2485. Find the Pivot Integer
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class pivotInteger{
    public static int pivot(int n){
        int[] nums = new int[n];
        for(int i = 1;i <= n;i++){
            nums[i - 1] = i;
        }
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] =  nums[0];
        suffix[suffix.length - 1] = nums[nums.length - 1];
        for(int i = 1;i < prefix.length;i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for(int i = nums.length - 2;i >=0 ;i--){
           suffix[i] = suffix[i + 1] + nums[i];
       }
        for(int i = 0;i < prefix.length;i++){
            if(prefix[i] == suffix[i]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = scan.nextInt();
        int result = pivot(n);
        System.out.println("result :"+ result);
    }
} 