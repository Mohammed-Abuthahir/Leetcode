// 1816. Truncate Sentence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class truncateSentence{
    public static String trucatesentences(String s,int k){
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str);
            sb.append(" ");
            k--;
            if(k == 0){
                break;
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        System.out.println("Enter the K");
        int k = scan.nextInt();
        String result = trucatesentences(s, k);
        System.out.println(result);
    }
}