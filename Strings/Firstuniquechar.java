import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Firstuniquechar{
    public static int firstindex(String s){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        char c = ' ';
        for(char key : map.keySet()){
            if(map.get(key) == 1){
                c = key;
                break;
            }
        }
        for(int i = 0;i<s.length();i++){
            if(c == s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        int result = firstindex(s);
        System.out.println("First Occuring index :"+result);
    }
}