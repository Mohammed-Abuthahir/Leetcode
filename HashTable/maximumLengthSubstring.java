// 3090. Maximum Length Substring With Two Occurrences
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maximumLengthSubstring{
    public static int maximumlength(String s){
        int max = 0;
        for(int i = 0;i < s.length(); i++){
            for(int j = i; j <= s.length(); j++){
                max = Math.max(max, getInt(s.substring(i, j)));
            }
        }
        return max;
    }
    public static int getInt(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean moreoccur = true;
        for(char c : map.keySet()){
            if(map.get(c) > 2){
                moreoccur = false;
            }
        }
        if(moreoccur){
            return s.length();
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.next();
        int result = maximumlength(s);
        System.out.println(result);
    }
}