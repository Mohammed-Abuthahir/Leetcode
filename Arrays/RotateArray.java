// 189. Rotate Array
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
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