// 3731. Find Missing Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findMissingElements{
    public static  List<Integer> findmissing(int[] nums){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = min; i <= max; i++){
            set.add(i);
        }
        for(int num : nums) set.remove(num);
        return new ArrayList<>(set);
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
        List<Integer> result = findmissing(nums);
        System.out.println(result);
    }
}