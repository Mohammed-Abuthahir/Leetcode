// 594. Longest Harmonious Subsequence
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class findLHS{
    public static int hormonios(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxLength = 0;
        for(int num : map.keySet()){
            if(map.containsKey(num + 1)){
                int length = map.get(num) + map.get(num + 1);
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
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
        int result = hormonios(nums);
        System.out.println(result);
    }
}