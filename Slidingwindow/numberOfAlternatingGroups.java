// 3206. Alternating Groups I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class numberOfAlternatingGroups{
    public static int numberofAlternating(int[] nums){
        int[] arr = new int[nums.length + 2];
        for(int i = 0;i < nums.length; i++){
            arr[i] = nums[i];
        }
        arr[nums.length - 2] = nums[0]; arr[nums.length - 1] = nums[1];
        int count = 0;
        for(int i = 1;i < arr.length - 1; i++){
            if(arr[i - 1] == 0 && arr[i] == 1 && arr[i + 1] == 0) count++;
            else if(arr[i - 1] == 1 && arr[i] == 0 && arr[i + 1] == 1) count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = numberofAlternating(nums);
        System.out.print(result);
    }
}