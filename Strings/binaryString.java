// 1980. Find Unique Binary String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
class binaryString{
    public static String findbinaryString(String[] nums){
        HashSet< Integer> set = new HashSet<>();
        for(String num : nums){
            BigInteger n = new BigInteger(num , 2);
            set.add(n.intValue());
        }
        int missing = 1;
        while(set.contains(missing)){
            missing++;
        }
        String binary = Integer.toBinaryString(missing);
        while(binary.length() < nums[0].length()){
            binary = "0" + binary;
        }
        return binary;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N :");
        int n = scan.nextInt();
        System.out.println("Enter the String :");
        String[] nums = new String[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = scan.next();
        }
        String result = findbinaryString(nums);
        System.out.println(result);

    }
}