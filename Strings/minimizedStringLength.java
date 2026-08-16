// 2716. Minimize String Length
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class minimizedStringLength{
    public static int minimizedString(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(sb.indexOf(String.valueOf(c)) == -1){
                sb.append(c);
            }
        }
        return sb.length();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = minimizedString(s);
        System.out.println(result);
    }
}