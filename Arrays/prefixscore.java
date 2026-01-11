// 2587. Rearrange Array to Maximize Prefix Score
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class prefixscore{
    public static int scoring(int[] nums){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        long sum = 0;
        int count = 0;
        for(int num : nums){
            sum = sum + num;
            if(sum > 0){
                count++;
            }
            else{
                break;
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
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = scoring(nums);
        System.out.println(result);
    }
}