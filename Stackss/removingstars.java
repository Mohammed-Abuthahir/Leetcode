// 2390. Removing Stars From a String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removingstars{
    public static String removingstarsfromString(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && c == '*'){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = removingstarsfromString(s);
        System.out.println("After Removing Stars from the String :"+result);
    }
}