// 3775. Reverse Words With Same Vowel Count
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reversevowelwithsamecount{
    public static String reversevowel(String s){
        int Vcount = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c != ' ' && c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    Vcount++;
            }
            else if(s.charAt(i) == ' ') {
                break;
            };
        }
        String[] input = s.split(" ");
        int checkcount = 0;
        for(int i = 1;i < input.length;i++){
            for(char c : input[i].toCharArray()){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    checkcount++;
                }
            }
            if(checkcount == Vcount){
                input[i] = new StringBuilder(input[i]).reverse().toString();
            }
            checkcount = 0;
        }
        System.out.println(Arrays.toString(input));
        return String.join(" ", input);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = reversevowel(s);
        System.out.println(result);
    }
}