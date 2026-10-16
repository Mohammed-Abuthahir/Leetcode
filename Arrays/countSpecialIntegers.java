// 4038. Count Integers Appearing in a Single Block
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countSpecialIntegers{
    public static int countSpecial(int[] nums){
         HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) freq.put(num, freq.getOrDefault(num , 0) + 1);
        int count = 0;
        for(int num : map.keySet()){
            if(map.get(num).get(map.get(num).size() - 1) - map.get(num).get(0) + 1 == freq.get(num)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the Size : ");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int result = countSpecial(nums);
        System.out.println(result);
    }
}
