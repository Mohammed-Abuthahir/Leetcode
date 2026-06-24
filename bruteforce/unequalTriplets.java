// 2475. Number of Unequal Triplets in Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class unequalTriplets{
    public static int unequaltriplets(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                for(int k = 0; k < nums.length; k++){
                    if(i < j && j < k){
                        if((nums[i] != nums[j]) && (nums[j] != nums[k]) && (nums[i] != nums[k])){
                            count++;
                        }
                    }
                }
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
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = unequaltriplets(nums);
        System.out.println(result);
    }
}