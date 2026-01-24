// 3541. Find Most Frequent Vowel and Consonant
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class mostfreqvowel{
    public static int sumofvowelandconsonents(String s){
         HashMap<Character,Integer> vowelfreq = new HashMap<>();
        HashMap<Character,Integer> consonentsfreq = new HashMap<>();
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelfreq.put(c , vowelfreq.getOrDefault(c , 0) + 1);
            }
            else{
                consonentsfreq.put(c , consonentsfreq.getOrDefault(c,0) + 1);
            }
        }
        int maxvowel = 0;
        int maxconsonenets = 0;
        if(vowelfreq.size() > 0){
            maxvowel = Collections.max(vowelfreq.values());
        }
        if(consonentsfreq.size() > 0){
            maxconsonenets = Collections.max(consonentsfreq.values());
        }
        return maxvowel + maxconsonenets;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        int result = sumofvowelandconsonents(s);
        System.out.println("Total Of vowel and Consonents is :"+result);
    }
}