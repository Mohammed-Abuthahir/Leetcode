// 3258. Count Substrings That Satisfy K-Constraint I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countKsubstring{
    public static boolean countsubstring(String s, int k){
        int zerocount = 0; int oncecount = 0;
        for(char c : s.toCharArray()){
            if(c == '0') zerocount++;
            else oncecount++;
        }
        return zerocount <= k || oncecount <= k;
    }
    public static int countKConstraintSubstrings(String s,int k){
        int count = 0;
        for(int i = 0;i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                if(countsubstring(s.substring(i,j), k)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        System.out.println("Enter the K :");
        int k = scan.nextInt();
        int result = countKConstraintSubstrings(s, k);
        System.out.println(result);
    }
}