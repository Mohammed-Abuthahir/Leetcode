import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class applyoperation{
    public static int[] operations(int[] nums){
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] == nums[i + 1]){
                nums[i] = nums[i + 1] * 2;
                nums[i + 1] = 0;
            }
        }
        int left = 0;
        for(int right = 0;right < nums.length;right++){
            if(nums[right] != 0){
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
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = operations(nums);
        System.out.println(Arrays.toString(result));
    }
}