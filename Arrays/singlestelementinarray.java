// 540. Single Element in a Sorted Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class singlestelementinarray{
    public static int singleelement(int[] nums){
        int xor = 0;
        for(int num : nums){
            xor = xor ^ num;
        }
        return xor;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = singleelement(nums);
        System.out.println("Result :"+result);
    }
}