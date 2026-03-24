// 3432. Count Partitions with Even Sum Difference
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countpartition{
    public static int countPartitions(int[] nums){
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
        suffix[suffix.length - 1] = 0;
        for(int i = suffix.length - 2;i >= 0;i--){
            suffix[i] = suffix[i + 1] + nums[i + 1];
        }
        int count = 0;
        for(int i = 0;i < prefix.length - 1;i++){
            if((suffix[i] - prefix[i]) % 2 == 0) count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("ENter the Arrays :");
        int[]  nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = countPartitions(nums);
        System.out.println(result);
        
    }
}