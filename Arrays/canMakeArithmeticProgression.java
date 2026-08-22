import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class canMakeArithmeticProgression{
    public static boolean canmakearithmetic(int[] nums){
        Arrays.sort(nums);
        int diff = nums[1] - nums[0];
        for(int i = 2; i < nums.length; i++){
            if(nums[i] - nums[i - 1] != diff){
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
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        boolean result = canmakearithmetic(nums);
        System.out.println(result);
    }
}