// 2748. Number of Beautiful Pairs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countBeatifulPairs{
    public static int countBeatifull(int[] nums){
        int count = 0;
        for(int i = 0;i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int a = nums[i] / (int) Math.pow(10, (int) Math.log10(nums[i]));
                int b = nums[i] % 10;
                while(b != 0){
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                if(a == 1) count++;
            }
        }
        return count;
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
        int result = countBeatifull(nums);
        System.out.println(result);
    }

}