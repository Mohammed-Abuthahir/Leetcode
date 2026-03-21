// 1446. Consecutive Characters
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class consecutivechar{
    public static int consecutive(String s){
        int count = 1;
        int max = 1;
        for(int i = 0;i < s.length() - 1;i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                count++;
                max = Math.max(max , count);
            }
            else {
                count = 1;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = consecutive(s);
        System.out.println(result);
    }
}