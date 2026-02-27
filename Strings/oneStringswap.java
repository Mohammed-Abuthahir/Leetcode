import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class oneStringswap{
    public static boolean Swapping(String s1 ,String s2){
        ArrayList<Character> list = new ArrayList<>();
        for(char c : s1.toCharArray()){
            list.add(c);
        }
        for(char c : s2.toCharArray()){
            if(!list.contains(c)){
                return false;
            }
            else{
                list.remove(Character.valueOf(c));
            }
        }
        int count = 0;
        if(s1.equals(s2)){
            return true;
        }
        else{
            for(int i = 0;i < s2.length();i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    count++;
                }
            }
        }
        return count == 2 ? true : false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s1 = scan.next();
        System.out.println("Enter the String 2");
        String s2 = scan.next();
        boolean result = Swapping(s1,s2);
        System.out.println(result);
    }
}