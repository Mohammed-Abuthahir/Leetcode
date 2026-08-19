// 2839. Check if Strings Can be Made Equal With Operations I
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class canBeEqual{
    public static boolean canbeequal(String s1, String s2){
        boolean evenMatch = (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2)) ||
                            (s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0));

        boolean oddMatch = (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3)) ||
                           (s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1));

        return evenMatch && oddMatch;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the S1 :");
        String s1 = scan.next();
        System.out.println("Enter the S2 :");
        String s2 = scan.next();
        boolean result = canbeequal(s1, s2);
        System.out.print(result);
    }
}