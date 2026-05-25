// 1592. Rearrange Spaces Between Words
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class ReOrderSpace{
    public static String reorderSpaces(String s){
        String text = s.replaceAll("\\s+", " ").trim();
        String[] input = text.split(" ");
        int count = 0;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        String str = input[0];
        if (input.length == 1) {
            while (str.length() < s.length()) {
                str += " ";
            }
            return str;
        }
        int divide = (count / (input.length - 1));
        int extra = count % (input.length - 1);
        for(int i = 1; i < input.length; i++){
            for(int j = 0;j < divide; j++){
                str = str + " ";
            }
            str = str + input[i];
        }
        while(extra-- > 0){
            str = str + " ";
        }
        return str;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        String result = reorderSpaces(s);
        System.out.println(result);
    }
}