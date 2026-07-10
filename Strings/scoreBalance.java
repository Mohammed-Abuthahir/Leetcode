// 3707. Equal Score Substrings
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class scoreBalance{
    public static boolean scorebalance(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int idx = 1;
        for(int i = 97; i <= 122; i++) map.put((char) i, idx++);
        for(int i = 0;i < s.length(); i++){
            String sub1 = s.substring(0, i + 1);
            String sub2 = s.substring(i + 1);
            int sum1 = 0; int sum2 = 0;
            for(char c : sub1.toCharArray()) sum1 = sum1 + map.get(c);
            for(char c : sub2.toCharArray()) sum2 = sum2 + map.get(c);
            if(sum1 == sum2) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        boolean result = scorebalance(s);
        System.out.println(result);
    }
}