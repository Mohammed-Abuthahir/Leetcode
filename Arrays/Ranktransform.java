// 1331. Rank Transform of an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Ranktransform{
    public static int[] ranktransform(int[] nums){
        TreeSet <Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
        }
        HashMap <Integer,Integer> map = new HashMap<>();
        int j = 0;
        for(int arr : set){
            map.put(arr,j++);
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = map.get(nums[i]) + 1;
        }
        return nums;
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
        int[] result = ranktransform(nums);
        System.out.println("Result Array :"+Arrays.toString(nums));
    }
}