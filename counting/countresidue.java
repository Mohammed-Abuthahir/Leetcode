// 3803. Count Residue Prefixes
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countresidue{
    public static int residuePrefixes(String s){
         int count = 0;
        String str = "";
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            str = str + c;
            set.add(c);
            if(str.length() % 3 == set.size()){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ;");
        String s = scan.next();
        int result = residuePrefixes(s);
        System.out.println(result);
    }
}