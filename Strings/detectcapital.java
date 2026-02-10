// 520. Detect Capital
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class detectcapital{
    public static boolean detectCapitalUse(String s) {
        int capitalcount = 0;
        int smallcount = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                capitalcount++;
                if(capitalcount == s.length()){
                    return true;
                }
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                smallcount++;
                if(smallcount == s.length()){
                    return true;
                }
            }
        } 
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
            return false;
        }
        for(int i = 1;i < s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        boolean result = detectCapitalUse(s);
        System.out.println(result);

    }
}