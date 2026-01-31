// 3467. Transform Array by Parity
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class tranformarray{
    public static int[] tranformarraybyparity(int[] nums){
        for(int i = 0;i < nums.length;i++){
            if((nums[i] & 1) == 0){
                nums[i] = 0;
            }
            else if((nums[i] & 1) == 1){
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("ENter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = tranformarraybyparity(nums);
        System.out.println(Arrays.toString(result));
    }
}