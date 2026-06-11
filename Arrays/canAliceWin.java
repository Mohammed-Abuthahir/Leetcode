// 3232. Find if Digit Game Can Be Won
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class canAliceWin{
    public static boolean canAliceWin(int[] nums){
        int SingleSum = 0; int DoubleSum = 0;
        for(int num : nums){
            if(num < 10){
                SingleSum = SingleSum + num;
            }
        }
        for(int num : nums){
            if(num >= 10){
                DoubleSum = DoubleSum + num;
            }
        }
        return SingleSum > DoubleSum || SingleSum < DoubleSum;
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
        boolean result = canAliceWin(nums);
        System.out.println(result);
    }
}