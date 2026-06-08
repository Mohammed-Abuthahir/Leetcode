// 3940. Limit Occurrences in Sorted Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class limitOccurence{
    public static int[] Limitoccur(int[] nums, int k){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0;i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > k){
                for(int i = 0;i < k; i++){
                    list.add(key);
                }
            }
            else{
               for(int i = 0;i < map.get(key); i++){
                  list.add(key);
               }
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0;i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int[] result = Limitoccur(nums, k);
        System.out.println(Arrays.toString(result));
    }
}