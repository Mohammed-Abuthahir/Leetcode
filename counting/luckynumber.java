// 1394. Find Lucky Integer in an Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class luckynumber{
    public static int luckynumbers(int[] nums){
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = nums.length - 1;i >= 0;i--){
            if(map.get(nums[i]) == nums[i]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = luckynumbers(nums);
        System.out.println("Lucky Number is :"+result);
    }
}