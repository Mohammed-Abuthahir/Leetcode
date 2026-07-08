// 2815. Max Pair Sum in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxSum{
    public static int maxsum(int[] nums){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int num : nums){
            int max = 0;
            for(char c : String.valueOf(num).toCharArray()){
                max = Math.max(max, c - '0');
            }
            if(!map.containsKey(max)){
                map.put(max, new ArrayList<>());
            }
            map.get(max).add(num);
        }
        int max = 0;
        for(List<Integer> num : map.values()){
            for(int i = 0;i < num.size(); i++){
                for(int j = 0;j < num.size(); j++){
                    if(i != j){
                        max = Math.max(max, (nums[i] + nums[j]));
                    }
                }
            }
        }
        return max == 0 ? -1 : max;
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
        int result = maxsum(nums);
        System.out.println(result);
    }
}