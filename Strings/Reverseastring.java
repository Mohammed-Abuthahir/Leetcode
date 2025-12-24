// 151. Reverse Words in a String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class Reverseastring{
    public static String Reverse(String s){
        String str = s.replaceAll("\\s+"," ").trim();
        String[] input = str.split(" ");
        String reverse = "";
        for(int i = input.length - 1;i>=0;i--){
            reverse = reverse + input[i] + " ";
        }
        return reverse.trim();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String result = Reverse(s);
        System.out.println("reverse :"+result);
    }
}