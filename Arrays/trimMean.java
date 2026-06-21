//  Mean of Array After Removing
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class trimMean{
    public static double trimMean(int[] arr){
        int avg = (5 * arr.length) / 100;
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for(int i = avg ; i < arr.length - avg; i++){
            sum = sum + arr[i];
            count++;
        }
        double result = (double) sum / count;
        return result;
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
        double result = trimMean(nums);
        System.out.println(result);
    }
}