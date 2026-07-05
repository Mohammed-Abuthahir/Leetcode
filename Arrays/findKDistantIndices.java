// 2200. Find All K-Distant Indices in an Array
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class findKDistantIndices{
    public static List<Integer> finddistantIndices(int[] nums, int key, int k){
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == key) arr.add(i);
        }
        List<Integer>  list = new ArrayList<>();
        for(int i = 0;i < nums.length; i++){
            for(int num : arr){
                if((Math.abs(i - num) <= k) && nums[num] == key){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
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
        System.out.println("Enter the Key :");
        int key = scan.nextInt();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        List<Integer> result = finddistantIndices(nums, key, k);
        System.out.println(result);
    }
}