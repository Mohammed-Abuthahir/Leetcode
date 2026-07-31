// 3379. Transformed Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class constructTransformedArray{
    public static int[] transform(int[] nums){
        int[] result = new int[nums.length];
        for(int i = 0;i < nums.length; i++){
            int currIdx = (i + nums[i]) % nums.length;
            if(currIdx < 0){
                currIdx = currIdx + nums.length;
            }
            result[i] = nums[currIdx];
        }
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
        int[] result = transform(nums);
        System.out.println(Arrays.toString(result));
    }
}