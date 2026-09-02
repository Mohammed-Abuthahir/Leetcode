// 2351. First Letter to Appear Twice
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class repeatedCharacter{
    public static char repeatedchar(String s){
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)) return c;
            else set.add(c);
        }
        return ' ';
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        char result = repeatedchar(s);
        System.out.println(result);
    }
}