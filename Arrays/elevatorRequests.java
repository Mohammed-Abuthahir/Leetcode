// 4020. Elevator Requests I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class elevatorRequests{
    public static int elevetor(int n, int[] nums){
        if(n == 1) return nums[0];
        int sum = nums[0];
        for(int i = 1;i < nums.length; i++){
            sum = sum + (Math.abs(nums[i - 1] - nums[i]));
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = elevetor(n, nums);
        System.out.println(result);
    }
}