// 1920. Build Array from Permutation
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class buildarray{
    public static int[] buildarray(int[] nums){
        int i = 0;
        int[] arr = new int[nums.length];
        while(i < arr.length){
            arr[i] = nums[nums[i]];
            i++;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = buildarray(nums);
        System.out.println("After Building Array :"+ Arrays.toString(result));
    }
}