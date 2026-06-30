// 2974. Minimum Number Game
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class numberGame{
    public static int[] numbergame(int[] nums){
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 1; i = i + 2){
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp; 
        }
        return nums;
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
        int[] result = numbergame(nums);
        System.out.print(Arrays.toString(result));
    }
}