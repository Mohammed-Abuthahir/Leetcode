// 2810. Faulty Keyboard
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class FaultyKeyboard{
    public static String finalString(String s){
        StringBuilder sb = new StringBuilder();
       for(int i = 0;i < s.length(); i++){
           if(s.charAt(i) != 'i'){
               sb.append(s.charAt(i));
           }
           else if(s.charAt(i) == 'i'){
               sb.reverse();
           }
       }
       return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = finalString(s);
        System.out.println(result);
    }
}