// 3136. Valid Word
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Validword{
    public static boolean validwords(String s){
        if(s.length() <= 2) return false;
        boolean isVowel = false;
        boolean isConsonents = false;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                isVowel = true;
            }
            else if(Character.isLetter(ch)) isConsonents = true;
            else if(!Character.isDigit(ch)) return false;
        }
        return isVowel && isConsonents;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = validwords(s);
        System.out.println(result);
    }
}