// 2154. Keep Multiplying Found Values by Two
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class findfinalvalue{
    public static int finalvalue(int[] nums,int original){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        while(set.contains(original)){
            original = original * 2;
        }
        return original;
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
        System.out.println("Enter the Original :");
        int original = scan.nextInt();
        int result = finalvalue(nums,original);
        System.out.println(result);
    }
}