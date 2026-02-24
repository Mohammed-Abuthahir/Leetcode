// 3174. Clear Digits
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
class cleardigit{
    public static String digits(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = digits(s);
        System.out.println(result);
    }
}