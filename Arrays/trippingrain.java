// 42. Trapping Rain Water
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class trippingrain{
    public static int rainwater(int[] nums){
        int[] prefix = nums.clone();
        int[] suffix = nums.clone();
        for(int i = 0;i < prefix.length - 1;i++){
            if(prefix[i] > prefix[i + 1]){
                prefix[i + 1] = prefix[i];
            }
        }
        for(int i = suffix.length - 2;i >= 0;i--){
            if(suffix[i] < suffix[i + 1]){
                suffix[i] = suffix[i + 1];
            }
        }
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum = sum + Math.min(prefix[i],suffix[i]) - nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = rainwater(nums);
        System.out.println("how much water it can trap after raining."+result);
    }
}