// 2855. Minimum Right Shifts to Sort the Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimumrightshift{
    public static int minimumRightShifts(int[] nums){
        int n = nums.length - 1;
        int breakpoints = -1;
        for(int i = 0;i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                if(breakpoints != -1){
                    return -1;
                }
                breakpoints = i;
            }
        }
        if(breakpoints == -1){
            return 0;
        }
        if(nums[n - 1] > nums[0]){
            return -1;
        } 
        return n - breakpoints;
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
        int result = minimumRightShifts(nums);
        System.out.println(result);
    }
}