// 20. Valid Parentheses
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;
class validparanthisis{
    public static boolean paranthisis(String s){
        Stack <Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                 if (stack.isEmpty()) return false;
                 if ((c == ')' && stack.pop() != '(') ||
                    (c == '}' && stack.pop() != '{') ||
                    (c == ']' && stack.pop() != '['))
                    return false;
                }
            }
        return stack.empty();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Paranthisis :");
        String s = scan.nextLine();
        boolean result = paranthisis(s);
        System.out.println("Valid or Nor :"+result);
    }
}