// 3637. Trionic Array I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class trionicarray{
    public static boolean trionic(int[] nums){
        int n = nums.length;
        if(n < 4) return false;
        int i = 0;
        while(i < n - 1 && nums[i] < nums[i + 1]){
            i++;
        }
        int p = i;
        if(i == 0 || i == n - 1) return false;
        while(i < n - 1 && nums[i] > nums[i + 1]){
            i++;
        }
        if(i == p || i == n - 1) return false;
        while(i < n - 1 && nums[i] < nums[i + 1]){
            i++;
        }
        return i ==  n - 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :"cd);
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        boolean result = trionic(nums);
        System.out.println(result);
    }
}