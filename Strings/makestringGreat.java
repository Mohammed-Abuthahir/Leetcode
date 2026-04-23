// 1544. Make The String Great
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class makestringGreat{
    public static String makeGood(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && Character.toLowerCase(ch) == Character.toLowerCase(stack.peek()) && stack.peek() != ch){
                stack.pop();
            }
            else{
                stack.push(ch);
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
        String result = makeGood(s);
        System.out.println(result);
    }
}