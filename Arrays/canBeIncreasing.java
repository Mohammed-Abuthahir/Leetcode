// 1909. Remove One Element to Make the Array Strictly Increasing
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class canBeIncreasing{
    public static boolean canincreasing(int[] nums){
        List<Integer> arr = new ArrayList<>();
        for(int num : nums) arr.add(num);
        for(int i = 0;i < nums.length; i++){
            int current = nums[i];
            arr.remove(i);
            boolean issort = true;
            for(int j = 0;j < arr.size() - 1;j++){
                if(arr.get(j) >= arr.get(j + 1)){
                    issort = false;
                }
            }
            if(issort) return true;
            arr.add(i, current);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Scanner :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i]  = scan.nextInt();
        }
        boolean result = canincreasing(nums);
        System.out.println(result);
    }
}