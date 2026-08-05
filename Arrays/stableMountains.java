// 3285. Find Indices of Stable Mountains
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class stableMountains{
    public static List<Integer> stable(int[] nums, int threshold){
        List<Integer> arr = new ArrayList<>();
        for(int i = 1;i < nums.length; i++){
            if(nums[i - 1] > threshold){
                arr.add(i);
            }
        }
        return arr;
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
        System.out.println("Enter the Threshold :");
        int threshold = scan.nextInt();
        List<Integer> result = stable(nums, threshold);
        System.out.println(result);

    }
}