// 1822. Sign of the Product of an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class arraySign{
    public static int arraysign(int[] nums) {
        for(int num : nums){
            if(num == 0) return 0;
        }
        int negativecount = 0;
        for(int num : nums){
            if(num < 0){
                negativecount++;
            }
        }
        return negativecount % 2 == 0 ? 1 : -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter teh Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = arraysign(nums);
        System.out.println(result);
    }
}