// 2150. Find All Lonely Numbers in the Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class lonelynumber{
    public static ArrayList<Integer> lonelynumber(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        LinkedHashSet<Integer> sets = new LinkedHashSet<>();
        for(int num : nums){
            if(!set.contains(num + 1) && !set.contains(num - 1) && map.get(num) == 1){
                sets.add(num);
            }
        }
        return new ArrayList<>(sets);
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
        ArrayList<Integer> result = lonelynumber(nums);
        System.out.println("Lonely Numbers are :"+result);
    }
}