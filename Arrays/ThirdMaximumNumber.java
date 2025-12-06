// 414. Third Maximum Number
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class ThirdMaximumNumber{
    public static int thirdmaximumnumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max = 0;
        int[] arr = new int[set.size()];
        int i = 0;
        for(int num : set){
            arr[i++] = num;
        }
        Arrays.sort(arr);
       if(arr.length == 1){
           max = nums[0];
       }
       else if(arr.length == 2){
           max = Collections.max(set);
       }
       else{
           max = arr[arr.length - 3];
       }
       return max;
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
        int maximum = thirdmaximumnumber(nums);
        System.out.println("Third Maximum Number :"+maximum);
    }
}