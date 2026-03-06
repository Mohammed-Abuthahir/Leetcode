// 1805. Number of Different Integers in a String
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class numberofInteger{
    public static int countInteger(String s){
        HashSet<String> set = new HashSet<>();
        StringBuilder newStr = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                newStr.append(c);
            }
            else{
                if(!newStr.isEmpty()){
                    set.add(newStr.toString().replaceFirst("^0+(?!$)",""));
                    newStr.setLength(0);
                }
            }
        }
        if(!newStr.isEmpty()){
            set.add(newStr.toString().replaceFirst("^0+(?!$)",""));
        }
        return set.size();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = countInteger(s);
        System.out.println(result);
    }
}