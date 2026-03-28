// 3769. Sort Integers by Binary Reflection
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sortbyReflections{
    public static int[] sortByReflection(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            String binary = new StringBuilder(Integer.toBinaryString(num)).reverse().toString();
            map.put(num , Integer.parseInt(binary, 2));
        }
        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr , (a, b) ->{
            if(map.get(a) != map.get(b)){
                return map.get(a) - map.get(b);
            }
            else{
                return a - b;
            }
        });
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map1.put(nums[i],map1.getOrDefault(nums[i], 0) + 1);
        }
        int index = 0;
        for(int num : arr){
            for(int i = 0;i < map1.get(num);i++){
                nums[index++] = num;
            }
        }
        return nums;
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
        int[] result = sortByReflection(nums);
        System.out.println(Arrays.toString(result));
    }
}