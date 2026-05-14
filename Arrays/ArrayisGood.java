// 2784. Check if Array is Good
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class ArrayisGood{
    public static boolean isGood(int[] nums){
        int max = 0;
        for(int num : nums) max = Math.max(max, num);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i <nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int num : map.keySet()){
            if(max != num && map.get(num) > 1){
                return false;
            }
        }
        return map.get(max) == 2 && max + 1 == nums.length;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        boolean result = isGood(nums);
        System.out.println(result);
    }
}