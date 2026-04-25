// 2206. Divide Array Into Equal Pairs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class divideequalpairs{
    public static boolean divideArray(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int val : map.values()){
            if(val % 2 != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] arr = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        boolean result = divideArray(arr);
        System.out.println(result);
    }
}