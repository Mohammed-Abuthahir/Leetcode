// 451. Sort Characters By Frequency
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sortcharbyfreq{
    public static String decreasing(String s){
        int[] nums = new int[s.length()];
        for(int i = 0;i < s.length();i++){
            nums[i] = (int) s.charAt(i);
        }
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i] , 0) + 1);
        }
        ArrayList<Integer>list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> {
            if(map.get(a) != map.get(b)){
                return map.get(b) - map.get(a);
            }
            else{
                return a - b;
            }
        });
        char[] arr = new char[nums.length];
        int index = 0;
        for(int num : list){
            for(int i = 0;i<map.get(num);i++){
                arr[index++] = (char) num;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = scan.nextLine();
        String result =  decreasing(s);
        System.out.println("After Decresing Sort :"+result);
    }
}