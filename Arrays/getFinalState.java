// 3264. Final Array State After K Multiplication Operations I
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class getFinalState{
    public static int[] getfinal(int[] nums, int k, int multiplier){
        List<Integer> list = new ArrayList<>();
        for(int num : nums) list.add(num);
        for(int i = 0;i < k; i++){
            int min = Integer.MAX_VALUE;
            for(int num : list){
                min = Math.min(min, num);
            }
            int index = list.indexOf(min);
            list.set(index, min * multiplier);
        }
        for(int i = 0;i <nums.length; i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        System.out.println("Enter the Multiplier :");
        int multiplier = scan.nextInt();
        int[] result = getfinal(nums, k, multiplier);
        System.out.println(Arrays.toString(result));
    }
}