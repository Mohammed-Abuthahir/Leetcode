// 290. Word Pattern
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class wordpattern{
    public static boolean words(String s1, String s2){
       String input[] = s2.split(" ");
        if (s1.length() != input.length) {
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String ,Character> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (map1.containsKey(s1.charAt(i)) && !Objects.equals(map1.get(s1.charAt(i)), input[i])) {
                return false;
            }
            if(map2.containsKey(input[i]) && !Objects.equals(map2.get(input[i]), s1.charAt(i))){
                return false;
            }
            map1.put(s1.charAt(i),input[i]);
            map2.put(input[i],s1.charAt(i));
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the s1 :");
        String s1 = scan.next();
        System.out.println("Enter the s2 :");
        String s2 = scan.next();
        boolean result = words(s1 , s2);
        System.out.println(result);
    }
}