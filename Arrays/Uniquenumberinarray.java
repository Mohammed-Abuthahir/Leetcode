// 1207. Unique Number of Occurrences
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Uniquenumberinarray{
    public static boolean Unique(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        HashSet<Integer>set = new HashSet<>();
        for(int key : map.keySet()){
            if(set.contains(map.get(key))){
                return false;
            }
            else{
                set.add(map.get(key));
            }
        }
        return true;
    }
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        boolean result = Unique(nums);
        System.out.println("Unique number :"+result);
    }
}
