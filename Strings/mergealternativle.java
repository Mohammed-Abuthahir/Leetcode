// 1768. Merge Strings Alternately
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class mergealternativle{
    public static String merge(String s1,String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        char[] ans = new char[arr1.length + arr2.length];
        int i = 0;
        int idx = 0;
        while(i < arr1.length || i < arr2.length){
            if(i < arr1.length){
                ans[idx++] = arr1[i];
            }
            if(i < arr2.length){
                ans[idx++] = arr2[i];
            }
            i++;
        }
        return new String(ans);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s1 = scan.nextLine();
        System.out.println("Enter the String 2 :");
        String s2 = scan.nextLine();
        String result = merge(s1,s2);
        System.out.println("After Merging Arrays :"+ result);
    }
}