// 1614. Maximum Nesting Depth of the Parentheses
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxDepth{
    public static int maxdepth(String s){
        int open = 0;
        int close = 0;
        int max = 0;
        for(char c : s.toCharArray()){
            max = Math.max(max, Math.abs(open - close));
            if(c == '(') open++;
            if(c == ')') close++;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        int result = maxdepth(s);
        System.out.println(result);
    }
}