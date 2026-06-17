import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Removeminandmax{
    public static int minimumDeletion(int[] nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int minIdx = 0;
        int maxIdx = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == min){
                minIdx = i;
            }
            if(nums[i] == max){
                maxIdx = i;
            }
        }
        int front = Math.min(minIdx , maxIdx) + 1;
        int end = nums.length - Math.min(minIdx, maxIdx);
        int frontandback = (Math.min(minIdx , maxIdx) + 1) + (nums.length - Math.min(minIdx, maxIdx))
        return Math.min(front, Math.min(back, frontandback))
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
        int result = minimumDeletion(nums);
        System.out.println(result);
    }
}