import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Removeelement{
    public static int[] remove(int[] nums,int target){
        int i = 0;
        for(int num: nums){
            if(num != target){
                nums[i++] = num;
            }
        }
        
        return Arrays.copyOf(nums,i);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Size :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Target :");
        int target = scan.nextInt();
        int[] result = remove(nums,target);
        System.out.println("After removing size is :"+Arrays.toString(result));
    }
}