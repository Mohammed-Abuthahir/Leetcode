// 2264. Largest 3-Same-Digit Number in String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class largestthreedigit{
    public static String threedigit(String s){
        int max = 0;
        for(int i = 1;i < s.length() - 1;i++){
            if(s.charAt(i - 1) == s.charAt(i) && s.charAt(i) == s.charAt(i + 1) && 
            s.charAt(i - 1) == s.charAt(i + 1)){
                max = Math.max(max , ((s.charAt(i - 1) - '0') + s.charAt(i) - '0') + 
                s.charAt(i + 1) - '0');
            }
        }
        StringBuilder num = new StringBuilder();
        for(int i = 1;i < s.length() - 1;i++){
            if(max == ((s.charAt(i - 1) - '0') + (s.charAt(i) - '0') +(s.charAt(i + 1) - '0') )){
                num.append(s.charAt(i - 1));
                num.append(s.charAt(i));
                num.append(s.charAt(i + 1));
                break;
            }
        }
        return num.toString();
    }
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = threedigit(s);
        System.out.println(result);
    }
}