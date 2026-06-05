// 3833. Count Dominant Indices
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class dominantIndices{
    public static int dominant(int[] nums) {
       int[] arr = nums.clone();
        int left = 0; int right = arr.length - 1;
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i = 1;i < arr.length - 1; i++){
            arr[i] = arr[i - 1] + arr[i];
        }
        left = 0; right = arr.length - 1;
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        int count = 0;
        int idx = 0;
        int n = nums.length - 1;
        for(int i = 1;i < arr.length; i++){
            arr[i] = (arr[i] / n);
            if(nums[idx++] > arr[i]){
                count++;
            }
            n--;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = dominant(nums);
        System.out.println(result);
    }
}
