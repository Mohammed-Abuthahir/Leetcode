// 1662. Check If Two String Arrays are Equivalent
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Arrayequals{
    public static boolean equalsornot(String[] nums1,String[] nums2){
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        for(String c : nums1){
            s.append(c);
        }
        for(String c : nums2){
            t.append(c);
        }
        return s.toString().equals(t.toString());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size 1:");
        int n1 = scan.nextInt();
        System.out.println("Enter the Size 2");
        int n2 = scan.nextInt();
        System.out.println("Enter the Arrays 1:");
        String[] nums1 = new String[n1];
        for(int i = 0;i < nums1.length;i++){
            nums1[i] = scan.next();
        }
        System.out.println("Enter the Arrays 2");
        String[] nums2 = new String[n2];
        for(int i = 0;i < nums2.length;i++){
            nums2[i] = scan.next();
        }
        boolean result = equalsornot(nums1,nums2);
        System.out.println(result);
    }
}