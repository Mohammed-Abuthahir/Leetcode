// 3925. Concatenate Array With Reverse
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class concatWithReverse{
    public static int[] concat(int[] nums){
        int[] newArr = new int[nums.length + nums.length];
        int idx = 0;
        for(int i = 0;i < nums.length; i++){
            newArr[idx++] = nums[i];
        }
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        for(int num : nums){
            newArr[idx++] = num;
        }
        return newArr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = concat(nums);
        System.out.println(Arrays.toString(result));
    }
}