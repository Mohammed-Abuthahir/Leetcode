// 2696. Minimum String Length After Removing Substrings
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minLength{
    public static int minlength(String s){
        StringBuilder sb = new StringBuilder(s);
        while((sb.indexOf("AB") != -1 || sb.indexOf("CD") != -1) && sb.length() >= 2){
            int index = sb.indexOf("AB");
            if(index != -1) {
                sb.delete(index , index + 2);
            }
            int index1 = sb.indexOf("CD");
            if(index1 != -1) {
                sb.delete(index1, index1 + 2);
            }
        }
        return sb.length();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = minlength(s);
        System.out.println(result);
    }
}