// 2190. Most Frequent Number Following Key In an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mostFrequent{
    public static int mostFrequentElement(int[] nums, int key){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == key){
                map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
            }
        }
        int max = Collections.max(map.values());
        for(int num : map.keySet()){
            if(map.get(num) == max){
                return num;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays : ");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Key :");
        int key = scan.nextInt();
        int result = mostFrequentElement(nums, key);
        System.out.println(result);
    }
}