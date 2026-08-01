// 3978. Unique Middle Element
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class isMiddleElementUnique{
    public static boolean middleelement(int[] nums){
        int middle = nums[nums.length / 2];
        int count = 0;
        for(int num : nums){
            if(num == middle){
                count++;
            }
            if(count > 1) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        boolean result = middleelement(nums);
        System.out.println(result);
    }
}