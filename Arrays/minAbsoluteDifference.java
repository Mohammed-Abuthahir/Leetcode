// 3880. Minimum Absolute Difference Between Two Values
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class minAbsoluteDifference{
    public static int minAbsolute(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 1){
                list.add(i);
                map.put(i, nums[i]);
            }
            else if(nums[i] == 2){
                list.add(i);
                map.put(i , nums[i]);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < list.size() - 1; i++){
            if(map.get(list.get(i)) != map.get(list.get(i + 1))){
                min = Math.min(min , Math.abs(list.get(i) - list.get(i + 1)));
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = minAbsolute(nums);
        System.out.println(result);
    }
}