import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Removeduplicates{
    public static int[] duplicate(int[] nums){
        HashSet<Integer>set =  new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int i = 0;
        for(int arr : set){
            nums[i++] = arr;
        }
        return Arrays.copyOf(nums,i);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result[] = duplicate(nums);
        System.out.println(Arrays.toString(result));
    }
}