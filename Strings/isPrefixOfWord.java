// 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isPrefixOfWord{
    public static int prefix(String s,String searchword){
        String[] index = s.split(" ");
        int i = 0;
        for(String word : index){
            if(word.startsWith(searchword)){
                return i + 1;
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        System.out.println("Enter the SearchWord :");
        String searchword = scan.nextLine();
        int result = prefix(s , searchword);
        System.out.println(result);
    }
}