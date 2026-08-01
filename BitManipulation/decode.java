// 1720. Decode XORed Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class decode{
    public static int[] decodeXorArray(int[] nums, int first){
        int n = nums.length;
        int[] arr = new int[nums.length + 1];
        arr[0] = first;
        for(int i = 0;i < nums.length; i++){
            arr[i + 1] = nums[i] ^ arr[i];
        }
        return arr;
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
        System.out.println("Enter the First :");
        int first = scan.nextInt();
        int[] result = decodeXorArray(nums, first);
        System.out.println(Arrays.toString(result));
    }
}