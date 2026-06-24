// 1534. Count Good Triplets
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countGoodTriplets{
    public static int countgoodtriplets(int[] nums, int a , int b , int c){
        int count = 0;
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                for(int k = 0;k < nums.length; k++){
                    if(i < j && j < k){
                         if((Math.abs(nums[i] - nums[j]) <= a) && (Math.abs(nums[j] - nums[k]) <= b) && (Math.abs(nums[i] - nums[k]) <= c)){
                          count++;
                      }
                    }
                }
            }
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
        System.out.println("Enter the A :");
        int a = scan.nextInt();
        System.out.println("Enter the B :");
        int b = scan.nextInt();
        System.out.println("Enter the C :");
        int c = scan.nextInt();
        int result = countgoodtriplets(nums, a, b, c);
        System.out.println(result);
    }
}