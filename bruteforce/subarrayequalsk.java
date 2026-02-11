// 560. Subarray Sum Equals K
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class subarrayequalsk{
    public static int subarray(int[] nums,int k){
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            int currSum = 0;
            for(int j = i;j < nums.length;j++){
                currSum = currSum + nums[j];
                if(currSum == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the k");
        int k = scan.nextInt();
        int result = subarray(nums,k);
        System.out.println("Subarray Count is to :"+result);
    }
}