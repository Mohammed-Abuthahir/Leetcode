// 495. Teemo Attacking
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findPoisonedDuration{
    public static int findPoison(int[] nums, int duration){
        if(nums.length == 0) return 0;
        int time = 0;
        for(int i = 0;i < nums.length - 1; i++){
            time = time + Math.min(nums[i + 1] - nums[i], duration);
        }
        time = time + duration;
        return time;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Duration : ");
        int duration = scan.nextInt();
        int result = findPoison(nums, duration);
        System.out.println(result);
    }
}