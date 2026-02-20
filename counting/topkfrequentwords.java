// 692. Top K Frequent Words
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class topkfrequentwords{
    public static ArrayList<String> topkfrequent(String[] nums, int k){
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            if(map.get(b) != map.get(a)){
                return map.get(b) - map.get(a);
            }
            else{
                return a.compareTo(b);
            }
        });
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0;i < list.size();i++){
            arr.add(list.get(i));
            k--;
            if(k == 0){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] nums = new String[n];
        for(int i  = 0;i < nums.length;i++){
            nums[i] = scan.next();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        ArrayList<String> result = topkfrequent(nums,k);
        System.out.println(result);
    }
}