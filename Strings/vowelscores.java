// 3813. Vowel-Consonant Score
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class vowelscores{
    public static int countvowel(String s){
        int vowelcount = 0;
        int consonentcount = 0;
        for(int c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelcount++;
            }
            else if(Character.isLetter(c)){
                consonentcount++;
            }
        }
        if(vowelcount >= 1 && consonentcount == 0 || vowelcount == 0 && consonentcount == 1 ||
        vowelcount == 0 && consonentcount == 0) return 0;
        return (int) Math.floor(vowelcount / consonentcount);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = countvowel(s);
        System.out.println(result);
    }
}