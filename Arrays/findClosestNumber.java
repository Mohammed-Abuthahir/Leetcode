// 2239. Find Closest Number to Zero
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findClosestNumber{
    public static int findclosest(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            map.put(nums[i], Math.abs(nums[i]));
        }
        int min = Collections.min(map.values());
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            if(map.get(key) == min){
                max = Math.max(max, key);
            }
        }
        return max;
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
        int result = findclosest(nums);
        System.out.println(result);
    }
}