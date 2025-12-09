// 137. Single Number II
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class singlenumber{
    public static int single(int[] nums){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int singleNum = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                singleNum = key;
            }
        }
        return singleNum;
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
        int result = single(nums);
        System.out.println("Single Ocuur Number is :"+result);
    }
}