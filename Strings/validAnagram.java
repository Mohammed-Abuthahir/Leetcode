// 242. Valid Anagram
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class validAnagarm{
    public static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] nums1 = s1.toCharArray();
        Arrays.sort(nums1);
        s1 = new String(nums1);
        char[] nums2 = s2.toCharArray();
        Arrays.sort(nums2);
        s2 = new String(nums2);
        return s1.equalsIgnoreCase(s2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String s1 = scan.nextLine();
        System.out.println("Enter the String 2:");
        String s2 = scan.nextLine();
        boolean result = isAnagram(s1,s2);
        System.out.println("String is Anagram or Not :"+result);
    }
}