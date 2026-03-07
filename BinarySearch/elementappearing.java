// 1287. Element Appearing More Than 25% In Sorted Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class elementappearing{
    public static int maxoccur(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        for(int num : map.values()){
            max = Math.max(max,num);
        }
        for(int key : map.keySet()){
            if(map.get(key) == max){
                return key;
            }
        }
       return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays ;");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = maxoccur(nums);
        System.out.println(result);
    }
}