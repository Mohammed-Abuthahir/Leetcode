import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class RotateArray{
    public static int[] rotate(int[] nums,int k){
        if(nums.length == 1){
            return nums;
        }
        if(nums.length < k){
            k = k % nums.length;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        left = 0;
        right = k - 1;
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        left = k;
        right = nums.length - 1;
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        System.out.println("Before Rotate Arrays :"+Arrays.toString(nums));
        int[] rotationarray = rotate(nums,k);
        System.out.println("After Rotation :"+Arrays.toString(rotationarray));
    }
}