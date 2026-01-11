// 2441. Largest Positive Integer That Exists With Its Negative
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class largetpositive{
    public static int largestpostivenum(int[] nums){
        Set<Integer> pos = new HashSet<>();
        Set<Integer>neg = new HashSet<>();
        for(int num : nums){
            if(num > 0){
                pos.add(num);
            }
            else{
                neg.add(-1 * num);
            }
        }
        int max = -1;
        for(int num : neg){
            if(pos.contains(num)){
                max = Math.max(num,max);
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = largestpostivenum(nums);
        System.out.println("Largest Positive is The :"+result);
    }
}