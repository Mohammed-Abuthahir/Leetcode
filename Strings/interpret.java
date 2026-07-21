// 1678. Goal Parser Interpretation
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class interpret{
    public static String interpreter(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length() - 1; i++){
            if(s.charAt(i) == '(' && s.charAt(i + 1) == ')'){
                sb.append('o');
            }
            else if(s.charAt(i) != ')'){
                if(s.charAt(i) != '('){
                    sb.append(s.charAt(i));
                }
            }
        }
        if(s.charAt(s.length() - 1) != ')'){
            sb.append(s.charAt(s.length() - 1));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = interpreter(s);
        System.out.println(result);
    }
}