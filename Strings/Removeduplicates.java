import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Removeduplicates{
    public static String duplicates(String s){
        LinkedHashSet<Character>set = new LinkedHashSet<>();
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        String removing = "";
        for(char arr : set){
            String myString = String.valueOf(arr);
            removing = removing + myString;
        }
        // String reverse = "";
        // for(int i = removing.length()-1;i>=0;i--){
        //     reverse = reverse + removing.charAt(i);
        // }
        return removing;
    }
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        String result = duplicates(s);
        System.out.println("Remove duplicate :"+result);
    }
}