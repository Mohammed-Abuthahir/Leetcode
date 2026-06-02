// 1108.  an IP Address
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class ipaddress{
    public static String defangIPaddr(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == '.'){
                sb.append("[");
                sb.append(".");
                sb.append("]");
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = defangIPaddr(s);
        System.out.println(result);
    }
}