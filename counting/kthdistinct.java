import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class kthdistinct{
    public static String distinct(String[] arr, int k){
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(String num : arr){
            if(map.get(num) == 1){
                list.add(num);
            }
        }
        return list.size() >= k ? list.get(k - 1) : "";
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("ENter the String :");
        String[] nums = new String[n];
        scan.nextLine();
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextLine();
        }
        System.out.println("enter the K");
        int k = scan.nextInt();
        String result = distinct(nums , k);
        System.out.println("kth distinct Character is :"+result);
    }
}