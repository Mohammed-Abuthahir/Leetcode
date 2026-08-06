// 2670. Find the Distinct Difference Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class distinctDifferenceArray{
    public static int[] distinctDiff(int[] nums){
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0;i < nums.length; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i + 1; j < nums.length; j++){
                set.add(nums[j]);
            }
            set1.add(nums[i]);
            nums[i] = set1.size() - set.size();
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Scanner :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int[] result = distinctDiff(nums);
        System.out.println(Arrays.toString(result));
    }
}