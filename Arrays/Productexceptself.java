import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Productexceptself{
    public static int[] Product(int[] nums){
        int n = nums.length;
        int[] pref = new int[n];
        pref[0] = 1;
        for(int i = 1;i < n;i++){
            pref[i] = pref[i - 1] * nums[i - 1];
        }
        int[] suffix = new int[n];
        suffix[n - 1] = 1;
        for(int i = n - 2;i >= 0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        int[] ans = new int[n];
        for(int i = 0;i<nums.length;i++){
            ans[i] = pref[i] * suffix[i];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i =0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = Product(nums);
        System.out.println("Product Array :"+Arrays.toString(result));
    }
}