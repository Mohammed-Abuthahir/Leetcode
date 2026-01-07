// 905. Sort Array By Parity
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sortbyparity{
    public static int[] sortbyparity(int[] nums) {
        int left = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right] % 2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
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
        int[] result = sortbyparity(nums);
        System.out.println("Result :"+Arrays.toString(result));
    }
}