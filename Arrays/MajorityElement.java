import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class MajorityElement{
    public static int mostoccurence(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max = Collections.max(map.values());
        int maximumElement = -1;
        for(Map.Entry <Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                maximumElement = entry.getKey();
            }
        }
        return maximumElement;
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
        int result = mostoccurence(nums);
        System.out.println("Most Occurence Number is :"+result);
    }
}