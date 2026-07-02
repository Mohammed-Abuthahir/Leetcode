// 3936. Minimum Swaps to Move Zeros to End
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumSwaps{
    public static int minimumswaps(int[] nums){
        int left = 0; int right = nums.length - 1; int count = 0;
        while(left < right){
            if(nums[left] == 0 && nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                count++;
                left++;
                right--;
            }
            else if(nums[left] != 0 && nums[right] != 0) left++;
            else if(nums[left] == 0 && nums[right] == 0) right--;
            else {left++; right--;};
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = minimumswaps(nums);
        System.out.println(result);
    }
}