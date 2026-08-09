// 2903. Find Indices With Index and Value Difference I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findIndices{
    public static int[] findindices(int[] nums, int indexdiff, int valuediff){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                if((Math.abs(i - j) >= indexdiff) && Math.abs(nums[i] - nums[j]) >= valuediff) return new int[]{i, j};
            }
        }
       return new int[]{-1, -1};
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the indexdiff :");
        int indexdiff = scan.nextInt();
        System.out.println("Enter the valuediff :");
        int valuediff = scan.nextInt();
        int[] result = findindices(nums, indexdiff, valuediff);
        System.out.println(Arrays.toString(result));
    }
}