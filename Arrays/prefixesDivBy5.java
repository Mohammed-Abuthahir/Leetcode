// 1018. Binary Prefix Divisible By 5
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class prefixesDivBy5{
    public static List<Boolean> prefixes(int[] nums){
        List<Boolean> list = new ArrayList<>();
        int currentRemainder = 0;
        for (int bit : nums) {
            currentRemainder = (currentRemainder * 2 + bit) % 5;
            list.add(currentRemainder == 0);
        }
        
        return list;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.nextInt();
        }
        List<Boolean> result = prefixes(nums);
        System.out.println(result);
    }
}