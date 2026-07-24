// 219. Contains Duplicate II
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class containsDuplicates{
    public static boolean containsduplicate(int[] nums, int k){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            }
            else{
                map.get(nums[i]).add(i);
            }
        }
        for(List<Integer> subset : map.values()){
            for(int i = 0;i < subset.size(); i++){
                for(int j = i + 1; j < subset.size(); j++){
                    if(Math.abs(subset.get(i) - subset.get(j)) <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i]  = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        boolean result = containsduplicate(nums, k);
        System.out.println(result);
    }
}