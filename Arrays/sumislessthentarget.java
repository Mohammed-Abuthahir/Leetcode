import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sumislessthentarget{
    public static int countPairs(int[] nums,int target){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while(left < right){
            if(nums[left] + nums[right] < target){
                count = count + (right - left);
                left++;
            }
            else{
                right--;
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
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Target");
        int target = scan.nextInt();
        int result = countPairs(nums,target);
        System.out.println(result);
    }
}