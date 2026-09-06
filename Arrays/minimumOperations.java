// 2357. Make Array Zero by Subtracting Equal Amounts
import java.util.*;
import java.util.Arrays;
class minimumOperations{
    public static int minimum(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(num != 0) set.add(num);
        }
        return set.size();
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
        int result = minimum(nums);
        System.out.println(result);
    }
}