// 561. Array Partition
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class arraypartition{
    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i < nums.length - 1; i = i + 2){
            sum = sum + Math.min(nums[i], nums[i + 1]);
        }
        return sum;
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
        int result = arrayPairSum(nums);
        System.out.println(result);
    }
}