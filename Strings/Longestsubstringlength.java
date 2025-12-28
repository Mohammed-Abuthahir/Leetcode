import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class Longestsubstringlength{
    public static int longestsublength(String s){
        Set<Character>set = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        for(int right = 0;right < s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        int result = longestsublength(s);
        System.out.println("Longest SubString  without repeting length :"+result);
    }
}