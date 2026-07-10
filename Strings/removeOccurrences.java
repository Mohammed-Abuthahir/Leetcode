// 1910. Remove All Occurrences of a Substring
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removeOccurences{
    public static String removeoccur(String s, String part){
        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf(part) != -1){
            int index = sb.indexOf(part);
            sb.delete(index, index + part.length());
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        String s = scan.next();
        System.out.println("Enter the Part :");
        String part = scan.next();
        String result = removeoccur(s, part);
        System.out.println(result);
    }
}