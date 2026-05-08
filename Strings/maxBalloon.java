// 1189. Maximum Number of Balloons
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxBalloon{
    public static int maxNumberOfBalloons(String s){
        int[] scount = new int[26];
        int[] bcount = new int[26];
        String b = "balloon";
        for(char c : s.toCharArray()){
            scount[c - 'a']++;
        }
        for(char c : b.toCharArray()){
            bcount[c - 'a']++;
        }
        int maxCopies = Integer.MAX_VALUE;
        for(char c : b.toCharArray()){
            int index = c - 'a';
            int possiblecopy = scount[index] / bcount[index];
            maxCopies = Math.min(maxCopies, possiblecopy);
        }
        return maxCopies;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = maxNumberOfBalloons(s);
        System.out.println(result);
    }
}