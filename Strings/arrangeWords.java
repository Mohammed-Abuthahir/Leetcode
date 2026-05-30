// 1451. Rearrange Words in a 
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class arrangeWords{
    public static String arragingWordsbyLength(String s){
        String[] words = s.split(" ");
        StringBuilder first = new StringBuilder();
        for(int i = 0;i < words[0].length(); i++){
            if(i == 0){
                 first.append(Character.toLowerCase(words[0].charAt(i)));
            }
            else {
                first.append(words[0].charAt(i));
            }
        }
        words[0] = first.toString();
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            return 0;
        });
        StringBuilder sb = new StringBuilder();
        for(String num : words){
            sb.append(num);
            sb.append(" ");
        }
        char lower = sb.charAt(0);
        char upper = Character.toUpperCase(lower);
        sb.setCharAt(0, upper);
        return sb.toString().trim(); 
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :" );
        String s = scan.nextLine();
        String result = arragingWordsbyLength(s);
        System.out.println(result);
    }
}