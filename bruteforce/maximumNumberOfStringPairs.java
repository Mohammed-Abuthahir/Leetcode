// 2744. Find Maximum Number of String Pairs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumNumberOfStringPairs{
    public static int minimumNumber(String[] words){
        int count =0;
        for(int j = 0;j < words.length;j++){
            String reverse = new StringBuilder(words[j]).reverse().toString();
            for(int i = j + 1;i < words.length; i++){
                if(reverse.contains(words[i])){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        String[] words = new String[n];
        for(int i = 0;i < words.length; i++){
            words[i] = scan.next();
        }
        int result = minimumNumber(words);
        System.out.println(result);
    }
}