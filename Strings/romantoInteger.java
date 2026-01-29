// 13. Roman to Integer
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class romantoInteger{
    public static int Integer(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        for(int i = 0;i < s.length();i++){
            int current = map.get(s.charAt(i));
            if(i + 1 < s.length() && current < map.get(s.charAt(i + 1))){
                result = result - current;
            }
            else{
                result = result + current;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        int result = Integer(s);
        System.out.println(result);
    }
}