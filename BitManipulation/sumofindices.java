// 2859. Sum of Values at Indices With K Set Bits
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumofindices{
    public static int sum(int[] nums,int k){
        int sum = 0;
        int i = 0;
        while(i < nums.length){
            if(Integer.bitCount(i) == k){
                sum = sum + nums[i];
            }
            i++;
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = sum(nums,k);
        System.out.println(result);
    }
}