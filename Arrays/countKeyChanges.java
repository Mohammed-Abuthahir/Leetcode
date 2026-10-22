// 3019. Number of Changing Keys
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countKeyChanges{
    public static int count(String s){
         int count = 0;
       for(int i = 0;i < s.length() - 1; i++){
           char c1 = Character.toLowerCase(s.charAt(i));
           char c2 = Character.toLowerCase(s.charAt(i + 1));
           if(c1 != c2) count++;
       }  
       return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.next();
        int result = count(s);
        System.out.println(result);
    }
}