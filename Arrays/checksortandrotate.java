// 1752. Check if Array Is Sorted and Rotated
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class checksortandrotate{
    public static boolean check(int[] nums) {
        if(nums.length == 1) return true;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : nums) arr.add(num); for(int num : nums) arr.add(num);
        int count = 1;
        for(int i = 0;i < arr.size(); i++){
            if(arr.get(i) <= arr.get(i + 1)){
                count++;
                 if(count == nums.length){
                    return true;
                }
            }
            else{
                count = 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        boolean result = check(nums);
        System.out.println(result);
    }
}