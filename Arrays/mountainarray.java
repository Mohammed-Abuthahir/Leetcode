// 941. Valid Mountain Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mountainarray{
    public static boolean Mountain(int[] nums){
        int n = nums.length;
        int i = 0;
        while(i < n - 1 && nums[i] < nums[i + 1]){
            i++;
        }
        if(i == 0 || i == n - 1) return false;
        while(i < n - 1 && nums[i] > nums[i + 1]){
            i++;
        }
        return i == n - 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        boolean result = Mountain(nums);
        System.out.println(result);
    }
}
