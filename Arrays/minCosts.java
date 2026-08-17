// 3502. Minimum Cost to Reach Every Position
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minCosts{
    public static int[] mincost(int[] nums){
        for(int i = 1;i < nums.length; i++){
            if(nums[i - 1] < nums[i]) nums[i] = nums[i - 1];
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
        int[] result = mincost(nums);
        System.out.println(Arrays.toString(result));
    }
}