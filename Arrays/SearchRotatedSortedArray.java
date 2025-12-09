// 33. Search in Rotated Sorted Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class SearchRotatedSortedArray{
    public static int Searching(int[] nums,int target){
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter the Target :");
        int target = scan.nextInt();
        int result = Searching(nums,target);
        System.out.println("Index is :"+result);
    }

}