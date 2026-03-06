// 205. Isomorphic Strings
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Isomorphic{
    public static boolean isomorphic(String s1 , String s2){
        if(s1.length() != s2.length()) return false;
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(int i = 0;i < s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(map1.containsKey(c1) && map1.get(c1) != c2){
                return false;
            }
            if(map2.containsKey(c2) && map2.get(c2) != c1){
                return false;
            }
            map1.put(c1 ,c2);
            map2.put(c2 , c1);
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s1 = scan.next();
        System.out.println("Enter the String 2");
        String s2 = scan.next();
        boolean result = isomorphic(s1 , s2);
        System.out.println(result);
    }
}