// 2341. Maximum Number of Pairs in Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class numofPairs{
    public static int[] numberofpairs(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0;
        int rem = 0;
        for(int val : map.values()){
            sum = sum + val / 2;
            rem = rem + val % 2;
        }
        return new int[]{sum, rem};
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
        int[] result = numberofpairs(nums);
        System.out.println(Arrays.toString(result));
    }
}