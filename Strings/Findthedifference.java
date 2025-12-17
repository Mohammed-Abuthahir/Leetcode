// 389. Find the Difference
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Findthedifference{
    public static char extrachar(String s,String t){
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0;i<t.length();i++){
            list.add(t.charAt(i));
        }
        for(int i = 0;i<s.length();i++){
            if(list.contains(s.charAt(i))){
                list.remove(Character.valueOf(s.charAt(i)));
            }
        }
        char character = ' ';
        for(char c : list){
            character = c;
        }
        return character;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String1 :");
        String s = scan.nextLine();
        System.out.println("Enter the String2 :");
        String t = scan.nextLine();
        char result = extrachar(s,t);
        System.out.println("Extra character is :"+result);

    }
}