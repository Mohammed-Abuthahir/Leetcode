// 1636. Sort Array by Increasing Frequency
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class sortarraybyfreq{
    public static int[] sortarray(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i] , 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) -> {
            if(map.get(a) != map.get(b)){
                return map.get(a) - map.get(b);
            }
            else{
                return b - a;
            }
        });
        int index = 0;
        for(int num : list){
            for(int i = 0;i < map.get(num);i++){
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
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = sortarray(nums);
        System.out.println("After Frequency Sort :"+Arrays.toString(nums));
    }
}