// 1481. Least Number of Unique Integers after K Removals
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class uniqueIntegerKremoval{
    public static int uniqueInteger(int[] nums,int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr , (a,b) -> {
            if(map.get(a) != map.get(b)){
                return map.get(a) - map.get(b);
            }
            else{
                return a - b;
            }
        });
        int index = 0;
        for(int key : arr){
            int freq = map.get(key);
            for(int i = 0; i < freq; i++){
                nums[index] = key;
                index++;
            }
        }
        HashSet<Integer> set = new HashSet<>();
         for(int i = k;i < nums.length;i++){
            set.add(nums[i]);
        }
        return set.size();
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = uniqueInteger(nums , k);
        System.out.println(result);
    }
}