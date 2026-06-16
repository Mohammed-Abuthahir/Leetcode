// 3612. Process String with Special Operations I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class processStr{
    public static String processStr(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(!sb.isEmpty() ){
                    sb.append(sb);
                }
            }
            else if(ch == '%'){
                sb.reverse();
            }
            else if(ch == '*'){
               if(!sb.isEmpty()){
                   sb.deleteCharAt(sb.length() - 1);
               }
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = processStr(s);
        System.out.println(result);
    }
}