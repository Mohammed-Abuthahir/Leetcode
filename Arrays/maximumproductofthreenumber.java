import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class maximumproductofthreenumber{
    public static int products(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[n - 1] *  nums[n - 2] * nums[n - 3];
        int b = nums[0] * nums[1] * nums[n - 1];
        int maxproduct = Math.max(a,b);
        return maxproduct;
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
        int result = products(nums);
        System.out.println("product of three number is :"+result);

    }
}