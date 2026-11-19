// 2970. Count the Number of Incremovable Subarrays I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class incremovableSubarrayCount{
    public static int incremovable(int[] nums){
        int count = 0;
        for(int start = 0; start < nums.length; start++){
            for(int end = start; end < nums.length; end++){
                boolean incremovable = true;
                for(int i = 1;i < start - 1; i++){
                    if(nums[i - 1] >= nums[i]) {
                        incremovable = false;
                        break;
                    }
                }
                for(int i = end + 1; i < nums.length - 1; i++){
                    if(nums[i] >= nums[i + 1]) {
                        incremovable = false;
                        break;
                    }
                }
                if(start > 0 && end < nums.length - 1 && nums[start - 1] >= nums[end + 1]){
                    incremovable = false;
                }
                if(incremovable) count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = incremovable(nums);
        System.out.println(result);
    }
}
