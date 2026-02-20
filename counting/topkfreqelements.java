// 347. Top K Frequent Elements
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class topkfreqelements{
    public static int[] topkfrequent(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a , b) -> {
            if(map.get(b) != map.get(a)){
                return map.get(b) - map.get(a);
            }
            else{
                return b - a;
            }
        });
        for(int i = 0;i < list.size();i++){
            nums[i] = list.get(i);
        }
        return Arrays.copyOf(nums,k);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Ararys :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int[] result = topkfrequent(nums,k);
        System.out.println(Arrays.toString(result));

    }
}