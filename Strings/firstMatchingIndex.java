// 3884. First Matching Character From Both Ends
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class firstMatchingIndex{
    public static int firstmatchingindex(String s){
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                min = Math.min(left, min);
            }
            left++;
            right--;
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = firstmatchingindex(s);
        System.out.println(result);
    }
}