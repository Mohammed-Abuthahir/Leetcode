// 3438. Find Valid Pair of Adjacent Digits in String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class validpairs{
    public static String AdjacentDigit(String nums){
        int[] arr = new int[nums.length()];
        for(int i = 0;i < arr.length;i++){
            arr[i] = Integer.parseInt(String.valueOf(nums.charAt(i)));
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        StringBuilder s = new StringBuilder();
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i] == map.get(arr[i]) && arr[i + 1] == map.get(arr[i + 1]) 
            && arr[i] != arr[i + 1]){
                 s.append(arr[i]);
                 s.append(arr[i + 1]);
                 break;
            }
        }
        return s.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String nums = scan.nextLine();
        String result = AdjacentDigit(nums);
        System.out.println(result);
    }
}