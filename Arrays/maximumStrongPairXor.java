// 2932. Maximum Strong Pair XOR I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumStrongPairXor{
    public static int maximumstrong(int[] nums){
        List<Integer> arr = new ArrayList<>();
        for(int num : nums){
            for(int num1 : nums){
                if(Math.abs(num - num1) <= Math.min(num, num1)){
                    arr.add(num);
                    arr.add(num1);
                }
            }
        }
        int max = 0;
        for(int i = 0;i < arr.size(); i = i + 2){
            int xor = arr.get(i) ^ arr.get(i + 1);
            max = Math.max(max, xor);
        }
        return max;
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
        int result = maximumstrong(nums);
        System.out.println(result);
    }
}
