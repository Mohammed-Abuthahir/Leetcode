// 1832. Check if the Sentence Is Pangram
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Checkpangram{
    public static boolean isPangram(String s){
       int n = s.length();
        if(s.length() < 26){
            return false;
        }
        boolean[] arr = new boolean[26];
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            if(x >= 'a' && x <= 'z'){
                arr[x - 'a'] = true;
            }
            else if(x >= 'A' && x <= 'Z'){
                arr[x - 'A'] = true;
            }
        }
        for(int i = 0; i < 26 ; i++){
            if(arr[i] == false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        boolean result = isPangram(s);
        System.out.println("String is pangram or not :"+result);
    }
}