// 2078. Two Furthest Houses With Different Colors
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class maxDistance{
    public static int maxdistance(int[] nums){
        int max = 0;
        for(int i = 0;i < nums.length;i++){
            for(int j = i;j < nums.length;j++){
                if(nums[i] != nums[j]){
                    max = Math.max(max, Math.abs(j - i));
                }
            }
        }
        return max;
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
        int result = maxdistance(nums);
        System.out.println(result);
    }
}
