// 1051. Height Checker
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Heightchecker{
    public static int heightchecker(int[] nums){
        int expected[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            expected[i] = nums[i];
        }
        Arrays.sort(expected);
        int matching = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == expected[i]){
                matching++;
            }
        }
        return nums.length - matching;
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
        int result = heightchecker(nums);
        System.out.println("Does Not match Count is :"+result);
    }
}