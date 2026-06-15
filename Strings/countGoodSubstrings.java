// 1876. Substrings of Size Three with Distinct Characters
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class countGoodSubstrings{
    public static int countsubString(String s){
        int k = 3;
        int count = 0;
        for(int i = 0;i <= s.length() - k; i++){
            String sub = s.substring(i, i + k);
             HashSet<Character> set = new HashSet<>();
             for(char c : sub.toCharArray()){
                set.add(c);
             }
             if(set.size() == 3){
                count++;
             }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        int result = countsubString(s);
        System.out.println(result);
    }
}