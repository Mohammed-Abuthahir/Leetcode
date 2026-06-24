// 1995. Count Special Quadruplets
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class countQuadruplets{
    public static int countquadruplets(int[] nums){
        int count = 0;
        for(int i = 0;i < nums.length; i++){
            for(int j = 0;j < nums.length; j++){
                for(int k = 0;k < nums.length; k++){
                    for(int l = 0;l < nums.length; l++){
                        if(i < j && j < k && k < l){
                            if(nums[i] + nums[j] + nums[k] == nums[l]){
                                count++;
                        }
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
        int result = countquadruplets(nums);
        System.out.println(result);
    }
}