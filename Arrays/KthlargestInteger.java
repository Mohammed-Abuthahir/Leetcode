// 1985. Find the Kth Largest Integer in the Array
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
class KthlargestInteger{
    public static String kthlargest(String[] nums, int k){
        ArrayList<BigInteger> arr = new ArrayList<>();
        for(String num : nums){
            BigInteger a = new BigInteger(num);
            arr.add(a);
        }
        Collections.sort(arr);
        String s = String.valueOf(arr.get(arr.size() - k));
        return s;
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
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        String result = kthlargest(nums, k);
        System.out.println(result);
    }
}