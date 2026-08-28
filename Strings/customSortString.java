// 791. Custom Sort String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class customSortString{
    public static String customsort(String order, String s){
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for(char c : order.toCharArray()){
            if(map.containsKey(c)) sb.append(String.valueOf(c).repeat(map.get(c)));
        }
        for(char c : s.toCharArray()){
            if(!order.contains(String.valueOf(c))) sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Order : ");
        String order = scan.next();
        System.out.println("Enter the String : ");
        String s = scan.next();
        String result = customsort(order, s);
        System.out.println(result);
    }
}