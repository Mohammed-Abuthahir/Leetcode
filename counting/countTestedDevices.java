// 2960. Count Tested Devices After Test Operations
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countTestedDevices{
    public static int countTested(int[] nums){
        int count = 0;
        for(int num : nums){
            if(num > count) count++;
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
        int result = countTested(nums);
        System.out.println(result);
    }
}