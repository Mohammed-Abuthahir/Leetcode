// 3959. Check Good Integer
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class checkGoodInteger{
    public static boolean checkGood(int[] nums){
        int sum = 0; int squareSum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem;
            squareSum = squareSum + (int) Math.pow(rem, 2);
            n = n / 10;
        }
        return squareSum - sum >= 50;
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
        boolean result = checkGood(nums);
        System.out.println(result);
    }
}