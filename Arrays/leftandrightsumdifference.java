// 2574. Left and Right Sum Differences
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class leftandrightsumdifference{
    public static int[] leftandright(int[] nums){
        int[] pref = new int[nums.length];
        pref[0] = 0;
        for(int i = 1;i<nums.length;i++){
            pref[i] = pref[i-1] + nums[i-1];
        }
        int[] sufx = new int[nums.length];
        sufx[sufx.length - 1] = 0;
        for(int i = nums.length - 2;i>=0;i--){
            sufx[i] = sufx[i+1] + nums[i+1];
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = Math.abs(pref[i] - sufx[i]);
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
        int[] result = leftandright(nums);
        System.out.println("Left and Right Sum Difference is :"+Arrays.toString(result));
    }
}