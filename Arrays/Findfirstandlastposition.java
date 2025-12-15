// 34. Find First and Last Position of Element in Sorted Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Findfirstandlastposition{
    public static int[] findposition(int[] nums,int target){
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int j = 0;
        int[] arr = new int[2];
        if(set.contains(target)){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == target){
                    arr[j++] = i;
                    break;
                }
            }
            for(int i = nums.length - 1 ;i >= 0;i--){
                if(nums[i] == target){
                    arr[j++] = i;
                    break;
                }
            }
        }
        else{
            return new int[]{-1,-1};
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Array :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Target :");
        int target = scan.nextInt();
        int[] result = findposition(nums,target);
        System.out.println("First and Last Position :"+Arrays.toString(result));
    }
}