// Count Elements With Strictly Smaller and Greater Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countElements{
    public static int countelements(int[] nums){
        int count = 0;
        for(int i = 0;i < nums.length; i++){
            boolean smaller = false;  boolean large = false;
            for(int num : nums){
                if(nums[i] > num) smaller = true;
                if(nums[i] < num) large = true;
            }
            if(smaller && large) count++;
        }
        return count;
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
        int result = countelements(nums);
        System.out.println(result);
    }
}