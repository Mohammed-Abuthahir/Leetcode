// 3120. Count the Number of Special Characters I
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class specialchar{
    public static int countspecial(String s){
        ArrayList<Character> upper = new ArrayList<>();
        ArrayList<Character> lower = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c >= 'A' && c <= 'Z' && !upper.contains(Character.toLowerCase(c))){
                upper.add(Character.toLowerCase(c));
            }
            else if(c >= 'a' && c <= 'z' && !lower.contains(c)){
                lower.add(c);
            }
        }
        int count = 0;
        for(int i = 0;i < upper.size();i++){
            if(lower.contains(upper.get(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = countspecial(s);
        System.out.println(result);
    }
}