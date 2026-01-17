// 2395. Find Subarrays With Equal Sum
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class findsubaraywithsum{
    public static boolean findsubarray(int[] nums){
        if(nums.length == 1 || nums.length == 2){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length - 1;i++){
            if(!set.contains(nums[i] + nums[i + 1])){
                set.add(nums[i] + nums[i + 1]);
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        boolean result = findsubarray(nums);
        System.out.println("Answer is : "+ result);
    }
}