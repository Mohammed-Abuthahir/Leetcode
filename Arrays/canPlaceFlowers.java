// 605. Can Place Flowers
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class canPlaceFlowers{
    public static boolean canplaceflower(int[] nums, int n){
        if(nums.length == 1 && nums[0] == 0 && n == 1) return true;
        if(nums.length == 1 && nums[0] == 1 && n == 0) return true;
        if(nums.length == 1 && nums[0] == 0 && n == 0) return true;
         for(int i = 1;i < nums.length - 1; i++){
            if(nums[i - 1] == 0 && nums[i] == 0 && i - 1 == 0){
                nums[i - 1] = 1;
                n--;
            }
            if(nums[i - 1] == 0 && nums[i] == 0 && nums[i + 1] == 0){
                nums[i] = 1;
                n--;
            }
        }
        if(n <= 0){
            return true;
        }
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] == 0 && nums[i - 1] == 0 && i == nums.length - 1){
                nums[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int size = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[size];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        boolean result = canplaceflower(nums, n);
        System.out.println(result);
    }
}