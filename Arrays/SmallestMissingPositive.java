import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class SmallestMissingPositive{
    public static int missingpositive(int[] nums){
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            if(num > 0){
                set.add(num);
            }
        }
        int missing = 1;
        while(set.contains(missing)){
            missing++;
        }
        return missing;
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
        int result = missingpositive(nums);
        System.out.println("Smallest Missing Positive :"+result);
    }
}