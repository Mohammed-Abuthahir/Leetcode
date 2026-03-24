// 3289. The Two Sneaky Numbers of Digitville
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class twosneakynumber{
    public static int[] sneakynumbers(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        int[] arr = new int[2];
        int k = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 2){
                arr[k++] = key;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = sneakynumbers(nums);
        System.out.println(Arrays.toString(result));
    }
}