// 852. Peak Index in a Mountain Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Peakindex{
    public static int peakindex(int[] nums){
        int index = 0;
        for(int i = 1;i<nums.length - 1;i++){
            if(nums[i - 1] < nums[i] && nums[i] > nums[i + 1]){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = peakindex(nums);
        System.out.println("Peak index is :"+result);
    }
}