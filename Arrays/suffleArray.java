// 1470. Shuffle the Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class suffleArray{
    public static int[] sufflearray(int[] nums, int n1){
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0;i <= mid; i++){
            arr1.add(nums[i]);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i = mid + 1; i < nums.length; i++){
            arr2.add(nums[i]);
        }
        int idx = 0;
        for(int i = 0;i < arr1.size(); i++){
            nums[idx++] = arr1.get(i);
            nums[idx++] = arr2.get(i);
        }
        return nums;
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
        System.out.println("Enter the N1 :");
        int n1 = scan.nextInt();
        int[] result = sufflearray(nums, n1);
        System.out.println(Arrays.toString(result));
    }
}