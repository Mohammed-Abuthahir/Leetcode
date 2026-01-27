// 1047. Remove All Adjacent Duplicates In String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class removeadjacentduplicates{
    public static String duplicateremove(String s){
        Stack <Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char c : stack){
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        String result = duplicateremove(s);
        System.out.println("After Removing Adjacent Duplicates :"+ result);
    }
}