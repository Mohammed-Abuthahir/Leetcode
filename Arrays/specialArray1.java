import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class specialArray1{
    public static boolean special(int[] nums){
        if(nums.length == 1) return true;
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 || nums[i] % 2 != 0 && nums[i + 1] % 2 != 0){
                return false;
            }
        }
        return true;
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
        boolean result = special(nums);
        System.out.println(result);
    }
}