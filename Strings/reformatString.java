// 1417. Reformat The String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class reformatString{
    public static String reformat(String s){
        if(s.length() == 1) return s;
        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> number = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) letter.add(c);
            else number.add(c);
        }
       if(Math.abs(letter.size() - number.size()) >= 2) return "";
        int i = 0;
        int idx = 0;
        char[] chars = new char[s.length()];
        if(letter.size() >= number.size()){
            while ((i < letter.size() || i < number.size()) && (!letter.isEmpty() && !number.isEmpty())) {
                if (i < letter.size()) {
                    chars[idx++] = letter.get(i);
                }
                if (i < number.size()) {
                    chars[idx++] = number.get(i);
                }
                i++;
            }
        }
        else{
            while ((i < letter.size() || i < number.size()) && (!letter.isEmpty() && !number.isEmpty())) {
                if (i < number.size()) {
                    chars[idx++] = number.get(i);
                }
                if (i < letter.size()) {
                    chars[idx++] = letter.get(i);
                }
                i++;
            }
        }
        return chars[0] == '\u0000' ?  "" : new String(chars) ;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        String result = reformat(s);
        System.out.println(result);
    }
}