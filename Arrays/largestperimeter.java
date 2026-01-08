// 976. Largest Perimeter Triangle
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class largestperimeter{
    public static int largestperimetertriangle(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 1;i<nums.length - 1;i++){
            if(nums[i - 1] + nums[i] > nums[ i + 1]){
                sum = nums[i - 1] + nums[i] + nums[i + 1];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = largestperimetertriangle(nums);
        System.out.println("largestperimeter :"+result);
    }
}