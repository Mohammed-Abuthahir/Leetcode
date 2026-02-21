// 844. Backspace String Compare
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class backspace{
    public static boolean backspace(String s, String t){
        Stack <Character> s1 = new Stack<>();
        Stack <Character> s2 = new Stack<>();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '#'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
            }
            else{
                s1.push(s.charAt(i));
            }
        }
        for(int i = 0;i < t.length();i++){
            if(t.charAt(i) == '#'){
                if(!s2.isEmpty()){
                    s2.pop();
                }
            }
            else{
                s2.push(t.charAt(i));
            }
        }
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.peek() != s2.peek()){
                return false;
            }
            else{
                s1.pop();
                s2.pop();
            }
        }
        return s1.isEmpty() && s2.isEmpty();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String s = scan.next();
        System.out.println("Enter the String 2 :");
        String t = scan.next();
        boolean result = backspace(s,t);
        System.out.println(result);
    }
}