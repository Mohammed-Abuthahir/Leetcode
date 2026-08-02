// 3146. Permutation Difference between Two Strings
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class findPermutationDifference{
    public static int findpermutation(String s1, String s2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0;i < s1.length(); i++){
            map1.put(s1.charAt(i), i);
        }
        for(int i = 0;i < s2.length(); i++){
            map2.put(s2.charAt(i), i);
        }
        int sum = 0;
        for(int i = 0;i < s1.length(); i++){
            sum = sum + Math.abs(map1.get(s1.charAt(i)) - map2.get(s1.charAt(i)));
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String s1 = scan.next();
        System.out.println("Enter the String 2 :");
        String s2 = scan.next();
        int result = findpermutation(s1, s2);
        System.out.println(result);
    }
}