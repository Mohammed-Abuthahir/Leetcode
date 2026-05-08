// 2287. Rearrange Characters to Make Target String
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class rearragingcharacter{
    public static int rearrangeCharacters(String s, String target){
        int[] scount = new int[26];
        int[] tcount = new int[26];
        for(char c : s.toCharArray()){
            scount[c - 'a']++;
        }
        for(char t : target.toCharArray()){
            tcount[t - 'a']++;
        }
        int maxCopies = Integer.MAX_VALUE;
        for(char c : target.toCharArray()){
            int index = c - 'a';
            int possiblecopies = scount[index] / tcount[index];
            maxCopies = Math.min(maxCopies , possiblecopies);
        }
        return maxCopies;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        System.out.println("Enter the Target :");
        String target = scan.nextLine();
        int result = rearrangeCharacters(s, target);
        System.out.println(result);

    }
}