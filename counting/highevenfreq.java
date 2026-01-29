// 2404. Most Frequent Even Element
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class highevenfreq{
    public static int highevenfrequency(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(nums[i] % 2 == 0){
                map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
            }
        }
        int max = Collections.max(map.values());
        int min = Integer.MAX_VALUE;
        for(int key : map.keySet()){
            if(map.get(key) == max){
                min = Math.min(min,key);
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = highevenfrequency(nums);
        System.out.println("Minimum Even Frequency :"+result);
    }
}