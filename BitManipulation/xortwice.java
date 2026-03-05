// 3158. Find the XOR of Numbers Which Appear Twice
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class xortwice{
    public static int xornumbers(int[] nums){
        ArrayList<Integer> list =  new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 1;i++){
            if(((nums[i]) ^ (nums[i + 1])) == 0){
                list.add(nums[i]);
            }
        }
        int xor = 0;
        for(int num : list){
            xor = xor ^ num;
        }
        return xor;
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
        int result = xornumbers(nums);
        System.out.println(result);
    }
}