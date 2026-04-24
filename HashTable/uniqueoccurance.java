// 3843. First Element with Unique Frequency
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class uniqueoccurance{
    public static int firstUnique(int[] nums){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        LinkedHashMap<Integer,List<Integer>> map1 = new LinkedHashMap<>();
        for(int key : map.keySet()){
            map1.putIfAbsent(map.get(key), new ArrayList<>());
            map1.get(map.get(key)).add(key);
        }
        for(int key : map1.keySet()){
            if(map1.get(key).size() == 1){
                return map1.get(key).getFirst();
            }
        }
        return -1;
    }   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int size = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] arr = new int[size];
        for(int i = 0;i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int result = firstUnique(arr);
        System.out.println(result);
    }
}