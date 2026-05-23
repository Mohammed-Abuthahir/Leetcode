// 859. Buddy Strings
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class BuddyString{
    public static boolean buddyString(String s , String goal){
        if(s.length() != goal.length()) return false;
        if(s.equals(goal)){
            HashSet<Character> set = new HashSet<>();
            for(int i = 0;i < s.length(); i++){
                if(set.contains(s.charAt(i))){
                    return true;
                }
                set.add(s.charAt(i));
            }
            return false;
        }
        List<Integer> mismatched = new ArrayList<>();
        for(int i = 0;i < s.length(); i++){
            if(s.length() != goal.charAt(i)){
                mismatched.add(i);
            }
        }
        if(mismatched.size() != 2) return false;
        return s.charAt(mismatched.get(0)) == goal.charAt(mismatched.get(1)) &&
        goal.charAt(mismatched.get(1)) == s.charAt(mismatched.get(0));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = scan.next();
        System.out.println("Enter the Goal :");
        String goal = scan.next();
        boolean result = buddyString(s, goal);
        System.out.println(result);
    }
}