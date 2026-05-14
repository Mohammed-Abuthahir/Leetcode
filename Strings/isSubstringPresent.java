// 3083. Existence of a Substring in a String and Its Reverse
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isSubstringPresent{
    public static boolean SubstringPresentorNot(String s){
        String reverse = new StringBuilder(s).reverse().toString();
        for(int i = 0;i < s.length() - 1; i++){
            String sub = s.substring(i , i + 2);
            if(reverse.contains(sub)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = SubstringPresentorNot(s);
        System.out.println(result);
    }
}